package com.JPA.onlineExam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.onlineExam.modeltest.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
