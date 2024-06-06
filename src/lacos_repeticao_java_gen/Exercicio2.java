package lacos_repeticao_java_gen;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number, i;
		int odd = 0, even = 0;

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			number = scan.nextInt();
			
			if (number % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Quantidade de números pares: " + even);
		System.out.println("Quantidade de números ímpares: " + odd);
		
		scan.close();
	}
}