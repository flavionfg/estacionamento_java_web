package br.com.estacionamento.mvc.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estacionamento.mvc.model.persistent_object.CRUDEstado;
import br.com.estacionamento.mvc.model.persistent_object.POEstado;
import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

@WebServlet("/InserirEstadoServlet")
public class InserirEstadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InserirEstadoServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	PrintWriter out = response.getWriter();
		
	String nome = request.getParameter("estado_nome");
	String sigla = request.getParameter("estado_sigla");
	//int id = Integer.parseInt(request.getParameter("id"));
	String status = request.getParameter("estado_status");
	
	System.out.println(nome + " " + sigla + " " );
	
	POEstado estado = new POEstado();
	estado.setNomeEstado(nome);
	estado.setSiglaEstado(sigla);
	//estado.setIdEstado(id);
	
	if (status.equals(EnumStatus.ATIVO) ) {
		estado.setStatusEstado(EnumStatus.ATIVO);
	}else {
		estado.setStatusEstado(EnumStatus.INATIVO);
	}
		
	CRUDEstado crud = new CRUDEstado();
	crud.insert(estado);
		
	if (estado.getIdEstado() > 0) {
		response.sendRedirect(request.getContextPath() + "/sucesso.jsp");
	}else {
		response.sendRedirect(request.getContextPath() + "/erro.jps");
	}

	out.println("<html>");
	out.println("<body>");
	out.println("<h1>Cadastrar um Estado</h1>");
	out.println("O nome do estado salvo é " + estado.getNomeEstado() + " Com a sigla " + estado.getSiglaEstado());
	out.println("</body>");
	out.println("</html>");
	
	}

}
