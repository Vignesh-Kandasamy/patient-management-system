package com.project.Medical.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medical.Entity.Prescriptions;

public interface PrescriptionsRepo extends JpaRepository<Prescriptions, Integer> {

}
