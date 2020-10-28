package br.com.project.servlet;
import java.io.IOException;

import br.com.project.beans.Pergunta;
import br.com.project.dao.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class PerguntaDeleta
*/
@WebServlet("/PerguntaDeleta")
public class PerguntaDeleta extends HttpServlet {
	private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
 */
 public PerguntaDeleta() {
	 super();
 // TODO Auto-generated constructor stub
 }
 
 /**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 int idPergunta = Integer.parseInt(request.getParameter("idPergunta"));
	 
	 Pergunta p = new Pergunta();
	 p.setId(idPergunta);
 
	 try {
		 PerguntaDAO pDao = new PerguntaDAO(); 
		 if(pDao.deletar(idPergunta) == 1) { 
			 request.setAttribute("message", "Deletado com sucesso, se precisar deletar"
			 + " mais uma pergunta, preencha os dados abaixo: <br>"
			 + "<a href=index.jsp>Clique para voltar para a index</a>");
			 }
	 }
	 catch(Exception ex) {
		 request.setAttribute("message", "Problema na deleção.");
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher("deletar.jsp");
		 dispatcher.forward(request, response);
		 }
	 } 
}