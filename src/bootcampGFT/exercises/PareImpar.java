package bootcampGFT.exercises;
/* Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares. O usuário deve
informar quantos números deseja informar.
*/

import java.util.Scanner;

public class PareImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int quantNumeros = 0;
        int i = 0;
        int quantPares = 0, quantImpares = 0;
        System.out.println("Quantos números quer digitar? ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            i++;
            if ((numero % 2) == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }
        } while (i < quantNumeros);
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }

}
