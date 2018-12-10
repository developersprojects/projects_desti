package com.helptree.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helptree.db.model.StateMaster;

public interface StateRepository extends JpaRepository<StateMaster, Integer> {

}
