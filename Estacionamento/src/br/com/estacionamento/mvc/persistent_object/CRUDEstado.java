package br.com.estacionamento.mvc.persistent_object;

import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDEstado extends AbstractCRUD{
	
	@Override
	public void insert(Object o) {
		
		POEstado po = (POEstado) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(po);
		super.em.getTransaction().commit();
		super.close();
	}
	
	public void update(Object o) {
		POEstado po = (POEstado) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(po);
		super.em.getTransaction().commit();
		super.close();
	}
	
	public void delete (Object o) {
		POEstado po = (POEstado) o;
		super.open();
		super.em.getTransaction().begin();
		po = super.em.find(POEstado.class, po.getIdEstado());
		super.em.remove(po);
		super.em.getTransaction().commit();
		super.close();
		
		
	}
	
	public ArrayList<Object> select (String statement){
		
		if (statement == null || statement.equals("")) {
			statement = "SELECT o FROM POEstado o";
		}
		
		super.open();
		Query query = super.em.createQuery(statement);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}
}
