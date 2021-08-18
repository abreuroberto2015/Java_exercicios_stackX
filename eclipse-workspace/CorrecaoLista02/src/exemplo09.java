import java.util.Scanner;

//Criar um programa que leia os valores A e B, compare se a soma
//de A e B é divisível por 2 e imprima a resposta na tela.


public class exemplo09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Qual o valor de A? :");
		a = leitor.nextInt();
		
		System.out.println("Qual o valor de B? :");
		b = leitor.nextInt();
		
		soma = a + b;
		
		if (soma % 2 == 0) {
			System.out.printf("%s é divisível por 2", soma);
		} else {
			System.out.printf("%s Não é divisível por 2", soma);

		}

	}

}
