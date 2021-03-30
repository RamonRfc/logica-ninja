package br.com.ramontreino.Lacosderepeticao;

import java.util.Scanner;

public class SequenciaDeFibonacci {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int quantidadeDeVezes = tec.nextInt();
		int anterior = 0;
		int atual = 1;
		int proximo = 1;
		for (int i = 1; i <= quantidadeDeVezes; i++) {
			System.out.print(" "+ proximo);
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
//			System.out.println();
//			System.out.println("PROXIMO: " + proximo);
//			System.out.println("PROXIMO: "+ proximo +" << "+ "ATUAL " + atual + " + ANTERIOR " + anterior);
//			System.out.println("ANTERIOR: "+ anterior + " << " + "ATUAL: " + atual);
//			System.out.println("ATUAL: "+ atual + " << " + "PROXIMO: " + proximo);
//			System.out.println("==============================================================");
		}

	}

}
