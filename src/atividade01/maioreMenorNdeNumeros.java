package atividade01;
import java.util.Scanner;
public class maioreMenorNdeNumeros {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Quantos números deseja digitar? ");
            int n = sc.nextInt();

            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                System.out.print("Número " + i + ": ");
                int valor = sc.nextInt();
                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
            }

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            sc.close();
        }
    }

}
