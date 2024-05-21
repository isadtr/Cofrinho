package empresa;

public class Dolar extends Moeda {  // Declaração da classe Dolar que estende a classe abstrata Moeda
	
	public Dolar() {  // Chama o construtor da superclasse Moeda 
		
	}

	public Dolar(double valor) {  //Construtor que inicializa o valor do Dolar
		this.valor = valor;
	}
	
	@Override
	public void info() {  // Implementação do método abstrato info() da classe Moeda
		System.out.println("Dolar - " + valor);
	}
	
	@Override 
	public double converter() {  //Implementação do método abstrato converter() da classe Moeda
		return this.valor * 5.1;
	}
	@Override 
	public boolean equals(Object objeto) {  //Verifica se o objeto passado é da mesma classe
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		Dolar objetoDolar = (Dolar) objeto;
		
		if (this.valor != objetoDolar.valor) {  // Compara o valor do Dolar atual com o valor do objeto Dolar passado
			return false;
		}
		
		return true;  // Retorna true se os valores forem iguais
	}
}


