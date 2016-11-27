package br.upf.projetos.trabalhoFinal;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Paciente;

public class TestePaciente {
	Paciente p = new Paciente();
	
	@Test
	public void testeId() {
		p.setId(1);
		System.out.println(p.getId());
	}
	
	@Test
	public void testeNome() {
		p.setNome("Felipe Gasparin Grando");
		System.out.println(p.getNome());
	}
	
	@Test
	public void testeTelefone() {
		p.setTelefone("(54)99999.9999");
		System.out.println(p.getTelefone());
	}
	
	@Test
	public void testeCidade() {
		p.setTelefone("Passo Fundo");
		System.out.println(p.getCidade());
	}

	@Test
	public void testeEstado() {
		p.setTelefone("Rio Grande do Sul");
		System.out.println(p.getEstado());
	}

	@Test
	public void testeEndereco() {
		p.setTelefone("Rua Frederico Westphalen");
		System.out.println(p.getEndereco());
	}

	@Test
	public void testeNumero() {
		p.setTelefone("1250");
		System.out.println(p.getNumero());
	}
	
	// Método que testa um cpf válido
	@Test
	public void testeCpfValido() {
		try {
			p.setCpf("717.560.357-68");
			System.out.println(p.getCpf());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
