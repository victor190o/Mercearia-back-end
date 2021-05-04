package main.java.entity;

import java.util.Date;

public abstract class Pessoa
{
	private Long id;
	private String name;
	private Date subscribeDate;
	private String cpf;
	private Endereco endereco;

	public Pessoa(Long id, String name, Date subscribeDate, String cpf, Endereco endereco)
	{
		this.id = id;
		this.name = name;
		this.subscribeDate = subscribeDate;
		this.cpf = cpf;
		this.endereco = endereco;
	}



	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getSubscribeDate()
	{
		return subscribeDate;
	}

	public void setSubscribeDate(Date subscribeDate)
	{
		this.subscribeDate = subscribeDate;
	}

}
