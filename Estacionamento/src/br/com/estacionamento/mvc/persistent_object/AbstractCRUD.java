package br.com.estacionamento.mvc.persistent_object;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Exemplo CRUD do professor!!

public abstract class AbstractCRUD {
	
	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;
	
	
	public void open() {
		
		this.emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
		this.em = this.emf.createEntityManager();
	}
	
	public void close() {
		this.em.close();
		this.emf.close();
		
	}

	public abstract void insert(Object o);
	public abstract void update(Object o);
	public abstract void delete(Object o);
	public abstract ArrayList<Object> select(String statament);
	
}
