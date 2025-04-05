import java.util.Scanner;

public class switchExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções para o usuário
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Olá");
        System.out.println("2 - Tchau");
        System.out.println("3 - Como vai?");
        System.out.print("Digite o número da opção: ");
        
        int opcao = scanner.nextInt();

        // Estrutura switch para executar ações diferentes
        switch(opcao) {
            case 1:
                System.out.println("Olá!");
                break;
            case 2:
                System.out.println("Tchau!");
                break;
            case 3:
                System.out.println("Estou bem, e você?");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
