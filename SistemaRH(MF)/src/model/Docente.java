package model;

public class Docente extends Funcionario {

	private String siape;
	private String area;
	
	public Docente(String cpf, String nome, String endereco, String dataAdmissao, String titulacao, float salarioBase, String siape, String area) {
		super(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase);
		this.siape = siape;
		this.area = area;
	}
	
	public void setSiape(String siape) {
		this.siape = siape;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getSiape() {
		return this.siape;
	}
	
	public String getArea() {
		return this.area;
	}
	
	@Override
	public float calculaSalario() {
		if (this.getTitulacao().equalsIgnoreCase("Mestre")) {
			return this.getSalarioBase() * 1.2f;
		} else if (this.getTitulacao().equalsIgnoreCase("Doutor")) {
			return this.getSalarioBase() * 1.4f;
		}
		return this.getSalarioBase();
	}
	
	@Override
	public String dadosCalculados() {
		String dadosFuncionario = super.dadosCalculados();
		String dadosDocente = String.format("Digite o Siape: %s\n"
										  + "Qual a area? %s", 
										  this.siape, this.area);
		return dadosFuncionario + dadosDocente;
	}
}
