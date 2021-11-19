package Guanabara;

public class Caneta {
	
	public String modelo;
	public String cor;
	public float ponta;
	public int carga;
	boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta" + this.cor);
		System.out.println("está tampada? " + this.tampada);
		System.out.println("Ponta:" + this.ponta);
		System.out.println("Carga:" + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		
	}

	public void tampar() {
		
	}
	
	public void destampar() {
		
	}
}
