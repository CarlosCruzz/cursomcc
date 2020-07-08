package com.example.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursomc.domain.Estado;
@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer>{

}
