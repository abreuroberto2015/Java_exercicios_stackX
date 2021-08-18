import java.util.Scanner;

//Criar um programa que leia pelo teclado um valor inteiro e diga se 
//é par ou ímpar.

public class exemplo05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor;
		int res;
		
		System.out.println("Digite um valor inteiro: ");
		valor = leitor.nextInt();
		
		res = valor % 2;
		
		if(res ==0) {
			System.out.println("Número Par:");
		} else {
			System.out.println("Número Ímpar");
		}

	}

}
