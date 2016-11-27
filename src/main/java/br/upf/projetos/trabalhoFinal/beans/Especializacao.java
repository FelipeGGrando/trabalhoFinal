package br.upf.projetos.trabalhoFinal.beans;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Especializacao
 *
 */
@Entity

public class Especializacao implements Serializable {
	@Version
	private Long versao;
	@Id
	private Integer id;
	@Column(length = 255, nullable = false)
	@NotNull(message = "O nome da especialização deve ser informado.")
	@Length(min = 1, max = 255, message = "O nome da especializacao deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String nome;
	private static final long serialVersionUID = 1L;

	public Long getVersao() {
		return versao;
	}
	public void setVersao(Long versao) {
		this.versao = versao;
	}
	public Especializacao() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
}
