package br.upf.projetos.trabalhoFinal;

import java.util.List;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Clinica;
import br.upf.projetos.trabalhoFinal.dao.ClinicaDaoImpl;

public class TesteDaoClinica {
	
	@Test
	public void testeListar() {
		List<Clinica> clinicas = new ClinicaDaoImpl().getObjetos();
		for(Clinica c : clinicas) {
			System.out.println(c.getNome());
		}
	}
	
	@Test
	public void testeInserir() throws Exception {
		Clinica c = new Clinica();
		c.setId(1);
		c.setNome("Vida e saúde");
		c.setEndereco("Rua Capitão Araújo 1255");
		c.setTelefone("(99)99999.1234");
		new ClinicaDaoImpl().gravar(c);
	}
	
	@Test
	public void testeExcluir() throws Exception {
		new ClinicaDaoImpl().excluir(1);
	}
	
	@Test
	public void testeBuscar() throws Exception {
		Clinica c = new ClinicaDaoImpl().getObjetoById(1);
		System.out.println(c.getNome());
	}
	
	@Test
	public void testeAlterar() throws Exception {
		Clinica c = new ClinicaDaoImpl().getObjetoById(1);
		c.setNome("Life Vittá");
	}
}
