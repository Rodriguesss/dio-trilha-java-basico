import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int accountNumber;
        String bankAgency, clientName;
        double accountBalance;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        accountNumber = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        bankAgency = scanner.next();

        scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        clientName = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        accountBalance = scanner.nextDouble();

        System.out.printf("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                bankAgency + ", conta " + accountNumber + " e seu saldo %.2f já está disponível " +
                "para saque %n", accountBalance);
    }
}