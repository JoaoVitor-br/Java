package PrimeiroProjeto;

import java.util.Scanner;

public class Lista09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 - Contador:
		int contagem = 1;
		while (contagem <=10) {
			System.out.println(contagem);
			contagem ++;
		}
		
//		2 - Contagem regressiva:
		
		int contagem_regressiva = 10;
		while (contagem_regressiva >=1) {
			System.out.println(contagem_regressiva);
			contagem_regressiva --;
		}
		
//		3 - Sequência numérica:
		int sequencia = 0;
		while (sequencia <=100) {
			System.out.println(sequencia);
			sequencia = 5+ sequencia;
		}
		
//		4 - Mostrando mensagem:
		
		int repeticao = 1;
		while (sequencia <=5) {
			System.out.println("Eu gosto de Java");
			repeticao ++;
		}
		
//		5 - Soma de Números Digitados:

		int contagem2 = 1;
		int somativa;
		int somativa2 = 0;
		while (contagem2 <=5) {
			System.out.println("digite um numero: ");
		somativa = scanner.nextInt();
			somativa2 = somativa + somativa2;
			System.out.println(somativa2);
			contagem2 ++;
		}
		
//		6 - Validação de Senha:
		System.out.println("Digite sua senha: ");
		String senha = scanner.next();
		while (!senha.equalsIgnoreCase("1234")) {
			System.out.println("Digite sua senha: ");
			senha = scanner.next();
		}
		
//		7 - Contagem Regressiva:
		int contagem_regressivafinal;
		System.out.println("escreva um numero positivo: ");
		contagem_regressivafinal = scanner.nextInt();
		while (contagem_regressivafinal >=1) {
			System.out.println(contagem_regressivafinal);
			contagem_regressivafinal --;
		}
	}

}
