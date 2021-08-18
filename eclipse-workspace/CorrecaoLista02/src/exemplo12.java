import java.util.Scanner;

//Criar um programa que receba pelo teclado 10 números inteiros.
//Apresentar na tela o MAIOR e o MENOR número lido. 
//OBS.: Não use vetor.

public class exemplo12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int maior = 0, menor = 0;
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %sº valor: ", i);
		     int n = leitor.nextInt();
		     
		     if(i ==1) {
		    	 maior = n;
		    	 menor =n;
		     }
		     
		     if(n > maior) {
		    	 maior = n;		    	 
		     }
		     
		     if(n < menor) {
		    	 menor = n;
		     }
		
		}
		
		System.out.printf("Maior: %s\n", maior);
		System.out.printf("Menor: %s", menor);

	}

}

