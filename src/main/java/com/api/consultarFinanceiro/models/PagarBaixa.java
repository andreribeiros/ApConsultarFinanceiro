package com.api.consultarFinanceiro.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAGAR_BAIXA")
public class PagarBaixa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	
	private long pagarBaixaId;
	private long pagarId;
	private String dataBaixa;
	private BigDecimal juros;
	private BigDecimal multa;
	private BigDecimal desconto;
	private BigDecimal valor;
	
	public String getDataBaixa() {
		return dataBaixa;
	}
	public long getPagarBaixaId() {
		return pagarBaixaId;
	}
	public void setPagarBaixaId(long pagarBaixaId) {
		this.pagarBaixaId = pagarBaixaId;
	}
	public long getPagarId() {
		return pagarId;
	}
	public void setPagarId(long pagarId) {
		this.pagarId = pagarId;
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
