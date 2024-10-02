import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de carros : ");
        int quantidadeDeCarros = sc.nextInt();
        int nota = 10;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite a nota do primeiro carro: ");
            double nota1 = sc.nextDouble();
            if (nota1 < 6) {
                System.out.println("A nota é ruim");
            }
            else if (nota1 > 6) {
                System.out.println("A nota é boa");
            }
            System.out.println("Digite a nota do segundo carro: ");
            double nota2 = sc.nextDouble();
            if (nota2 < 6) {
                System.out.println("A nota é ruim");
            }
            else if (nota2 > 6) {
                System.out.println("A nota é boa");
            }
            System.out.println("Digite a nota do terceiro carro: ");
            double nota3 = sc.nextDouble();
            if (nota3 < 6) {
                System.out.println("A nota é ruim");
            }
            else if (nota3 > 6) {
                System.out.println("A nota é boa");
            }
            System.out.println("Digite a nota do quarto carro: ");
            double nota4 = sc.nextDouble();
            if (nota4 < 6) {
                System.out.println("A nota é ruim");
            }
            else if (nota4 > 6) {
                System.out.println("A nota é boa");
            }
            while (i <= nota) {
                System.out.println("Digite um numero válido ");
                nota = (int) sc.nextDouble();
            }


        }
    }
}