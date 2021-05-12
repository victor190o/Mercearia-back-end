package mercearia.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private DadosPessoais dadosPessoais;

    private Double salario;

    @ManyToOne
    private Funcao funcao;

    public Funcionario(String name, Date subscribeDate, Double salario, String cpf, Endereco endereco, Funcao funcao) {
        this.dadosPessoais = new DadosPessoais(name, subscribeDate, cpf, endereco) {
        };
        this.salario = salario;
        this.funcao = funcao;
    }

    public Funcionario() {

    }

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
