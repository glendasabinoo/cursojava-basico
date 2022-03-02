package aula18;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a quantidade de temperaturas");
		int qtdTemperaturas = scan.nextInt();
		double temperaturas; 
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		double soma = 0;
		for(int i = 1; i<=qtdTemperaturas; i++) {
			System.out.println("Informe a temperatura " + i);
			temperaturas = scan.nextDouble();
			
			soma += temperaturas;
			
			if(temperaturas > maior) {
				maior = temperaturas;
			}
			
			if(temperaturas < menor) {
				menor = temperaturas;
			}
			}
		
		double media = soma / qtdTemperaturas;
		System.out.println("Média: " + media);
		System.out.println("Menor valor: " + menor);
		System.out.println("Maior valor: " + maior);

	}

}
