package lacos_repeticao_java_gen;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		int lessThan21 = 0;
		int moreThan50 = 0;
		
		while (true) {
			System.out.println("Digite uma idade: ");
			age = scan.nextInt();
			
			if (age < 0) {
				break;
			}
			
			if (age < 21) {
				lessThan21++;
			}else if (age > 50) {
				moreThan50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + lessThan21);
		System.out.println("Total de pessoas maiores de 50 anos: " + moreThan50);
		
		scan.close();
	}
}
