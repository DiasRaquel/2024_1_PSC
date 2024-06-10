package model;

public class ClienteFisico extends Cliente{
    public String cpf;
    public double altura;
    public boolean casado;//aqui fica o verdadeiro, entao se é casado, se for falso não é casado

    public ClienteFisico()
    {
        //chamando sem parametro, traz o sem paramento do Cliente
        super();
    }

    public ClienteFisico(String nome)
    {
        //SUPER chama o construtor da classe mae
        //chamando com o parametro nome, traz o paramento do Cliente(String nome)
        super(nome);
    }

    public ClienteFisico(String nome, String cpf)
    {
        //chamando com o parametro nome, traz o paramento do Cliente(String nome)
        //esse ta chamando o q ta la no main
        super(nome);
        //esse chama aqui pq ta aqui
        this.cpf = cpf;
    }

    public ClienteFisico(int id, String nome, String end, Cidade cidade, String cpf, double altura, boolean casado)
    {
        super(id, nome, end, cidade);
        this.cpf = cpf;
        this.casado = casado;
        this.altura = altura;
        System.out.print(this);
    }   
    
    @Override
    public String toString() {
        String txtCasado = "Não";
        if(this.casado){
            txtCasado = "Sim";
        }
        return super.toString() + "\nAltura: " + this.altura + "\nCasado: " + txtCasado + "\nCpf: " +this.cpf;
    }
}
