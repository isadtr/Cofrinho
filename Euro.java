package empresa;

public class Euro extends Moeda {  // Declaração da classe Euro que estende a classe abstrata Moeda
	
	public Euro() {  // Chama o construtor da superclasse Moeda 
		
	}

	public Euro(double valor) {  //Construtor que inicializa o valor do Euro
		this.valor = valor;
	}
	
	@Override
	public void info() {   // Implementação do método abstrato info() da classe Moeda
		System.out.println("Euro - " + valor);
	}
	
	@Override 
	public double converter() {  //Implementação do método abstrato converter() da classe Moeda
		return this.valor * 5.5;
	}
	@Override 
	public boolean equals(Object objeto) {  //Verifica se o objeto passado é da mesma classe
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		Euro objetoEuro = (Euro) objeto;
		
		if (this.valor != objetoEuro.valor) {  // Compara o valor do Euro atual com o valor do objeto Euro passado
			return false;
		}
		
		return true;  // Retorna true se os valores forem iguais
	}
}

