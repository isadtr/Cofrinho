package empresa;

public abstract class Moeda {
	double valor;  // Atributo para armazenar o valor da moeda
	
	public abstract void info(); //método abstrato pra exibir informações
	
	public abstract double converter(); //método abstrato para fazer a conversão

}
