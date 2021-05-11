package main.java.poo_project.entities;

import java.util.List;

public class Pedido
{
	private Long id;
	private Cliente cliente;
	private Funcionario funcionario;
	private List<Produto> produtos;

	public Pedido(Long id, Cliente cliente, Funcionario funcionario, List<Produto> produtos)
	{
		this.id = id;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.produtos = produtos;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Double getValorTotal()
	{
		Double valorTotal = 0.0;
		for (Produto produto : produtos)
		{
			Double valorProduto = produto.getValor();

			valorTotal += valorProduto;
		}
		return valorTotal;
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


}
