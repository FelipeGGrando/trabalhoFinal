package br.upf.projetos.trabalhoFinal;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import br.upf.projetos.trabalhoFinal.beans.Clinica;
import br.upf.projetos.trabalhoFinal.beans.HorarioDisponivel;

public class TesteHorarioDisponivel {
	HorarioDisponivel hd = new HorarioDisponivel();
	SimpleDateFormat dataFormater = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat horarioFormater = new SimpleDateFormat("HH:mm:ss");

	@Test
	public void testeId() {
		hd.setId(1);
		System.out.println(hd.getId());
	}
	
	@Test
	public void testeData() {
		Calendar c = Calendar.getInstance();
		c.set(2017, 03, 26);
		hd.setData(c);
		System.out.println(dataFormater.format(hd.getData().getTime()));
	}
	
	@Test
	public void testeHorario() {
		Calendar c = Calendar.getInstance();
		c.set(2017, 03, 26, 15, 0);
		hd.setData(c);
		System.out.println(horarioFormater.format(hd.getData().getTime()));
	}
	
	@Test
	public void testeClinica() {
		Clinica c = new Clinica();
		c.setNome("Odoncenter");
		hd.setClinica(c);
		System.out.println(hd.getClinica().getNome());
	}
}
