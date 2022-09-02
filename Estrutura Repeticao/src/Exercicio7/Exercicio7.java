package Exercicio7;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		System.out.print("Digite um numero:");
		num1 = entrada.nextInt();
		
		int num2 = 0;
		System.out.print("Digite um outro numero:");
		num2 = entrada.nextInt();
		
		while(num1 < num2-1) {
			System.out.print(num1+" ");
		}
		
		entrada.close();	
	}

}
