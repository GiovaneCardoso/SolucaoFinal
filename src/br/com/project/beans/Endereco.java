package br.com.project.beans;

/**
 * The type Endereco.
 */
public class Endereco
{
    private int id;
    private String pais;
    private String estado;
    private String cidade;
    private String codigo_postal;
    private String logradouro;
    private String numero;
    private String complemento;

    /**
     * Instantiates a new Endereco.
     */
    public Endereco() {
        this.setTudo(0,"","","","","","","");
    }

    /**
     * Instantiates a new Endereco.
     *
     * @param id            the id
     * @param pais          the pais
     * @param estado        the estado
     * @param cidade        the cidade
     * @param codigo_postal the codigo postal
     * @param logradouro    the logradouro
     * @param numero        the numero
     * @param complemento   the complemento
     */
    public Endereco(int id, String pais, String estado, String cidade, String codigo_postal,
                    String logradouro, String numero, String complemento) {
        this.setTudo(id,pais,estado,cidade,codigo_postal,logradouro,numero,complemento);
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
     * Gets pais.
     *
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets pais.
     *
     * @param pais the pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Gets estado.
     *
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets estado.
     *
     * @param estado the estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Gets cidade.
     *
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets cidade.
     *
     * @param cidade the cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Gets codigo postal.
     *
     * @return the codigo postal
     */
    public String getCodigo_postal() {
        return codigo_postal;
    }

    /**
     * Sets codigo postal.
     *
     * @param codigo_postal the codigo postal
     */
    public void setCodigoPostal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    /**
     * Gets logradouro.
     *
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Sets logradouro.
     *
     * @param logradouro the logradouro
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Gets numero.
     *
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets numero.
     *
     * @param numero the numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Gets complemento.
     *
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Sets complemento.
     *
     * @param complemento the complemento
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * Sets tudo.
     *
     * @param id            the id
     * @param pais          the pais
     * @param estado        the estado
     * @param cidade        the cidade
     * @param codigo_postal the codigo postal
     * @param logradouro    the logradouro
     * @param numero        the numero
     * @param complemento   the complemento
     */
    public void setTudo(int id, String pais, String estado, String cidade, String codigo_postal,
                        String logradouro, String numero, String complemento) {
        this.setId(id);
        this.setPais(pais);
        this.setEstado(estado);
        this.setCidade(cidade);
        this.setCodigoPostal(codigo_postal);
        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setComplemento(complemento);
    };

    /**
     * Gets tudo.
     *
     * @return the tudo
     */
    public String getTudo() {
        return "id: "               + this.id + "\n" +
               "pais: "             + this.pais + "\n" +
               "estado: "           + this.estado + "\n" +
               "cidade: "           + this.cidade + "\n" +
               "codigo_postal: "    + this.codigo_postal + "\n" +
               "logradouro: "       + this.logradouro + "\n" +
               "numero: "           + this.numero + "\n" +
               "complemento: "      + this.complemento;
    }
}

