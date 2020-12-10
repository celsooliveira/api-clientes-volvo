package br.com.volvo.apicadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.volvo.apicadastro.entity.Cliente;
import br.com.volvo.apicadastro.service.ClienteService;

@RestController
@RequestMapping("/api-cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;

	@RequestMapping(value = "buscar-clientes", method = RequestMethod.GET)
	public Page<Cliente> buscarClientes(@RequestParam ("page") int page, @RequestParam("size") int size) {
		return clienteService.findAll(page, size);
	}
	
	@RequestMapping(value = "cadastrar-cliente", method = RequestMethod.POST)
	public String cadastrarCliente(@RequestBody Cliente cliente) {
		return clienteService.insertData(cliente);
	}
}
