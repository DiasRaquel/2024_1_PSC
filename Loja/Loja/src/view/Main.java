package view;

import javax.swing.JOptionPane;

import model.Categoria;
import model.Cidade;
import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;
import model.Pedido;
import model.Produto;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Projeto Loja!");

        //class Cidade
        Cidade c1 = new Cidade();
        Cidade c2 = new Cidade("Porto Alegre");
        Cidade c3 = new Cidade(2,"Rio de Janeiro");
        Cidade c4 = new Cidade("São Paulo");
        
        System.out.println("Cidade c1: nome - " + c1.nome);
        System.out.println("Cidade c2: id - " + c2.id);
        System.out.println("Cidade c3: id - " + c3.id + " e nome - " +c3.nome);

        //class Cliente
        Cliente cli01 = new Cliente();
        cli01.nome = "João";
        cli01.cidade = c2;

        Cliente cli02 = new Cliente("Maria");
        cli01.cidade = c3;

        Cliente cli03 = new Cliente(1, "José", "Rua A, 100", c3);
        Cliente cli04 = new Cliente(1, "Carlos", "Rua B, 200", new Cidade("Tangamandápio"));

        System.out.println("Nome do cliente: " + cli04.nome + "\nCidade: " + cli04.cidade.nome);
        System.out.println("---------------------------------");
        System.out.println(c3);

        Cidade[] cidades = { c1, c2, c3 };
        for (Cidade cid : cidades) {
            System.out.println("---------------------------------");
            System.out.println(cid.nome);
            System.out.println(cid);
        }
        System.out.println("----23/04/2024-----------------------------");
        System.out.println("---------------------------------");

        System.out.println("---------PF1-----------");
        ClienteFisico pf1 = new ClienteFisico();
        pf1.nome = "Raquel";
        pf1.cidade = c2;
        System.out.println("Nome do Cliente PF1: " +pf1.nome);

        System.out.println("---------PF2-----------");
        ClienteFisico pf2 = new ClienteFisico("Luis", "111.222.333-44");
        System.out.println("Nome do Cliente PF2: " + pf2.nome + "\n" + "CPF PF2: " + pf2.cpf);
        
        System.out.println("---------PF3-----------");
        ClienteFisico pf3 = new ClienteFisico(3,"Vitor", "Rua A", c4, "333.444.555-11", 1.69, true);

        System.out.println("\n---------PJ1-----------");
        ClienteJuridico pj1 = new ClienteJuridico();
        pj1.nome = "Mercearia do Seu Manoel";
        pj1.cnpj = "00.111.222/0001-33";
        pj1.cidade = c2;
        pj1.endereco = "Rua Bonita, 22";
        //System.out.println(pj1);
        JOptionPane.showMessageDialog(null, pj1);

        Categoria cat01 = new Categoria(1, "Bebidas");
        Categoria cat02 = new Categoria(2, "Alimentos");

        //pode ser sem passar tds os parametros e depois criar um a um... ou
        Produto prod01 = new Produto("Coca-Cola");
        prod01.preco = 8.99;
        prod01.quantidade = 100;
        prod01.categoria = cat01;
        //passando td ja
        Produto prod02 = new Produto("Pepsi", 7.65, 50, cat01);
        Produto prod03 = new Produto("Arroz", 4.0, 80, cat02);

        Pedido ped01 = new Pedido("Rua A, 150", pf1);
        System.out.println("---------PED01---------------");
        ped01.imprimirPedido();

        ped01.addProduto(prod01);
        ped01.addProduto(prod02);
        ped01.imprimirPedido();
        
        ped01.addProduto(prod03);
        ped01.imprimirPedido();

        System.out.println("----------------modificadores e acessores -----------------");
        ped01.setTotalPedido(10);
        System.out.println("Total do pedido: R$" + String.format("%.2f", ped01.getTotalPedido()));

        System.out.println("\n-------------------\nTaxa de entrega: "+Pedido.TAXA_DE_ENTREGA);

    }
}

