package model;

public class ClienteJuridico extends Cliente {

    public String cnpj;
    public ClienteJuridico ()
    {
        super();
        System.out.println("Cliente Juridico");
    }
    public ClienteJuridico (String nome)
    {
        super(nome);
    }

    @Override
    public String toString() {
        return "--------------------------------" + "\nNome da empresa: " + this.nome + "\nCNPJ: " + this.cnpj +"\nCidade: " + this.cidade.nome + "\nEndereço: " +this.endereco;
    }
}
