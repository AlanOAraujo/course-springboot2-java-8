package br.com.encoded.nave.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Cliente {

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private LocalDateTime dt_cadastro;
	
	private LocalDate dt_nascimento;

	public Cliente() {
	}

	public Cliente(Long id, String nome, LocalDateTime dt_cadastro, LocalDate dt_nascimento) {
		
		this.id = id;
		this.nome = nome;
		this.dt_cadastro = dt_cadastro;
		this.dt_nascimento = dt_nascimento;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(LocalDateTime dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
}
