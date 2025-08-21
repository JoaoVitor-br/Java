package PrimeiroProjeto;

import java.util.Scanner;

public class Lista5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 - Classificação de idade
		System.out.println("digite sua idade: ");
		int idade = scanner.nextInt();
		if(idade <12) {
			System.out.println("Criança");
		}
		else if(idade <17) {
			System.out.println("adolecente");
		}
		else if(idade <65) {
			System.out.println("Adolto");
		}
		else {
			System.out.println("idoso");
		}
		
//		2 - Avaliação de Temperatura
		System.out.println("qual e a temperatura atual: ");
		double temp = scanner.nextDouble();
		if(temp <10) {
			System.out.println("Muito frio");
		}
		else if(temp <20) {
			System.out.println("Frio");
		}
		else if(temp <40) {
			System.out.println("Agradavel");
		}
		else {
			System.out.println("Muito quente");
		}
	
//		3 - Sistema de Notas Escolares
		System.out.println("qual e a temperatura atual: ");
		double nota = scanner.nextDouble();
		if(nota >90) {
			System.out.println("A");
		}
		else if(nota >80) {
			System.out.println("B");
		}
		else if(nota <70) {
			System.out.println("C");
		}
		else if(nota <60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		

	}

}
