package bootcampGFT.exercises;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido
pelo usuário. Ex.: 5!= 120 (5x4x3x2x1)
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int num, i;
        int multiplicacao = 1;
        System.out.println("Digite um número inteiro para ver o seu fatorial: ");
        num = scan.nextInt();
        for (i = num; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
            System.out.println(num + "!= "+ multiplicacao);
    }
}
