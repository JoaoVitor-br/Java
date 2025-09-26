package PrimeiroProjeto;

import java.util.Scanner;

public class Lista07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 - Classificação de Filme
		System.out.println("Quantos anos voce tem: ");
		int idade = scanner.nextInt();
		if(idade >=(70) && idade <=16 ) {
			System.out.println("Classificação especial");
		}else {
			System.out.println("Classificação regular");
		}
		
//		2 - Promoção de Produto

		System.out.println("quantos produtos voce comprou: ");
		int produto = scanner.nextInt();
		System.out.println("Qual o valor deles: ");
		double preco = scanner.nextDouble();
		double saldo = preco * produto;
		if(saldo >= 200 && produto >= 5) {
			System.out.print("\n");
		}

	}

}
