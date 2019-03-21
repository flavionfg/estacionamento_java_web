package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDCidade extends AbstractCRUD{
	
	@Override
	public void insert(Object o) {
		
		POCidade po = (POCidade) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(po);
		super.em.getTransaction().commit();
		super.close();
	}
	
	public void update(Object o) {
		POCidade po = (POCidade) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(po);
		super.em.getTransaction().commit();
		super.close();
	}
	
	public void delete (Object o) {
		POCidade po = (POCidade) o;
		super.open();
		super.em.getTransaction().begin();
		po = super.em.find(POCidade.class, po.getIdCidade());
		super.em.remove(po);
		super.em.getTransaction().commit();
		super.close();
		
		
	}
	
	public ArrayList<POCidade> select (String statement){
		
		if (statement == null || statement.equals("")) {
			statement = "SELECT o FROM POCidade o";
		}
		
		super.open();
		Query query = super.em.createQuery(statement);
		ArrayList<POCidade> set = (ArrayList<POCidade>) query.getResultList();
		super.close();
		return set;
	}
	
	
	

}
