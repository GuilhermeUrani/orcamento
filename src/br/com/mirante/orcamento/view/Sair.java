package br.com.mirante.orcamento.view;

public class Sair implements Funcionalidade {

	@Override
	public void executar() {

		System.out.println("Adeus...");
		System.exit(0);
	}

}
