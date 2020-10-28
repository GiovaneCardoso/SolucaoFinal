package br.com.project.dao;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaCategoria;
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
public class PerguntaDAO implements PadraoDAO<Pergunta>
{

	private Connection conection;

	private ResultSet result_set;

	private PreparedStatement statement;


	/**
	 * Instantiates a new Pergunta dao.
	 *
	 * @throws Exception the exception
	 */
	public PerguntaDAO() throws Exception {
		this.conection = Connect.build();
	}

	public void close() throws Exception {
		this.conection.close();
	}

	/**
	 * Inicializa objeto resultset pergunta.
	 *
	 * @return the pergunta
	 * @throws Exception the exception
	 */
	public Pergunta inicializaObjetoResultset() throws Exception {
		return new Pergunta(
				this.result_set.getInt("ID"),
				new PerguntaCategoria(),
				this.result_set.getString("TITULO"),
				this.result_set.getString("PERGUNTA"),
				this.result_set.getString("RESPOSTA")
		);
	}


	/**
	 *
	 * @return
	 * @throws Exception
	 */
	public List<Pergunta> listar() throws Exception {
		this.statement = this.conection.prepareStatement("SELECT * FROM PERGUNTAS");

		List<Pergunta> lista = new ArrayList<Pergunta>();

		this.result_set = this.statement.executeQuery();

		while( this.result_set.next() )
			lista.add( this.inicializaObjetoResultset() );

		return lista;
	}

	/**
	 *
	 * @param id the id
	 * @return
	 * @throws Exception
	 */
	public Pergunta encontrar(int id) throws Exception {
		this.statement = this.conection.prepareStatement("SELECT * FROM PERGUNTAS WHERE ID = ?");

		this.statement.setInt(1, id);

		this.result_set = this.statement.executeQuery();

		while( this.result_set.next() )
			return  this.inicializaObjetoResultset();

		return new Pergunta();
	}

	/**
	 * Pesquisar list.
	 *
	 * @param texto the texto
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<Pergunta> pesquisar(String texto) throws Exception {

		this.statement = this.conection.prepareStatement
				("SELECT * FROM PERGUNTAS WHERE PERGUNTA LIKE ? OR TITULO LIKE ? ");

		this.statement.setString(1, "%" + texto + "%");
		this.statement.setString(2, "%" + texto + "%");

		List<Pergunta> lista = new ArrayList<Pergunta>();

		this.result_set = this.statement.executeQuery();

		while( this.result_set.next() )
			lista.add( this.inicializaObjetoResultset() );

		return lista;
	}

	/**
	 *
	 * @param recurso the recurso
	 * @return
	 * @throws Exception
	 */
	public boolean adicionar(Pergunta recurso) throws Exception {

		this.statement = this.conection.prepareStatement("INSERT INTO PERGUNTAS " +
				"(ID,CATEGORIA_ID,TITULO,PERGUNTA,RESPOSTA) VALUES(?,?,?,?,?)" );

		this.statement.setInt(1, recurso.getId());
		this.statement.setInt(2, recurso.getCategoria().getId());
		this.statement.setString(3, recurso.getTitulo());
		this.statement.setString(4, recurso.getPergunta());
		this.statement.setString(5, recurso.getResposta());

		return this.statement.executeUpdate() == 1;

	}

	/**
	 *
	 * @param recurso the recurso
	 * @return
	 * @throws Exception
	 */
	public boolean atualizar(Pergunta recurso) throws Exception {

		this.statement = this.conection.prepareStatement("UPDATE PERGUNTAS " +
				"SET TITULO = ?, PERGUNTA = ?, RESPOSTA = ? WHERE ID = ?" );

		this.statement.setString(1, recurso.getTitulo());
		this.statement.setString(2, recurso.getPergunta());
		this.statement.setString(3, recurso.getResposta());
		this.statement.setInt(4, recurso.getId());

		return this.statement.executeUpdate() == 1;

	}

	/**
	 *
	 * @param id the id
	 * @return
	 * @throws Exception
	 */
	public int deletar(int id) throws Exception {
		this.statement = this.conection.prepareStatement("DELETE FROM PERGUNTAS WHERE ID = ?");

		this.statement.setInt(1, id);

		return this.statement.executeUpdate();
	}


}
