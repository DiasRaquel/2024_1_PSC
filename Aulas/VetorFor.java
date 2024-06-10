import javax.swing.JOptionPane;

public class VetorFor {
    public static void main (String [] args){
        //int[] vet = new int[5]
        //vet[0] = 10;
        //vet[1] = 20;
        //vet[2] = 30;
        //vet[3] = 40;
        //vet[4] = 50;

        int [] vet = new int[10];
        for (int i = 0; i < 10; i++)
        {
            vet[i] = ((i + 1) * 10);
        }
            //na primeira volta i vale 0, +1 = 1 *10 = 10
            //na segunda volta i vale 1, +1 = 2 *10 = 20
            //na terceira volta i vale 2, +1 = 3 *10 = 30
            //na terceira volta i vale 3, +1 = 4 *10 = 40
            //na terceira volta i vale 4, +1 = 5 *10 = 50
        String texto = "";
        for (int i = 0; i < 10; i++)
        {
            System.out.print( vet[i] + "-");
            texto += vet[i] + "-";
        }
        JOptionPane.showMessageDialog(null, texto);
}
}