package br.com.volvo.apicadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.volvo.apicadastro.entity.Cliente;
import br.com.volvo.apicadastro.repository.ClienteRepository;
import br.com.volvo.apicadastro.repository.EnderecoRepository;

@Service
public class ClienteService implements IService<Cliente>{

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@Override
	public Page<Cliente> findAll(int page, int size) {
		return clienteRepository.findAll(PageRequest.of(page,size));
	}

	@Override
	public String insertData(Cliente cliente) {
			
		try {
			clienteRepository.save(cliente);
			return "\0/ Cadastro efetuado com sucesso - Execute a camada buscar-usuarios para verificar os dados";
		} catch (Exception e) {
			return ":( Ocorreu um erro ao cadastrar dados";
		}
	}

	
}
