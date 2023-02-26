package com.leopie.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {
    @Bean
    public CustomerMapper customerMapper() {
        return new CustomerMapper();
    }

}
