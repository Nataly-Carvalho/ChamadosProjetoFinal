package com.ElasTechProjetoFinal.repository;

import com.ElasTechProjetoFinal.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadosRepository extends JpaRepository<Chamado, Integer> {
}
