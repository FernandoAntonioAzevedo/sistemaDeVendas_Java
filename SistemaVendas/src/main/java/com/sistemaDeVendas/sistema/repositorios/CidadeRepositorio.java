package com.sistemaDeVendas.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaDeVendas.sistema.modelos.Cidade;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {

}
