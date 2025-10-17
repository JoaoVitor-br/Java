package PrimeiroProjeto;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual e a sua idade:");
		int idade = scanner.nextInt();
		clasificacao(idade);
	}
	public static void mensage() {
		System.out.println("Função sem retorno.");
		
	}
	public static void linha() {
		System.out.println("-----------------------");
	}
	public static void contagem() {
		for(int e =1;e <= 5; e++ ) {
			System.out.println(e);
		}
	}
	public static void saudacao(String nome) {
		System.out.println("Olá "+nome);
	}
	public static void clasificacao(int idade) {
		if(idade >=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
	}
	public static void compra(int quant,double valor) {
		double total = quant * valor;
		System.out.println("Pague: R$"+ total);
	}
}
