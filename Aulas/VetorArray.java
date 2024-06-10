import javax.swing.JOptionPane;

public class VetorArray {
    public static void main(String[] args) {
        // Em C: int vet[5];

        //Em Java:
        int tam = 20;
        int[] vet = new int[tam];
       
        for( int i = 0; i < tam ; i++){
            vet[i] = ((i+1) * 10);
        }
        String texto = "";
        for( int i = 0; i < tam ; i++){
            System.out.print( vet[i] + " - " );
            texto += vet[i] + " - ";
        }
        
        texto += "\n\n";
        System.out.println("\n---------------------");
        String[] carros = {"Doblo" , "Renegade" , "Uno", "Hilux"};
        for( int i = 0 ; i < carros.length ; i++){
            System.out.print( carros[i] + " - " );
            texto += carros[i] +  "\n";
        }

        System.out.println("\n---------------------");
        for (String car : carros) {
            System.out.print( car + " tam: " + car.length() + " - ");
        }
        System.out.println("\n---------------------");
        for (int numero : vet) {
            System.out.print( numero + " - " );
        }        

        String[] boneca = {"barbie", "doll", "baby live", "crybabies"};
        for( int i = 0 ; i < boneca.length ; i++)
        {
            System.out.print( boneca[i] + " - " );
            texto += boneca[i] +  "\n";
        }
            
        for (String item : boneca) 
        {
            System.out.println( boneca + " - " );
        }
        JOptionPane.showMessageDialog(null, texto);

    }
}

