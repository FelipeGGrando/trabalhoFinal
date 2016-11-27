package br.upf.projetos.trabalhoFinal;

import java.util.List;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Paciente;
import br.upf.projetos.trabalhoFinal.dao.GenericDaoImpl;

public class TesteGenericDaoPaciente {
	
	@Test
	public void listarPacientes() {
		List<Paciente> lista = new GenericDaoImpl().getObjetos(Paciente.class);
		System.out.println(lista);
	}
	
	@Test
	public void inserirPaciente() throws Exception{
		Paciente p = new Paciente();
		p.setId(2);
		p.setNome("Mário");
		p.setCpf("037.586.020-76");
		p.setEstado("Rio Grande do Sul");
		p.setCidade("Passo Fundo");
		p.setEndereco("Rua Capitão Araújo");
		p.setNumero("800");
		p.setTelefone("(54)99914.1740");
		p = new GenericDaoImpl().gravar(p);
		System.out.println(p);
	}
	
	@Test
	public void alterarPaciente() throws Exception {
		Paciente p = new GenericDaoImpl().getObjetoById(Paciente.class, 1);
		p.setNome("Carlos");
		p = new GenericDaoImpl().gravar(p);
	}
	
	@Test
	public void excluirPaciente() throws Exception {
		new GenericDaoImpl().excluir(Paciente.class, 2);
	}
	
}
