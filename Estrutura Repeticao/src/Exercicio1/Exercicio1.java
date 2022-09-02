package Exercicio1;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float nota = 0;
		int n = 0;
		
		do {
			if (n != 0) {
				System.out.print("Nota inválida");
			} 
			System.out.print("Informe uma nota: ");
			nota = entrada.nextFloat();
		} while (!(nota <= 10 && nota >= 0));
		
		System.out.println("Nota: "+nota);
		
		entrada.close();
	}

}
