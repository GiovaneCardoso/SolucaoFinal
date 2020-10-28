package br.com.project.bo;

import br.com.project.beans.Pergunta;
import br.com.project.dao.CategoriaDAO;
import br.com.project.dao.PerguntaDAO;

import java.util.List;

/**
 * The type Pergunta bo.
 */
public class PerguntaBO
{
    /**
     * Apagar boolean.
     *
     * @param id the id
     * @return the boolean
     * @throws Exception the exception
     */
    public static boolean apagar( int id )  throws Exception {

        PerguntaDAO dao = new PerguntaDAO();
        if( dao.encontrar(id).getId() == 0 )
        {
            throw new RuntimeException("ID inválido");
        }

        int result = dao.deletar(id);

        dao.close();

        return result > 0;
    }

    /**
     * Pesquisar list.
     *
     * @param texto the texto
     * @return the list
     * @throws Exception the exception
     */
    public static List<Pergunta> pesquisar(String texto) throws Exception{

        texto = texto.trim();

        if (texto.length()<=0 || texto.length()>500) {
            throw new RuntimeException("Titulo fora do escopo de caracteres permitido");
        }

        PerguntaDAO dao = new PerguntaDAO();
        List<Pergunta> perguntas = dao.pesquisar(texto);
        dao.close();

        return perguntas;
    }

    /**
     * Listar list.
     *
     * @return the list
     * @throws Exception the exception
     */
    public static List<Pergunta> listar() throws Exception{

        PerguntaDAO dao = new PerguntaDAO();

        List<Pergunta> perguntas = dao.listar();

        dao.close();

        return perguntas;
    }

    /**
     * Novo boolean.
     *
     * @param pergunta the pergunta
     * @return the boolean
     * @throws Exception the exception
     */
    public static boolean novo(Pergunta pergunta)  throws Exception{

        if (pergunta.getTitulo().length()<0 || pergunta.getTitulo().length()>100) {
            throw new RuntimeException("Titulo fora do escopo de caracteres permitido");
        }

        if (pergunta.getPergunta().length()<0 || pergunta.getPergunta().length()>500) {
            throw new RuntimeException("pergunta do escopo de caracteres permitido");
        }

        if (pergunta.getResposta().length()<0 || pergunta.getPergunta().length()>2000) {
            throw new RuntimeException("resposta do escopo de caracteres permitido");
        }

        int categoria_id = pergunta.getCategoria().getId();

        if (pergunta.getCategoria().getId() == 0 ||
                (new CategoriaDAO()).encontrar(categoria_id).getId() == 0 ) {
            throw new RuntimeException("A categoria nao existe");
        }

        PerguntaDAO dao = new PerguntaDAO();

        if (pergunta.getId()<1) {
            throw new RuntimeException("ID inválido");
        }

        if (dao.encontrar(pergunta.getId()).getId()!=0) {
            throw new RuntimeException("ID já existe");
        }

        pergunta.setTitulo(pergunta.getTitulo().trim());
        pergunta.setPergunta(pergunta.getPergunta().trim());
        pergunta.setResposta(pergunta.getResposta().trim());

        boolean result = dao.adicionar(pergunta);

        dao.close();

        return result;
    }

    /**
     * Atualizar boolean.
     *
     * @param pergunta the pergunta
     * @return the boolean
     * @throws Exception the exception
     */
    public static boolean atualizar(Pergunta pergunta)  throws Exception{

        if (pergunta.getTitulo().length()<0 || pergunta.getTitulo().length()>100) {
            throw new RuntimeException("Titulo fora do escopo de caracteres permitido");
        }

        if (pergunta.getPergunta().length()<0 || pergunta.getPergunta().length()>500) {
            throw new RuntimeException("pergunta do escopo de caracteres permitido");
        }

        if (pergunta.getResposta().length()<0 || pergunta.getPergunta().length()>2000) {
            throw new RuntimeException("resposta do escopo de caracteres permitido");
        }

        if (pergunta.getCategoria().getId() == 0 ||
                (new CategoriaDAO()).encontrar(pergunta.getCategoria().getId()).getId() == 0 ) {
            throw new RuntimeException("A categoria nao existe");
        }

        PerguntaDAO dao = new PerguntaDAO();

        if (dao.encontrar(pergunta.getId()).getId()==0) {
            throw new RuntimeException("ID nao existe existe");
        }

        pergunta.setTitulo(pergunta.getTitulo().trim());
        pergunta.setPergunta(pergunta.getPergunta().trim());
        pergunta.setResposta(pergunta.getResposta().trim());

        boolean result = dao.atualizar(pergunta);

        dao.close();

        return result;
    }
}
