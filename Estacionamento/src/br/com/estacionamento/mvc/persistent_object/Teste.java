package br.com.estacionamento.mvc.persistent_object;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.estacionamento.mvc.persistent_object.enums.EnumStatus;

//SET @@glocal_time_zone = "+3:00" - rodar no banco em caso de erro de timezone


public class Teste {
	
	public static void main(String[] args) {
		
		
		System.out.println(EnumStatus.INATIVO.getStatus()); //pegar o valor do enum inativo
		
		POEstado e = new POEstado();
		e.setNomeEstado("São paulo");
		e.setSiglaEstado("SP");
		e.setStatusEstado(EnumStatus.ATIVO);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
		EntityManager em = emf.createEntityManager();
		
		//Operação
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	
	}

}
