package br.upf.projetos.trabalhoFinal.beans;

import br.upf.projetos.trabalhoFinal.beans.Clinica;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Calendar;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: HorarioDisponivel
 *
 */
@Entity

public class HorarioDisponivel implements Serializable {
	@Version
	private Long versao;
	@Id
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Future(message = "A data precisa ser no futuro")
	@NotNull(message = "A data deve ser informada.")
	private Calendar data;
	@Temporal(TemporalType.DATE)
	@NotNull(message = "O horário deve ser informado.")
	private Calendar horario;
	@ManyToOne(optional = false)
	@NotNull(message = "A clínica deve ser informada.")
	private Clinica clinica;
	private static final long serialVersionUID = 1L;

	public Long getVersao() {
		return versao;
	}
	public void setVersao(Long versao) {
		this.versao = versao;
	}
	public HorarioDisponivel() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Calendar getHorario() {
		return this.horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}   
	public Calendar getData() {
		return this.data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}   
	public Clinica getClinica() {
		return this.clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
   
}
