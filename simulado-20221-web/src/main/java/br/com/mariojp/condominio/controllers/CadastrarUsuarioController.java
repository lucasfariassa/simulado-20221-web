package br.com.mariojp.condominio.controllers;

import java.io.IOException;

import br.com.mariojp.condominio.dao.UsuarioDAO;
import br.com.mariojp.condominio.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/cadastro")
public class LoginController extends HttpServlet {

	UsuarioDAO dao = new UsuarioDAO();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");

		if(!login.equals("") || !senha.equals("")) {
			Usuario usuario = new Usuario(login, senha);
			dao.save(usuario);
			resp.sendRedirect("/login.jsp")
		} else {
			resp.sendRedirect("/cadastro.jsp");
		}

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/cadastro.jsp").forward(req, resp);
	}
}
