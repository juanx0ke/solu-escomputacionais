import java.util.Scanner;
public class salario{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       
        Float rend;
        double desconto;

        System.out.println("Digite o seu salário 1- $600 reais, 2- $1200, 3- $2000");

        rend = scanner.nextFloat();
      
        if (rend <= 600){
            System.out.println("Você está isento."); 
        }else if (rend > 600 &&  rend <=1200){
            desconto = rend * 0.2;
            System.out.printf("O desconto será de: R$ %.2f\n ",desconto);
        } else {
            desconto = rend * 0.25;
            System.out.printf("O seu desconto será de: R$ %.2f\n ",desconto);
        }
        scanner.close();

    }
    
}

