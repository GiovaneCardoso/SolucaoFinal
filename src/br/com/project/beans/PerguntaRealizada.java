package br.com.project.beans;

/**
 * The type Pergunta realizada.
 */
public class PerguntaRealizada
{
    private int id;

    private Atendimento atendimento;

    private String pergunta;

    /**
     * Instantiates a new Pergunta realizada.
     */
    public PerguntaRealizada() {
        this.setudo( 0,new Atendimento(), "" );
    }

    /**
     * Instantiates a new Pergunta realizada.
     *
     * @param id       the id
     * @param pergunta the pergunta
     */
    public PerguntaRealizada(int id, String pergunta) {
        this.setudo( id, new Atendimento(), pergunta );
    }

    /**
     * Instantiates a new Pergunta realizada.
     *
     * @param id          the id
     * @param pergunta    the pergunta
     * @param atendimento the atendimento
     */
    public PerguntaRealizada(int id, String pergunta, Atendimento atendimento) {
        this.setudo( id, atendimento, pergunta );
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
     * Gets atendimento.
     *
     * @return the atendimento
     */
    public Atendimento getAtendimento() {
        return atendimento;
    }

    /**
     * Sets atendimento.
     *
     * @param atendimento the atendimento
     */
    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    /**
     * Gets pergunta.
     *
     * @return the pergunta
     */
    public String getPergunta() {
        return pergunta;
    }

    /**
     * Sets pergunta.
     *
     * @param pergunta the pergunta
     */
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    /**
     * Sets .
     *
     * @param id          the id
     * @param atendimento the atendimento
     * @param pergunta    the pergunta
     */
    public void setudo(int id, Atendimento atendimento, String pergunta) {
        this.setId(id);
        this.setAtendimento(atendimento);
        this.setPergunta(pergunta);
    }

    /**
     * Gets tudo.
     *
     * @return the tudo
     */
    public String getTudo()
    {
        return "id: " + this.getId() + "\n"+
                "pergunta realizada: " + this.pergunta;
    }
}
