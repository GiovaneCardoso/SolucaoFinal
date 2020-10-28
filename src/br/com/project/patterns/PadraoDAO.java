package br.com.project.patterns;

import java.util.List;

/**
 * The interface Padrao dao.
 *
 * @param <T> the type parameter
 */
public interface PadraoDAO<T>
{
	/**
	 * Close.
	 *
	 * @throws Exception the exception
	 */
	public void close() throws Exception;

	/**
	 * Listar list.
	 *
	 * @return the list
	 * @throws Exception the exception
	 */
	public List<T> listar()  throws Exception;

	/**
	 * Procurar t.
	 *
	 * @param id the id
	 * @return the t
	 * @throws Exception the exception
	 */
	public T encontrar( int id )  throws Exception;

	/**
	 * Adicionar boolean.
	 *
	 * @param recurso the recurso
	 * @return the boolean
	 * @throws Exception the exception
	 */
	public boolean adicionar( T recurso ) throws Exception;

	/**
	 * Adicionar boolean.
	 *
	 * @param recurso the recurso
	 * @return the boolean
	 * @throws Exception the exception
	 */
	public boolean atualizar( T recurso ) throws Exception;


	/**
	 * Deletar int.
	 *
	 * @param id the id
	 * @return the int
	 * @throws Exception the exception
	 */
	public int deletar( int id ) throws Exception;


}
