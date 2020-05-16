package com.api.consultarFinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.consultarFinanceiro.models.Funcionario;

public interface ConsultarFuncionarioRepository extends JpaRepository <Funcionario, Long>{

}