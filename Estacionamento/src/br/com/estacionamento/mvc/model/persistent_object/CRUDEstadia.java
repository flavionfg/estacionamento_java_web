package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDEstadia extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POEstadia estadia = (POEstadia) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(estadia);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POEstadia estadia = (POEstadia) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(estadia);
		super.em.getTransaction().commit();
		super.em.close();
		
	}

	@Override
	public void delete(Object o) {
		POEstadia estadia = (POEstadia) o;
		super.open();
		super.em.getTransaction().begin();
		estadia = super.em.find(POEstadia.class, estadia.getIdEstadia());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
			
		if (statament == null || statament.equals(statament)) {
			statament = "SELECT o FROM POEstadia o ";
		}
		
		super.open();
		Query query = super.em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
