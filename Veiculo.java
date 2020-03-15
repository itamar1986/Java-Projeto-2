package unijorge;
import java.util.Scanner;

public class Veiculo {
	// Atributos
	int capacidadeTanque, numeroPassageiros;
	float preco;

	// retorno do atributo capacidadeTanque
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	// parametro capacidadeTanque para setar no atributo capacidadeTanque
	public void setCapacidadeTanque(int capacidadeTanque) {
		if(capacidadeTanque >= 0) {
			this.capacidadeTanque = capacidadeTanque;
		}	
	}
	
	// retorno do atributo numeroPassageiros
	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	// parametro numeroPassageiros para setar no atributo numeroPassageiros
	public void setNumeroPassageiros(int numeroPassageiros) {
		if(numeroPassageiros >= 0) {
			this.numeroPassageiros = numeroPassageiros;
		}
	}
		
	// retorno do atributo preco
	public float getPreco() {
		return preco;
	}

	// parametro preco para setar no atributo preco
	public void setPreco(float preco) {
		if(preco >= 0) {
			this.preco = preco;
		}
	}

	public Veiculo() { }
	
	public Veiculo(int capTanque, int numPassageiros) {
		setCapacidadeTanque(capTanque);
		setNumeroPassageiros(numPassageiros);
	}
	
	public Veiculo(int numPassageiros, float preco) {
		setNumeroPassageiros(numPassageiros);
		setPreco(preco);
	}
	
	public Veiculo(float preco, int capTanque)  {
		setPreco(preco);
		setCapacidadeTanque(capTanque);
	}
	
	public Veiculo(int capTanque, int numPassageiros, float preco) {
		setCapacidadeTanque(capTanque);
		setNumeroPassageiros(numPassageiros);
		setPreco(preco);
	}

	public void cadastrar(int capTanque, int numPassageiros, float preco) {
		setCapacidadeTanque(capTanque);
		setNumeroPassageiros(numPassageiros);
		setPreco(preco);
	}
	
	public void imprimir() {
		System.out.println("Capacidade do tanque :" + getCapacidadeTanque());
		System.out.println("Número de passageiros :" + getNumeroPassageiros());
		System.out.println("Preço :" + getPreco());
	}
	
	public void entrada() {
		/* Como o Scanner não é um atributo da classe, ele deve ser declarado 
		dentro do método em que será utilizado, como um objeto auxiliar */
		Scanner ent = new Scanner(System.in);
		System.out.println("Capacidade do tanque :");
		setCapacidadeTanque(Integer.parseInt(ent.nextLine()));
		System.out.println("Número de passageiros :");
		setNumeroPassageiros(Integer.parseInt(ent.nextLine()));
		System.out.println("Preço :");
		setPreco(Float.parseFloat(ent.nextLine()));
	}
}