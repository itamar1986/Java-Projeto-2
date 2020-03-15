package unijorge;
import java.util.Scanner;

public class Navio extends Veiculo {
	// Atributos
	String nome, dataLancamento;
	int numeroTripulantes;
	
	// retorno do atributo nome
	public String getNome() {
		return nome;
	}

	// parametro nome para setar no atributo nome
	public void setNome(String nome) {
		if(!nome.isEmpty()) {
			this.nome = nome;
		}
	}

	// retorno do atributo dataLancamento
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	// parametro dataLancamento para setar no atributo dataLancamento
	public void setDataLancamento(String dataLancamento) {
		if(!dataLancamento.isEmpty()) {
			this.dataLancamento = dataLancamento;
		}
	}

	// retorno do atributoe numeroTripulantes
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}
	
	// parametro numeroTripulantes para setar no atributo numeroTripulantes
	public void setNumeroTripulantes(int numeroTripulantes) {
		if(numeroTripulantes >= 0) {
			this.numeroTripulantes = numeroTripulantes;
		}
	}
	
	public Navio() { }
	
	public Navio(int capTanque, int numTripulantes, String nome) {
		setCapacidadeTanque(capTanque);
		setNumeroTripulantes(numTripulantes);
		setNome(nome);
	}
	
	public Navio(int numPassageiros, float preco, String dataLancamento) {
		setNumeroPassageiros(numPassageiros);
		setPreco(preco);
		setDataLancamento(dataLancamento);
	}
	
	public Navio(float preco, int capTanque, String nome, String dataLancamento )  {
		setPreco(preco);
		setCapacidadeTanque(capTanque);
		setNome(nome);
		setDataLancamento(dataLancamento);
	}
	
	public Navio(String nome, String dataLancamento) {
		setNome(nome);
		setDataLancamento(dataLancamento);
	}
	
	public void cadastrar(int capTanque, int numPassageiros, float preco,
			String nome, String dataLancamento, int numTripulantes) {
		// Reaproveitamento do m�todo cadastrar da superclasse.
		super.cadastrar(capTanque, numPassageiros, preco);
		setNome(nome);
		setDataLancamento(dataLancamento);
		setNumeroTripulantes(numTripulantes);
	}
	
	public void imprimir() {
		// Reaproveitamento do m�todo imprimir da superclasse.
		super.imprimir();
		System.out.println("Nome :" + getNome());
		System.out.println("Data do Lan�amento :" + getDataLancamento());
		System.out.println("N�mero de tripulantes :" + getNumeroTripulantes());
	}
	
	public void entrada() {
		/* Como o Scanner n�o � um atributo da classe, ele deve ser declarado
		dentro do m�todo em que ser� utilizado, como um objeto auxiliar*/
		Scanner ent = new Scanner(System.in);
		// Reaproveitamento do m�todo entrada da superclasse.
		super.entrada();
		System.out.println("Nome :");
		setNome(ent.nextLine());
		System.out.println("Data do Lan�amento :");
		setDataLancamento(ent.nextLine());
		System.out.println("N�mero de tripulante :");
		setNumeroTripulantes(Integer.parseInt(ent.nextLine()));
	}
	
	public double passageirosPorTripulantes() {
		return (getNumeroPassageiros() / getNumeroTripulantes());
	}
}
