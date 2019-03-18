package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDMarca extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POMarca marca = (POMarca) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(marca);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POMarca marca = (POMarca) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(marca);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POMarca marca = (POMarca) o;
		super.open();
		super.em.getTransaction().begin();
		marca = super.em.find(POMarca.class, marca.getIdMarca());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POMarca o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
