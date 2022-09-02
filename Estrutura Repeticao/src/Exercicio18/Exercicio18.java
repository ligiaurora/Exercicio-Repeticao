package Exercicio18;
import java.util.Scanner;


public class Exercicio18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Digite um numero:");
		num = entrada.nextInt();
	
		int cont = 0;
		
		if (num == 1) {
			System.out.println("Não é um número primo");
		} else {	
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					cont++;
					System.out.println("Número divisivel por: "+i);
				}
			}
			
			if (cont == 0) {
				System.out.println("Este número é primo");
			} else System.out.println("Não é um número primo");
		}
		entrada.close();
	}


}
