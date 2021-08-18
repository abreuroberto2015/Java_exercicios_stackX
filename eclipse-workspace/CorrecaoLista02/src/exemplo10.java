
import java.util.Scanner;

//Criar um programa que leia os valores A, B, N, compare se a 
//soma de A e B é divisível por N e imprima a resposta na tela



public class exemplo10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a, b, n, soma;
		
		System.out.println("Qual o valor de A? :");
		a = leitor.nextInt();
		
		System.out.println("Qual o valor de B? :");
		b = leitor.nextInt();
		
		System.out.println("Qual o valor de N? :");
		n = leitor.nextInt();
		
		soma = a + b;
		
		if (soma % n == 0) {
			System.out.printf("%s é divisível por %s", soma, n);
		} else {
			System.out.printf("%s Não é divisível por %s", soma, n);

		}

	}

}
