package aula18;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o n�mero da tabuada:");
		int num = scan.nextInt();
		System.out.println("Informe o n�mero onde come�a a tabuada:");
		int inicio = scan.nextInt();
		System.out.println("Informe o n�mero onde termina a tabuada:");
		int fim = scan.nextInt();
		
		System.out.println("Tabuada de " + num + ":");
		System.out.println("Come�ar por: " + inicio);
		System.out.println("Terminar por: " + fim);
		
		System.out.println("Vou montar a tabuada de " + num + " come�ando em " + inicio + " e terminando em " + fim);
		
		for(int i = inicio; i<=fim; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}

	}

}
