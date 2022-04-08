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

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioDAO dao = new UsuarioDAO();

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");

		Usuario usuario = dao.findByLogin(login);

		if(usuario == null) {
			resp.sendRedirect("/login.jsp");
		} else {
			if (usuario.getSenha().equals(senha)) {
				resp.sendRedirect("/lista.jsp");
			} else {
				resp.sendRedirect("/login.jsp");
			}
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
}
