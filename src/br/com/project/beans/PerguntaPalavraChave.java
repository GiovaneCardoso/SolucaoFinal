package br.com.project.beans;

/**
 * The type Pergunta palavra chave.
 */
public class PerguntaPalavraChave
{
    /**
     * The Id.
     */
    public int id;

    /**
     * The Palavra.
     */
    public String palavra;

    /**
     * The Pergunta.
     */
    public Pergunta pergunta;

    /**
     * Instantiates a new Pergunta palavra chave.
     */
    public PerguntaPalavraChave()
    {
        this.setTudo(0, "", new Pergunta());
    }

    /**
     * Instantiates a new Pergunta palavra chave.
     *
     * @param id      the id
     * @param palavra the palavra
     */
    public PerguntaPalavraChave( int id, String palavra ) {
        this.setTudo(id, palavra, new Pergunta());
    }

    /**
     * Instantiates a new Pergunta palavra chave.
     *
     * @param id       the id
     * @param palavra  the palavra
     * @param pergunta the pergunta
     */
    public PerguntaPalavraChave(int id, String palavra, Pergunta pergunta) {
        this.setTudo(id, palavra, pergunta);
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets palavra.
     *
     * @return the palavra
     */
    public String getPalavra() {
        return palavra;
    }

    /**
     * Sets palavra.
     *
     * @param palavra the palavra
     */
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    /**
     * Gets pergunta.
     *
     * @return the pergunta
     */
    public Pergunta getPergunta() {
        return pergunta;
    }

    /**
     * Sets pergunta.
     *
     * @param pergunta the pergunta
     */
    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    /**
     * Set tudo.
     *
     * @param id       the id
     * @param palavra  the palavra
     * @param pergunta the pergunta
     */
    public void setTudo( int id, String palavra, Pergunta pergunta ){
        this.setId(id);
        this.setPalavra(palavra);
        this.setPergunta(pergunta);
    }

    /**
     * Gets tudo.
     *
     * @return the tudo
     */
    public String getTudo()
    {
        return " ID: "      + this.getId()      + "\n" +
                "Palavrar"  + this.getPalavra() + "\n";
    }
}
