package aula19;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] idades = new int [10];
		
		int soma = 0;
		
		for(int i=0; i<idades.length;i++) {
			System.out.println("Informe a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
		}
		
		for(int i=0;i<idades.length;i++) {
			if(idades[i] > 35) {
				soma++;
			}
		}
		System.out.print("Vetor A = ");
		for(int i =0;i<idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		System.out.println("O número de pessoas com idade superior a de 35 anos é: " + soma);

	}

}
