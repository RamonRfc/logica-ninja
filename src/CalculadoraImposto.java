
public class CalculadoraImposto {

	public static void main(String[] args) {

		float salario = 1000F;
		float valorPorcentagem = 50;

		float calculaPorcentagem = (salario * valorPorcentagem) / 100;

		System.out.println("Resultado: " + calculaPorcentagem);
	}

}
