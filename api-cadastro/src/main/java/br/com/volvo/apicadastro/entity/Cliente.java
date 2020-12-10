package br.com.volvo.apicadastro.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Setter;
import lombok.Getter;

@Entity
@Setter
@Getter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String documento;
	
	private String nome;
	
	private int idade; 
	
	private Date dataRegistro;
	
	private Date dataAtualizacao;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Endereco> enderecos;

	public Cliente() {
		
	}
	
	public Cliente(String documento, String nome, int idade, Date dataRegistro, Date dataAtualizacao,
			List<Endereco> enderecos) {
		super();
		this.documento = documento;
		this.nome = nome;
		this.idade = idade;
		this.dataRegistro = dataRegistro;
		this.dataAtualizacao = dataAtualizacao;
		this.enderecos = enderecos;
	}
	
	
	
}
