package br.com.ramontreino.Lacosderepeticao;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		final String login = "Ramon";
		final String senha = "xxx";
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite seu nome: ");
			String loginDigitado = teclado.next();
			System.out.println("Digite sua senha: ");
			String senhaDigitado = teclado.next();

			if ((login.equals(loginDigitado)) && (senha.equals(senhaDigitado))) {
				System.out.println("Senha correta, bom trabalho!");
				break;
			}
			System.out.println("ACESSO NEGADO!");
		}

	}

}
