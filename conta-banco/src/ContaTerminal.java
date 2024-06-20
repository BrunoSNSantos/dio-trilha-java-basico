import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo a nosso banco, para criar sua conta preciso que você digite o número da sua agência (somente dígitos):");
        int agencia = scanner.nextInt();

        System.out.println("Agora, diga-me o número da sua conta:");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine();

        System.out.println("Agora, me informe o seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Falta pouco! Agora, só preciso que você me informe o seu saldo em conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numeroConta + " e seu saldo de " + saldo + 
        " já está disponível para saque. Muito obrigado pela preferência :)");

        scanner.close();
    }
}
