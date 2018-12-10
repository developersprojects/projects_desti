package com.helptree.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helptree.db.model.CustomerMaster;

public interface CustomerRepository extends JpaRepository<CustomerMaster, Integer> {

}
