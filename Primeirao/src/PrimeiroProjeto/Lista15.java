package PrimeiroProjeto;

import java.util.Scanner;

public class Lista15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 - Criando um vetor
		
		String[] frutas = new String[5];
		for(int e =0;e<5;e++) {
			System.out.println("Digite o nome de uma fruta");
			frutas[e] = scanner.next();
		}
		for(int r=0;r<5;r++) {
			System.out.println(frutas[r]);
		}
		
//		2 - Vetor de números inteiros
		int[] posicao = new int[10];
		for(int e =0;e<10;e++) {
			System.out.println("escreva um numero: ");
			posicao[e] = scanner.nextInt();
		}
		for(int e =0;e<10;e++) {
			System.out.println(posicao[e]);
		}
//		3 - Mostrando os valores na ordem inversa
		int[] reverso = new int[7];
		for(int e = 0;e<7;e++) {
			System.out.println("escreva um numero: ");
			reverso[e] = scanner.nextInt();
		}
		for(int e =7;e>=0;e--) {
			System.out.println(reverso[e]);
		}
		
//		4 - Maiores que 100
		int[] cem = new int[10];
		for(int e=0;e<10;e++) {
			System.out.println("digite um numero: ");
			cem[e] = scanner.nextInt();
			if(cem[e]>=100) {
				System.out.println("Maior do que 100");
			}else {
				System.out.println("Menor que 100");
			}
		}for(int e=0;e<10;e++) {
			System.out.println(cem[e]);
		}
//		5 - Procurando um valor no vetor
		
		int[] vetor = new int[8];
		for(int e= 0;e<8;e++) {
			System.out.println("digite um numero: ");
			vetor[e] = scanner.nextInt();
		}
		System.out.println("Qual valor voce quer ver: ");
		int escolha = scanner.nextInt();
		if(escolha <=7) {
			System.out.println(vetor[escolha]);
		}else {
			System.out.println("fora de escopo");
		}
		
//		6 - Nome e idade de 5 pessoas
		String[] nome = new String[5];
		int[] idade = new int[5];
		for(int e = 0;e <5;e++) {
			System.out.println("Qual e o seu nome: ");
			nome[e] = scanner.next();
			System.out.println("Qual e a sua idade: ");
			idade[e] = scanner.nextInt();
		}
		for(int e = 0;e <5;e++) {
			System.out.println(nome[e]+" tem "+idade[e]+" anos");
		}
	}

}
