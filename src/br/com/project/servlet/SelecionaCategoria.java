package br.com.project.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.project.beans.PerguntaCategoria;
import br.com.project.dao.CategoriaDAO;
/**
 * Servlet implementation class SelecionaCategoria
 */
@WebServlet("/SelecionaCategoria")
public class SelecionaCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelecionaCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriaDAO cDao;
		try {
			cDao = new CategoriaDAO();
			ArrayList<PerguntaCategoria> listCategory = cDao.listar();
			request.setAttribute("listCategory", listCategory);
            RequestDispatcher dispatcher = request.getRequestDispatcher("perguntas.jsp");
            dispatcher.forward(request, response);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
