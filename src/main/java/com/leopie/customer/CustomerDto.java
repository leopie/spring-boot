package com.leopie.customer;

public record CustomerDto(
        Integer id,
        String name,
        String email,
        Integer age
) {

}
