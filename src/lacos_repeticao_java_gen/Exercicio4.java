package lacos_repeticao_java_gen;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age, gender, devType;
        int backend = 0, frontendWomen = 0, mobileMen = 0, fullstackNb = 0, total = 0, sumAge = 0;

        while (true) {
            System.out.println("Digite a sua idade: ");
            age = scan.nextInt();

            System.out.println("Digite a sua identidade de gênero:");
            System.out.println("1 - Mulher Cis");
            System.out.println("2 - Homem Cis");
            System.out.println("3 - Não Binárie");
            System.out.println("4 - Mulher Trans");
            System.out.println("5 - Homem Trans");
            System.out.println("6 - Outros");
            gender = scan.nextInt();

            System.out.println("Pessoa Desenvolvedora: ");
            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - FullStack");
            devType = scan.nextInt();

            total++;
            sumAge += age;

            if (devType == 1) {
                backend++;
            }

            if ((gender == 1 || gender == 4) && devType == 2) {
                frontendWomen++;
            }

            if ((gender == 2 || gender == 5) && devType == 3 && age > 40) {
                mobileMen++;
            }

            if (gender == 3 && devType == 4 && age < 30) {
                fullstackNb++;
            }

            System.out.println("Deseja continuar (S/N)?");
            char continueChar = scan.next().charAt(0);
            if (continueChar == 'N' || continueChar == 'n') {
                break;
            }
        }

        int ageAverage = sumAge / total;
        
        System.out.println("=========================================================================================");
        System.out.println("\nNúmero de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("\nNúmero de Mulheres Cis e Trans desenvolvedoras Frontend: " + frontendWomen);
        System.out.println("\nNúmero de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobileMen);
        System.out.println("\nNúmero de Não Binários desenvolvedores FullStack menores de 30 anos: " + fullstackNb);
        System.out.println("\nNúmero total de pessoas que responderam à pesquisa: " + total);
        System.out.println("\nMédia de idade das pessoas que responderam à pesquisa: " + ageAverage);
        System.out.println("=========================================================================================");

        scan.close();
    }
}
