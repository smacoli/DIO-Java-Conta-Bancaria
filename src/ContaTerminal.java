import java.util.Scanner;

public class ContaTerminal {

    public static void main (String [] args){
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número da sua conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insira seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Insira o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Insira seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco. O numero de sua agência é " + agencia + ", conta número " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}