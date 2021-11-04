package br.com.mirante.orcamento.domain;

public class ItemOrcamento {

	private String origem;
	private String codigo;
	private String DescricaoItem;
	private float valorUnitario;
	private String unidade;
	private float quantidade;
	private float valorTotalInformado;
																																																			
	
	public ItemOrcamento(String origem, String codigo, String DescricaoItem, float valorUnitario, String unidade,
			float quantidade, float valorTotalInformado) {
		super();
		this.origem = origem;
		this.codigo = codigo;
		this.DescricaoItem = DescricaoItem;
		this.valorUnitario = valorUnitario;
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.valorTotalInformado = valorTotalInformado;
	}

	public String getOrigem() {
		return origem;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricaoItem() {
		return DescricaoItem;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public String getUnidade() {
		return unidade;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public float getValorTotalInformado() {
		return valorTotalInformado;
	}

	public boolean possuiIncosistencia() {
		return valorUnitario * quantidade != valorTotalInformado;
	}

}
