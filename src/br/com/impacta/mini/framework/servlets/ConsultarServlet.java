package br.com.impacta.mini.framework.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.mini.framework.model.Usuario;

@WebServlet(name="/ConsultarServlet", urlPatterns = {"/consultarServlet"})
public class ConsultarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pLogin = request.getParameter("login");
		String pSenha = request.getParameter("senha");
		
		Usuario usuario = new Usuario(pNome,pLogin,pSenha);
		request.getSession().setAttribute("usuario", usuario);
		
		//encaminha a requisição para a view corresponte
		String urlPagina = "/jsp/consultado-sucesso.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(urlPagina);
		dispatcher.forward(request, response);
	}
	
}
