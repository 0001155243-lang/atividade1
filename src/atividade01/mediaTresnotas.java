package atividade01;
import java.util.Scanner;
public class mediaTresnotas {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double n3 = sc.nextDouble();

            double media = (n1 + n2 + n3) / 3;

            System.out.println("Média = " + media);
            System.out.println(media >= 7 ? "Aprovado" : "Reprovado");

            sc.close();
        }
    }
}
