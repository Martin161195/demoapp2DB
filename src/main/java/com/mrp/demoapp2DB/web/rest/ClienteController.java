package com.mrp.demoapp2DB.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mrp.demoapp2DB.Repository.ClienteRepository;
import com.mrp.demoapp2DB.model.Cliente;

@RestController
public class ClienteController {
	
	@Autowired //
	private ClienteRepository clienteRepository ;
	@RequestMapping(value="/cliente",method=RequestMethod.POST)
		public Cliente RegisterCliente(@RequestBody Cliente cliente) {
			
			Cliente c = clienteRepository.save(cliente);  
			
			return c;
		}
	@RequestMapping(value="/cliente/{id}",method=RequestMethod.GET)
		public Cliente ObtenerCliente(@PathVariable String id) {
		Cliente c=	clienteRepository.findOne(id);
		return c;
	}
}
