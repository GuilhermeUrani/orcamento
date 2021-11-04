package br.com.mirante.orcamento.servico;

import br.com.mirante.orcamento.domain.Orcamento;
import br.com.mirante.orcamento.repository.OrcamentoRepository;
import br.com.mirante.orcamento.repository.OrcamentoRepositoryEmJava;

public class DetalharOrcamentoServico {

	private OrcamentoRepository repositorio = new OrcamentoRepositoryEmJava();

	public Orcamento recuperar(int id) {
		return repositorio.recuperar(id);

	}

}
