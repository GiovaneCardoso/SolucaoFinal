package br.com.project.beans;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Atendimento
{
	private int id;
	private Cliente cliente;
	private Timestamp data_inicio;
	private Timestamp data_fim;
	private String protocolo;
	private AtendimentoSatisfacao satisfacao;
	private List<PerguntaRealizada> perguntas_realizadas;

	public Atendimento() {
		setTudo(0 ,new Cliente() ,new Timestamp(System.currentTimeMillis()) ,
				new Timestamp(0) ,"", new ArrayList<PerguntaRealizada>(), new AtendimentoSatisfacao());
	}

	public Atendimento(int id, Cliente cliente, Timestamp data_inicio, Timestamp data_fim,
					   String protocolo, List<PerguntaRealizada> perguntas_realizadas,
					   AtendimentoSatisfacao satisfacao) {
		setTudo(id ,cliente ,data_inicio ,data_fim ,protocolo, perguntas_realizadas, satisfacao);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Timestamp getDataInicio() {
		return data_inicio;
	}

	public void setDataInicio(Timestamp data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Timestamp getDataFim() {
		return data_fim;
	}

	public void setDataFim(Timestamp data_fim) {
		this.data_fim = data_fim;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public AtendimentoSatisfacao getSatisfacao() {
		return satisfacao;
	}

	public void setSatisfacao(AtendimentoSatisfacao satisfacao) {
		this.satisfacao = satisfacao;
	}

	public List<PerguntaRealizada> getPerguntasRealizadas() {
		return perguntas_realizadas;
	}

	public void setPerguntasRealizadas( List<PerguntaRealizada> perguntas_realizadas ) {
		this.perguntas_realizadas = perguntas_realizadas;
	}

	private void setTudo(int id, Cliente cliente, Timestamp data_inicio,
						 Timestamp data_fim, String protocolo,
						 List<PerguntaRealizada> perguntas_realizadas, AtendimentoSatisfacao satisfacao) {
		this.setId(id);
		this.setCliente(cliente);
		this.setDataInicio(data_inicio);
		this.setDataFim(data_fim);
		this.setProtocolo(protocolo);
		this.setPerguntasRealizadas(perguntas_realizadas);
		this.setSatisfacao(satisfacao);
	}

	public String getTudo() {
		String perguntas = "";

		for( PerguntaRealizada pergunta : this.getPerguntasRealizadas() ) {
			perguntas = perguntas + "\n" + pergunta.getTudo();
		}

		return "id: " + this.getId() + "\n" +
				"data_inicio:" + getDataInicio() + "\n" +
				"data_fim:" + this.getDataFim() + "\n" +
				"protocolo:" + this.getProtocolo() + "\n" +
				"cliente:" + this.cliente.getTudo() + "\n" +
				"satisfacao:" + this.satisfacao.getTudo() + "\n" +
				"perguntas realizadas:" + perguntas;
	}

}
