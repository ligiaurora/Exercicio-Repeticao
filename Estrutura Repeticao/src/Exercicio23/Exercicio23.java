package Exercicio23;
import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
			System.out.print("Quantidade de turmas: ");
		n = entrada.nextInt();
		
		int alunos = 0;
		int soma = 0;
	for (int x = 1; x <= n; x++) {
		do {
			System.out.print("Quantidade de alunos da turma "+x+": ");
			alunos = entrada.nextInt();
		} while (alunos < 1 && alunos > 40);
		soma = soma + alunos;
	}
	System.out.println("A m�dia de alunos por turma � de: "+soma/n+" alunos");
	entrada.close();

	}
}
