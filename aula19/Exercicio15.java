package aula19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int pares = 0;
	
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Informe o valor de entrada de " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i] % 2 == 0) {
				pares++;
			}
		}
		
		int impares = vetorA.length - pares;
		
		int percentualPares = (pares*100) / vetorA.length;
		int percentualImpares = (impares*100) / vetorA.length;
		
		System.out.print("Vetor A = ");
		for(int i=0;i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("O percentual de valores ímpares é de: " + percentualImpares + "%");
		System.out.println("O percentual de valores pares é de: " + percentualPares + "%");
		
		

	}

}
