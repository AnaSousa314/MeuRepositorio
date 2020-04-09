
import java.util.*;

public class Teste01 {

     public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        int num;
        int num2;
        int soma;
        num = 1;
        int num3;
        num2=2;

        soma = num + num2;
        System.out.println(soma);
        String nome;
        Scanner tec = new Scanner(System.in);

        System.out.println("digite um Numero: ");
        num3 = tec.nextInt();
        System.out.println(num3);

        int opcao;
        opcao = 1;

        while (opcao !=0){

            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - Cadastrar Dados");
            System.out.println("0 - Sair");

            switch (opcao) {
                case 1:
                    System.out.println("Informe o seu nome: ");
                    nome = tec.nextLine();
                    System.out.println("Seu nome é: "+nome);


                    break;
            
                default:
                    break;
            }

        }


    }
    
}
