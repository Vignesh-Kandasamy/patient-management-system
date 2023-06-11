package com.project.Medical.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medical.Entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
