package Exercicio8;
import java.util.Scanner;


public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1 = 0;
		System.out.print("Primeiro número: ");
		n1 = entrada.nextInt();
		
		int n2 = 0;
		System.out.print("Segundo número: ");
		n2 = entrada.nextInt();
		
		int soma = 0;
		
		while(n1 < n2-1) {
			System.out.print(n1+" ");
			soma = soma + n1;
		}
		System.out.println(" soma: "+soma);
		entrada.close();
	}
}
