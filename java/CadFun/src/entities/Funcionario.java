package entities;

public class Funcionario {

	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//so entra alguma variavel dentro dos parenteses se for uma informa��o
	//externa, como por ex hora extra
	public double calcularSalario() {
		return (this.horasTrabalhadas*this.valorHora);
	}
	
}