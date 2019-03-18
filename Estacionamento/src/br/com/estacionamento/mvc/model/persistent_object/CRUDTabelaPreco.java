package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDTabelaPreco extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POTabelaPreco TabelaPreco = (POTabelaPreco) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(TabelaPreco);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POTabelaPreco TabelaPreco = (POTabelaPreco) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(TabelaPreco);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POTabelaPreco TabelaPreco = (POTabelaPreco) o;
		super.open();
		super.em.getTransaction().begin();
		TabelaPreco = super.em.find(POTabelaPreco.class, TabelaPreco.getIdTabelaPreco());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POTabelaPreco o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
