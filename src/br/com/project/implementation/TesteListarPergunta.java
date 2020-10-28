package br.com.project.implementation;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaCategoria;
import br.com.project.bo.PerguntaBO;
import br.com.project.expetions.Exceptions;

import javax.swing.*;


public class TesteListarPergunta
{
    public static void main(String[] args) {
        try
        {
            String perguntas = "";
            for (Pergunta pergunta :  PerguntaBO.listar())
                perguntas = perguntas + pergunta.getTudo() + "\n\n";

            JOptionPane.showMessageDialog(new JFrame(), perguntas );

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(new JFrame(),Exceptions.handleExceptions(e));
        }
    }
}
