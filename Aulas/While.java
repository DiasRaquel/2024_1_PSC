import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int opcao = 5;
        double v1 = 0, v2 = 0, resultado = 0.0;
        while (opcao != 0) {
            System.out.println("--------- MENU--------");
            System.out.println("1 - SOMAR");
            System.out.println("2 - SUBTRAIR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("0 - SAIR");
            System.out.print("Digite a sua opção: ");
            opcao = ler.nextInt();

            if(opcao >= 1 && opcao <=4)
            { 
                System.out.println("Digite o valor 1? ");
                v1 = ler.nextDouble();
                System.out.println("Digite o valor 2? ");
                v2 = ler.nextDouble();
            }

            switch (opcao) {
                case 1:
                resultado = v1 + v2;                    
                break;
                case 2:
                resultado = v1 - v2;                    
                break;
                case 3:
                resultado = v1 * v2;                    
                break;
                case 4:
                resultado = v1 / v2;                    
                break ;           
                default:
                System.out.println("Opção inválida!");
                    break;
            }
            if(opcao >= 1 && opcao <=4)
            { 
                System.out.println("O resultado é: " + resultado);
            }
        }
    }
}
