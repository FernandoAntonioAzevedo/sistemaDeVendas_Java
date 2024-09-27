package com.sistemaDeVendas.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaDeVendas.sistema.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
