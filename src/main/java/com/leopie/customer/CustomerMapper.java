package com.leopie.customer;

public class CustomerMapper {
    public CustomerDto entityToDto(Customer customer) {
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getAge()
        );
    }

    public Customer dtoToEntity(CustomerDto customerDto) {
        Customer customer = new Customer();
        if(customerDto.id()!=null) {
            customer.setId(customerDto.id());
        }
        if(customerDto.name()!=null) {
            customer.setName(customerDto.name());
        }
        if(customerDto.email()!=null) {
            customer.setEmail(customerDto.email());
        }
        if(customerDto.age()!=null) {
            customer.setAge(customerDto.age());
        }
        return customer;
    }

}
