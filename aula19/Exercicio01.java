package aula19;

import java.util.Scanner;

public class Exercicio01 {
//Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho com os "mesmos" elementos do vetor A. Ou seja, B[i] = A[i].
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int [5];
		int vetorB[] = new int [vetorA.length];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Informe o número de entrada");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0;i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0;i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
