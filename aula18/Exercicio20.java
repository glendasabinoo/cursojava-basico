package aula18;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a quantidade de idades:");
		int idades = scan.nextInt();
		
		double soma = 0;
		double media;
		int idade;
		
		for(int i = 0; i<idades; i++) {
			System.out.println("Entre com a idade " + (i+1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		media = soma / idades;
		if(media >= 0 && media <= 25) {
			System.out.println("A média das idades informadas é: " + media + "; turma jovem");
		} else if(media >= 26 && media <= 60) {
			System.out.println("A média das idades informadas é: " + media + "; turma adulta");
		} else {
			System.out.println("A média das idades informadas é: " + media + "; turma idosa");
		}
		

	}

}
