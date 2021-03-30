import java.util.Scanner;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite o sexo: M ou F");
			String sexo = teclado.next();
			System.out.println("Digite sua idade: ");
			int idade = teclado.nextInt();
			teclado.close();
			if (sexo.equals("M") && idade >= 18) {
				System.out.println("Alistamento obrigatorio!");
			} else if (sexo.equals("M") && idade < 18) {
				System.out.println("Alistamento não permitido pela lei brasileira!");
			} else if (sexo.equals("F") && idade >= 18) {
				System.out.println("Você deseja se alistar?");
				String result = teclado.next();
				System.out.println("Resposta: " + result);
			} else if (sexo.equals("F") && idade < 18) {
				System.out.println("Alistamento não permitido pela lei brasileira!");
			}
		}

	}

}
