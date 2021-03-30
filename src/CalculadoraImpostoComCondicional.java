
public class CalculadoraImpostoComCondicional {

	public static void main(String[] args) {
		float salario = 4700.00F;
		float valor = 0F;
		String porcentagem = "";

		if (salario > 4500) {
			valor = (salario * 30) / 100;
			System.out.println("Imposto é de : " + valor);
			porcentagem = "30%";
		} else {
			valor = (salario * 15) / 100;
			System.out.println("Imposto é de : " + valor);
			porcentagem = "15%";
		}
		System.out.println(" Na porcentagem de " + porcentagem + " o valor é  " + valor);
	}

}
