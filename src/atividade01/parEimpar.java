package atividade01;
import java.util.Scanner;
public class parEimpar {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int n = sc.nextInt();

            if (n % 2 == 0) System.out.println("Par");
            else System.out.println("Ímpar");

            sc.close();
        }
    }
}
