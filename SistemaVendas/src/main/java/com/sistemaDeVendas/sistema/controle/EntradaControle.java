package com.sistemaDeVendas.sistema.controle;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistemaDeVendas.sistema.modelos.Entrada;
import com.sistemaDeVendas.sistema.repositorios.EntradaRepositorio;
import com.sistemaDeVendas.sistema.repositorios.EstadoRepositorio;

@Controller
public class EntradaControle {
	
	@Autowired
	private EntradaRepositorio entradaRepositorio;
	@Autowired
	private EstadoRepositorio estadoRepositorio;
	
	@GetMapping("/cadastroEntrada")
	public ModelAndView cadastrar(Entrada entrada) {
		ModelAndView mv = new ModelAndView("administrativo/entradas/cadastro");
		mv.addObject("Entrada", entrada);
		mv.addObject("listaEstados", estadoRepositorio.findAll());
		return mv;
	}
	
	@GetMapping("/listarEntrada")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("administrativo/entradas/lista");
		mv.addObject("listaEntradas", entradaRepositorio.findAll());
		return mv;
	}
	
	@GetMapping("/editarEntrada/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		Optional<Entrada> entrada = entradaRepositorio.findById(id);
		return cadastrar(entrada.get());
		
	}
	
	@GetMapping("/removerEntrada/{id}")
	public ModelAndView remover(@PathVariable("id") Long id) {
		Optional<Entrada> entrada = entradaRepositorio.findById(id);
		entradaRepositorio.delete(entrada.get());
		return listar();
		
	}
	
	@PostMapping("/salvarEntrada")
	public ModelAndView salvar(Entrada entrada, BindingResult result) {
		if(result.hasErrors()) {
			return cadastrar(entrada);
		}
		entradaRepositorio.saveAndFlush(entrada);
		return cadastrar(new Entrada());
		
	}

}