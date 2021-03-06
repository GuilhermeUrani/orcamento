package br.com.mirante.orcamento.servico;

import java.util.List;

import br.com.mirante.orcamento.domain.Orcamento;
import br.com.mirante.orcamento.repository.OrcamentoRepository;
import br.com.mirante.orcamento.repository.OrcamentoRepositoryEmJava;

public class ListarOrcamentosServico {

	private OrcamentoRepository repositorio = new OrcamentoRepositoryEmJava();

	public List<Orcamento> listarOrcamentos() {
		return repositorio.listar();
	}

}
