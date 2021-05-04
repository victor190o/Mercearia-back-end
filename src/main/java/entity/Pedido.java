package main.java.entity;

import java.util.List;

public class Pedido
{
	private Long id;
	private Cliente cliente;
	private Funcionario funcionario;
	private List<Produto> produtos;
	private Double valorTotal;

	public Pedido(Long id, Cliente cliente, Funcionario funcionario, List<Produto> produtos,
		Double valorTotal)
	{
		this.id = id;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.produtos = produtos;
		this.valorTotal = valorTotal;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public Funcionario getFuncionario()
	{
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario)
	{
		this.funcionario = funcionario;
	}

	public List<Produto> getProdutos()
	{
		return produtos;
	}

	public void setProdutos(List<Produto> produtos)
	{
		this.produtos = produtos;
	}

	public Double getValorTotal()
	{
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal)
	{
		this.valorTotal = valorTotal;
	}
}
