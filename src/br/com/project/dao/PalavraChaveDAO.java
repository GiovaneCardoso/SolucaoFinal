package br.com.project.dao;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaPalavraChave;
import br.com.project.connect.Connect;
import br.com.project.patterns.PadraoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Pergunta dao.
 */
public class PalavraChaveDAO implements PadraoDAO<PerguntaPalavraChave>
{

	private Connection conection;

	private ResultSet result_set;

	private PreparedStatement statement;


	/**
	 * Instantiates a new Pergunta dao.
	 *
	 * @throws Exception the exception
	 */
	public PalavraChaveDAO() throws Exception {
		this.conection = Connect.build();
	}

	public void close() throws Exception {
		this.conection.close();
	}

	/**
	 *
	 * @return
	 * @throws Exception
	 */
	public List<PerguntaPalavraChave> listar() throws Exception {
		this.statement = this.conection.prepareStatement("SELECT DISTINCT(PALAVRA), ID FROM PERGUNTA_PALAVRAS_CHAVES");

		List<PerguntaPalavraChave> lista = new ArrayList<PerguntaPalavraChave>();

		result_set = this.statement.executeQuery();
		Pergunta p = new Pergunta();
		while( this.result_set.next() )
			//p.setId(result_set.getInt("PERGUNTA_ID"));
		
			lista.add( new PerguntaPalavraChave(result_set.getInt("ID"), 
					result_set.getString("Palavra"),
					p));

		return lista;
	}

	/**
	 *
	 * @param id the id
	 * @return
	 * @throws Exception
	 */
	public PerguntaPalavraChave encontrar(int id) throws Exception {
		return null;
	}
	
	/**
	 *
	 * @param id the id
	 * @return
	 * @throws Exception
	 */
	
	public List<PerguntaPalavraChave> pesquisar(int id) throws Exception {
		this.statement = this.conection.prepareStatement("SELECT * FROM PERGUNTA_PALAVRAS_CHAVES WHERE PERGUNTA_ID = ?");
		this.statement.setInt(1, id);
		
		List<PerguntaPalavraChave> lista = new ArrayList<PerguntaPalavraChave>();

		result_set = this.statement.executeQuery();
		Pergunta p = new Pergunta();
		p.setId(id);
		while( this.result_set.next() )
			lista.add( new PerguntaPalavraChave(result_set.getInt("ID"), 
					result_set.getString("Palavra"),
					p));

		return lista;
	}

	/**
	 *
	 * @param recurso the recurso
	 * @return
	 * @throws Exception
	 */
	public boolean adicionar(PerguntaPalavraChave recurso) throws Exception {

		this.statement = this.conection.prepareStatement("INSERT INTO PERGUNTA_PALAVRAS_CHAVES " +
				" VALUES(keywords_sequ.nextval,?,?)" );
		

		/*this.statement.setInt(1, recurso.getId());*/
		this.statement.setInt(1, recurso.getPergunta().getId());
		this.statement.setString(2, recurso.getPalavra());

		return this.statement.executeUpdate() == 1;

	}

	/**
	 *
	 * @param recurso the recurso
	 * @return
	 * @throws Exception
	 */
	public boolean atualizar(PerguntaPalavraChave recurso) throws Exception {
		/* Não se aplica pois o processo de atualização se dá por
		 * 
		 * 1) Deletar palavras-chaves associadas atuais
		 * 2) Adicionar as novas
		 * 
		 * */
		
		return false;

	}

	/**
	 *
	 * @param id the id
	 * @return
	 * @throws Exception
	 */
	public int deletar(int id) throws Exception {
		this.statement = this.conection.prepareStatement("DELETE FROM PERGUNTA_PALAVRAS_CHAVES WHERE PERGUNTA_ID = ?");

		this.statement.setInt(1, id);

		return this.statement.executeUpdate();
	}


}
