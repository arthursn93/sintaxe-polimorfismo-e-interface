
public class TesteContaInterface {

	public static void main(String[] args) {
		
		Conta conta = new Conta(123,123123);
		conta.setSaldo(2000);
		
		System.out.println(conta.getValor(23));

	}
}
