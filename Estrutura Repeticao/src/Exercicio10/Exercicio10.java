package Exercicio10;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int base = 0;
		System.out.print("Digite o valor da base: ");
		base = entrada.nextInt();
		
		int exp = 0;
		System.out.print("Digite o valor do expoente: ");
		exp = entrada.nextInt();
		
		int result = 0;
		
		
		if (exp == 0) {
			System.out.println("Potencia��o de base "+base+" com expoente "+exp+" = 1");
		} else if (exp == 1) {
			System.out.println("Potencia��o de base "+base+" com expoente "+exp+" = "+base);
		} else {		
			for(int x = 0; x < exp; x++) {
				if (x == 1) {
					result = base * base;
				} else result = result * base;
			}
			
			System.out.println("Potencia��o de base "+base+" com expoente "+exp+" = "+result);
		}
		
		entrada.close();
	}
	
}
