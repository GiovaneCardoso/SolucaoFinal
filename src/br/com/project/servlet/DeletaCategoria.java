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
 * Servlet implementation class DeletaCategoria
 */
@WebServlet("/DeletaCategoria")
public class DeletaCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletaCategoria() {
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
		int idPergunta = Integer.parseInt(request.getParameter("idCategoria"));
		PerguntaCategoria pc = new PerguntaCategoria();
		pc.setId(idPergunta);
		
		try {
			if(CategoriaBO.apagar(idPergunta)) {
				request.setAttribute("message", "O registro foi deletado com sucesso! <br>" + "<a href=index.jsp>Clique para voltar para index</a>");
			} else {
				request.setAttribute("message", "Problema na deleção.");
			}
		} catch(Exception e) {
			request.setAttribute("message", "Problema na deleção.");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("deletaCategoria.jsp");
		dispatcher.forward(request, response);
		
	}

}
