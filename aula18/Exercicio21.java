package aula18;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de turmas:");
		int turmas = scan.nextInt();
		int alunos;
		
		int soma = 0;
		boolean invalido = true;
		
		
		for(int i = 1; i<=turmas; i++) {
			
			invalido = true;
			do {
				System.out.println("Informe a quantidade de alunos da turma: " + i);
				alunos = scan.nextInt();
				
				if(alunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Número de alunos deve ser menor que 40.");
				}
			} while(invalido);
			
			soma += alunos;
			
		}
		double media = soma / turmas;
		System.out.println("Média = " + media);

	}

}
