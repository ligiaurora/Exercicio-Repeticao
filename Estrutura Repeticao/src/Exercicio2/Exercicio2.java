package Exercicio2;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome = null;
		String senha = null;
	
		int n = 0;
		do {
			if (n != 0) {
				System.out.println("Usuário ou senha inválido ");
			} 
			
			System.out.print("Nome Usuário:");
			nome = entrada.nextLine();
			
			System.out.print("Digite a sua senha:");
			senha = entrada.nextLine();
			
		} while ((nome.equals(senha)));
		
		System.out.println("usuario: "+nome);
		System.out.println("senha: "+senha);
		
		entrada.close();

	}
}
