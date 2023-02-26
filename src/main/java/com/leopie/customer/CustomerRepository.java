package com.leopie.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    List<Customer> findAll();
    Optional<Customer> findById(Integer id);
    void deleteById(Integer id);
    Customer save(Customer customer);
}
