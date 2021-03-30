import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero de UM a SETE: ");
		int dia = teclado.nextInt();
		
		if (dia == 1) {
			System.out.println("segunda");
		} else if (dia == 2 ) {
			System.out.println("terça");
		} else if (dia == 3 ) {
			System.out.println("quarta");
		} else if (dia == 4 ) {
			System.out.println("quinta");
		} else if (dia == 5 ) {
			System.out.println("sextou");
		} else if (dia == 6 ) {
			System.out.println("sabadeira");
		} else if (dia == 7 ) {
			System.out.println("domingão");
		}else {
			System.out.println("Dia nao valido!");
		}
		
	}

}
