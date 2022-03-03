package aula18;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for(int i = num1;i<=max; i++) {
			if(i % 7 == 0) {
				continue;
				// se for múltiplo de 7, não vai imprimir o valor.
			}
			System.out.println("O valor de i: " + i);

	}
	}
}
