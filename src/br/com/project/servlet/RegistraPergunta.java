package br.com.project.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaCategoria;
import br.com.project.beans.PerguntaPalavraChave;

import br.com.project.dao.*;
import br.com.project.bo.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Registra
 */
@WebServlet("/registrapergunta")
public class RegistraPergunta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistraPergunta() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PerguntaCategoria c = new PerguntaCategoria();
		int cat_id = Integer.parseInt(request.getParameter("category"));
		String titulo = request.getParameter("titulo");
		String pergunta = request.getParameter("pergunta");
		String resposta = request.getParameter("resposta");
		c.setTudo(cat_id, "Teste");
		Pergunta p = new Pergunta();
		p.setCategoria(c);
		p.setTitulo(titulo);
		p.setPergunta(pergunta);
		p.setResposta(resposta);
		
		
		//Palavrachaves
		List<PerguntaPalavraChave> listPalavrachave = new ArrayList<PerguntaPalavraChave>();
		if(request.getParameter("palavraschave") != null || request.getParameter("palavraschave").trim() != "") {
			String[] palavraschave = request.getParameter("palavraschave").split(",");
			for(String sPalavrachave : palavraschave) {
				listPalavrachave.add(new PerguntaPalavraChave(0, sPalavrachave));
			}
		}
		
		p.setPalavrasChaves(listPalavrachave);
		
		try {
			if (PerguntaBO.novo(p)) {
				
				request.setAttribute("message",
						"Inserido com sucesso, se precisar cadastrar" + " mais uma pergunta, clique em adicionar: <br>");
			} else {
				request.setAttribute("message", "Problema na inser��o.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("perguntas.jsp");
		dispatcher.forward(request, response);
	}
}
