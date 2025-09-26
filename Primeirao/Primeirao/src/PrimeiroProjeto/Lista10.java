package PrimeiroProjeto;

import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 - Contador:
		int contagem = 10;
		while (contagem <=30) {
			System.out.println(contagem);
			contagem ++;
		}

//		2 - Soma de Números Digitados:
		int contagem2 = 1;
		int somativa;
		int somativa2 = 0;
		while (contagem2 <=3) {
			System.out.println("digite um numero: ");
		somativa = scanner.nextInt();
			somativa2 = somativa + somativa2;
			System.out.println(somativa2);
			contagem2 ++;
		}
		
//		3 - Multiplicação de Números Digitados:

		int contagem3 = 1;
		int somativa3;
		int somativa4 = 1;
		while (contagem3 <=3) {
			System.out.println("digite um numero: ");
		somativa3 = scanner.nextInt();
			somativa4 = somativa3 * somativa4;
			System.out.println(somativa4);
			contagem3 ++;
		}
		
//		4 - Contar até o número informado:
		
		int sequencia;
		int conta = 0;
		System.out.println("escreva um numero positivo: ");
		sequencia = scanner.nextInt();
		while (conta <= sequencia) {
			System.out.println(conta);
			conta ++;
		}
		
//		5 - Somar os números de 1 a 5:
		
		int conta2 = 1;
		int soma =1;
		int soma2 = 0;
		while (conta2 <=5) {
			soma2 = soma + soma2;
			System.out.println(soma2);
			conta2 ++;
			soma ++;
		}
	
//		6 - Tabuada
		int conta3 = 1;
		int mult;
		int resultado;
		System.out.println("digite um numero: ");
		mult = scanner.nextInt();
		while (conta3 <=10) {
			resultado = mult * conta3;
			System.out.println(resultado);
			conta3 ++;
		}
		
	}

}
