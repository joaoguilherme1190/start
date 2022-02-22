package bootcampGFT.exercises;
/* Crie um vetor de 6 números interiros
e mostre-os na ordem inversa.
 */
public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = new int[]{-5, 6, 15, 50, 8, 4};
        int cont = 0;
        System.out.println("Vetores:");
        while (cont < (vetor.length)){
            System.out.print(vetor[cont] + ", ");
            cont++;

        }
        System.out.println("\nOrdem Inversa:");
        for (int i = (vetor.length - 1); i>=0; i--) {
            System.out.print(vetor[i] + ", ");
        }
    }
}