package aula18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um n�mero");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        
        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("N�o � primo - divis�vel por " + i);
                primo = false;
                break;
            }
        }
        if (primo){
            System.out.println("� n�mero primo");
        }
}
}
