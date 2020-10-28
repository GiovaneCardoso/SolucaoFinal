package br.com.project.beans;

import java.util.List;

/**
 * The type Pergunta.
 */
public class Pergunta
{
    private int id;
    private String titulo;
    private String pergunta;
    private String resposta;
    private PerguntaCategoria categoria;
    private List<PerguntaPalavraChave> palavras_chaves;

    /**
     * Instantiates a new Pergunta.
     */
    public Pergunta(){
        this.setTudo(0,new PerguntaCategoria(),"","","");
    }

    /**
     * Instantiates a new Pergunta.
     *
     * @param id        the id
     * @param categoria the categoria
     * @param titulo    the titulo
     * @param pergunta  the pergunta
     * @param resposta  the resposta
     */
    public Pergunta(int id, PerguntaCategoria categoria, String titulo, String pergunta, String resposta){
        this.setTudo(id,categoria,titulo,pergunta,resposta);
    }

    /**
     * Get id int.
     *
     * @return the int
     */
    public int getId(){
        return this.id;
    }

    /**
     * Set id.
     *
     * @param id the id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Get categoria pergunta categoria.
     *
     * @return the pergunta categoria
     */
    public PerguntaCategoria getCategoria(){
        return this.categoria;
    }

    /**
     * Set categoria.
     *
     * @param categoria the categoria
     */
    public void setCategoria(PerguntaCategoria categoria){
        this.categoria = categoria;
    }

    /**
     * Get titulo string.
     *
     * @return the string
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Set titulo.
     *
     * @param titulo the titulo
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /**
     * Get pergunta string.
     *
     * @return the string
     */
    public String getPergunta(){
        return this.pergunta;
    }

    /**
     * Set pergunta.
     *
     * @param pergunta the pergunta
     */
    public void setPergunta(String pergunta){
        this.pergunta = pergunta;
    }

    /**
     * Get resposta string.
     *
     * @return the string
     */
    public String getResposta(){
        return this.resposta;
    }

    /**
     * Set resposta.
     *
     * @param resposta the resposta
     */
    public void setResposta(String resposta){
        this.resposta = resposta;
    }

    /**
     * Set tudo.
     *
     * @param id        the id
     * @param categoria the categoria
     * @param titulo    the titulo
     * @param pergunta  the pergunta
     * @param resposta  the resposta
     */
    public void setTudo(int id, PerguntaCategoria categoria, String titulo, String pergunta, String resposta){
        this.setId(id);
        this.setCategoria(categoria);
        this.setTitulo(titulo);
        this.setPergunta(pergunta);
        this.setResposta(resposta);
    }

    /**
     * Gets palavras chaves.
     *
     * @return the palavras chaves
     */
    public List<PerguntaPalavraChave> getPalavrasChaves() {
        return palavras_chaves;
    }

    /**
     * Sets palavras chaves.
     *
     * @param palavras_chaves the palavras chaves
     */
    public void setPalavrasChaves(List<PerguntaPalavraChave> palavras_chaves) {
        this.palavras_chaves = palavras_chaves;
    }

    /**
     * Get tudo string.
     *
     * @return the string
     */
    public String getTudo(){
        return  "id: "          + this.id                   + "\n" +
                "categoria: "   + this.categoria.getNome()  + "\n" +
                "titulo: "      + this.titulo               + "\n" +
                "pergunta: "    + this.pergunta             + "\n" +
                "resposta: "    + this.resposta             + "\n";
    }

}
