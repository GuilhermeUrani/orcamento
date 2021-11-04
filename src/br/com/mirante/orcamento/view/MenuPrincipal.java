package br.com.mirante.orcamento.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuPrincipal {
	Scanner scanner = new Scanner(System.in);

	public void exibir() {
		imprimirMenu();

		var opcaoSelecionada = scanner.next();

		while (verificarSeOpcaoInvalida(opcaoSelecionada)) {
			System.out.println("A op��o � inv�lida, tente novamente. ");
			imprimirMenu();
			opcaoSelecionada = scanner.next();

		}

		processarOpcaoSelecionada(opcaoSelecionada);

	}

	private void processarOpcaoSelecionada(String opcaoSelecionada) {

		Map<String, Funcionalidade> menus = new HashMap<>();
	    menus.put("1", new CadastrarOrcamentoUI());
	    menus.put("2", new ListarOrcamentosUI());
	    menus.put("3", new DetalharOrcamentoUI());
	    menus.put("4", new Sair()); 
	    menus.get(opcaoSelecionada).executar();

	}

	private void imprimirMenu() {
		System.out.println("Digite o n�mero correspodente � opa��o desejada:");
		System.out.println("[1]. Cadastrar or�amento");
		System.out.println("[2]. Listar or�amento");
		System.out.println("[3]. Detalhar or�amento");
		System.out.println("[4]. Sair");

	}

	private boolean verificarSeOpcaoInvalida(String opcaoSelecionada) {
		return !opcaoSelecionada.equals("1") && !opcaoSelecionada.equals("2") && !opcaoSelecionada.equals("3")
				&& !opcaoSelecionada.equals("4");
	}
}
