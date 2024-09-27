import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu Nome?");
        String strNome = s.nextLine();

        System.out.println("Digite sua Agência!?");
        String strAgencia = s.nextLine();

        System.out.println("Digite sua Conta!?");
        int intConta = s.nextInt();

        System.out.println("Informe seu Saldo Atual?");
        double dblSaldo = s.nextDouble();

        s.close();

        System.out.println("Olá [" + strNome + "], obrigado por criar uma conta em nosso banco, sua agência é [" + strAgencia + "], conta [" + intConta + "] e seu saldo [" + dblSaldo + "] já está disponível para saque.");
    }
}
