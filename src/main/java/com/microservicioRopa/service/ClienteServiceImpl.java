package com.microservicioRopa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicioRopa.client.ClienteClient;
import com.microservicioRopa.modelo.Cliente;

@Service
public class ClienteServiceImpl implements Ciente_RopaService{

	@Autowired
	private ClienteClient cliente;
	
	@Override
	public List<Cliente> clientelist() {
		List<Cliente> listar = new ArrayList<>();
		
		Cliente cli_rop = new Cliente();
		
		cli_rop.setIdCliente(1);
		cli_rop.setApellidoCliente("Garcia");
		cli_rop.setNombreCliente("Garcia");
		cli_rop.setNroCelular(978875485);
		cli_rop.setDireccion("calle lima");
		
		listar.add(cli_rop);
	
		return listar;
	}

}
