package entities;

public class TesteCarroPadrao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro1 = new Carro ("PLLX0301","CELTA","GM");
		Carro carro2 = new Carro ();
		
		
		//se for receber informação de usuario, basta criar um sysout,
		//uma variavel auxiliar, tipo "auxPlaca", e ai dentro do setPlaca, jogo essa variavel auxiliar.
		
//		carro2.setPlaca("BBC-0301");
//		carro1.setPlaca("PPR-0234");
//		
		
		carro1.ligarCarro();
		carro1.andarCarro();
		System.out.println("marcha:" + carro1.getMarcha() + " velocidade: "+carro1.getVelocidade());
//		System.out.println(carro1.getModelo()+""+carro1.getPlaca());
//		System.out.println(carro2.getModelo()+""+carro2.getPlaca());
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println("marcha:" + carro1.getMarcha() + " velocidade: "+carro1.getVelocidade());
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println("marcha:" + carro1.getMarcha() + "velocidade: "+carro1.getVelocidade());
		carro1.descerMarcha();
		carro1.reduzir();
		carro1.reduzir();
		carro1.reduzir();
		System.out.println("marcha:" + carro1.getMarcha() + " velocidade: "+carro1.getVelocidade());
		
		carro1.reduzir();
		carro1.reduzir();
		carro1.descerMarcha();
		carro1.reduzir();
		carro1.reduzir();
		carro1.descerMarcha();
		System.out.println("marcha:" + carro1.getMarcha() + " velocidade: "+carro1.getVelocidade());

		
	}

}