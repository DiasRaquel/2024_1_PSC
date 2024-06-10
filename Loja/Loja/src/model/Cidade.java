package model;

//objeto
public class Cidade 
{
	//propriedades do objeto
	public int id;
	public String nome;

	// Método construtor que não recebe parâmetro
	public Cidade()
    {
		this.id = 0;
		this.nome = "Sem nome";
	}

	// Método construtor que recebe um parâmetro
	public Cidade(String nome)
    {
		this.id = 1;
		this.nome = nome;
	}

	// Método construtor que recebe muitos parâmetro
	public Cidade(int id, String nome)
    {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString(){
		return "Id: " + this.id + "\nNome: " + this.nome;
	}
}
