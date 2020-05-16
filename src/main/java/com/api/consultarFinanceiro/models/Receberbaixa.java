package com.api.consultarFinanceiro.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RECEBER_BAIXA")
public class Receberbaixa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	
	private long receberBaixaId;
	private long receberId;
	private String dataBaixa;
	private BigDecimal juros;
	private BigDecimal multa;
	private BigDecimal desconto;
	private BigDecimal valor;
		
	public long getReceberBaixaId() {
		return receberBaixaId;
	}
	public void setReceberBaixaId(long receberBaixaId) {
		this.receberBaixaId = receberBaixaId;
	}
	public long getReceberId() {
		return receberId;
	}
	public void setReceberId(long receberId) {
		this.receberId = receberId;
	}
	public String getDataBaixa() {
		return dataBaixa;
	}
	public void setDataBaixa(String dataBaixa) {
		this.dataBaixa = dataBaixa;
	}
	public BigDecimal getJuros() {
		return juros;
	}
	public void setJuros(BigDecimal juros) {
		this.juros = juros;
	}
	public BigDecimal getMulta() {
		return multa;
	}
	public void setMulta(BigDecimal multa) {
		this.multa = multa;
	}
	public BigDecimal getDesconto() {
		return desconto;
	}
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
