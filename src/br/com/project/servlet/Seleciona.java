package br.com.project.servlet;

import java.io.IOException;
import java.sql.*;
import br.com.project.bo.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import br.com.project.beans.Pergunta;
import br.com.project.connect.*;

/**
 * Servlet implementation class viewData
 */
@WebServlet("/Seleciona")
public class Seleciona extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Seleciona() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
* @return
* @return
* @see HttpServlet#doGet(HttpServletRequest request,
HttpServletResponse response)
*/

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String item = request.getParameter("item");
	
	if (PerguntaBO.pesquisar(item)) {

		request.setAttribute("message", "<h1>Retorno da seleção</h1>");

		}
	RequestDispatcher dispatcher =	request.getRequestDispatcher("index.jsp");
	dispatcher.forward(request, response);
	}
}