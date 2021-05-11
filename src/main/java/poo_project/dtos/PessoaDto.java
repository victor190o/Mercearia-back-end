package main.java.poo_project.dtos;

import java.io.Serializable;
import java.util.Date;

import main.java.poo_project.entities.Pessoa;

public abstract class PessoaDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Date subscribeDate;
	private EnderecoDto endereco;
	
	public PessoaDto() {}

	public PessoaDto(Long id, String name, Date subscribeDate, EnderecoDto endereco) {
		this.id = id;
		this.name = name;
		this.subscribeDate = subscribeDate;
		this.endereco = endereco;
	}
	
	public PessoaDto(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.name = pessoa.getName();
		this.subscribeDate = pessoa.getSubscribeDate();
		this.endereco = new EnderecoDto(pessoa.getEndereco());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getSubscribeDate() {
		return subscribeDate;
	}

	public void setSubscribeDate(Date subscribeDate) {
		this.subscribeDate = subscribeDate;
	}

	public EnderecoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}
}
