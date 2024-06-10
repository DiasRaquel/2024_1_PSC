/* *****************************************************************************
	Laço de Repetição
	1. Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e
	cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos
	serão necessários para que Zé seja maior que Chico.
	*******************************************************************************/
    public class Exercicio2 {
        public static void main(String[] args) {
            double chico = 1.50 ;
            double ze = 1.10;
            int anos = 0;
    
            while( chico >= ze ){
                chico = chico + 0.02;
                ze += 0.03;
                anos++;
            }
            System.out.println(	"Serão necessários " + anos + 
                        " anos para Zé ser maior que Chico");
            System.out.println("Altura do Chico: " + String.format("%.2f", chico) );
            System.out.printf("Altura do Zé: %.2f \n" , ze );
    
        }
    }