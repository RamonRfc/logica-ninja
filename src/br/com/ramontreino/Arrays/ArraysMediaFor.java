package br.com.ramontreino.Arrays;

import java.util.Scanner;

public class ArraysMediaFor {

	public static void main(String[] args) {
		double[] notas = new double[4];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: " + (i + 1));
			notas[i] = scanner.nextDouble();
			
		}
		System.out.println("-------------------------------");
		double media = 0;
		for (int ii = 0; ii < notas.length; ii++) {
			 media = media + notas[ii];
			System.out.println("Nota " + (ii + 1) + ": " + notas[ii]);

		}
		System.out.println(media / notas.length);

	}

}
