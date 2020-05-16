package com.api.consultarFinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.consultarFinanceiro.models.Receberbaixa;

public interface ConsultarReceberRepository extends JpaRepository <Receberbaixa, Long>{

}