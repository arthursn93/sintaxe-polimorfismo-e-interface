
public class Valor implements PassandoValor {
	
	private double valor;

	@Override
	public double getValor(double valor) {
		return this.valor += valor;
		
	}
}
