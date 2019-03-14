package br.com.estacionamento.mvc.persistent_object;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//CRUD exercicio

public class EstadoCrud {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
	EntityManager em = emf.createEntityManager();
	
	public void salvar(POEstado estado) {
	
		try {
			em.getTransaction().begin();
			em.persist(estado);
			em.merge(estado);
			em.getTransaction().commit();
			System.out.println("Estado Inserido com Sucesso");
			em.close();
			emf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remover(POEstado estado) {
		
		try {
			
			em.getTransaction().begin();
			estado = em.find(POEstado.class, estado.getIdEstado());
			em.remove(estado);
			em.getTransaction().commit();
			System.out.println("Estado Deletado com Sucesso");
			em.close();
			emf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void editar(POEstado estado) {
		
		try {
			
			em.getTransaction().begin();
			em.merge(estado);
			em.getTransaction().commit();
			System.out.println("Estado Editado com Sucesso");
			em.close();
			emf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("unchecked")
	public List <POEstado> Listar(POEstado estado) {
		
		try {
			
			
			Query query = em.createQuery("SELECT e FROM POEstado e");
			query.setFirstResult(0);
			query.setMaxResults(4); 
			List<POEstado> ListaEstado = query.getResultList();
			
			for(POEstado e : ListaEstado) {
				System.out.println(e.getNomeEstado());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
