package aula19;

public class Arrays {
	//Estrutura de dados mais simples existente na maioria das linguagens de programação;
	// Lista ordenada de dados.

	public static void main(String[] args) {
		// Armazenar a temperatura média por 1 ano;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 31.4;
		temperaturas[2] = 32.3;
		temperaturas[3] = 31.6;
		temperaturas[4] = 31.7;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array é de: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for(int i = 0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		

}
}
