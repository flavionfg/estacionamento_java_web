package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDVeiculo extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POVeiculo Veiculo = (POVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(Veiculo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POVeiculo Veiculo = (POVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(Veiculo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POVeiculo Veiculo = (POVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		Veiculo = super.em.find(POVeiculo.class, Veiculo.getIdVeiculo());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POVeiculo o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
