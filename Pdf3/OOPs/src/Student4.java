package Pdf3.OOPs.src;

public class Student4 {
        int id;  
        String name;  
        }  
class TestStudent3{  
        public static void main(String args[]){  
                Student4 s1=new Student4();  
                Student4 s2=new Student4();  
                Student4 s3=new Student4();  
                Student4 s4=new Student4();  

                s1.id=1;  
                s1.name="Plano Unimed";  
                s2.id=2;  
                s2.name="Plano Amil";  
                s3.id=3;  
                s3.name="Plano Bradesco";  
                s4.id=4;  
                s4.name="Plano SulAmerica";  

                System.out.println("Planos de saúde aceitos: \n\n" + s1.id+" "+s1.name + 
                                                                        "\n" + s2.id+" "+s2.name + 
                                                                        "\n" + s3.id+" "+s3.name + 
                                                                        "\n" + s4.id+" "+s4.name );

        }  
}          
