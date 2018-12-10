package com.helptree.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helptree.db.model.CountryMaster;

public interface CountryRepository extends JpaRepository<CountryMaster, Integer> {

}
