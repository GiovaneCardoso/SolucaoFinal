package br.com.project.servlet;
import java.io.IOException;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaCategoria;
import br.com.project.beans.PerguntaPalavraChave;
import br.com.project.dao.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class PerguntaAltera
*/
@WebServlet("/PerguntaAltera")
public class PerguntaAltera extends HttpServlet {
	private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
 */
 public PerguntaAltera() {
	 super();
 // TODO Auto-generated constructor stub
 }
 
 /**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 // Recebe parametros do HTML (Jsp)
	 int idPergunta = Integer.parseInt(request.getParameter("idPergunta"));
	 String titulo = request.getParameter("titulo"); // Não é a mesma informação que pergunta??
	 String pergunta = request.getParameter("pergunta");
	 String resposta = request.getParameter("resposta");
	 int idCategoria = Integer.parseInt(request.getParameter("idCategoria"));
	 String nomeCategoria = request.getParameter("idCategoria");
	 String[] palavraschave = request.getParameterValues("palavraschave");
	 
	 // Cria a pergunta
	 Pergunta p = new Pergunta();
	 // Cria a Categoria
	 PerguntaCategoria pc = new PerguntaCategoria();
	 pc.setId(idCategoria);
	 pc.setNome(nomeCategoria);
	 
	 p.setTudo(idPergunta, pc, titulo, pergunta, resposta);
	 
	 try {
		 // Instância o DAO
		 PerguntaDAO pDao = new PerguntaDAO(); 
		 
		 // Chama o Atualizar
		 if(pDao.atualizar(p)) {
			 request.setAttribute("message", "Aletrado com sucesso, se precisar alterar"
			 + " mais uma pergunta, preencha os dados abaixo: <br>"
			 + "<a href=index.jsp>Clique para voltar para a index</a>");
			 }
	 }	 
	 catch(Exception ex) {
		 request.setAttribute("message", "Problema na alteração.");
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("deletar.jsp");
		 dispatcher.forward(request, response);
		 }
	 }
 }