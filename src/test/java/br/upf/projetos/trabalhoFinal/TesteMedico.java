package br.upf.projetos.trabalhoFinal;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Especializacao;
import br.upf.projetos.trabalhoFinal.beans.Medico;

public class TesteMedico {
	Medico m = new Medico();
	
	@Test
	public void testeId() {
		m.setId(1);
		System.out.println(m.getId());
	}
	
	@Test
	public void testeNome() {
		m.setNome("Dráuzio Varela");
		System.out.println(m.getNome());
	}
	
	@Test
	public void testeTelefone() {
		m.setTelefone("(54)99999.9999");
		System.out.println(m.getTelefone());
	}
	
	@Test
	public void testeCidade() {
		m.setTelefone("Marau");
		System.out.println(m.getCidade());
	}

	@Test
	public void testeEstado() {
		m.setTelefone("Rio Grande do Sul");
		System.out.println(m.getEstado());
	}
	
	@Test
	public void testeEndereco() {
		m.setTelefone("Rua Alfredo Wagner");
		System.out.println(m.getEndereco());
	}

	@Test
	public void testeNumero() {
		m.setTelefone("5024");
		System.out.println(m.getNumero());
	}
	
	// Método que testa um crm válido
	@Test
	public void testeCrmValido() {
		try {
			m.setCrm("000000000000000");
			System.out.println(m.getCrm());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testeEspecializacao() {
		Especializacao e = new Especializacao();
		e.setNome("Pediatria");
		m.setEspecializacao(e);
		System.out.println(m.getEspecializacao().getNome());
	}
}
