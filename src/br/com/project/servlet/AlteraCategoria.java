package br.com.project.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.project.beans.PerguntaCategoria;
import br.com.project.dao.CategoriaDAO;

/**
 * Servlet implementation class AlteraCategoria
 */
@WebServlet("/AlteraCategoria")
public class AlteraCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlteraCategoria() {
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
		int idCategoria = Integer.parseInt(request.getParameter("idCategoria"));
		String nomeCategoria = request.getParameter("nomeCategoria");
		
		PerguntaCategoria pc = new PerguntaCategoria();
		pc.setId(idCategoria);
		pc.setNome(nomeCategoria);
		try {
			CategoriaDAO dao = new CategoriaDAO();
			if(dao.atualizar(pc)) {
				request.setAttribute("message", "Alterado com sucesso!<br>" + "<a href=index.jsp>Clique para voltar para a index</a>"); 
			}
		} catch(Exception e) {
			request.setAttribute("message", "Problema na Alteração!");
			
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("alteraCategoria.jsp");
		dispatcher.forward(request, response);
	}

}
