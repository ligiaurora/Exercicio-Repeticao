package Exercicio22;
import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			int n = 0;
				System.out.print("Informe a quantidade de votantes: ");
					n = entrada.nextInt();
			
			int cand1 = 0;
			int cand2 = 0;
			int cand3 = 0;
			int voto = 0;
				
		for (int x = 1; x <= n; x++) {
			do {
				System.out.print("Voto (1 - candidato1; 2- candidato2; 3- candidato3): ");
				voto = entrada.nextInt();
				if (voto > 3 && voto < 1) {
					System.out.println("Voto Inválido");				
				}
			} while (voto > 3 && voto < 1);
			
			if (voto == 1) {
				cand1++;
			} else if (voto == 2) {
				cand2++;
			} else cand3++;	
		}
		
		System.out.println("Votos do primeiro candidato: "+cand1);
		System.out.println("Votos do segundo candidato: "+cand2);
		System.out.println("Votos do terceiro candidato: "+cand3);
		
		entrada.close();
	}

}
