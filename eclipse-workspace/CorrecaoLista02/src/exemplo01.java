import java.util.Scanner;

//Criar um programa que leia o sal�rio de um funcion�rio.
//Apresente na tela o sal�rio do funcion�rio com reajuste de 15%.


public class exemplo01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double salario;
		
		System.out.print("Digite o sal�rio do funcion�rio: ");
		salario = leitor.nextDouble();
		
		double reajuste = salario * 0.15;
		
		System.out.printf("Sal�rio Atual: R$ %.2f\n", salario); 
		System.out.printf("Sal�rio + 15%%: R$ %.2f", (salario +reajuste));;

	}

}
