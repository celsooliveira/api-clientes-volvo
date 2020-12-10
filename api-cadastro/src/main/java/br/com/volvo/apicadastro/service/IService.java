package br.com.volvo.apicadastro.service;

import org.springframework.data.domain.Page;

import br.com.volvo.apicadastro.entity.Cliente;

public interface IService<T> {

	
	Page<T> findAll(int page, int size);
	
	String insertData(Cliente cliente);
}
