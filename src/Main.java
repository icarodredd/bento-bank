import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Bento Bank.\n");
        while (true) {
            System.out.print("1. Ver saldo\n2.Depositar dinheiro\n3.Sacar dinheiro\n4.Sair\n\n");
            System.out.println("Selecione uma opção para começar: ");
            String input = scanner.next();

            if (input.equals("4")) {
                System.out.println("Saindo do programa...");
                break;
            }
        }
    }
}
