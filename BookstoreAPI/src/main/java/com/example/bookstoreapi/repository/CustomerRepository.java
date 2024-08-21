package com.example.bookstoreapi.repository;

import com.example.bookstoreapi.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can define custom queries here if needed
}
