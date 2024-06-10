package Pdf3.OOPs.src;


public class Student3 {
    int dia;  
    String texto, frase;  
    }  

class TestStudent2{  
    public static void main(String args[]){  

        Student3 s1=new Student3();  
        s1.texto=" Dia";  
        s1.dia=30;  
        s1.frase= "de maio é feriado!";

        System.out.println(s1.texto+" "+s1.dia+" "+s1.frase);
    }  
} 
       
