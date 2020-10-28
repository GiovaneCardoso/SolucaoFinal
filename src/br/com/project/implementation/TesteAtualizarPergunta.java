package br.com.project.implementation;

import br.com.project.beans.Pergunta;
import br.com.project.beans.PerguntaCategoria;
import br.com.project.bo.PerguntaBO;
import br.com.project.expetions.Exceptions;

import javax.swing.*;


public class TesteAtualizarPergunta
{
    public static void main(String[] args) {
        try {

            Pergunta pergunta = new Pergunta(
                Integer.parseInt(JOptionPane.showInputDialog("ID")),
                new PerguntaCategoria( Integer.parseInt(JOptionPane.showInputDialog("ID Categoria")), "" ),
                JOptionPane.showInputDialog("Titulo"),
                JOptionPane.showInputDialog("Pergunta"),
                JOptionPane.showInputDialog("Resposta")
            );

            Boolean result = PerguntaBO.atualizar(pergunta);

            JOptionPane.showMessageDialog(new JFrame(), result ? "Atualizada!": "Nao Atualizada" );

        }catch(Exception e) {
            JOptionPane.showMessageDialog(new JFrame(),Exceptions.handleExceptions(e));
        }
    }
}
