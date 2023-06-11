package com.project.Medical.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medical.Entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
