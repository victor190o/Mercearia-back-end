package com.poo.mercearia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.mercearia.dtos.ClientDto;
import com.poo.mercearia.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<ClientDto>> findAll(){
		List<ClientDto> list = clientService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<ClientDto> findById(Long id) throws Exception{
		ClientDto client = clientService.findById(id);
		return ResponseEntity.ok().body(client);
	}

}
