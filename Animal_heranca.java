package Poo_java;

public class Animal_heranca {
	
	String nome;
	int idade;
	String especie;
	
	public Animal_heranca(String nome,  int idade,String especie) {
		
	
	super();
	this.nome = nome;
	this.idade = idade;
	this.especie =especie;
}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getespecie() {
		return especie;
	}


	public void setespecie(int idade) {
		this.especie = especie;
	}


	public void emitirSom()
	{
		System.out.println("RSRSRSRSRS!");

	
	}
	
	
	
	

}
