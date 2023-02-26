package com.leopie.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("real")
public interface CustomerRepositoryReal extends JpaRepository<Customer, Integer>, CustomerRepository {
}
