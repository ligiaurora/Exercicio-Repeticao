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
				System.out.println("Usu�rio ou senha inv�lido ");
			} 
			
			System.out.print("Nome Usu�rio:");
			nome = entrada.nextLine();
			
			System.out.print("Digite a sua senha:");
			senha = entrada.nextLine();
			
		} while ((nome.equals(senha)));
		
		System.out.println("usuario: "+nome);
		System.out.println("senha: "+senha);
		
		entrada.close();

	}
}
