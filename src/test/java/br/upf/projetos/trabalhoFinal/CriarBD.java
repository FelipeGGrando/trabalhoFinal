package br.upf.projetos.trabalhoFinal;

import javax.persistence.Persistence;

import org.junit.Test;

public class CriarBD {
	
	@Test
	public void criarBD() {
		Persistence.createEntityManagerFactory("trabalhoFinal");
	}
}
