package aula18;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um n�mero");
        int num = scan.nextInt();
        boolean primo;
        
        for(int i = 1; i<=num; i++) {
        	
        	primo = true;
            
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.println(i);
            }
        }
	}

}
