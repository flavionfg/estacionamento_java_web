package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDTelefone extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POTelefone Telefone = (POTelefone) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(Telefone);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POTelefone Telefone = (POTelefone) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(Telefone);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POTelefone Telefone = (POTelefone) o;
		super.open();
		super.em.getTransaction().begin();
		Telefone = super.em.find(POTelefone.class, Telefone.getIdTelefone());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POTelefone o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
