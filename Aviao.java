package unijorge;
import java.util.Scanner;

public class Aviao extends Veiculo {
	// Atributos
		String prefixo, dataRevisao;

		// retorno do atributo prefixo
		public String getPrefixo() {
			return prefixo;
		}

		// parametro prefixo para setar no atributo prefixo
		public void setPrefixo(String prefixo) {
			if(!prefixo.isEmpty()) {
				this.prefixo = prefixo;
			}
		}

		// retorno do atributo dataRevisao
		public String getDataRevisao() {
			return dataRevisao;
		}

		// parametro dataRevisao para setar no atributo dataRevisao
		public void setDataRevisao(String dataRevisao) {
			if(!dataRevisao.isEmpty()) {
				this.dataRevisao = dataRevisao;
			}
		}
		
		public Aviao() { }
		
		public Aviao(int capTanque, int numPassageiros, String prefixo) {
			setCapacidadeTanque(capTanque);
			setNumeroPassageiros(numPassageiros);
			setPrefixo(prefixo);
		}
		
		public Aviao(int numPassageiros, float preco, String dataRevisao) {
			setNumeroPassageiros(numPassageiros);
			setPreco(preco);
			setDataRevisao(dataRevisao);
		}
		
		public Aviao(float preco, int capTanque, String prefixo, String dataRevisao )  {
			setPreco(preco);
			setCapacidadeTanque(capTanque);
			setPrefixo(prefixo);
			setDataRevisao(dataRevisao);
		}
		
		public Aviao(String prefixo, String dataRevisao) {
			setPrefixo(prefixo);
			setDataRevisao(dataRevisao);
		}
		
		public void cadastrar(int capTanque, int numPassageiros, float preco,
				String prefixo, String dataRevisao) {
			// Reaproveitamento do método cadastrar da superclasse.
			super.cadastrar(capTanque, numPassageiros, preco);
			setPrefixo(prefixo);
			setDataRevisao(dataRevisao);
		}
		
		public void imprimir() {
			// Reaproveitamento do método imprimir da superclasse.
			super.imprimir();
			System.out.println("Prefixo :" + getPrefixo());
			System.out.println("Data da revisão :" + getDataRevisao());
		}
		
		public void entrada() {
			/* Como o Scanner não é um atributo da classe, ele deve ser declarado
			dentro do método em que será utilizado, como um objeto auxiliar*/
			Scanner ent = new Scanner(System.in);
			// Reaproveitamento do método entrada da superclasse.
			super.entrada();
			System.out.println("Prefixo :");
			setPrefixo(ent.nextLine());
			System.out.println("Data da revisão :");
			setDataRevisao(ent.nextLine());
		}
		
		public void reajustarPreco(float percentual) {
			if(percentual > 0) {
				float valor = getPreco();
				valor = valor * percentual;
				setPreco(valor);
			}
			
		}
}
		
