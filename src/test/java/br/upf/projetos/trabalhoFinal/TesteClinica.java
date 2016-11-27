package br.upf.projetos.trabalhoFinal;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Clinica;

public class TesteClinica {
	Clinica c = new Clinica();
	
	
	@Test
	public void testeId() {
		c.setId(1);
		System.out.println(c.getId());
	}
	
	@Test
	public void testeNome() {
		c.setNome("Vitta Life");
		System.out.println(c.getNome());
	}
	
	@Test
	public void testeEndereco() {
		c.setEndereco("Rua Antônio Prado - 800 - São Paulo - SP");
		System.out.println(c.getEndereco());
	}
	
	@Test
	public void testeTelefone() {
		c.setTelefone("(54)99912.1825");
		System.out.println(c.getTelefone());
	}
	
}
