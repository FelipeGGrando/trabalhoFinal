package br.upf.projetos.trabalhoFinal;

import java.util.List;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Clinica;
import br.upf.projetos.trabalhoFinal.dao.GenericDaoImpl;

public class TesteGenericDaoClinica {
	
	@Test
	public void listarClinicas() {
		List<Clinica> lista = new GenericDaoImpl().getObjetos(Clinica.class);
		System.out.println(lista);
	}
	
	@Test
	public void inserirClinica() throws Exception{
		Clinica c = new Clinica();
		c.setId(1);
		c.setNome("OpenVita");
		c.setEndereco("Passo Fundo - RS - Avenida Brasil 1270");
		c.setTelefone("(54) 9914.1740");
		c = new GenericDaoImpl().gravar(c);
		System.out.println(c);
	}
	
	@Test
	public void alterarClinica() throws Exception {
		Clinica c = new GenericDaoImpl().getObjetoById(Clinica.class, 1);
		c.setNome("Clínica do Bem");
		c = new GenericDaoImpl().gravar(c);
	}
	
	@Test
	public void excluirClinica() throws Exception {
		new GenericDaoImpl().excluir(Clinica.class, 1);
	}
	
}
