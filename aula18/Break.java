package aula18;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		// comando utilizado para saída de loops;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número");
		int num1 = scan.nextInt();
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for(int i = num1;i<=max; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
