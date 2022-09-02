package Exercicio11;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int par = 0;
		int impar = 0;
		int n = 0;
		for(int x = 1; x <= 10; x++) {
			System.out.print("Digite um número:");
			n = entrada.nextInt();
			
			if (n % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		
		System.out.println("Número Par: "+par);
		System.out.println("Número Impar: "+impar);
		
		entrada.close();
	}

}
