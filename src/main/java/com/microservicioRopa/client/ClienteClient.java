package com.microservicioRopa.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservicioRopa.modelo.Cliente;
import com.microservicioRopa.modelo.Ropa;

@FeignClient(name="micro-servicios", url="localhost:9095")
public interface ClienteClient {
	
	@GetMapping("/cliente/listarCli")
	public List<Cliente> listarCliente();
	
	@GetMapping("/ropa//listarR")
	public List<Ropa> listarRopa();

}
