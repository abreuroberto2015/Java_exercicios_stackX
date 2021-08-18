import java.util.Scanner;

//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia,
//e R$ 1,00 se forem compradas pelo menos 12. Crie um programa que 
//receba a quantidade de maçãs compradas, calcule e escreva o custo 
//total da compra


public class exemplo03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int qtde;
		double custoTotal;
		
		System.out.print("Digite a quantidade de maças: ");
		qtde = leitor.nextInt();
		
		if (qtde >= 12) {
			custoTotal = qtde * 1.00;
		} else {
			custoTotal = qtde * 1.30;
		}
		
		System.out.printf("Valor total da compra : R$ %.2f", custoTotal);

	}

}
