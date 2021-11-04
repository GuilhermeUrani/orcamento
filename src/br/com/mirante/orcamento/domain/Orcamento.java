package br.com.mirante.orcamento.domain;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private int id;
	private String descricao;
	private int mes;
	private int ano;
	private float valorTotalInformado;
	private List<ItemOrcamento> itensOrcamento;

	public Orcamento(String descricao, int mes, int ano, float valorTotalInformado,
			List<ItemOrcamento> itensOrcamento) {
		super();
		this.descricao = descricao;
		this.mes = mes;
		this.ano = ano;
		this.valorTotalInformado = valorTotalInformado;
		this.itensOrcamento = itensOrcamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public float getValorTotalInformado() {
		return valorTotalInformado;
	}

	public List<ItemOrcamento> getItensOrcamento() {
		return itensOrcamento; 
	}

	public List<ItemOrcamento> destalharInconsistencias() {
		var itensComInconsistencia = new ArrayList<ItemOrcamento>();
		for (var itemOrcamento : itensOrcamento) {
			if (itemOrcamento.possuiIncosistencia()) {
				itensComInconsistencia.add(itemOrcamento);

			}
		}
		return itensComInconsistencia;
	}
}
