package com.leopie.customer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fake")
public class CustomerRepositoryFake implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        return List.of(
                new Customer(1, "Mario", "Rossi", 40),
                new Customer(2, "Luca", "Bianchi", 50)
        );
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return Optional.of(
                new Customer(1, "Mario", "Rossi", 40)
        );
    }

    @Override
    public void deleteById(Integer id) {}

    @Override
    public Customer save(Customer customer) {
        return null;
    }
}
