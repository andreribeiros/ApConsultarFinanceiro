package com.api.consultarFinanceiro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.consultarFinanceiro.models.Funcionario;
import com.api.consultarFinanceiro.models.PagarBaixa;
import com.api.consultarFinanceiro.models.Receberbaixa;
import com.api.consultarFinanceiro.repository.ConsultarFuncionarioRepository;
import com.api.consultarFinanceiro.repository.ConsultarPagarRepository;
import com.api.consultarFinanceiro.repository.ConsultarReceberRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
public class ConsultarFinanceiroResources {
	
	@Autowired
	ConsultarReceberRepository consultarReceberRepository; 	
	@Autowired
	ConsultarPagarRepository consultarPagarRepository; 	
	@Autowired
	ConsultarFuncionarioRepository consultarFuncionarioRepository; 	
	
	@ApiOperation(value="Retorna uma lista de titulos receber baixados")
	@GetMapping("/ReceberBaixas")
	public List<Receberbaixa> ListaReceberBaixas(){
		return consultarReceberRepository.findAll();
	}
	
	@ApiOperation(value="Retorna uma lista de titulos pagar baixados")
	@GetMapping("/PagarBaixas")
	public List<PagarBaixa> ListaPagarBaixa(){
		return consultarPagarRepository.findAll();
	}
	
	@ApiOperation(value="Retorna uma lista de funcionarios")
	@GetMapping("/Funcionarios")
	public List<Funcionario> ListaFuncionarios(){
		return consultarFuncionarioRepository.findAll();
	}

}
