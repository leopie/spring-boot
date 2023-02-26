package com.leopie.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(@Qualifier("real") CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer oldCustomer, Customer newCustomer) {
        if(newCustomer.getName()!=null) {
            oldCustomer.setName(newCustomer.getName());
        }
        if(newCustomer.getEmail()!=null) {
            oldCustomer.setEmail(newCustomer.getEmail());
        }
        if(newCustomer.getAge()!=null) {
            oldCustomer.setAge(newCustomer.getAge());
        }
        customerRepository.save(oldCustomer);
    }

    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

}
