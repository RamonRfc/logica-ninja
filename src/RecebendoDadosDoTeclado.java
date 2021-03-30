import java.util.Scanner;

public class RecebendoDadosDoTeclado {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String nome = teclado.next();

			System.out.println("Digite seu nome: " + nome);
		}
	}

}
