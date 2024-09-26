package com.sistemaDeVendas.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaDeVendas.sistema.modelos.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
