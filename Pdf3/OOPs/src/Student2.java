package Pdf3.OOPs.src;


import java.util.Scanner;

//main fora da classe
public class Student2{  
    int id;  
    String name;  
   }  

   class TestStudent1{  
    public static void main(String args[]){  
        Scanner scanner= new Scanner(System.in);

        Student2 s1=new Student2();

        System.out.print("Whats your name? ");
        s1.name = scanner.next();

        System.out.print("Hello, " + s1.name + ".");

        System.out.print("\n\nHow old are you? ");
        s1.id = scanner.nextInt();

        System.out.print("Você tem " + s1.id + " anos."); 
    }  
}  
   
