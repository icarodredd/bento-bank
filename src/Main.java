import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static void clearScreen() {
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Could not clear console: " + e.getMessage());
        }
    }

    static void main(String[] args) throws InterruptedException {
        double balance = 0.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Bento Bank.\n");
        while (true) {
            clearScreen();
            System.out.print("1. Ver saldo\n2. Depositar dinheiro\n3. Sacar dinheiro\n4. Sair\n\n");
            System.out.println("Selecione uma opção: ");

            String input = scanner.next();

            if (input.equals("1")) {
                TimeUnit.SECONDS.sleep(2);
                clearScreen();
                System.out.printf("Saldo disponível: R$ %.2f\n\n", balance);
                TimeUnit.SECONDS.sleep(4);
                clearScreen();

            }

            if (input.equals("2")) {
                TimeUnit.SECONDS.sleep(2);
                clearScreen();
                System.out.println("Qual valor deseja depositar?");
                double amount = scanner.nextDouble();

                if (amount <= 0) {
                    System.out.println("Erro: Digite um valor positivo!");
                    TimeUnit.SECONDS.sleep(3);
                    clearScreen();
                    continue;
                }

                balance += amount;
                clearScreen();

                System.out.printf("Seu novo saldo é de R$ %.2f\n\n", balance);
                TimeUnit.SECONDS.sleep(4);

                clearScreen();
            }

            if (input.equals("3")) {
                TimeUnit.SECONDS.sleep(2);
                clearScreen();
                System.out.println("Qual valor deseja sacar?");
                double amount = scanner.nextDouble();

                if (amount > balance) {
                    System.out.println("Erro: Saldo insuficiente!");
                    TimeUnit.SECONDS.sleep(3);
                    clearScreen();
                    continue;
                }

                balance -= amount;
                clearScreen();

                System.out.printf("Seu novo saldo é de R$ %.2f\n\n", balance);
                TimeUnit.SECONDS.sleep(4);

                clearScreen();
            }

            if (input.equals("4")) {
                System.out.println("Saindo do programa...");
                break;
            }
        }

        scanner.close();
    }


}
