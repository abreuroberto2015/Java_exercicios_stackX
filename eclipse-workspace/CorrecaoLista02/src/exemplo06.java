import java.util.Scanner;

//Fa�a um programa que receba um n�mero inteiro entre 1 e 7 e
//informe o dia da semana correspondente, por exemplo, se a 
//entrada for: 1, mostre Domingo; 2, exiba Segunda;... OBS.: 
//Utilizar o comando switch case


public class exemplo06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int diaSemana;
		
		System.out.println("Digite um valor entre 1 e 7: ");
		diaSemana = leitor.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break; 
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("S�bado"); break;
		default: System.out.println("Valor inv�lido");
		}

	}

}
