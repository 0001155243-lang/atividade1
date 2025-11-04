package atividade01;
import java.util.Scanner;
public class numPnumNnumZ {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");
            double n = sc.nextDouble();

            if (n > 0) System.out.println("Positivo");
            else if (n < 0) System.out.println("Negativo");
            else System.out.println("Zero");

            sc.close();
        }
    }
}
