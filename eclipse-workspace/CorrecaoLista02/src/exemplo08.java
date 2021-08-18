//Criar um programa em Java que receba pelo teclado 10 números
//inteiros e informe quantos números digitados são ímpares.

import java.util.Scanner;

public class exemplo08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contadorImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %sº valor: ", i);
			int n = leitor.nextInt();
			
			if(n % 2 != 0) {
				contadorImpar ++;
			}
		}
		
		System.out.printf("Quantidade de números ímpares: %s", contadorImpar);		

	}

}
