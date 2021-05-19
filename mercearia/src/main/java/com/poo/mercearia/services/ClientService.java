package com.poo.mercearia.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poo.mercearia.dtos.ClientDto;
import com.poo.mercearia.entities.Address;
import com.poo.mercearia.entities.Client;
import com.poo.mercearia.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public List<ClientDto> findAll(){
		List<Client> list = clientRepository.findAll();
		return list.stream().map(x -> new ClientDto(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ClientDto findById(Long id) throws Exception{
		Optional<Client> obj = clientRepository.findById(id);
		Client client = obj.orElseThrow(() -> new Exception("Cliente não encontrado"));
		return new ClientDto(client);
	}
	
	@Transactional(readOnly = true)
	public ClientDto insert(ClientDto clientDto){
		Client client = new Client(null, clientDto.getName(), clientDto.getRegistrationDate(), new Address());
		client = clientRepository.save(client);
		return new ClientDto(client);
	}
	
	@Transactional(readOnly = true)
	public ClientDto update(Long id, ClientDto clientDto){
		Client client = clientRepository.getOne(id);
		
		Address newAddress = new Address (clientDto.getAddress().getPublicPlace(), 
				clientDto.getAddress().getNumber(),
				clientDto.getAddress().getComplement(),
				clientDto.getAddress().getDistrict(),
				clientDto.getAddress().getCity(),
				clientDto.getAddress().getState());
		
		client.setAddress(newAddress);
		
		client = clientRepository.save(client);
		return new ClientDto(client);
	}
	
	@Transactional(readOnly = true)
	public void delete(Long id){
		clientRepository.deleteById(id);
	}
}
