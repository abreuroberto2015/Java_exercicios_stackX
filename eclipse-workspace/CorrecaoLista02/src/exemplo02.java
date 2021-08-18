import java.util.Scanner;

//Criar um programa que leia pelo teclado duas notas n1 e n2 de um 
//aluno, calcule a média e exiba na tela se o aluno foi 
//APROVADO ou REPROVADO. OBS.: A média base para aprovação é 6


public class exemplo02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.printf("Digite a 1ª nota: ");
		n1 = leitor.nextDouble();

		System.out.printf("Digite a 2ª nota: ");
		n2 = leitor.nextDouble();
		
		media = (n1 + n2) / 2;  
		
		if (media >= 6) {
			System.out.printf("Média: %s\n Aluno Aprovado", media);
			
		} else {
			System.out.printf("Média: %s Aluno Reprovado", media);
		}
	}

}
