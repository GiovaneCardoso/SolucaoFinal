package br.com.project.bo;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaPalavraChave;
import br.com.project.dao.PalavraChaveDAO;
import br.com.project.dao.PerguntaDAO;

import java.util.ArrayList;
import java.util.List;

public class PerguntaPalavrachaveBO {

    public static boolean apagar( int id )  throws Exception {

    	PalavraChaveDAO dao = new PalavraChaveDAO();
        if( dao.encontrar(id).getId() == 0 )
        {
            throw new RuntimeException("ID inválido");
        }

        int result = dao.deletar(id);

        dao.close();

        return result > 0;
    }
    
    
    public static List<PerguntaPalavraChave> pesquisar(int perguntaId) throws Exception{

    	PalavraChaveDAO dao = new PalavraChaveDAO();
        List<PerguntaPalavraChave> palavraschave = dao.pesquisar(perguntaId);
        dao.close();

        return palavraschave;
    }
    
    public static boolean novo(Pergunta pergunta) throws Exception{
    	
    	//Passando se estiver vazia
    	if(pergunta.getPalavrasChaves().size() == 0) {
    		return true;
    	}
    	
    	PalavraChaveDAO dao = new PalavraChaveDAO();
    	
    	for(PerguntaPalavraChave palavra : pergunta.getPalavrasChaves()) {
    		PerguntaPalavraChave pc = new PerguntaPalavraChave();

    		pc.setPalavra(palavra.getPalavra());
    		pc.setPergunta(pergunta);
    		dao.adicionar(pc);
    	}
    	
    	return true;
    }
    
    public static boolean atualizar(Pergunta pergunta)  throws Exception{
    	
    	//Deleta antigas
    	PerguntaPalavrachaveBO.apagar(pergunta.getId());
    	
    	//Adiciona novas
    	return PerguntaPalavrachaveBO.novo(pergunta);
    }
}
