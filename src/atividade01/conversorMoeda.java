package atividade01;
import java.util.Scanner;
public class conversorMoeda {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Valor em reais: ");
            double reais = sc.nextDouble();
            System.out.print("Converter para (USD/EUR): ");
            String moeda = sc.next().toUpperCase();

            if (moeda.equals("USD"))
                System.out.println("Em dólares: $" + (reais / 5.5));
            else if (moeda.equals("EUR"))
                System.out.println("Em euros: €" + (reais / 6.0));
            else
                System.out.println("Moeda inválida.");

            sc.close();
        }
    }
}
