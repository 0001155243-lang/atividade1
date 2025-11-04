package atividade01;
import java.util.Scanner;
public class convensorTemperatura {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a temperatura: ");
            double temp = sc.nextDouble();
            System.out.print("Está em (C/F)? ");
            char tipo = sc.next().toUpperCase().charAt(0);

            if (tipo == 'C')
                System.out.println("Em Fahrenheit: " + ((temp * 9/5) + 32));
            else
                System.out.println("Em Celsius: " + ((temp - 32) * 5/9));

            sc.close();
        }
    }
}
