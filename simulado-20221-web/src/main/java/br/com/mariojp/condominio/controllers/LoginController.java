package br.com.mariojp.condominio.controllers;

import java.io.IOException;

import br.com.mariojp.condominio.model.Usuario;
import br.com.mariojp.condominio.dao.UsuarioDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 9114513377601247298L;
	
	private UsuarioDAO dao = new UsuarioDAO();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");

		Usuario usuario = dao.findByLogin(login);

		if(usuario != null && usuario.getSenha().equals(senha)) {
			req.getSession().setAttribute("usuario", usuario);
			resp.sendRedirect("/lista");
		} else {
			req.setAttribute("Usuário e/ou senha incorretos", "erro");
			resp.sendRedirect("/login.jsp");
		}
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
}
