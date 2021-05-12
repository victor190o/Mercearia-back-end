package mercearia.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

@Embeddable
public abstract class DadosPessoais implements Serializable
{
	private String name;
	private Date subscribeDate;
	private String cpf;

	private Endereco endereco;

	public DadosPessoais(String name, Date subscribeDate, String cpf, Endereco endereco)
	{
		this.name = name;
		this.subscribeDate = subscribeDate;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public DadosPessoais()
	{

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
