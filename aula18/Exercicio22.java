package aula18;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de CDs:");
		int qtdCDs = scan.nextInt();
		
		double valorCD;
		double soma = 0;
		double media;
		
		for(int i = 0; i<qtdCDs; i++) {
			System.out.println("Entre com o valor do CD " + (i+1));
			valorCD = scan.nextDouble();
			
			soma += valorCD;		
		}
		media = soma / qtdCDs;
		System.out.println("Valor médio gasto em CDs: " + media);
	}

}
