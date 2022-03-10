package aula20;

public class IntroducaoMatriz {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 7.3;
		notasAlunos[1][2] = 8.2;
		notasAlunos[1][3] = 9.5;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 7;
		notasAlunos[2][2] = 8;
		notasAlunos[2][3] = 9;
		
		//Imprimindo uma matriz na tela
		//i percorre o primeiro colchete, a posição do aluno
		//j percorre o segundo colchete, a nota no index
		
		for(int i=0; i<notasAlunos.length; i++) {
			for(int j=0; j<notasAlunos[i].length;j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		
		//Mudando o valor de uma célula da matriz
		notasAlunos[1][3] = 8;
		
		System.out.println();
		
		for(int i=0; i<notasAlunos.length; i++) {
			for(int j=0; j<notasAlunos[i].length;j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		
		//Calculando a média de cada aluno
		System.out.println("Calculando a média de cada aluno");
		
		double soma;
		for(int i=0; i<notasAlunos.length; i++) {
			soma = 0;
			for(int j=0; j<notasAlunos[i].length;j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + (i+1) + ": " + (soma/4));
		}
		
		//Array de arrays
		
		double[][] notasAlunos2 = {{10,7,8,9.5},{9,8,7,9}};
		
		System.out.println("Output da matriz notasAlunos2");
		
		for(int i=0; i<notasAlunos2.length; i++) {
			for(int j=0; j<notasAlunos2[i].length;j++) {
				System.out.print(notasAlunos2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
