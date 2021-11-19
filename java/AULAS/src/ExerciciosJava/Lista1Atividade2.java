package ExerciciosJava;
import java.util.Scanner;
public class Lista1Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		double nota1,nota2,nota3,media;
		
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = read.nextDouble();		
		System.out.println("Informe a segunda nota do aluno");
		nota2 = read.nextDouble();		
		System.out.println("Informe a terceira nota do aluno");
		nota3 = read.nextDouble();	
		
		media= ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
		
		System.out.println("A média do aluno foi: " + media);
		
	}

}
