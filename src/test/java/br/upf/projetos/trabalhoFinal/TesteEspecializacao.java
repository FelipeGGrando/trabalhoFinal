package br.upf.projetos.trabalhoFinal;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Especializacao;

public class TesteEspecializacao {
	Especializacao e = new Especializacao();
	
	@Test
	public void testeId() {
		e.setId(1);
		System.out.println(e.getId());
	}
	
	@Test
	public void testNome() {
		e.setNome("Oncologia");
		System.out.println(e.getNome());
	}
}
