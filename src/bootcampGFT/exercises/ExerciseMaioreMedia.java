package bootcampGFT.exercises;
import java.util.Scanner;

public class ExerciseMaioreMedia {
    /* Faça um programa que leia 5 números
    e informe o maior número e a média desses números.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int numero;
            int i = 0;
            int soma = 0;
            int maior = 0;
            int media;
                do {
                    System.out.println("Número: ");
                    numero = scan.nextInt();
                    soma = soma + numero;
                    i++;
                        if (numero > maior) {
                            maior = numero;
                        }

                    } while (i < 5);
                        System.out.println("Maior: " + maior);
                        System.out.println("Média: " + (soma / 5));


    }
}
