package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    //by using findBy spring data JPA framework can look at the database and find based on the name provided(not case sensitive)
    //findbyMobileNumber finds based on mobile number
    //findbyMobileNumberAndEmail(String mobileNumber, String email) checks for both columns
    Optional<Customer>findByMobileNumber(String mobileNumber);
}
