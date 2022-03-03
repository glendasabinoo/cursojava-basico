package aula19;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int [10];
		int somaMenor15 = 0;
		int qtdIgual15 = 0;
		int somaMaior15 = 0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Informe o valor de entrada " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length;i++) {
			if(vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else if(vetorA[i] == 15) {
				qtdIgual15++;
			} else if(vetorA[i] > 15) {
				somaMaior15 += vetorA[i];
			}
		}
		
		int mediaMaior15 = somaMaior15 / vetorA.length;
		System.out.print("Vetor A = ");
		for(int i=0;i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma de valores menores que 15 é de: " + somaMenor15);
		System.out.println("A quantidade de valores igual a 15 é de: " + qtdIgual15);
		System.out.println("A média de valores maiores que 15 é de: " + mediaMaior15);

	}

}
