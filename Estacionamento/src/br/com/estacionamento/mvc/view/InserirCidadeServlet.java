package br.com.estacionamento.mvc.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estacionamento.mvc.model.persistent_object.CRUDCidade;
import br.com.estacionamento.mvc.model.persistent_object.POCidade;
import br.com.estacionamento.mvc.model.persistent_object.POEstado;
import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;


@WebServlet("/InserirCidadeServlet")
public class InserirCidadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InserirCidadeServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("cidade_nome");
		String status = request.getParameter("cidade_status");
		
		POEstado estado = new POEstado();
		estado.setIdEstado(Integer.parseInt(request.getParameter("estado")));
		
		POCidade cidade = new POCidade();
		
		cidade.setNomeCidade(nome);
		
		if (status.equals(EnumStatus.ATIVO)) {
			cidade.setStatusCidade(EnumStatus.ATIVO);
		}else{
			cidade.setStatusCidade(EnumStatus.INATIVO);
		}
		
		cidade.setEstadoCidade(estado);
		
		CRUDCidade crud = new CRUDCidade();
		crud.insert(cidade);
		
		System.out.println("Cadastrado " + cidade.getNomeCidade() + " Com Sucesso!");
	}

}
