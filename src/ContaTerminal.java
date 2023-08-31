import java.util.Scanner;

public class ContaTerminal {

    public static void main (String [] args){
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;
        float saque;
        String realizar;


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
        scanner.nextLine();

        System.out.println("Ola " + nomeCliente + ", obrigada por criar uma conta em nosso banco. \nO numero de sua agência é " + agencia + ", conta número " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");

        System.out.println("Gostaria de realizar um saque? S/N");
        realizar = scanner.nextLine();

        if(realizar.equalsIgnoreCase("S")){
            System.out.print("::::::::::::::Sacar dinheiro::::::::::::::\nInsira o valor do saque: ");
            saque = scanner.nextFloat();

            if(saque < saldo){
                saldo = saldo - saque;
            }

            System.out.println("Novo saldo = " + saldo);
        } else {
            System.out.println("Obrigada por acessar nosso caixa online.");
        }

    }
}