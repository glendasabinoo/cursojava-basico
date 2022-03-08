package aula19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] notas1 = new double [10];
		double[] notas2 = new double [notas1.length];
		double media = 0;
		double[] result = new double [notas1.length];
		
		
		for(int i=0; i<notas1.length;i++) {
			System.out.println("Informe o valor da primeira nota bimestral do aluno " + (i+1));
			notas1[i] = scan.nextInt();
		}
		
		for(int i=0; i<notas1.length;i++) {
			System.out.println("Informe o valor da segunda nota bimestral do aluno " + (i+1));
			notas2[i] = scan.nextInt();
		}
		
		for(int i=0;i<notas1.length;i++) {
			media = (notas1[i] + notas2[i]) / 2;
			System.out.println("Média do aluno " + (i+1) + ": " + media);
			
			if(media >= 7) {
				System.out.println("aprovado!");
			} else {
				System.out.println("reprovado!");
			}
		}
	
		

	}

}
