package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDVaga extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POVaga Vaga = (POVaga) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(Vaga);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POVaga Vaga = (POVaga) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(Vaga);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POVaga Vaga = (POVaga) o;
		super.open();
		super.em.getTransaction().begin();
		Vaga = super.em.find(POVaga.class, Vaga.getIdVaga());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POVaga o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
