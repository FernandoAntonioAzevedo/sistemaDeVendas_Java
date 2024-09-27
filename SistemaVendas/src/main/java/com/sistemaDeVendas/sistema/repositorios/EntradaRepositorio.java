package com.sistemaDeVendas.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaDeVendas.sistema.modelos.Entrada;

public interface EntradaRepositorio extends JpaRepository<Entrada, Long> {

}
