
import javax.swing.JOptionPane;

public class Exercicio4 {
    	// ler 10 valores inteiros e ao final da leitura
	// informar o maior número lido, o menor número lido, 
	// a soma e a média dos números lidos
	public static void main(String[] args) {
		int tam = 4;
		int[] numeros = new int[ tam ];
		double soma = 0, maior = 0, menor = 0; 
		double media = 0;
		int num = 0;
		
		//P saber os 10 valores
		for( int i = 0 ; i < tam ; i++ )
		{
			String valor = JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor: ");
			if( valor.isEmpty() )
			{
				num = 0;
			}
			else
			{
				num = Integer.valueOf( valor );
				soma += num;
			}
			numeros[i] = num;

			//saber qual é o maior número lido, o menor número lido
			if( i == 0 )
			{
				menor = num;
				maior = num;
			}else
			{
				if( num < menor )
				{
					menor = num;
				}
				if( num > maior )
				{
					maior = num;
				}
			}
		}
		String texto = "";
		for (int val : numeros) 
		{
			texto += val + " - ";
		}
		texto += "\n\nSoma: " + soma + "\nMaior: " + maior + "\nMenor: " + menor;
		
		//p saber a media
		media = (soma / tam);
		texto += "\nMédia: " + String.valueOf( media );
		JOptionPane.showMessageDialog(null, texto);
	}
}
