package aula19;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int [10];
		int vetorB[] = new int [vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Informe o n�mero de entrada A");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Informe o n�mero de entrada do vetor B");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i =0; i<vetorA.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
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
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0;i<vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
