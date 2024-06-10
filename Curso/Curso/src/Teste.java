package src;
import Curso.Curso.src.Musica;

public class Teste {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.nome = "I love"; 
        musica1.artista = "Marilia";
        musica1.duracao = 10;

        Musica musica2 = new Musica();
        musica2.nome = "You yes";
        musica2.artista = "Wanessa";
        musica2.disponivel = true;

        musica1.status();
    }

}
