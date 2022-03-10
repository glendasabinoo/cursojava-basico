package aula20;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[4][4];
		
		Random numeroRandom = new Random();
		int maior = 0;
		int linha = 0;
		int col = 0;
		
		for(int i=0; i<numerosAleatorios.length;i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(9);
				
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		for(int i=0; i<numerosAleatorios.length;i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
				}
			System.out.println();
			}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O maior número está localizado na linha " + linha + " e na coluna " + col);
		
		
		
	}

}
