package br.upf.projetos.trabalhoFinal.beans;


import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;



/**
 * Entity implementation class for Entity: Clinica
 *
 */
@Entity

public class Clinica implements Serializable {
	@Version
	private Long versao;
	@Id
	private Integer id;
	@Column(length = 60, nullable = false)
	@NotNull(message = "O nome da clínica deve ser informado.")
	@Length(min = 1, max = 60, message = "O nome da clínica deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String nome;
	@Column(length = 255, nullable = false)
	@NotNull(message = "O endereço da clínica deve ser informado.")
	@Length(min = 1, max = 255, message = "O endereco da clínica deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String endereco;
	@Column(length = 15, nullable = false)
	@NotNull(message = "O telefone deve ser informado.")
	@Length(min = 1, max = 15, message = "O telefone deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String telefone;
	private static final long serialVersionUID = 1L;

	public Clinica() {
		super();
	}   
	
	public Long getVersao() {
		return versao;
	}

	public void setVersao(Long versao) {
		this.versao = versao;
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
	
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}   
	
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
   
}
