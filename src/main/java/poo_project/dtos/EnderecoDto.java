package main.java.poo_project.dtos;

import java.io.Serializable;

import main.java.poo_project.entities.Endereco;

public class EnderecoDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String estado;
	private String cidade;
	private String bairro;
	private String logradrouro;
	private Integer numero;
	private String complemento;
	
	public EnderecoDto() {}

	public EnderecoDto(Long id, String estado, String cidade, String bairro, String logradrouro, Integer numero,
			String complemento) {
		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradrouro = logradrouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public EnderecoDto(Endereco endereco) {
		this.id = endereco.getId();
		this.estado = endereco.getEstado();
		this.cidade = endereco.getCidade();
		this.bairro = endereco.getBairro();
		this.logradrouro = endereco.getLogradrouro();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradrouro() {
		return logradrouro;
	}

	public void setLogradrouro(String logradrouro) {
		this.logradrouro = logradrouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
