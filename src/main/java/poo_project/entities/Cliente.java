package main.java.poo_project.entities;

import java.util.Date;

public class Cliente extends Pessoa
{

	public Cliente(Long id, String name, Date subscribeDate, String cpf, Endereco endereco)
	{
		super(id, name, subscribeDate, cpf, endereco);
	}
}
