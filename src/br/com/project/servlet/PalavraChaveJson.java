package br.com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.project.beans.PerguntaCategoria;
import br.com.project.beans.PerguntaPalavraChave;
import br.com.project.dao.CategoriaDAO;
import br.com.project.dao.PalavraChaveDAO;

@WebServlet("/listapalavraschavesjson")
public class PalavraChaveJson extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    public PalavraChaveJson() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PalavraChaveDAO pcDao = new PalavraChaveDAO();
			List<PerguntaPalavraChave> lPalavraChaves = pcDao.listar();
			ArrayList<String> palavras = new ArrayList<String>();
			
			// Separando as palavras
			for(PerguntaPalavraChave pc : lPalavraChaves) {
				palavras.add(pc.getPalavra());
			}
			/*
			 * 1) Baixar jar em https://search.maven.org/remotecontent?filepath=com/google/code/gson/gson/2.8.6/gson-2.8.6.jar
			 * 2) colocar em WEB-INF/lib
			 * */
			String json = new Gson().toJson(palavras);
			
            response.setContentType("application/json");
	        // Get the printwriter object from response to write the required json object to the output stream      
	        PrintWriter out = response.getWriter();
	        // Assuming your json object is **jsonObject**, perform the following, it will return your json object  
	        out.print(json);
	        out.flush();
         
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}
