package br.com.project.bo;

import br.com.project.beans.PerguntaCategoria;
import br.com.project.dao.CategoriaDAO;

/**
 * The type CategoriaBO
 */

public class CategoriaBO {
	
	/**
	 * Apagar boolean
	 * 
	 * @param int id
	 * @return the boolean
	 * @throws Exception the exception
	 */
	
	public static boolean apagar(int id) throws Exception {
		CategoriaDAO dao = new CategoriaDAO();
		
		if (dao.encontrar(id).getId() == 0) {
			throw new RuntimeException("ID inválido");
		}
		
		int result = dao.deletar(id);
		dao.close();
		
		return result > 0;
	}
	
	/**
	 * Novo boolean
	 * @param perguntaCategoria pc
	 * @return the boolena
	 * @throws Exception the exception
	 */
	
	public static boolean novo(PerguntaCategoria pc) throws Exception {
		if (pc.getNome().length()<0 || pc.getNome().length()>100) {
            throw new RuntimeException("Categoria fora do escopo de caracteres permitido");
        }
		
		CategoriaDAO dao = new CategoriaDAO();
				
		if (dao.encontrar(pc.getId()).getId()!=0) {
			throw new RuntimeException("ID já existe");
		}
		
		pc.setNome(pc.getNome().trim());
		
		boolean result = dao.adicionar(pc);
		
		dao.close();
		
		return result;
	}
	
	/**
	 * Atualizar boolean
	 * 
	 * @param PerguntaCategoria pc
	 * @return the boolean
	 * @throws Exception the exception
	 */
	
	public static boolean atualizar(PerguntaCategoria pc) throws Exception {
		if (pc.getNome().length()<0 || pc.getNome().length()>100) {
            throw new RuntimeException("Categoria fora do escopo de caracteres permitido");
        }
		
		if (pc.getId() == 0 ||
                (new CategoriaDAO()).encontrar(pc.getId()).getId() == 0 ) {
            throw new RuntimeException("A categoria nao existe");
        }
		
		CategoriaDAO dao = new CategoriaDAO();
		
		pc.setNome(pc.getNome().trim());
		
		boolean result = dao.atualizar(pc);
		
		return result;
	}
}
