package Exercicio13;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Fatorial:");
		n = entrada.nextInt();
		
		int resultado = 1;
		
		System.out.print(n+"!=");
		while(n != 0) {
			System.out.print(n+".");
			resultado = (resultado*n);
			n--;
		}
		System.out.print("="+resultado);
		entrada.close();
	}

}
