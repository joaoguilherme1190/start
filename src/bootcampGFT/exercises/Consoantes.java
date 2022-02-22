package bootcampGFT.exercises;
/*Faça um program a que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
import java.util.Scanner;
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String[] consoantes = new String[6];
        int qntDeConsoantes = 0;
        int cont = 0;
        do {
            System.out.println("Letra:");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u"))){
                consoantes[cont] = letra;
                qntDeConsoantes++;

            }
            cont++;

        } while (cont < consoantes.length);
        System.out.println("consoantes:");
        for (String consoante: consoantes){
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\n"+"Quantidade de consoantes: " + qntDeConsoantes);
    }
}
