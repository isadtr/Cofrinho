package empresa;

import java.util.Locale;  
import java.util.Scanner;

public class Menu {		
	
	        private Scanner sc; // Scanner para entrada de dados do usuário
	        private Cofrinho cofrinho; // Instância de Cofrinho para gerenciar as moedas
	        

	        public Menu() {
	            sc = new Scanner(System.in); // Inicializa o Scanner
	            sc.useLocale(Locale.US);  // Define o Locale para US (para ponto decimal)
	            cofrinho = new Cofrinho(); // Inicializa o Cofrinho
	        }
	     // Método para exibir o menu e lidar com as opções do usuário
	            public void exibirMenu() {
	            	while(true) {   // Loop infinito até o usuário escolher encerrar
			        	System.out.println("COFRINHO");
			        	System.out.println("1-Adicionar moedas");
						System.out.println("2-Remover moedas");
						System.out.println("3-Listar moedas");
						System.out.println("4-Calcular valor total em Reais");
						System.out.println("0-Encerrar");
		
			            String opcao = sc.next(); // Lê a opção do usuário
			        
			            switch (opcao) {  
			                case "0":  // Caso o usuário escolha encerrar
			                    System.out.println("Encerrando...");
			                    return;   // Encerra o loop e o programa

		                case "1":  // Caso o usuário escolha adicionar moeda
		                    System.out.println("Escolha a Moeda: ");
		                    System.out.println("1- Dolar");
		                    System.out.println("2- Euro");
		                    System.out.println("3- Real");
	
		                    int opcaoMoeda = sc.nextInt();  // Lê a opção da moeda
	
		                    System.out.println("Digite o valor(utilize ponto em caso de possuir casas decimais):");
		                    double valorMoeda = sc.nextDouble();


		                    Moeda moeda = null;  // Declara uma variável Moeda
		                    if (opcaoMoeda == 1) {  // Cria um Dolar se a opção for 1
		                        moeda = new Dolar(valorMoeda);
		                    } else if (opcaoMoeda == 2) {  // Cria um Euro se a opção for 2
		                        moeda = new Euro(valorMoeda);
		                     
		                    } else if (opcaoMoeda == 3) {  // Cria um Real se a opção for 3
		                        moeda = new Real(valorMoeda);
		                        
		                    } else {
		                        System.out.println("Opcao invalida!");
		                        return;  // Retorna ao início do loop se a opção for inválida
		                    }

		                    cofrinho.adicionar(moeda);  // Adiciona a moeda ao Cofrinho
		                    System.out.println("Moeda adicionada");
		                    break;
	                    
	                case "2":  // Caso o usuário escolha remover moeda
	                	 System.out.println("Escolha a Moeda: ");
		                    System.out.println("1- Dolar");
		                    System.out.println("2- Euro");
		                    System.out.println("3- Real");

		                    int opcaoMoedaRemover = sc.nextInt();  // Lê a opção da moeda a remover

		                    System.out.println("Digite o valor que deseja remover(utilize ponto em caso de possuir casas decimais):");
		                    double valorMoedaRemover = sc.nextDouble();

		                    Moeda moedaRemover = null;  // Declara uma variável Moeda

		                    if (opcaoMoedaRemover == 1) {
		                        moedaRemover = new Dolar(valorMoedaRemover);
	
		                    } else if (opcaoMoedaRemover == 2) {
		                        moedaRemover = new Euro(valorMoedaRemover);
		                     
		                    } else if (opcaoMoedaRemover == 3) {
		                        moedaRemover = new Real(valorMoedaRemover);
		                       
		                    } else {
		                        System.out.println("Opcao invalida!");
		                       return;
		                    }
		                    if (cofrinho.remover(moedaRemover)) {  // Remove a moeda do Cofrinho
		                    System.out.println("Moeda removida");
		                    } else {
		                    	System.out.println("O cofre não possui nenhuma moeda com esse valor.");
		                    }
		                    break;
		                    
	                case "3":  // Caso o usuário escolha listar as moedas
	                    cofrinho.listagemMoedas();  // Lista as moedas no Cofrinho
	                    System.out.println("Moedas: ");
	                    break;

	                case "4":  // Caso o usuário escolha calcular o valor total
	                    double totalConvertido = cofrinho.totalConvertido();  // Calcula o valor total em Reais
	                    System.out.println("Valor total em Reais: " + cofrinho.totalConvertido());
	                    break;

	                default:  // Caso o usuário escolha uma opção inválida
	                    System.out.println("Opcao invalida");
	                    exibirMenu();
	                    break;  // Sai do switch e volta ao início do loop
			            }}
	        }

	    }

