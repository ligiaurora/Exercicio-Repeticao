package Exercicio24;
import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			int n = 0;
				System.out.print("Quantidade de Cds: ");
			n = entrada.nextInt();
			
			float pTotal = 0;
			float cd = 0;
			
			for (int x = 1; x <= n; x++) {
				System.out.print("Preço de "+x+" Cds: ");
				cd = entrada.nextFloat();
			
				pTotal = pTotal + cd;
			}
			
		System.out.println("O preço total foi de "+pTotal);
		System.out.println("O preço medio por cds:"+pTotal/n);
		entrada.close();
	}
}
