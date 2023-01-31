package com.aloyolaa.libraryapp.repository;

import com.aloyolaa.libraryapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}