import java.util.Scanner;

//Criar um algoritmo que receba a idade de um nadador e informe a sua
//categoria: infantil (at� 10 anos), juvenil (at� 17 anos) ou s�nior
//(acima de 17 anos).

public class exemplo04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do nadador: ");
		idade = leitor.nextInt();
		
		if (idade <= 10) {
			System.out.println("Nadador infantil:");			
		} else if (idade <= 17) {
			System.out.println("Nadador juvenil:");
	    } else {
		    System.out.println("Nadador s�nior:");		
	    }
	}
}
