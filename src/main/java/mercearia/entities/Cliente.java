package mercearia.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Cliente
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Embedded
	DadosPessoais dadosPessoais;

	public Cliente(String name, Date subscribeDate, String cpf, Endereco endereco)
	{
		this.dadosPessoais = new DadosPessoais(name, subscribeDate, cpf, endereco){};
	}

	public Cliente()
	{

	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
}
