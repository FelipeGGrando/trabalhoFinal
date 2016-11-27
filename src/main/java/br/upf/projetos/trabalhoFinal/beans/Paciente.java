package br.upf.projetos.trabalhoFinal.beans;

import br.upf.projetos.trabalhoFinal.beans.Pessoa;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity
public class Paciente extends Pessoa implements Serializable {

	@CPF(message = "O CPF do paciente deve ser válido")
	@NotNull
	private String cpf;
	private static final long serialVersionUID = 1L;

	public Paciente() {
		super();
	}
	
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
   
}
