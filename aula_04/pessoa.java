import java.util.Scanner;

public class pessoa {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Coloque: Nome, Cor e Idade");

//Instanciando o atributo da classe pessoa

        //string nome
        String nome = myObj.nextLine();

        //String cor
        String cor = myObj.nextLine();

        //Numerical input
        int idade = myObj.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Cor:" + cor);
        System.out.println("Idade: " + idade);
       
       
    }
}
