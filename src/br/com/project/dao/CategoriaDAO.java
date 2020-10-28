package br.com.project.dao;

import br.com.project.beans.PerguntaCategoria;
import br.com.project.connect.Connect;
import br.com.project.patterns.PadraoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Categoria dao.
 */
public class CategoriaDAO implements PadraoDAO<PerguntaCategoria>
{

	private Connection conection;

	private ResultSet result_set;

	private PreparedStatement statement;


	/**
	 * Instantiates a new Categoria dao.
	 *
	 * @throws Exception the exception
	 */
	public CategoriaDAO() throws Exception{
		this.conection = Connect.build();
	}

	public void close() throws Exception{
		this.conection.close();
	}

	/**
	 * Inicializa objeto resultset pergunta categoria.
	 *
	 * @return the pergunta categoria
	 * @throws Exception the exception
	 */
	public PerguntaCategoria inicializaObjetoResultset() throws Exception {
		return new PerguntaCategoria(
				this.result_set.getInt("ID"),
				this.result_set.getString("NOME")
		);
	}

	/**
	 *
	 * @return
	 * @throws Exception
	 */
	public List<PerguntaCategoria> listar() throws Exception{
		this.statement = this.conection.prepareStatement("SELECT * FROM PERGUNTA_CATEGORIA");

		List<PerguntaCategoria> lista = new ArrayList<PerguntaCategoria>();

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
	public PerguntaCategoria encontrar(int id) throws Exception{
		this.statement = this.conection.prepareStatement("SELECT * FROM PERGUNTA_CATEGORIA WHERE ID = ?");

		this.statement.setInt(1, id);

		this.result_set = this.statement.executeQuery();

		while( this.result_set.next() )
			return  this.inicializaObjetoResultset();

		return new PerguntaCategoria();
	}

	/**
	 *
	 * @param recurso the recurso
	 * @return
	 * @throws Exception
	 */
	public boolean adicionar(PerguntaCategoria recurso) throws Exception {

		this.statement = this.conection.prepareStatement("INSERT INTO PERGUNTA_CATEGORIA (ID, NOME) VALUES(?, ?)" );

		/**
		 * Set os atributos das colunas
		 *
		 */
		this.statement.setInt(1, recurso.getId());
		this.statement.setString(2, recurso.getNome());

		return this.statement.executeUpdate() == 1;
	}

	/**
	 *
	 * @param recurso the recurso
	 * @return
	 * @throws Exception
	 */
	public boolean atualizar(PerguntaCategoria recurso) throws Exception {

		this.statement = this.conection.prepareStatement("UPDATE PERGUNTA_CATEGORIA SET NOME = ? WHERE ID = ?" );

		this.statement.setString(1, recurso.getNome());
		this.statement.setInt(2, recurso.getId());

		return this.statement.executeUpdate() == 1;
	}


	/**
	 *
	 * @param id the id
	 * @return
	 * @throws Exception
	 */
	public int deletar(int id) throws Exception{
		this.statement = this.conection.prepareStatement("DELETE FROM PERGUNTA_CATEGORIA WHERE ID = ?");

		this.statement.setInt(1, id);

		return this.statement.executeUpdate();
	}


}
