package br.com.project.implementation;

import br.com.project.beans.Pergunta;
import br.com.project.bo.PerguntaBO;
import br.com.project.expetions.Exceptions;

import javax.swing.*;


public class TestePesquisarPergunta
{
    public static void main(String[] args) {
        try
        {
            String perguntas = "";

            for (Pergunta pergunta :  PerguntaBO.pesquisar(JOptionPane.showInputDialog("Pergunta: ")))
                perguntas = perguntas + pergunta.getTudo() + "\n\n";

            JOptionPane.showMessageDialog(new JFrame(), perguntas );

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(new JFrame(),Exceptions.handleExceptions(e));
        }
    }
}
