package atividade01;
import java.util.Scanner;
public class somaNumPares {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite N: ");
            int n = sc.nextInt();

            int soma = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) soma += i;
            }

            System.out.println("Soma dos pares = " + soma);
            sc.close();
        }
    }
}
