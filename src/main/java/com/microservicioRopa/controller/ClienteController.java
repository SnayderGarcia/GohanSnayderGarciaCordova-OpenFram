package com.microservicioRopa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservicioRopa.modelo.Cliente;
import com.microservicioRopa.modelo.Cliente_Ropa;
import com.microservicioRopa.service.Ciente_RopaService;

@RequestMapping("/cliente_ropa")
public class ClienteController {
	
	@Autowired
	private Ciente_RopaService servicio;
	
	@GetMapping(path="/listar")
	public @ResponseBody List<Cliente>listar(){
		return servicio.clientelist();
	}

}
