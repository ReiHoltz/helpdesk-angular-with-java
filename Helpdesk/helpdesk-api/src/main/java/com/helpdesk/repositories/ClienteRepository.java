package com.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
