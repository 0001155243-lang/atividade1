package atividade01;
import java.util.Scanner;
public class fatorialNum {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Número: ");
            int n = sc.nextInt();

            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println("Fatorial = " + fatorial);
            sc.close();
        }
    }
}
