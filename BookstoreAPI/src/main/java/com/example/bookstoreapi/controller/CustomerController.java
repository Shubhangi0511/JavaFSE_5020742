package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
@Validated
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
        customers.add(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }


    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String address) {
        Customer customer = new Customer();
        customers.add(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
}
