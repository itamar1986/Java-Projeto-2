package unijorge;
import java.util.Scanner;

public class AppHeranca {

	public static void main(String[] args) {
		// inicializa��o de objetos
		
		
		Scanner ent = new Scanner(System.in);
		int qtdElementos = 2;
		int elemento;
		boolean continuar = true;
		
		// Declara��o do vetor
		Aviao vetAviao[] = new Aviao[qtdElementos];
		Navio vetNavio[] = new Navio[qtdElementos];
		
		// Cria��o dos objetos e preenchimento do vetor
		System.out.println("Por favor, preencha as informa��es dos objetos do tipo Avi�o");
		for (int i = 0; i < vetAviao.length; i++) {
			vetAviao[i] = new Aviao();
			vetAviao[i].entrada();
		}
		
		System.out.println("Por favor, preencha as informa��es dos objetos do tipo Navio");
		for (int i = 0; i < vetNavio.length; i++) {
			vetNavio[i] = new Navio();
			vetNavio[i].entrada();
		}
		
		// Repeti��o at� apresentar um elemento v�lido do tipo Avi�o
		do {
			// Determina��o do elemento a ser exibido, com prote��o
			try {
				System.out.println("Qual � o �ndice do elemento do vetor de avi�o que voc� quer exibir?");
				elemento = Integer.parseInt(ent.nextLine());
				// Exibe o elemento
				vetAviao[elemento].imprimir();
				continuar = false;
			} catch (ArrayIndexOutOfBoundsException ex1) {
				System.out.println("Voc� escolheu um elemento inexistente do vetor.");
				System.out.println("Tente novamente!");
			} catch (NullPointerException ex2) {
				System.out.println("Voc� escolheu um elemento n�o instanciado do vetor.");
				System.out.println("Tente novamente!");
			} catch (Exception ex3) {
				System.out.println("Alguma outra exce��o ocorreu!");
			}
		} while (continuar);
		
		continuar = true;
		
		// Repeti��o at� apresentar um elemento v�lido Navio
		do {
			// Determina��o do elemento a ser exibido, com prote��o
			try {
				System.out.println("Qual � o �ndice do elemento do vetor de navio que voc� quer exibir?");
				elemento = Integer.parseInt(ent.nextLine());
				// Exibe o elemento
				vetNavio[elemento].imprimir();
				continuar = false;
			} catch (ArrayIndexOutOfBoundsException ex1) {
				System.out.println("Voc� escolheu um elemento inexistente do vetor.");
				System.out.println("Tente novamente!");
			} catch (NullPointerException ex2) {
				System.out.println("Voc� escolheu um elemento n�o instanciado do vetor.");
				System.out.println("Tente novamente!");
			} catch (Exception ex3) {
				System.out.println("Alguma outra exce��o ocorreu!");
			}
		} while (continuar);
		
		System.out.println("\nFim de execu��o!");
	}
}
