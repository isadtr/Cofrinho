package empresa;

public class Real extends Moeda {  // Declaração da classe Real que estende a classe abstrata Moeda
	
	public Real() {  // Chama o construtor da superclasse Moeda 
		
	}
	
	public Real(double valor) {  //Construtor que inicializa o valor do Real
		this.valor = valor;
	}
	
	@Override
	public void info() {  // Implementação do método abstrato info() da classe Moeda
		System.out.println("Real - " + valor);
	}
	
	@Override 
	public double converter() {  //Implementação do método abstrato converter() da classe Moeda
			return this.valor;
	}
	@Override 
	public boolean equals(Object objeto) {  //Verifica se o objeto passado é da mesma classe
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		Real objetoReal = (Real) objeto;
		
		if (this.valor != objetoReal.valor) {  // Compara o valor do Real atual com o valor do objeto Real passado
			return false;
		}
		
		return true;  // Retorna true se os valores forem iguais
	}
}
