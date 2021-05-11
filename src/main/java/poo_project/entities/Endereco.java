package main.java.poo_project.entities;

public class Endereco
{
	private Long id;
	private String estado;
	private String cidade;
	private String bairro;
	private String logradrouro;
	private Integer numero;
	private String complemento;

	public Endereco(Long id, String estado, String cidade, String bairro, String logradrouro,
		Integer numero, String complemento)
	{
		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradrouro = logradrouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getEstado()
	{
		return estado;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	public String getCidade()
	{
		return cidade;
	}

	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}

	public String getBairro()
	{
		return bairro;
	}

	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

	public String getLogradrouro()
	{
		return logradrouro;
	}

	public void setLogradrouro(String logradrouro)
	{
		this.logradrouro = logradrouro;
	}

	public Integer getNumero()
	{
		return numero;
	}

	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}

	public String getComplemento()
	{
		return complemento;
	}

	public void setComplemento(String complemento)
	{
		this.complemento = complemento;
	}
}
