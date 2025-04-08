//aula sobre constructors

import java.util.Scanner;

class pessoa {
    String nome;
    int ra;

    // Construtor para inicializar os atributos

    public pessoa (String nome, int ra){
        this.nome = nome;
        this.ra = ra;
    }

    // Método para exibir os dados da pessoa

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Ra: " + ra);
        
    }
}

public class chamada {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);{

            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite seu Ra: ");
            int ra = scanner.nextInt();

            pessoa pessoa = new pessoa(nome, ra);

            pessoa.exibirDados();

            scanner.close();
        }
    }
}
