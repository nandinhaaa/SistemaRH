package model;

import java.util.ArrayList;
import java.util.List;

public class RH {

	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void adicionaFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public List<Funcionario> buscaFuncionario(String nome) {
		List<Funcionario> pesquisar = new ArrayList<Funcionario>();
		for (Funcionario f : funcionarios) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				pesquisar.add(f);
			}
		}
		return pesquisar;
	}
	
	public List<Funcionario> listarFuncionarios() {
		return this.funcionarios;
	}
}
