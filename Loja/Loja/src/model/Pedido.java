package model;

import java.lang.management.ThreadInfo;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //essa taxa não altera, é fixa
    public static double TAXA_DE_ENTREGA = 8.99;
    
    public int id;
    public String endereco;
    public List<Produto> produtos;
    public Cliente cliente;
    private double totalPedido;
    //sempre q wuiser dar acesso ou permitir modificação tem q criar um get e set

    //Metodo construtores
    public Pedido()
    {
        this.produtos = new ArrayList<Produto>();
        totalPedido = 0;
    }

    public Pedido (String endereco, Cliente cli)
    {
        this.endereco = endereco; 
        this.cliente = cli;
        this.produtos = new ArrayList<Produto>();
        this.totalPedido = 0;
    }
    //Metodos acessores - Getters (GET)
    public double getTotalPedido()
    {
        return this.totalPedido;
        //poderia fazer um if...
        //pode ser assim p apenas ler sem modificar
    }

    //Metodos modificador - Setters (SET)
    public void setTotalPedido(double valor){
        if(valor>= TAXA_DE_ENTREGA)
            this.totalPedido = valor;
        else
            System.out.println("Valor não permitido");
    }


    public void addProduto(Produto prod){
        if (this.produtos.size ()== 0){
            this.totalPedido += TAXA_DE_ENTREGA;
        }
        this.produtos.add(prod);
        this.totalPedido += prod.preco;

    }

    public void imprimirPedido(){
        System.out.println("---------------------------------");
        //atributo direto da classe pedido
        System.out.println("Pedido do endereço: "+this.endereco);
        //atributo de um atributo da classe pedido
        System.out.println("Nome do cliente: " +this.cliente.nome);
        //atributo de um atributo de um atributo da classe pedido
        System.out.println("Nome da cidade do cliente: " +this.cliente.cidade.nome);
        System.out.println("Total do pedido: " + this.totalPedido);
        if(this.produtos.size() == 0){
            System.out.println("Pedido vazio");
        }else{
            System.out.println("Produtos do pedido");
            for(Produto prod : this.produtos){
                System.out.println(prod.nome + "-" + prod.preco);
            }
        }
    }
}
