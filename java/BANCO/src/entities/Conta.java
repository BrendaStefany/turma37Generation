package entities;

public abstract class Conta {

	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;

	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

//	
//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	// METODOS
	public void ativarConta() {
		this.ativo = true;
	}

	// RECEBE UM VALOR EXTERNO, POR ISSO ENTRA NOS PARENTESES
	public void credito(double valor) {
		if (valor <= 0) {
			System.out.println("Imposs�vel realizar a opera��o..");
		} else {
			this.saldo = this.saldo + valor;
			System.out.println("Opera��o de cr�dito realizada com sucesso!!");
		}

	}

	public void debito(double valor) {
		if (valor <= 0) {
			System.out.println("Imposs�vel realizar opera��o..");
		} else if (valor > saldo) {
			System.out.println("Saldo indispoviel..");
		} else if (saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Opera��o de d�bito realizado com sucesso!");
		}

	}

}