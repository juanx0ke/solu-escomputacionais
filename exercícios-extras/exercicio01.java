import java.util.Scanner;

public class exercicio01 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numero de 1 a 7. Cada número representa um dia da semana e ela represeta você");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");

        int escolha = scanner.nextInt();
    
    // Utilizando o switch para realizar a operação correspondente
        
        switch (escolha) {
            case 1:
            System.out.println("O número 1 representa o Domingo na sua semana. Você costuma ser uma pessoa caseira e tranquila. ");
            break;

            case 2:
            System.out.println("O número 2 representa a Segunda na sua semana. Você costuma ser uma pessoa apressada, mas muito trabalhadora.");
            break;

            case 3:
            System.out.println("O número 3 representa a Terça na sua semana. Você costuma ser uma pessoa tranquila.");
            break;

            case 4:
            System.out.println("O número 4 representa a Quarta na sua semana. Seu eu apelido no trabalho deve ser Quarta-feira, pois deve ficar sempre no meio de tudo");
            break;

            case 5:
            System.out.println("O número 5 representa a Quinta na sua semana.");
            break;

            case 6:
            System.out.println("O número 6 representa a Sexta na sua semana. Seu apelido no trabalho é Tartaruga Nija. Tartaruga para chegar e ninja para sair kkkkkkk");
            break;

            case 7:
            System.out.println("O número 7 representa Sábado na sua semana. Você deve gostar de praia, sair com os amigos e aproveitar mais do que a maioria");
            break;

            default:
            System.out.println("Opção invalida!");
                break;
        }
        scanner.close();
    }
}