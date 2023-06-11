package com.project.Medical.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medical.Entity.Clinical;

public interface ClinicalRepo extends JpaRepository<Clinical, Integer> {

}
