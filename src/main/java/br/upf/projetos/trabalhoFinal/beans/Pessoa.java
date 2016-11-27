package br.upf.projetos.trabalhoFinal.beans;

import static javax.persistence.InheritanceType.JOINED;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy = JOINED)
public abstract class Pessoa implements Serializable {
	@Version
	private Long versao;
	@Id
	private Integer id;
	@Column(length = 255, nullable = false)
	@NotNull(message = "O nome deve ser informado.")
	@Length(min = 1, max = 255, message = "O nome deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String nome;
	@Column(length = 15, nullable = false)
	@NotNull(message = "O telefone deve ser informado.")
	@Length(min = 1, max = 15, message = "O telefone deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String telefone;
	@Column(length = 255, nullable = false)
	@NotNull(message = "A cidade deve ser informada.")
	@Length(min = 1, max = 255, message = "A cidade deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String cidade;
	@Column(length = 255, nullable = false)
	@NotNull(message = "O estado deve ser informado.")
	@Length(min = 1, max = 255, message = "O estado deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String estado;
	@Column(length = 255, nullable = false)
	@NotNull(message = "O endereco deve ser informado.")
	@Length(min = 1, max = 255, message = "O endereco deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String endereco;
	@Column(length = 10, nullable = false)
	@NotNull(message = "O número deve ser informado.")
	@Length(min = 1, max = 10, message = "O número deve ter no mínimo {min} e no máximo {max} caracteres.")
	private String numero;
	
	public Long getVersao() {
		return versao;
	}
	public void setVersao(Long versao) {
		this.versao = versao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	private static final long serialVersionUID = 1L;

	public Pessoa() {
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
