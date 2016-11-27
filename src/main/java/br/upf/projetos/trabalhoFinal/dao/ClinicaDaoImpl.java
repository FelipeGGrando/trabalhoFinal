package br.upf.projetos.trabalhoFinal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.upf.proejtos.trabalhoFinal.util.JPAUtil;
import br.upf.projetos.trabalhoFinal.beans.Clinica;

public class ClinicaDaoImpl implements ClinicaDao{
	
	private EntityManager em;
	
	public ClinicaDaoImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}
	
	@Override
	public Clinica gravar(Clinica objeto) throws Exception {
		em.getTransaction().begin();
		objeto = em.merge(objeto);
		em.getTransaction().commit();
		em.close();
		return objeto;
	}

	@Override
	public void excluir(Integer id) throws Exception {
		em.getTransaction().begin();
		em.remove(em.find(Clinica.class, id));
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Clinica getObjetoById(Integer id) {
		Clinica ret = em.find(Clinica.class, id);
		em.close();
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Clinica> getObjetos() {
		List<Clinica> ret = em.createQuery("select o from Clinica o").getResultList();
		em.close();
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Clinica> getObjetos(String atributoOrdem) {
		List<Clinica> ret = em.createQuery(
				"select o from Clinica o order by "+atributoOrdem).getResultList();
		em.close();
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Clinica> getObjetos(String atributoOrdem, int maxResults,
			int firstResult) {
		List<Clinica> ret = em.createQuery(
				"select o from Clinica o order by "+atributoOrdem).
				setMaxResults(maxResults).setFirstResult(firstResult).getResultList();
		em.close();
		return ret;
	}

}
