import java.util.Scanner;

public class Switch 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Digite um numero de 1 a 7: ");
        numero = ler.nextInt();

        switch(numero)
        {
            case 1:
            System.out.println("Domingo");
            break;
            
            case 2:
            System.out.println("Segunda-feira");
            break;
            
            case 3:
            System.out.println("Terça-feira");
            break;
            
            case 4:
            System.out.println("Quarta-feira");
            break;
            
            case 5:
            System.out.println("Quinta-feira");
            break;
            
            case 6:
            System.out.println("Sexta-feira");
            break;
        
            case 7:
            System.out.println("Sábado");
            break;
            
            default:
            System.out.println("Opção inválida");
        }
    }

}
