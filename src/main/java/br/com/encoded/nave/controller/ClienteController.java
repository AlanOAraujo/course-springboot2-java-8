package br.com.encoded.nave.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.encoded.nave.controller.dto.ClienteDTO;
import br.com.encoded.nave.entities.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/")
	public List<ClienteDTO> lista(){
		
		Cliente cliente = new Cliente(1L, "Alan", LocalDateTime.now(), LocalDate.of(1990, 1, 9));
		
		return ClienteDTO.converter(Arrays.asList(cliente));
		
	}
	
}
