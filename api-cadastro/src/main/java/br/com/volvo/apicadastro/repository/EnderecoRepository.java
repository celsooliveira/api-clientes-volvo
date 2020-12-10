package br.com.volvo.apicadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.volvo.apicadastro.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
