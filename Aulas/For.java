import java.util.Scanner;

public class For {
    public static void main(String[] args) {
		System.out.println("OI\n");
        System.out.println("----------------------");
            for(int i = 1 ; i <= 10 ; i++)
            {
                System.out.println(i);
            }
                System.out.println("----------------------");
            
            for(int i = 1 ; i <= 10 ; i+=2)
            {
                System.out.println(i);
            }
            System.out.println();

            for(int i = 20 ; i >= 11 ; i--)
            {
                System.out.print(i + "-");
            }
            
        //Somar os numeros de 1 a 10
        int soma = 0;
        for(int i = 1 ; i <= 10 ; i++)
        {
            soma = soma + i;
            //soma+=1
        }
            System.out.println("\n\nA soma de 1 a 10 é: " + soma);

            //Somar os numeros pares de 1 a 100
            soma = 0;
            for(int i = 1; i <= 100; i+=2)
            {
                soma +=i;
            }       
            System.out.println("\nA soma dos numeros pares de 1 a 100 é " + soma); 
            
            //ou
            soma = 0;
            for(int i = 1; i <= 100; i++)
            {
                if(i %2 == 0)
                {
                    soma += i;
                }
            }
            System.out.println("\nA soma dos numeros pares de 1 a 100 é " + soma +"\n");   

            //Calcular o fatorial de 5, utilizando for
            int fatorial = 1;
            for(int i = 5; i >1; i--)
            {
                fatorial = fatorial * i;
            //fatorial *= i
            }
            System.out.println("O fatorial de 5 é: " + fatorial); 
            
            System.out.println("-----------------------------");  
            
            Scanner ler = new Scanner (System.in);
            
            System.out.print("Digite o valor que vc quer calcular o fatorial: ");
            int valor = ler.nextInt();
            
            fatorial = 1;
            for(int i = valor; i>1; i--)
            {
                fatorial*=i;
            }
            System.out.println("O fatorial de " + valor + " é: " + fatorial);
        }
}


