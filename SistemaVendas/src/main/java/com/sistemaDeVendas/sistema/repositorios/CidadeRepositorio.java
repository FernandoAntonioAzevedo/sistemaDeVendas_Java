package com.sistemaDeVendas.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaDeVendas.sistema.modelos.Estado;

public interface CidadeRepositorio extends JpaRepository<Estado, Long> {

}
