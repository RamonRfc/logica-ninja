package br.com.ramontreino.Lacosderepeticao;

import java.util.Scanner;

public class MiniBanco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 3) {
			System.out.println("1. Calcula Impostos");
			System.out.println("2. Depositar Salario");
			System.out.println("3. Sair");
			opcao = teclado.nextInt();

		}
	}

}
