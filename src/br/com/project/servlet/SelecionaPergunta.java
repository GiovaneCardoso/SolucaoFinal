package br.com.project.servlet;

import java.io.IOException;
import java.sql.*;
import br.com.project.bo.*;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import br.com.project.beans.Pergunta;
import br.com.project.connect.*;
import br.com.project.dao.PerguntaDAO;

/**
 * Servlet implementation class viewData
 */
@WebServlet("/Seleciona")
public class SelecionaPergunta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelecionaPergunta() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
* @return
* @return
* @see HttpServlet#doGet(HttpServletRequest request,
HttpServletResponse response)
*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		PerguntaDAO pDAO = new PerguntaDAO();
		List<Pergunta> listaResul = pDAO.listar();
		request.setAttribute("listaResul", listaResul);	
		RequestDispatcher saida =
		request.getRequestDispatcher("perguntas.jsp");
		saida.forward(request, response);
	} catch (SQLException e) {
		System.out.print("Erro: ");
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//TODO Auto-generated method stub
		doGet(request, response);
	}
}