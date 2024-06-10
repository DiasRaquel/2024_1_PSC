package model;

import java.lang.annotation.Retention;

public class Cliente 
{
    public int id;
    public String nome, endereco;
    public Cidade cidade;

    public Cliente()
    {
        this.nome = "Sem Nome";
        System.out.println("Nome do Cliente: " + this.nome);
    }

    public Cliente(String nome)
    {
        this.nome = nome;
    }

    public Cliente(int id, String nome, String end, Cidade cidade)
    {
        this.id = id;
        this.nome = nome;
        this.endereco = end;
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        String texto = "Nome do cliente: " + this.nome + "\nCidade: " + this.cidade.nome;
        return texto;
    }
}
