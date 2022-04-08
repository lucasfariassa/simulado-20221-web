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
public class CadastrarUsuarioController extends HttpServlet {

	private static final long serialVersionUID = -6203239160583344809L;
	
	private UsuarioDAO dao = new UsuarioDAO();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		System.out.println(login);
		System.out.println(senha);
		
		// O if não está funcionando
		/* if(!login.equals("") || !senha.equals("")) {
			Usuario usuario = new Usuario();
			usuario.setLogin(login);
			usuario.setSenha(senha);
			dao.save(usuario);
			resp.sendRedirect("/lista");
		} else {
			resp.sendRedirect("/cadastro.jsp");
		} */
		
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		dao.save(usuario);
		resp.sendRedirect("/login");

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/cadastro.jsp").forward(req, resp);
	}
}
