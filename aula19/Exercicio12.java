package aula19;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int soma = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Informe o valor de entrada " + (i+1));
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i=0;i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma dos valores informados é: " + soma);
		
		

	}

}
