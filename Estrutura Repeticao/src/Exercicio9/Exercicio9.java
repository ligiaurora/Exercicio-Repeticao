package Exercicio9;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		System.out.print("Tabuada:");
		n = entrada.nextInt();
		
		int mult = 0;
		for (int x = 1; x <= 10; x++) {
			mult = n*x;
			System.out.println(n+" x "+x+" = "+mult);
		}
		
		entrada.close();
	}
}
