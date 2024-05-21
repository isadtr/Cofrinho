package empresa;

import java.util.ArrayList;


public class Cofrinho {
	private ArrayList<Moeda> listaMoedas;  // Lista para armazenar objetos do tipo Moeda

	public Cofrinho() {     // Construtor da classe Cofrinho
		this.listaMoedas = new ArrayList<>();  // Inicializa a lista de moedas
	}
	
	public void adicionar(Moeda m) {  // Método para adicionar uma moeda ao cofrinho
		listaMoedas.add(m);  // Adiciona a moeda à lista
	}
	
	public boolean remover(Moeda m) {  // Método para remover uma moeda do cofrinho, retorna true se a moeda foi removida, false se não foi encontrada
		return this.listaMoedas.remove(m);// Remove a moeda da lista
	}
	
	public void listagemMoedas() {  // Método para listar todas as moedas no cofrinho
		
		if(this.listaMoedas.isEmpty()) {  // Verifica se a lista está vazia
			System.out.println("O cofrinho possui 0 moedas.");
			return;  // Sai do método se a lista estiver vazia
		}

		for(Moeda m : this.listaMoedas) {   // Itera sobre cada moeda na lista e chama o método info()
			m.info();
		}
	}

	public double totalConvertido() {  // Método para calcular o valor total das moedas convertidas para Reais
		if (this.listaMoedas.isEmpty()) {  // Verifica se a lista está vazia
			return 0;   // Retorna 0 se não houver moedas
		} 

		double valorAcumulado = 0;  // Variável para acumular o valor total convertido

		for (Moeda moeda : this.listaMoedas) {  // Itera sobre cada moeda na lista e acumula seu valor convertido
			valorAcumulado = valorAcumulado + moeda.converter();
		}

		return valorAcumulado; // Retorna o valor total convertido		
	}
}
