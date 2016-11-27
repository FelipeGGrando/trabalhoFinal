package br.upf.projetos.trabalhoFinal;

import java.util.List;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Paciente;
import br.upf.projetos.trabalhoFinal.dao.PacienteDaoImpl;

public class TesteDaoPaciente {
	
	@Test
	public void testeListar() {
		List<Paciente> pacientes = new PacienteDaoImpl().getObjetos();
		for(Paciente p : pacientes) {
			System.out.println(p.getNome());
		}
	}
	
	@Test
	public void testeInserir() throws Exception {
		Paciente p = new Paciente();
		p.setId(1);
		p.setNome("Miguel da Silva");
		p.setCidade("Passo Fundo");
		p.setEstado("Rio Grande do Sul");
		p.setEndereco("Avenida Brasil");
		p.setNumero("500");
		p.setTelefone("(99)99999.1234");
		p.setCpf("999.999.099-99");
		new PacienteDaoImpl().gravar(p);
	}
	
	@Test
	public void testeExcluir() throws Exception {
		new PacienteDaoImpl().excluir(1);
	}
	
	@Test
	public void testeBuscar() throws Exception {
		Paciente p = new PacienteDaoImpl().getObjetoById(1);
		System.out.println(p.getNome());
	}
	
	@Test
	public void testeAlterar() throws Exception {
		Paciente p = new PacienteDaoImpl().getObjetoById(1);
		p.setNome("Maria do Bairro");
		new PacienteDaoImpl().gravar(p);
	}
}
