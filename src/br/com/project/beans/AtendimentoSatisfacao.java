package br.com.project.beans;

/**
 * The type Atendimento satisfacao.
 */
public class AtendimentoSatisfacao
{
    private int id;

    private int nota;

    private String justificativa;

    private Atendimento atendimento;

    /**
     * Instantiates a new Atendimento satisfacao.
     */
    public AtendimentoSatisfacao()
    {
        this.setTudo(0,new Atendimento(),0,"");
    }

    /**
     * Instantiates a new Atendimento satisfacao.
     *
     * @param id            the id
     * @param nota          the nota
     * @param justificativa the justificativa
     */
    public AtendimentoSatisfacao(int id, int nota, String justificativa)
    {
       this.setTudo(id,new Atendimento(),nota,justificativa);
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
     * Get atendimento atendimento.
     *
     * @return the atendimento
     */
    public Atendimento getAtendimento(){
        return atendimento;
    }

    /**
     * Set atendimento.
     *
     * @param atendimento the atendimento
     */
    public void setAtendimento(Atendimento atendimento){
        this.atendimento = atendimento;
    }

    /**
     * Get nota int.
     *
     * @return the int
     */
    public int getNota(){
        return nota;
    }

    /**
     * Set nota.
     *
     * @param nota the nota
     */
    public void setNota(int nota){
        this.nota = nota;
    }

    /**
     * Get justificativa string.
     *
     * @return the string
     */
    public String getJustificativa(){
        return justificativa;
    }

    /**
     * Set justificativa.
     *
     * @param justificativa the justificativa
     */
    public void setJustificativa(String justificativa){
        this.justificativa = justificativa;
    }

    /**
     * Set tudo.
     *
     * @param id            the id
     * @param atendimento   the atendimento
     * @param nota          the nota
     * @param justificativa the justificativa
     */
    public void setTudo(int id, Atendimento atendimento, int nota, String justificativa){
        this.setId(id);
        this.setAtendimento(atendimento);
        this.setNota(nota);
        this.setJustificativa(justificativa);
    }

    /**
     * Get tudo string.
     *
     * @return the string
     */
    public String getTudo(){
        return "id: " + id +  "\n" +
                "nota: " + nota + "\n" +
                "justificativa: '" + justificativa + "\n";
    }
}
