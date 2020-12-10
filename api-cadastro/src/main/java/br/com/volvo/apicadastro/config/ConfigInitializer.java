package br.com.volvo.apicadastro.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.volvo.apicadastro.entity.Cliente;
import br.com.volvo.apicadastro.entity.Endereco;
import br.com.volvo.apicadastro.repository.ClienteRepository;
import br.com.volvo.apicadastro.repository.EnderecoRepository;

@Component
public class ConfigInitializer implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	EnderecoRepository enderecoRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		List<Cliente> clientes = clienteRepository.findAll();
		if(clientes.isEmpty()) {
			this.criarDadosIniciais();
		}
	}
	
	private void criarDadosIniciais() {
		List<Endereco> enderecos = new ArrayList<Endereco>();
		Endereco endereco = new Endereco("22050-002", "Nossa Senhora de Copacabana", 723);
		enderecoRepository.save(endereco);
		enderecos.add(endereco);
		
		Cliente cliente = new Cliente("90777778778", "Cliente um", 20, new Date(), new Date(), enderecos);
		clienteRepository.save(cliente);
	}

}
