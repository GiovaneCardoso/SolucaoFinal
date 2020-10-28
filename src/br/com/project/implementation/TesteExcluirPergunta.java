package br.com.project.implementation;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaCategoria;
import br.com.project.bo.PerguntaBO;
import br.com.project.expetions.Exceptions;

import javax.swing.*;


public class TesteExcluirPergunta
{
    public static void main(String[] args) {
        try {

            Boolean result = PerguntaBO.apagar(Integer.parseInt(JOptionPane.showInputDialog("ID")));

            JOptionPane.showMessageDialog(new JFrame(), result ? "Apagado!": "Nao Apagado" );

        }catch(Exception e) {
            JOptionPane.showMessageDialog(new JFrame(),Exceptions.handleExceptions(e));
        }
    }
}
