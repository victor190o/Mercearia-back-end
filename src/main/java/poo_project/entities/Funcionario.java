package main.java.poo_project.entities;

import java.util.Date;

public class Funcionario extends Pessoa
{

	private Double salario;
	private Funcao funcao;

	public Funcionario(Long id, String name, Date subscribeDate, Double salario, String cpf,
		Endereco endereco, Funcao funcao)
	{
		super(id, name, subscribeDate, cpf, endereco);
		this.salario = salario;
		this.funcao = funcao;
	}

	public Double getSalario()
	{
		return salario;
	}

	public void setSalario(Double salario)
	{
		this.salario = salario;
	}
}
