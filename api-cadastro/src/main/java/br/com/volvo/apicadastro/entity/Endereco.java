package br.com.volvo.apicadastro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique = true)
	private String cep;
	
	private String endereco;
	
	private int numero;

	public Endereco() {
		
	}
	
	public Endereco(String cep, String endereco, int numero) {
		super();
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	
}
