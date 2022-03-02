package aula18;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o número da tabuada:");
		int num = scan.nextInt();
		System.out.println("Informe o número onde começa a tabuada:");
		int inicio = scan.nextInt();
		System.out.println("Informe o número onde termina a tabuada:");
		int fim = scan.nextInt();
		
		System.out.println("Tabuada de " + num + ":");
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar por: " + fim);
		
		System.out.println("Vou montar a tabuada de " + num + " começando em " + inicio + " e terminando em " + fim);
		
		for(int i = inicio; i<=fim; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}

	}

}
