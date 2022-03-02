package aula18;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        double salario = 1000; 
        
        double percentual = 1.5; 
        
        salario += (salario/100) * percentual; 
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        for (int i=1997; i<=2015; i++){
            
            percentual *= 2;
            
            salario += (salario/100) * percentual;
            
            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");

	}
	}
}
