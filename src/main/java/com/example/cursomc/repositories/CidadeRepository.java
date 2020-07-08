package com.example.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursomc.domain.Cidade;
@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer>{

}
