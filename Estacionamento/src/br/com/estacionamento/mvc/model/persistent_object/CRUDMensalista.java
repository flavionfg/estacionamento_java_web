package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDMensalista extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POMensalista Mensalista = (POMensalista) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(Mensalista);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POMensalista Mensalista = (POMensalista) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(Mensalista);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POMensalista Mensalista = (POMensalista) o;
		super.open();
		super.em.getTransaction().begin();
		Mensalista = super.em.find(POMensalista.class, Mensalista.getIdMensalista());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POMensalista o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
