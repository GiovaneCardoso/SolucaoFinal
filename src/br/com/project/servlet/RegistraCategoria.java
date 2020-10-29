package br.com.project.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.project.beans.PerguntaCategoria;
import br.com.project.bo.CategoriaBO;

/**
 * Servlet implementation class RegistraCategoria
 */
@WebServlet("/RegistraCategoria")
public class RegistraCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistraCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* int id = Integer.parseInt(request.getParameter("id")); */
		String nome = request.getParameter("nomeCategoria");
		
		PerguntaCategoria pc = new PerguntaCategoria();
		pc.setNome(nome);
		
		try {
			if(CategoriaBO.novo(pc)) {
				request.setAttribute("message", "Inserido com sucesso! " + "<a href=index.jsp>Clique para voltar para a index</a>");
			} else {
				request.setAttribute("message", "Problema no cadastro!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			request.setAttribute("message", "Problema no cadastro!");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("perguntas.jsp");
		dispatcher.forward(request, response);
	}

}
