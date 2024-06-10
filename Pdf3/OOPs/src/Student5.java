package Pdf3.OOPs.src;

public class Student5{  
    int rollno;  
    String name;  
    void insertRecord(int r, String n){  
        rollno=r;  
        name=n;  
    }  
    void displayInformation(){
        System.out.println(rollno+" "+name); 
    }
}  
class TestStudent4{  
    public static void main(String args[]){  
        Student5 s1=new Student5();  
        Student5 s2=new Student5();  
        Student5 s3=new Student5();

        s1.insertRecord(111,"Karan");  
        s2.insertRecord(222,"Aryan");  
        s3.insertRecord(333, "Raquel");

        s1.displayInformation();  
        s2.displayInformation();  
        s3.displayInformation();
    }  
}  
