package com.sistemaDeVendas.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaDeVendas.sistema.modelos.Fornecedor;

public interface FornecedorRepositorio extends JpaRepository<Fornecedor, Long> {

}
