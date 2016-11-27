package br.upf.projetos.trabalhoFinal.beans;

import br.upf.projetos.trabalhoFinal.beans.Pessoa;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Medico
 *
 */
@Entity

public class Medico extends Pessoa implements Serializable {

	@Column(length = 50, nullable = false)
	@NotNull(message = "O CRM do médico deve ser informado.")
	@Length(min = 1, max = 50, message = "O CRM do médico deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String crm;
	@NotNull(message = "A especialização do médico deve ser informada")
	@ManyToOne(optional = false)
	private Especializacao especializacao;
	@NotNull(message = "A clínica do médico deve ser informada")
	@ManyToOne(optional = false)
	private Clinica clinica;
	
	public Clinica getClinica() {
		return clinica;
	}
	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
	public Especializacao getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(Especializacao especializacao) {
		this.especializacao = especializacao;
	}

	private static final long serialVersionUID = 1L;

	public Medico() {
		super();
	}   
	public String getCrm() {
		return this.crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
   
}
