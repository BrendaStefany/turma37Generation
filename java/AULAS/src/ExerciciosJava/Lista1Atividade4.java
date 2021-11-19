package ExerciciosJava;
import java.util.Scanner;

public class Lista1Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		int horas, minutos, segundo, segundosFinal;

		System.out.println("Digite a duração do tempo em segundos: ");
		segundo = read.nextInt();

		horas = segundo / 3600;
		minutos = ((segundo % 3600) / 60);
		segundosFinal = ((segundo % 3600) % 60);

		System.out.println("A duração do evento em horas, minutos e segundos foi " + horas + ":" + minutos + ":" + segundosFinal);

	}
}
