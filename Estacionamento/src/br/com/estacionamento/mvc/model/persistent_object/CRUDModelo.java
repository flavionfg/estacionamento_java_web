package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDModelo extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POModelo Modelo = (POModelo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(Modelo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POModelo Modelo = (POModelo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(Modelo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POModelo Modelo = (POModelo) o;
		super.open();
		super.em.getTransaction().begin();
		Modelo = super.em.find(POModelo.class, Modelo.getIdModelo());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POModelo o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
