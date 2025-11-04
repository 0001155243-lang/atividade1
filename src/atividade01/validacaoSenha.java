package atividade01;
import java.util.Scanner;
public class validacaoSenha {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a senha: ");
            String senha = sc.next();

            if (senha.length() >= 6)
                System.out.println("Senha válida");
            else
                System.out.println("Senha inválida (mínimo 6 caracteres)");

            sc.close();
        }
    }
}
