import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//Aqui fornecerá o número de itens que vai ter a array
		System.out.print("Quantos número você vai digitar: ");
		int n = sc.nextInt();
		double[] vect = new double [n]; //para criar a array, n é o numero de itens
		
		//Loop for para incluir a quantidade de itens que o usuário escolheu
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		
		//Loop for, com uma condicional para se for um numero negativo digitado vai aparecer aqui
		System.out.println("Números negativos:");
		for (int i=0; i<vect.length; i++) {
	        if (vect[i] < 0) {
	        	System.out.printf("%.2f%n", vect[i]);
	        }
	    }
		
		sc.close();
	}

}
