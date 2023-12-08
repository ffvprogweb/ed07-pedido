package com.fatec.pedido.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Pedido {
	int numero;
	String status;
	String data;
	String cnpj;
	String cep;
	String endereco;
	String complemento;
	String descricao;
	double valor;
	String previsaoEntrega;
	Logger logger = LogManager.getLogger(this.getClass());

	public Pedido(int numero, String status, String data, String cnpj, String cep, String endereco, String complemento,
			String descricao, double valor, String previsaoEntrega) {
		super();
		this.numero = numero;
		this.status = status;
		this.data = setDataEmissao();
		this.cnpj = cnpj;
		this.cep = cep;
		this.endereco = endereco;
		this.complemento = complemento;
		this.descricao = descricao;
		this.valor = valor;
		setPrevisaoEntrega(previsaoEntrega);
	}
	public Pedido() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public String setDataEmissao() {
		DateTime dataAtual = new DateTime();
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/YYYY");
		logger.info(">>>>>> setDataEmissao para data de hoje => " + dataAtual.toString(fmt));
		return dataAtual.toString(fmt);
	}
	public void setPrevisaoEntrega(String previsaoEntrega) {
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/YYYY");
		try {
			fmt.parseDateTime(previsaoEntrega);
			this.previsaoEntrega = previsaoEntrega;
		} catch (Exception e) {
			throw new IllegalArgumentException("Data invalida");
		}
		
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	
}
