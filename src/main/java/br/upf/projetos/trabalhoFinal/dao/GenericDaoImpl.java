package br.upf.projetos.trabalhoFinal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.upf.proejtos.trabalhoFinal.util.JPAUtil;

public class GenericDaoImpl implements GenericDao {

	private EntityManager em;
	
	public GenericDaoImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}	
	
	@Override
	public <T> T gravar(T objeto) throws Exception {
		em.getTransaction().begin();
		objeto = em.merge(objeto);
		em.getTransaction().commit();
		em.close();
		return objeto;
	}

	@Override
	public <T> void excluir(Class<T> classe, Integer id) throws Exception {
		em.getTransaction().begin();
		em.remove(em.find(classe, id));
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public <T> T getObjetoById(Class<T> classe, Integer id) {
		T ret = em.find(classe, id);
		em.close();
		return ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getObjetos(Class<T> classe) {
		List<T> ret = em.createQuery("select o from "+
	                  classe.getSimpleName()+" o").getResultList();
		em.close();
		return ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getObjetos(Class<T> classe, String atributoOrdem) {
		List<T> ret = em.createQuery(
				"select o from "+
	            classe.getSimpleName()+" o order by "+atributoOrdem).getResultList();
		em.close();
		return ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getObjetos(Class<T> classe, String atributoOrdem,
			int maxResults, int firstResult) {
		List<T> ret = em.createQuery(
				"select o from "+
	            classe.getSimpleName()+" o order by "+atributoOrdem).
				setMaxResults(maxResults).setFirstResult(firstResult).getResultList();
		em.close();
		return ret;
	}

}
