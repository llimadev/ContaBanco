import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("""
                ********************************
                *****Bem-vindo ao Banco DIO*****
                ********************************
                \n""");

        System.out.print("Insira a agência: ");
        String numeroDaAgencia = userInput.nextLine();

        System.out.print("Insira o número da conta: ");
        int numeroDaConta = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Insira o nome do cliente: ");
        String nomeDoCliente = userInput.nextLine();

        System.out.print("Quanto você vai depositar? ");
        double saldoDaConta = userInput.nextDouble();
        userInput.nextLine();

        System.out.println("\nOlá "+nomeDoCliente+", obrigado por criar uma conta em nosso banco, sua agência é: "+numeroDaAgencia+", conta: "+numeroDaConta+" e seu saldo: " +
                saldoDaConta+"\njá se encontra disponível para saque.\n");
    }
}