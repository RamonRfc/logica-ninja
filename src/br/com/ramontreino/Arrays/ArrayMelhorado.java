package br.com.ramontreino.Arrays;

import java.util.Scanner;

public class ArrayMelhorado {

	public static void main(String[] args) {
		int[] arrays1 = new int[3];
		int[] arrays2 = new int[3];
		int[] arrays3 = new int[3];

		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < arrays1.length; i++) {
			System.out.println("Vetor 1: posição  " + i + ";");
			arrays1[i] = scn.nextInt();
			System.out.println("Vetor 2: posição  " + i + ";");
			arrays2[i] = scn.nextInt();
			arrays3[i] = arrays1[i] * arrays2[i];
		} 
	}
}
