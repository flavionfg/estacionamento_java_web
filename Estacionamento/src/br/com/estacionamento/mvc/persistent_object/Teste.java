package br.com.estacionamento.mvc.persistent_object;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.estacionamento.mvc.persistent_object.enums.EnumStatus;

//SET @@glocal_time_zone = "+3:00" - rodar no banco em caso de erro de timezone
//ATALHOS:

//Tecla end vai para o final da linha e home para o começo
//segure shift e aperto home ele selecione toda a linha
//ctrl + home vai para o topo da pagina
//ctrl + end vai para o fim da pagina


public class Teste {
	
	public static void main(String[] args) {
		
		
//		System.out.println(EnumStatus.INATIVO.getStatus()); //pegar o valor do enum inativo
//		
//		POEstado e = new POEstado();
////		e.setNomeEstado("São paulo");
////		e.setSiglaEstado("SP");
////		e.setStatusEstado(EnumStatus.ATIVO);
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
//		EntityManager em = emf.createEntityManager();
//		
//		
//		
//		
//		//Operação
//		em.getTransaction().begin();
////		em.persist(e);
//		e = em.find(POEstado.class, e.getIdEstado());
////		e = em.find(POEstado.class, 2);
////		em.remove(e);
//		
//		
//		
//		e.setNomeEstado("Pernanbuco");
//		em.merge(e);
//		
//		em.getTransaction().commit();
//		
//		em.close();
//		emf.close();
//		
		//System.out.println(e.getIdEstado());
		
		//find
		
		POEstado es = new POEstado();
		es.setNomeEstado("Santa Catarina");
		es.setSiglaEstado("SC");
		es.setIdEstado(6);
		
		EstadoCrud ec = new EstadoCrud();
//		ec.salvar(es);
//		ec.remover(es);
//		ec.editar(es);
		ec.Listar(es);
	
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
//		EntityManager em = emf.createEntityManager();
//		
//		Query q = em.createQuery("SELECT o FROM POEstado o");
//		q.setFirstResult(0);
//		q.setMaxResults(4); //quantidade maximo de resultado
//		ArrayList<POEstado> l = (ArrayList<POEstado>) q.getResultList();
//		
//		em.close();
//		emf.close();
//		
//		for(POEstado e : l) {
//			System.out.println(e.getNomeEstado());
//		}
		
	}

}
