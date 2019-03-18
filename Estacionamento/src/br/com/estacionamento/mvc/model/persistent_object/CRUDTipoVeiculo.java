package br.com.estacionamento.mvc.model.persistent_object;


import java.util.ArrayList;

import javax.persistence.Query;

public class CRUDTipoVeiculo extends AbstractCRUD{

	@Override
	public void insert(Object o) {
		POTipoVeiculo TipoVeiculo = (POTipoVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.persist(TipoVeiculo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void update(Object o) {
		POTipoVeiculo TipoVeiculo = (POTipoVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		super.em.merge(TipoVeiculo);
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public void delete(Object o) {
		POTipoVeiculo TipoVeiculo = (POTipoVeiculo) o;
		super.open();
		super.em.getTransaction().begin();
		TipoVeiculo = super.em.find(POTipoVeiculo.class, TipoVeiculo.getIdTipoVeiculo());
		super.em.getTransaction().commit();
		super.close();
		
	}

	@Override
	public ArrayList<Object> select(String statament) {
		
		if (statament == null || statament.equals("")) {
			statament = "SELECT o FROM POTipoVeiculo o";
		}
		
		super.open();
		Query query = em.createQuery(statament);
		ArrayList<Object> set = (ArrayList<Object>) query.getResultList();
		super.close();
		return set;
	}

}
