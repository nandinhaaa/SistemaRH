package view;

import java.util.Scanner;

import model.Docente;
import model.Tecnico;
import model.Terceirizado;

public class Menu {
	
	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private float salarioBase;
	private Scanner in;

	public Menu() {
		in = new Scanner(System.in);
	}
	
	private void dadosFuncionario() {
		System.out.print("Digite o CPF: ");
		cpf = in.nextLine();
		System.out.print("Digite o nome: ");
		nome = in.nextLine();
		System.out.print("Digite o endereco: ");
		endereco = in.nextLine();
		System.out.print("Digite a data de admissao: ");
		dataAdmissao = in.nextLine();
		System.out.print("Digite a titulacao: ");
		titulacao = in.nextLine();
		System.out.print("digite o salario base: ");
		salarioBase = Float.parseFloat(in.nextLine());
	}
	
	public Docente dadosDocente() {
		this.dadosFuncionario();
		System.out.print("Siape: ");
		String siape = in.nextLine();
		System.out.print("Area: ");
		String area = in.nextLine();
		Docente d = new Docente(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase, siape, area);
		return d;
	}
	
	public Tecnico dadosTecnico() {
		this.dadosFuncionario();
		System.out.print("Siape: ");
		String siape = in.nextLine();
		System.out.print("Departamento: ");
		String departamento = in.nextLine();
		Tecnico t = new Tecnico(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase, 
				siape, departamento);
		return t;
	}
	
	public Terceirizado dadosTerceirizado() {
		this.dadosFuncionario();
		System.out.print("Quando sera acabara o contrado? ");
		String dataFimContrato = in.nextLine();
		System.out.print("Qual sera sua funcao? ");
		String funcao = in.nextLine();
		Terceirizado t = new Terceirizado(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase, 
				dataFimContrato, funcao);
		return t;
	}
	
	public int mainMenu() {
		System.out.println("IF RH -----------------Menu principal-------------------------");
		System.out.println("|~-~-~-~-~-~-~-~-~-~-~-~-~-~-~--~-~-~-~-~-~-~-~-~-~-~-~-~-~--~|");
		System.out.println("| Bem-Vindo(a) ao sistema do RH if sul de minas!              |");
		System.out.println("| Selecione uma das opcoes :)                                 |");
		System.out.println("| [1]* Cadastro de Docente, Tecnico ou Terceiro               |");
		System.out.println("| [2]* Pesquisar um nome                                      |");
		System.out.println("| [3]* Listar todos os funcionarios cadastrados no sistema    |");
		System.out.println("| [0]* Sair di sistema :(                                     |");
		System.out.println("|~-~-~-~-~-~-~-~-~-~-~-~-~-~-~--~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-|");
		System.out.println("copyright Nanda. Todos os direitos reservados 2022.");
		int opcao = Integer.parseInt(in.nextLine());
		return opcao;
	}
	
	public int menuFuncionario() {
		System.out.println("Tipo de funcionario");
		System.out.println("[1]* Docente");
		System.out.println("[2]* Tecnico");
		System.out.println("[3]* Terceirizado");
		System.out.println("[0]* Voltar ao menu");
		int tipo = Integer.parseInt(in.nextLine());
		return tipo;
	}
	
	public String nomeFuncionario() {
		System.out.print("Digite o nome: ");
		String nome = in.nextLine();
		return nome;
	}
	
	public void close() {
		in.close();
	}
}
