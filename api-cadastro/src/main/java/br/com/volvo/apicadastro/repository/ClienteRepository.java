package br.com.volvo.apicadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.volvo.apicadastro.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
