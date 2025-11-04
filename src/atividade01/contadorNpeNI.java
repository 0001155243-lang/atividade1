package atividade01;
import java.util.Scanner;
public class contadorNpeNI {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int pares = 0, impares = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int n = sc.nextInt();

                if (n % 2 == 0) pares++;
                else impares++;
            }

            System.out.println("Pares: " + pares + " | Ímpares: " + impares);
            sc.close();
        }
    }
}
