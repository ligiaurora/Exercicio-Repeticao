package Exercicio17;
import java.util.Scanner;


public class Exercicio17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		System.out.print("Digite um numero:");
		numero = entrada.nextInt();
		
		int cont = 0;
		
		if (numero == 1) {
			System.out.println("Não é um número primo");
		} else {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
				}
			}
			
			if (cont == 0) {
				System.out.println("Este número é primo");
			} else System.out.println("Não é um número primo");
		}
	
		entrada.close();
	}

}
