package br.com.estacionamento.mvc.model.persistent_object;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumCor;
import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//SET @@glocal_time_zone = "+3:00" - rodar no banco em caso de erro de timezone
//ATALHOS:

//Tecla end vai para o final da linha e home para o come�o
//segure shift e aperto home ele selecione toda a linha
//ctrl + home vai para o topo da pagina
//ctrl + end vai para o fim da pagina


public class Teste {
	
	public static void main(String[] args) {
		
		
//		System.out.println(EnumStatus.INATIVO.getStatus()); //pegar o valor do enum inativo
//		
//		POEstado e = new POEstado();
////		e.setNomeEstado("S�o paulo");
////		e.setSiglaEstado("SP");
////		e.setStatusEstado(EnumStatus.ATIVO);
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
//		EntityManager em = emf.createEntityManager();
//		
//		
//		
//		
//		//Opera��o
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
//		es.setNomeEstado("Santa Catarina");
//		es.setSiglaEstado("SC");
//		es.setIdEstado(6);
//		
//		EstadoCrud ec = new EstadoCrud();
//		ec.salvar(es);
//		ec.remover(es);
//		ec.editar(es);
//		ec.Listar(es);
	
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
		
		
		
//		CRUDEstado crudEstado = new CRUDEstado();
//		CRUDCidade crudCidade = new CRUDCidade();
//		
//		ArrayList<Object> estadoResult = crudEstado
//				.select("SELECT o FROM POEstado o WHERE "
//						+ "o.idEstado = 1");
//		
//		POEstado estado = (POEstado) estadoResult.get(0);
//		
//		POCidade cidade = new POCidade();
//		cidade.setNomeCidade("Rol�ndia");
//		cidade.setEstadoCidade(estado);
//		cidade.setStatusCidade(EnumStatus.ATIVO);
//		
//		crudCidade.insert(cidade);
//		System.out.println(cidade.getIdCidade());
		
//		POMarca marca = new POMarca();
//		marca.setDescricao("Honda");
//		marca.setStatus_marca(EnumStatus.ATIVO);
//		
//		POModelo m = new POModelo();
//		m.setDescrica("CIVIC");
//		m.setStatus_modelo(EnumStatus.ATIVO);
//		m.setMarcaModelo(marca);
//	
//		POVeiculo v = new POVeiculo();
//		v.setCorVeiculo(EnumCor.PRETO);
//		v.setPlacaVeiculo("vdl-2123");
//		v.setModeloVeiculo(m);
//		v.setStatusVeiculo(EnumStatus.ATIVO);
//		
//		CRUDVeiculo crudVeiculo = new CRUDVeiculo();
		
		
		

	}

}
