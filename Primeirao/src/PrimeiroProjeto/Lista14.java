package PrimeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		1 - Contador:
		
		for(int i =0;i<=10;i++) {
			System.out.println(i);
		}
		
//		2 - Somando números de 1 a 100:
		int soma = 0;
		for(int e = 1;e<=100;e++) {
			
			soma = e+soma ;
			System.out.println(soma);
		}
		
//		3 - Imprimir números pares de 1 a 20:
		
		for(int e = 1;e<=20;e++) {
			if(e%2== 0) {
				System.out.println(e);
			}
		}	
//		4 - Imprimir a tabuada de um número:
		System.out.println("qual numero voce quer ver a tabuada: ");
			int num = scanner.nextInt();
			for(int i = 0;i<=10;i++) {
			System.out.println((num*i));
		}
//		5 - Contar números divisíveis por 3:
		int divisivel=0;
		for(int e = 1;e<=50;e++) {
			if(e%3==0) {
				divisivel ++;
			}
		}System.out.println(divisivel);
//		6 - Imprimir números ímpares de 1 a N:
		System.out.println("escreva munumero: ");
		int cin = scanner.nextInt();
		for(int e=0;e <=cin;e++) {
			if(e%2!=0) {
				System.out.println(e);
			}
		}
//		7 - Multiplicação de valores:
		int nume;
		int mult=1;
		for(int e=0;e<=5;e++) {
			System.out.println("escreva um numero: ");
			nume = scanner.nextInt();
			mult = mult*nume;
			
		}
		System.out.println(mult);
		
//		8 - Premiação da empresa:
		for(int e=0;e<=10;e++) {
			System.out.println("Voce tem quantos anos de impresa: ");
			int idade = scanner.nextInt();
			if(idade >10) {
				System.out.println("Parabéns! Você irá receber um prêmio");
			}else {
				System.out.println("Quase lá");
			}
		}
	}

}
