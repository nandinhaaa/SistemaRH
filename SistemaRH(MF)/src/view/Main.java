package view;

import java.util.List;

import model.Docente;
import model.Funcionario;
import model.RH;
import model.Tecnico;
import model.Terceirizado;

public class Main {

	public static void main(String[] args) {

		int opcao;
		int tipo;

		Menu menu = new Menu();
		RH rh = new RH();

		do {
			opcao = menu.mainMenu();
			switch (opcao) {
			case 1: {
				tipo = menu.menuFuncionario();
				switch (tipo) {
				case 1: {
					Docente d = menu.dadosDocente();
					rh.adicionaFuncionario(d);
					System.out.println("Digite os dados do docente");
					System.out.println(d.dadosCalculados());
					System.out.println("Salario total do docente");
					System.out.println("Valor:" + d.calculaSalario());
				}
					break;
				case 2: {
					Tecnico t = menu.dadosTecnico();
					rh.adicionaFuncionario(t);
					System.out.println("Digite os dados do tecnico");
					System.out.println(t.dadosCalculados());
					System.out.println("Salario total do tecnico");
					System.out.println("Valor:" + t.calculaSalario());
				}
					break;
				case 3: {
					Terceirizado t = menu.dadosTerceirizado();
					rh.adicionaFuncionario(t);
					System.out.println("Digite os dados do tercerizado");
					System.out.println(t.dadosCalculados());
					System.out.println("Salario total do terceirizado");
					System.out.println("Valor:" + t.calculaSalario());
				}
					break;
				case 0: {
					System.out.println
					("-~-~-> Retornando para o menu <-~-~-");
				}
					break;
				default: {
					System.out.println
					("Opcao nao existe!");
				}
					break;
				}
			}
				break;
			case 2: {
				String nome = menu.nomeFuncionario();
				List<Funcionario> pesquisar = rh.buscaFuncionario(nome);
				if (pesquisar.isEmpty()) {
					System.out.println
					("Nome nao encontrado!");
				} else {
					for (Funcionario f : pesquisar) {
						System.out.println(f.dadosCalculados());
					}
				}
			}
				break;
			case 3: {
				List<Funcionario> lista = rh.listarFuncionarios();
				if (lista.isEmpty()) {
					System.out.println
					("Funcionario nao existe!");
				} else {
					for (Funcionario f : lista) {
						System.out.println(f.dadosCalculados());
					}
				}
			}
				break;
			case 0: {
				System.out.println
				("Sistema encerrado, tchau! o/");
			}
				break;
			default: {
				System.out.println
				("Opcao nao existe");
			}
				break;
			}
		} while (opcao != 0);

		menu.close();
	}
}
