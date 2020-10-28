package br.com.project.beans;

/**
 * The type Pergunta categoria.
 */
public class PerguntaCategoria
{
    private int id;

    private String nome;

    private Pergunta pergunta;

    /**
     * Instantiates a new Pergunta categoria.
     */
    public PerguntaCategoria(){
        this.setTudo(0, "");
    }

    /**
     * Instantiates a new Pergunta categoria.
     *
     * @param id   the id
     * @param nome the nome
     */
    public PerguntaCategoria(int id, String nome){
        this.setTudo( id, nome  );
    }

    /**
     * Get id int.
     *
     * @return the int
     */
    public int getId(){
        return id;
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
     * Get nome string.
     *
     * @return the string
     */
    public String getNome(){
        return nome;
    }

    /**
     * Set nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome){
        this.nome = nome;
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
     * @param nome     the nome
     */
    public void setTudo(int id, String nome){
        this.setId(id);
        this.setNome(nome);
    }

    /**
     * Get tudo string.
     *
     * @return the string
     */
    public String getTudo(){
        return "id: "       + this.id + "\n" +
                "nome: "    + this.nome;
    }
}
