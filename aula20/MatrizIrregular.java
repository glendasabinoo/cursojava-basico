package aula20;

import java.util.Scanner;

public class MatrizIrregular {
	/*Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da avenida mais movimentada de onde você mora.
	 * A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome de cada filho. Guarde essas informações em uma matriz
	 * de forma que cada pessoa da entevista ocupe somente o espaço necessário na memória para guardar os nomes dos filhos.Imprima a quantidade
	 * de pessoas entrevistadas, a quantidade de filhos de cada entrevistado e os respectivos nomes dos filhos.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número de pessoas que serão entrevistadas:");
		int qtdEntrevistados = scan.nextInt();
		int qtdFilhos;
		
		
		String[][] nomesFilhos = new String[qtdEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Qual a quantidade de filhos da pessoa " + (i+1) + "?");
			qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Entre com o nome do filho " + (j+1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i+1) + " tem " + nomesFilhos[i].length + " filhos:");
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}
