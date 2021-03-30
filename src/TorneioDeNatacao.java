import java.util.Scanner;

public class TorneioDeNatacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = teclado.next();
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();

		if (idade <= 10) {
			System.out.println("Nome: " + nome);
			System.out.println("Categoria Infantil");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println("Nome: " + nome);
			System.out.println("Categoria Juvenil");
		} else if (idade >= 16 && idade <= 19) {
			System.out.println("Nome: " + nome);
			System.out.println("Categoria Pre-Adulto");
		} else if (idade > 20) {
			System.out.println("Nome: " + nome);
			System.out.println("Categoria Adulto");
		}
	}
}
