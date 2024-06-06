package lacos_repeticao_java_gen;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		int sum = 0;
		
		do {
			System.out.println("Digite um número inteiro (0 para encerrar): ");
			number = scan.nextInt();
			
			if (number > 0) {
				sum += number;
			}
		}while (number != 0);
		
		System.out.println("A soma dos números positivos é: " + sum);
		scan.close();
	}
}