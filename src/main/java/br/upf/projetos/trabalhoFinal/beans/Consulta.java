package br.upf.projetos.trabalhoFinal.beans;

import br.upf.projetos.trabalhoFinal.beans.Clinica;
import br.upf.projetos.trabalhoFinal.beans.Medico;
import br.upf.projetos.trabalhoFinal.beans.Paciente;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.util.Calendar;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Consulta
 *
 */
@Entity

public class Consulta implements Serializable {
	@Version
	private Long versao;
	@Id
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Future(message = "A data precisa ser no futuro")
	@NotNull(message = "A data da consulta deve ser informada.")
	private Calendar data;
	@Temporal(TemporalType.DATE)
	@NotNull(message = "O horário da consulta deve ser informado.")
	private Calendar horario;
	@Min(value = 0)
	@NotNull(message = "O valor da consulta deve ser informado.")
	private Double valor;
	@NotNull(message = "O paciente da consulta deve ser informado.")
	@ManyToOne(optional = false)
	private Paciente paciente;
	@NotNull(message = "O médico da consulta deve ser informado.")
	@ManyToOne(optional = false)
	private Medico medico;
	@NotNull(message = "A clínica da consulta deve ser informada.")
	@ManyToOne(optional = false)
	private Clinica clinica;
	private static final long serialVersionUID = 1L;

	public Long getVersao() {
		return versao;
	}
	public void setVersao(Long versao) {
		this.versao = versao;
	}
	public Consulta() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Calendar getData() {
		return this.data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}   
	public Calendar getHorario() {
		return this.horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}   
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}   
	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}   
	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}   
	public Clinica getClinica() {
		return this.clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
   
}
