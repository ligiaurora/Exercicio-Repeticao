package Exercicio4;
import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float a = 0;
		float b = 0;
		float txa = 0;
		float txb = 0;
		
		do {
		System.out.print("População da cidade a: ");
		a = entrada.nextFloat();
		
		System.out.print("População da cidade b: ");
		b = entrada.nextFloat();
		
		System.out.print("Crescimento população da cidade a: ");
		txa = entrada.nextFloat();
		
		System.out.print("Crescimento população da cidade b: ");
		txb = entrada.nextFloat();
		} while(a > b || txa < txb);
		
		int anos = 0;
		
		do {
			a = a + ((a/100)*txa);
			b = (float) (b + ((b/100)*txb));
			anos++;
		} while ((a <= b));
		
		System.out.println(anos);
		entrada.close();
	}
}
