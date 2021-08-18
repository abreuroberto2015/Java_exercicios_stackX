import java.util.Scanner;

//Criar um programa que leia o salário de um funcionário.
//Apresente na tela o salário do funcionário com reajuste de 15%.


public class exemplo01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double salario;
		
		System.out.print("Digite o salário do funcionário: ");
		salario = leitor.nextDouble();
		
		double reajuste = salario * 0.15;
		
		System.out.printf("Salário Atual: R$ %.2f\n", salario); 
		System.out.printf("Salário + 15%%: R$ %.2f", (salario +reajuste));;

	}

}
