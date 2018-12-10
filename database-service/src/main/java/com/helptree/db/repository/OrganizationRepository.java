package com.helptree.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helptree.db.model.OrganizationMaster;

public interface OrganizationRepository  extends  JpaRepository<OrganizationMaster, Integer>{

}
