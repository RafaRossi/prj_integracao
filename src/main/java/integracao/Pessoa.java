package integracao;

public class Pessoa {

	private String nome;
	private int idade = 0;
	
	public Pessoa(String nome, int idade)
	{
		this.idade = idade;	
	}
	
	public String GetNome()
	{
		return nome;
	}
	
	public int GetIdade()
	{
		return idade;
	}
}
