package atividade01;
import java.util.Scanner;
public class caixaEletronico {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Valor a sacar: ");
            int valor = sc.nextInt();

            int[] notas = {100, 50, 20, 10, 5};

            for (int nota : notas) {
                int qtd = valor / nota;
                valor %= nota;
                if (qtd > 0)
                    System.out.println(qtd + " nota(s) de R$" + nota);
            }

            sc.close();
        }
    }
}
