package atividade01;
import java.util.Scanner;
public class maiordeDoisnumeros {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            if (a > b) System.out.println("Maior: " + a);
            else System.out.println("Maior: " + b);

            sc.close();
        }
    }
}
