import java.util.Scanner;

public class Concurso {

    public static void main(String[] args) {


        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas irão votar? ");
        opcao = sc.nextInt();

        do {
            System.out.println("** Escolha em quem irá votar **");
            System.out.println("80 - Taffe");
            System.out.println("70 - Rodrigo");
            System.out.println("60 - Lucas ");
            System.out.println("50 - Alessandro ");
            opcao = sc.nextInt();
        }
        while (opcao == 80 || opcao == 70 || opcao == 60 || opcao == 50);

            System.out.println(" Digite um número válido ");
            opcao = sc.nextInt();
            if(opcao == 80){
            System.out.println("Taffe Venceu!");
        }
        if (opcao == 70) {
            System.out.println("Rodrigo venceu!");
        }
        else if (opcao == 60) {
            System.out.println("Lucas venceu!");
        }
        else if (opcao == 50) {
            System.out.println("Alessandro venceu!");
        }

    }
}