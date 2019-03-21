package br.com.impacta.mini.framework.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controller", urlPatterns = { "/controller" })
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		String paginaDestino = "/mini-framework/jsp/formulario-1.jsp";
		
		switch(acao.toUpperCase()){
		
			case "ADICIONAR":
				paginaDestino = "/adicionarServlet";
				break;
			case "REMOVER":
				paginaDestino = "/removerServlet";
				break;
			case "CONSULTAR":
				paginaDestino = "/consultarServlet";
				break;
			default:
				response.sendRedirect(paginaDestino);	
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
		
	}

}
