package TesteHerancaEntities;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal cachorro = new Cachorro ("BOB", 8, "MARROM","POODLE");
		Animal cavalo = new Cavalo ("BLACK", 12, "PRETO","MUSTANGUE");
		Animal preguica = new Preguica ("FLASH",6, 0.8,4); 
		
		System.out.println("CACHORRO  \nNOME:" + cachorro.getNome()+ " \nIDADE:" + cachorro.getIdade()+"\n"+cachorro.somCachorro());
		System.out.println("\nCAVALO  \nNOME:" + cavalo.getNome()+ "\nIDADE:" + cavalo.getIdade() + "\n"+ cavalo.somCavalo());
		System.out.println("\nPREGUIÇA \nNOME:"+ preguica.getNome()+ "\nIDADE:" + preguica.getIdade()+ "\n"+preguica.somPreguica());
		
		
	}

}
