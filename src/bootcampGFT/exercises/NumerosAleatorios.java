package bootcampGFT.exercises;
/* Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100)
e armazene-os em um vetor. Ao final mostre os números e seus sucessores.
 */
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
