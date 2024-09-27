package com.sistemaDeVendas.sistema.modelos;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemEntrada implements Serializable {
	
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Double quantidade;
	private Double valor;
	@ManyToOne
	private Entrada entrada;
	@ManyToOne
	private Produto produto;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Entrada getEntrada() {
		return entrada;
	}
	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
	
}
