package br.upf.projetos.trabalhoFinal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.upf.proejtos.trabalhoFinal.util.JPAUtil;
import br.upf.projetos.trabalhoFinal.beans.Paciente;

public class PacienteDaoImpl implements PacienteDao {

	private EntityManager em;
	
	public PacienteDaoImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}

	@Override
	public Paciente gravar(Paciente objeto) throws Exception {
		em.getTransaction().begin();
		objeto = em.merge(objeto);
		em.getTransaction().commit();
		em.close();
		return objeto;
	}

	@Override
	public void excluir(Integer id) throws Exception {
		em.getTransaction().begin();
		em.remove(em.find(Paciente.class, id));
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Paciente getObjetoById(Integer id) {
		Paciente ret = em.find(Paciente.class, id);
		em.close();
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> getObjetos() {
		List<Paciente> ret = em.createQuery("select o from Paciente o").getResultList();
		em.close();
		return ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> getObjetos(String atributoOrdem) {
		List<Paciente> ret = em.createQuery(
				"select o from Paciente o order by "+atributoOrdem).getResultList();
		em.close();
		return ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> getObjetos(String atributoOrdem, int maxResults,
			int firstResult) {
		List<Paciente> ret = em.createQuery(
				"select o from Paciente o order by "+atributoOrdem).
				setMaxResults(maxResults).setFirstResult(firstResult).getResultList();
		em.close();
		return ret;
	}

}
