package Poo_java;

public class cachorro extends Animal_heranca{
	
		public cachorro(String nome,int idade,String especie) { 
			
			super(nome,idade,especie);
		} 
		public void imprimir() {
		System.out.println("\n"+getNome()+"\n"+getIdade()+"\n"+getespecie());
		}
		public void correr()
		{
			System.out.println("Cachorro ruivando...");
		}
		
		public void emitirSom()
		{
			System.out.println("AUUUUUUUUU!");
		}


	}

