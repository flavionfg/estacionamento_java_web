package br.com.estacionamento.mvc.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;

import br.com.estacionamento.mvc.model.persistent_object.CRUDEstado;
import br.com.estacionamento.mvc.model.persistent_object.POEstado;
import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;


@WebServlet("/UpdateEstadoServlet")
public class UpdateEstadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateEstadoServlet() {
        super();
  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("estado_nome");
		String sigla = request.getParameter("estado_sigla");
		int id = Integer.parseInt(request.getParameter("id"));
		String status = request.getParameter("estado_status");
		
		System.out.println(nome + " " + sigla + " " + id);

		POEstado estado = new POEstado();
		estado.setNomeEstado(nome);
		estado.setSiglaEstado(sigla);
		estado.setIdEstado(id);
		if (status.equals(EnumStatus.ATIVO)) {
			estado.setStatusEstado(EnumStatus.ATIVO);
		}else {
			estado.setStatusEstado(EnumStatus.INATIVO);
		}
	
		CRUDEstado e = new CRUDEstado();		
		e.update(estado);
		
		System.out.println("Atualizado com Sucesso!");

	}

}
