package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDMensalistaVeiculo extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POMensalistaVeiculo MensalistaVeiculo = (POMensalistaVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(MensalistaVeiculo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POMensalistaVeiculo MensalistaVeiculo = (POMensalistaVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(MensalistaVeiculo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POMensalistaVeiculo MensalistaVeiculo = (POMensalistaVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		MensalistaVeiculo = super.em.find(POMensalistaVeiculo.class, MensalistaVeiculo.getIdMensalistaVeiculo());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POMensalistaVeiculo o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
