package atividade01;
import java.util.Scanner;
import java.util.Random;
public class adivinhacao {



    public class Main {
        public static void main(String[] args) {
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            int numeroSecreto = rand.nextInt(10) + 1;

            System.out.print("Adivinhe o número (1 a 10): ");
            int palpite = sc.nextInt();

            if (palpite == numeroSecreto)
                System.out.println("Acertou!");
            else
                System.out.println("Errou! O número era " + numeroSecreto);

            sc.close();
        }
    }
}
