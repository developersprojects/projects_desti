package com.helptree.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helptree.db.model.CityMaster;


public interface CityRepository extends JpaRepository<CityMaster, Integer> {

}
