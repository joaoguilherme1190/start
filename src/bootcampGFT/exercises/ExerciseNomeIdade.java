package bootcampGFT.exercises;

import java.util.Scanner;
import java.lang.String;

public class ExerciseNomeIdade {
    /*Faça um programa que leia conjuntos de dois valores, o
    primeiro representando o nome e o segunto representando a sua idade.
    (Pare o programa inserindo 0 no campo nome
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        while (true) {
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if (nome.equals("0")) {
                break;
            }
            ;
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();


        }
        System.out.println("Fim do programa.");
    }
}