package br.com.estacionamento.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estacionamento.mvc.model.persistent_object.CRUDCidade;
import br.com.estacionamento.mvc.model.persistent_object.POCidade;
import br.com.estacionamento.mvc.model.persistent_object.POEstado;
import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

@WebServlet("/UpdateCidadeServlet")
public class UpdateCidadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateCidadeServlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nome = request.getParameter("cidade_nome");
		String status = request.getParameter("cidade_status");
	
		POEstado estado = new POEstado();
		estado.setIdEstado(Integer.parseInt(request.getParameter("estado")));
		
		System.out.println("estado : " + estado.getIdEstado());
		
		POCidade cidade = new POCidade();
		cidade.setNomeCidade(nome);
		
		System.out.println(nome + "" + estado);
		
		if (status.equals(EnumStatus.ATIVO)) {
			cidade.setStatusCidade(EnumStatus.ATIVO);
		}else{
			cidade.setStatusCidade(EnumStatus.INATIVO);
		}
		
		cidade.setEstadoCidade(estado);
		
		CRUDCidade c = new CRUDCidade();
		c.update(estado);
		
		System.out.println("Cidade Atualizada com Sucesso!");
			
	}

}
