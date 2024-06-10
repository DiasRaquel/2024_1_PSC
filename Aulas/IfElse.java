import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.print("Qual é a sua idade? ");
	    num = scanner.nextInt();
	    
        if ( num > 60)
        {
            System.out.println("Você é maduro!");
        } 
            else if (num <30)
            {
                System.out.println("Você é um menino!");
            }
            else 
            {
                System.out.println("Você está na flor da idade!");
            }
	}


	}

