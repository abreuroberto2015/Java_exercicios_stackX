import java.util.Scanner;

//Criar um programa que receba pelo teclado um n�mero positivo
//inteiro N. Apresentar na tela a soma dos N primeiros n�meros,
//por exemplo: se N = 5, ent�o SOMA = 1 + 2 + 3 + 4 + 5


public class exemplo11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n, soma = 0;
		
		System.out.println("Digite o valor n:");
		n = leitor.nextInt();
		
		for (int i = 1; i <= n; i++) {
			soma = soma +i;			
		}
		
		System.out.printf("soma: %s", soma);

	}

}
