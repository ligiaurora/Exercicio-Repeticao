package Exercicio16;
import java.util.Scanner;


public class Exercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Quantidade de números no conjunto:");
		n = entrada.nextInt();
		
		int soma = 0;
		int num = 0;
		int menor = 0;
		int maior = 0;
		
		for (int x = 0; x < n; x++) {
			System.out.print("Digite um número:");
			num = entrada.nextInt();
			if (x == 0) {
				menor = num;
				maior = num;
			} else {  
				if (num < menor) {
					menor = num;
				} else if (num > maior) {
					maior = num;
				}
			}
			soma = soma+num;
		}
		System.out.println("Maior Valor: "+maior);
		System.out.println("Menor Valor: "+menor);
		System.out.println("Soma: "+soma);
		entrada.close();
	}
}
