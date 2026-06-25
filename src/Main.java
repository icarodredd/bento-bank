import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void clearScreen() {
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Could not clear console: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        double balance = 0.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Bento Bank.\n");
        while (true) {
            System.out.print("1. Ver saldo\n2. Depositar dinheiro\n3. Sacar dinheiro\n4. Sair\n\n");
            System.out.println("Selecione uma opção: ");

            String input = scanner.next();

            if (input.equals("1")) {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("Saldo disponível: R$ %.2f\n\n", balance);
                TimeUnit.SECONDS.sleep(2);
                clearScreen();

            }

            if (input.equals("4")) {
                System.out.println("Saindo do programa...");
                break;
            }
        }
    }


}
