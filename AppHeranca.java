package unijorge;
import java.util.Scanner;

public class AppHeranca {

	public static void main(String[] args) {
		// inicialização de objetos
		
		
		Scanner ent = new Scanner(System.in);
		int qtdElementos = 2;
		int elemento;
		boolean continuar = true;
		
		// Declaração do vetor
		Aviao vetAviao[] = new Aviao[qtdElementos];
		Navio vetNavio[] = new Navio[qtdElementos];
		
		// Criação dos objetos e preenchimento do vetor
		System.out.println("Por favor, preencha as informações dos objetos do tipo Avião");
		for (int i = 0; i < vetAviao.length; i++) {
			vetAviao[i] = new Aviao();
			vetAviao[i].entrada();
		}
		
		System.out.println("Por favor, preencha as informações dos objetos do tipo Navio");
		for (int i = 0; i < vetNavio.length; i++) {
			vetNavio[i] = new Navio();
			vetNavio[i].entrada();
		}
		
		// Repetição até apresentar um elemento válido do tipo Avião
		do {
			// Determinação do elemento a ser exibido, com proteção
			try {
				System.out.println("Qual é o índice do elemento do vetor de avião que você quer exibir?");
				elemento = Integer.parseInt(ent.nextLine());
				// Exibe o elemento
				vetAviao[elemento].imprimir();
				continuar = false;
			} catch (ArrayIndexOutOfBoundsException ex1) {
				System.out.println("Você escolheu um elemento inexistente do vetor.");
				System.out.println("Tente novamente!");
			} catch (NullPointerException ex2) {
				System.out.println("Você escolheu um elemento não instanciado do vetor.");
				System.out.println("Tente novamente!");
			} catch (Exception ex3) {
				System.out.println("Alguma outra exceção ocorreu!");
			}
		} while (continuar);
		
		continuar = true;
		
		// Repetição até apresentar um elemento válido Navio
		do {
			// Determinação do elemento a ser exibido, com proteção
			try {
				System.out.println("Qual é o índice do elemento do vetor de navio que você quer exibir?");
				elemento = Integer.parseInt(ent.nextLine());
				// Exibe o elemento
				vetNavio[elemento].imprimir();
				continuar = false;
			} catch (ArrayIndexOutOfBoundsException ex1) {
				System.out.println("Você escolheu um elemento inexistente do vetor.");
				System.out.println("Tente novamente!");
			} catch (NullPointerException ex2) {
				System.out.println("Você escolheu um elemento não instanciado do vetor.");
				System.out.println("Tente novamente!");
			} catch (Exception ex3) {
				System.out.println("Alguma outra exceção ocorreu!");
			}
		} while (continuar);
		
		System.out.println("\nFim de execução!");
	}
}
