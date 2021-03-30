package br.com.ramontreino.Lacosderepeticao;

import java.util.Scanner;

public class CalculadoraComFor {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Digite o numero da taboada que deseja: ");

		int valorTaboada = teclado.nextInt();
		System.out.println("--------------------------------------");
		
		for (int valor = 1; valor <= 10; valor++) {
			int resultado = valor * valorTaboada;
			System.out.println(valorTaboada + "x" + valor + "=" + resultado);

		}

	}

}
