package br.com.project.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Cliente.
 */
public class Cliente
{
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String celular;
	private List<Atendimento> atendimentos;
	private List<Endereco> enderecos;

    /**
     * Instantiates a new Cliente.
     */
    public Cliente() {
        this.setTudo(0,"","","","", new ArrayList<Atendimento>(), new ArrayList<Endereco>());
    }

    /**
     * Instantiates a new Cliente.
     *
     * @param id        the id
     * @param nome      the nome
     * @param email     the email
     * @param telefone  the telefone
     * @param celular   the celular
     * @param enderecos the enderecos
     */
    public Cliente(int id, String nome, String email, String telefone, String celular,List<Endereco> enderecos) {
        this.setTudo(id,nome,email,telefone,celular,  new ArrayList<Atendimento>(), enderecos);
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
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets telefone.
     *
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Sets telefone.
     *
     * @param telefone the telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Gets celular.
     *
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Sets celular.
     *
     * @param celular the celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Gets atendimentos.
     *
     * @return the atendimentos
     */
    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    /**
     * Sets atendimentos.
     *
     * @param atendimentos the atendimentos
     */
    public void setAtendimentos(List<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    /**
     * Gets enderecos.
     *
     * @return the enderecos
     */
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * Sets enderecos.
     *
     * @param enderecos the enderecos
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    /**
     * Sets tudo.
     *
     * @param id           the id
     * @param nome         the nome
     * @param email        the email
     * @param telefone     the telefone
     * @param celular      the celular
     * @param atendimentos the atendimentos
     * @param enderecos    the enderecos
     */
    public void setTudo(int id, String nome, String email, String telefone, String celular,
                        List<Atendimento> atendimentos, List<Endereco> enderecos ) {
        this.setId(id);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setCelular(celular);
        this.setAtendimentos(atendimentos);
        this.setEnderecos(enderecos);
    }

    /**
     * Gets tudo.
     *
     * @return the tudo
     */
    public String getTudo() {
        return "id:"            + id        + "\n" +
                "nome: "        + nome      + "\n" +
                "email: "       + email     + "\n"  +
                "telefone: "    + telefone  + "\n"  +
                "celular: "     + celular;
    }
}
