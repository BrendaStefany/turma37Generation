package entities;

public class Terceiro extends Funcionario{

	private double adicional;

	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	
	@Override
	//PUXOU OS VALORES DE HORAS TRABALHADAS E VALOR HORA
	//DA MÃE, SO COLOCANDO O SUPER NA FRENTE.
	//O OVERRIDE
	public double calcularSalario() {
		return (super.getHorasTrabalhadas()*super.getValorHora())+this.adicional;
		
		//OUTRO JEITO MUDAR O PRIVATE PARA PROTECT PQ AI EXTENDE
		//QUE A CLASSE FILHO TENHA ACESSO DIRETO AOS ATRIBUTOS
		//O USO DO PROTECT NÃO PRECISA UTILIZAR O SUPER, JA QUE A CLASSE FILHO TEM ACESSO DIRETO.
		//return (this.horasTrabalhadas * this.valorHora)+adicional;
	}
	
}