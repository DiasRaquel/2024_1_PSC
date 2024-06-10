import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double chico = 1.50, ze = 1.10;
        int anos = 0;
        while(chico >= ze){
            chico = chico + 0.02;
            ze+= 0.03;
            anos++;
        }
        System.out.println("Será necessário " + anos + " anos para Zé ser maior que Chico.");
    }
}
