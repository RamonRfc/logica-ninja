package br.com.ramontreino.Lacosderepeticao;

import java.util.Scanner;

public class Impar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite valor desejado: ");

		int valorFinal = teclado.nextInt();
		int imp = 0;

		while (imp <= valorFinal) {
			if (imp % 2 != 0) {
				System.out.println("imp: " + imp);
			}
			imp++;
		}

	}

}
