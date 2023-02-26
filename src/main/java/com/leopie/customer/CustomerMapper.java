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
        if(customerDto.getId()!=null) {
            customer.setId(customerDto.getId());
        }
        if(customerDto.getName()!=null) {
            customer.setName(customerDto.getName());
        }
        if(customerDto.getEmail()!=null) {
            customer.setEmail(customerDto.getEmail());
        }
        if(customerDto.getAge()!=null) {
            customer.setAge(customerDto.getAge());
        }
        return customer;
    }

}
