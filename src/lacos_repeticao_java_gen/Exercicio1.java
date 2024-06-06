package lacos_repeticao_java_gen;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2, i;

		System.out.println("Digite o primeiro número do intervalo: ");
		number1 = scan.nextInt();

		System.out.println("Digite o segundo número do intervalo: ");
		number2 = scan.nextInt();

		scan.close();

		if (number1 >= number2) {
			System.out.println("Intervalo inválido! :(");
			return;
		}

		System.out.println("No intervalo entre " + number1 + " e " + number2 + ":");
		for (i = number1; i <= number2; i++){
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
