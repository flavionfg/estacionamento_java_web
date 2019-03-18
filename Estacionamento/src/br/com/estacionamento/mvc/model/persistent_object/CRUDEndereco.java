package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDEndereco extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POEndereco end = (POEndereco) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(end);
		super.em.getTransaction().commit();
		super.close();
	}

	@Override
	public void update(Object o) {
		POEndereco end = (POEndereco) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(end);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POEndereco end = (POEndereco) o;
		super.open();
		super.em.getTransaction().begin();
		end = super.em.find(POEndereco.class, end.getIdEndereco());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POEndereco o";
		}
		
		super.open();
		Query query = super.em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
