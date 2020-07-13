package com.example.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursomc.domain.Endereco;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer>{

}
