package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDUsuario extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POUsuario Usuario = (POUsuario) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(Usuario);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POUsuario Usuario = (POUsuario) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(Usuario);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POUsuario Usuario = (POUsuario) o;
		super.open();
		super.em.getTransaction().begin();
		Usuario = super.em.find(POUsuario.class, Usuario.getIdUsuario());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POUsuario o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
