package Exercicio15;

public class Exercicio15 {
	public static void main(String[] args) {
		int en = 1;
		int n = 37;
		int m = 38;
		
		float resultado = 0;
		
		System.out.print("S = ");
		
	while (n != 0) {
		if ( n != 1 ) {
			System.out.print("("+n+"*"+m+")/"+en+" + ");
		} 
		if (n == 1) {
			System.out.println("("+n+"*"+m+")/"+en+".");
		}
		resultado = resultado +(n*m)/en;
	}
	System.out.println("Resultado:"+resultado);
}

}
