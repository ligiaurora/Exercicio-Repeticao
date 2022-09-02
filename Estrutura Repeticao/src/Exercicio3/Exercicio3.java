package Exercicio3;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int c = 0;
		String nome = null;
		
		do {
			if (c != 0) {
				System.out.print("O nome deve ser maior que 3 caracteres");
			} 
			System.out.print("Informe um nome: ");
			nome = entrada.nextLine();
	
		} while ((nome.length() <= 3));
		
		
		float idade = 0;
		c = 0;
		
		do {
			if (c != 0) {
				System.out.print("Idade inválida, ");
			} 
			System.out.print("Informe uma Idade: ");
			idade = entrada.nextFloat();
		
		} while (!(idade <= 150 && idade >= 0));
		
		float salario = 0;
		c = 0;
		
		do {
			if (c != 0) {
				System.out.print("Salário deve ser maior que zero, ");
			} 
			System.out.print("Informe seu Salário: ");
			salario = entrada.nextFloat();
			
		} while ((salario <= 0));
		
	
		String sexo = null;
		c = 0;
		entrada.nextLine();
		do {
			if (c != 0) {
				System.out.print("Digite: M ou F");
			} 
		
			System.out.print("Informe o genero:");
			sexo = entrada.nextLine();
		
			c++;
		} while (!(sexo.equals("m") || sexo.equals("f") || sexo.equals("M") || sexo.equals("F")));
		
	
		String estCivil = null;
		c = 0;
		
		do {
			if (c != 0) {
				System.out.print("Use s ou c ou v ou d, ");
			} 
		
			System.out.print("Informe um estado civil (s,c,v,d): ");
			estCivil = entrada.nextLine();
		
			c++;
		} while (!(estCivil.equals("s") || estCivil.equals("c") || estCivil.equals("d") || estCivil.equals("v") || estCivil.equals("S") || estCivil.equals("C") || estCivil.equals("D") || estCivil.equals("V")));
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário: "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+estCivil);
		
		entrada.close();

	}


}
