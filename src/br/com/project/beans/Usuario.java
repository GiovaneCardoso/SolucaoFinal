package br.com.project.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Usuario.
 */
public class Usuario
{
    /**
     * The Id.
     */
    public int id;

    /**
     * The Email.
     */
    public String email;

    /**
     * The Senha.
     */
    public String senha;

    /**
     * The Nome completo.
     */
    public String nome_completo;

    /**
     * The Telefone.
     */
    public String telefone;

    /**
     * The Celular.
     */
    public String celular;

    /**
     * The Enderecos.
     */
    public List<Endereco> enderecos;

    /**
     * Instantiates a new Usuario.
     */
    public Usuario()
    {
        this.setTudo( 0, "", "","","","", new ArrayList<Endereco>());
    }

    /**
     * Instantiates a new Usuario.
     *
     * @param id            the id
     * @param email         the email
     * @param senha         the senha
     * @param nome_completo the nome completo
     * @param telefone      the telefone
     * @param celular       the celular
     * @param enderecos     the enderecos
     */
    public Usuario(int id, String email, String senha, String nome_completo, String telefone, String celular,
                   List<Endereco> enderecos) {
        this.setTudo( id, email, senha,nome_completo,telefone,celular,enderecos );
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
     * Gets senha.
     *
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets senha.
     *
     * @param senha the senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Gets nome completo.
     *
     * @return the nome completo
     */
    public String getNomeCompleto() {
        return nome_completo;
    }

    /**
     * Sets nome completo.
     *
     * @param nome_completo the nome completo
     */
    public void setNomeCompleto(String nome_completo) {
        this.nome_completo = nome_completo;
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
     * @param id            the id
     * @param email         the email
     * @param senha         the senha
     * @param nome_completo the nome completo
     * @param telefone      the telefone
     * @param celular       the celular
     * @param enderecos     the enderecos
     */
    public void setTudo(int id, String email, String senha, String nome_completo, String telefone,
                        String celular, List<Endereco> enderecos) {
        this.setId(id);
        this.setEmail(email);
        this.setSenha(senha);
        this.setNomeCompleto(nome_completo);
        this.setTelefone(telefone);
        this.setCelular(celular);
        this.setEnderecos(enderecos);
    }

    /**
     * Gets tudo.
     *
     * @return the tudo
     */
    public String getTudo()
    {
        String result =
        "id: "              +   this.getId()            +"\n"+
        "email: "           +   this.getEmail()         +"\n"+
        "nome_completo: "   +   this.getNomeCompleto()  +"\n"+
        "telefone: "        +   this.getTelefone()      +"\n"+
        "celular: "         +   this.getCelular()       +"\n";

        for ( Endereco endereco : this.enderecos )
            result =    result + ( "\n\n" + endereco.getTudo() + "\n" );

        return  result;
    }

}
