package com.example.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursomc.domain.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
