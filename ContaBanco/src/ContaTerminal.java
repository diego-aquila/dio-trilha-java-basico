import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o nome do cliente");
        String nome = scanner.nextLine();
        System.out.println("Por favor, insira o número da conta");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, insira o número da agência");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, insira o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque.");

        
    }
}
