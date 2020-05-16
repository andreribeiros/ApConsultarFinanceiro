package com.api.consultarFinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.consultarFinanceiro.models.PagarBaixa;

public interface ConsultarPagarRepository extends JpaRepository <PagarBaixa, Long>{

}

