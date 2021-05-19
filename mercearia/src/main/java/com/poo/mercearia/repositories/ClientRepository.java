package com.poo.mercearia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.mercearia.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
