package br.com.encoded.nave.controller.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.encoded.nave.entities.Cliente;

public class ClienteDTO {

	private Long id;
	
	private String nome;
	
	private LocalDateTime dt_cadastro;
	
	private LocalDate dt_nascimento;

	public ClienteDTO(Cliente cliente) {
		
		this.id = getId();
		this.nome = getNome();
		this.dt_cadastro = getDt_cadastro();
		this.dt_nascimento = getDt_nascimento();
		
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getDt_cadastro() {
		return dt_cadastro;
	}

	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}
	
	public static List<ClienteDTO> converter(List<Cliente> clientes){
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}
	
}
