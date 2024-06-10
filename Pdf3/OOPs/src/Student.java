package Pdf3.OOPs.src;


import java.util.Scanner;

//main dentro da classe
public class Student {
    
    int id;
    String name;  

    public static void main(String args[]){  
        Scanner scanner= new Scanner(System.in);

        Student s1=new Student();

        System.out.print("Whats your name? ");
        s1.name = scanner.next();

        System.out.print("Hello, " + s1.name + ".");

        System.out.print("\n\nHow old are you? ");
        s1.id = scanner.nextInt();

        System.out.print("Você tem " + s1.id + " anos.");  
    }  
}
