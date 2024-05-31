import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.printf("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.printf("Digite a agência: ");
        String agencia = sc.next();
        System.out.printf("Informe o saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, ", nomeCliente);
        System.out.printf("sua agência é %s, ", agencia);
        System.out.printf("conta %d e seu saldo %.2f já está disponível para saque.\n", numero, saldo);

        sc.close();
    }
}