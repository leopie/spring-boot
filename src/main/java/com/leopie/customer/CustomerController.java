package com.leopie.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }

    @GetMapping("/getAll")
    public List<CustomerDto> getCustomers() {
        return customerService.getCustomers()
                .stream()
                .map(customerMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/create")
    public void createCustomer(@RequestBody CustomerDto customerDto) {
        customerService.saveCustomer(customerMapper.dtoToEntity(customerDto));
    }

    @PutMapping("/update/{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer id, @RequestBody CustomerDto customerDTO) {
        Optional<Customer> optionalCustomer = customerService.findById(id);

        if(optionalCustomer.isEmpty())
            throw new IllegalArgumentException("Customer with id %d not found".formatted(id));

        customerService.updateCustomer(optionalCustomer.get(), customerMapper.dtoToEntity(customerDTO));
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerService.deleteCustomer(id);
    }

}
