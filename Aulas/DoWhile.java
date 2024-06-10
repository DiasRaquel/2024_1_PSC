import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args)
    {
        Scanner ler = new Scanner(System.in);
        int soma = 0, valor;

        do{
            System.out.println("---------MENU----------");
            System.out.println("\nDigite qualquer valor para somar: ");
            System.out.print("\nDigite 0 para sair: ");
            valor = ler.nextInt();
            //soma = soma + valor
            soma+=valor;
            System.out.println("A soma está em: "+ soma);

        }while(valor!=0);
        
    }
}
