package com.project.Medical.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medical.Entity.Insurance;

public interface InsuranceRepo extends JpaRepository<Insurance, Integer> {

}
