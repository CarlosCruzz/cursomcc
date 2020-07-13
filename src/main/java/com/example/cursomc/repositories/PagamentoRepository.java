package com.example.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursomc.domain.Pagamento;
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer>{

}
