package com.api.consultarFinanceiro.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FUNCIONARIO")
public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	
	private long funcionarioId;
	//private long clienteId;
	private String nome;
	private String senha;
	
	public long getFuncionarioId() {
		return funcionarioId;
	}
	public void setFuncionarioId(long funcionarioId) {
		this.funcionarioId = funcionarioId;
	}
	/*
	public long getClienteId() {
		return clienteId;
	}
	public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
	}
	*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
