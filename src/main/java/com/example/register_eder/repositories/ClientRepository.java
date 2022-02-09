package com.example.register_eder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.register_eder.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
