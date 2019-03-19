package br.com.estacionamento.mvc.view;

import java.io.IOException;
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

/**
 * Servlet implementation class ListarEstadoServlet
 */
@WebServlet("/ListarEstadoServlet")
public class ListarEstadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListarEstadoServlet() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CRUDEstado crud = new CRUDEstado();
		ArrayList<POEstado> result = crud.select("");
		
		JSONArray arr = new JSONArray();
		if (result.size() > 0) {
			for (POEstado e : result) {
				try {
					arr.put(e.toJSON());
				} catch (JSONException el) {
					el.printStackTrace();
				}
			}
		}
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(arr.toString());
	}

}
