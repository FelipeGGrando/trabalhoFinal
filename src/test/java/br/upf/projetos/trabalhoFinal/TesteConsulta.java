package br.upf.projetos.trabalhoFinal;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Consulta;
import br.upf.projetos.trabalhoFinal.beans.Paciente;

public class TesteConsulta {
	Consulta c = new Consulta();
	SimpleDateFormat dataFormater = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat horarioFormater = new SimpleDateFormat("HH:mm:ss");
	
	@Test
	public void testeId() {
		c.setId(5);
		System.out.println(c.getId());
	}
	@Test
	public void testeData() {
		Calendar ca = Calendar.getInstance();
		ca.set(2016, 04, 06);
		c.setData(ca);
		System.out.println(dataFormater.format(c.getData().getTime()));
	}
	
	@Test
	public void testeHorario() {
		Calendar ca = Calendar.getInstance();
		ca.set(2017, 8, 26, 15, 0);
		c.setData(ca);
		System.out.println(horarioFormater.format(c.getData().getTime()));
	}
	
	@Test
	public void testeValor() {
		c.setValor(150.00);
		System.out.println(c.getValor());
	}
	
	@Test
	public void testePaciente() {
		Paciente pa = new Paciente();
		pa.setNome("João");
		c.setPaciente(pa);
		System.out.println(c.getPaciente().getNome());
	}
	
	@Test
	public void testeMedico() {
		Paciente pa = new Paciente();
		pa.setNome("João");
		c.setPaciente(pa);
		System.out.println(c.getPaciente().getNome());
	}
}
