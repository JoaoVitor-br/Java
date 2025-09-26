package PrimeiroProjeto;

import java.util.Scanner;

public class Lista05 {

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
		System.out.println("digite sua nota: ");
		double nota = scanner.nextDouble();
		if(nota >=90) {
			System.out.println("A");
		}
		else if(nota >=80 ) {
			System.out.println("B");
		}
		else if(nota >=70) {
			System.out.println("C");
		}
		else if(nota >=60) {
			System.out.println("D");
		}
		else if(nota <60) {
			System.out.println("F");
		}
		
//		4 - Verificação de senha
		System.out.println("digite a sua senha: ");
		String senha = scanner.next();
		if(senha.equalsIgnoreCase("Adim")) {
			System.out.println("Senha correta");
		}
		else {
			System.out.println("Senha incorreta");
		}
		
//		5 - Comparação de nomes
		System.out.println("Digite um nome: ");
		String nome1 = scanner.next();
		System.out.println("Digite outro nome: ");
		String nome2 = scanner.next();
		if(nome1.equalsIgnoreCase(nome2)) {
			System.out.println("Os nomes são iguais.");
		}
		else {
			System.out.println("Os nomes são diferentes.");
		}
//		6 - Jogo da cor favorita
		System.out.print("Informe uma cor: ");
		String cor = scanner.next();
		if(cor.equalsIgnoreCase("azul")) {
			System.out.println("Boa escolha");
		}else if (cor.equalsIgnoreCase("Verde")) {
			System.out.println("cor da natureza");
		}else if (cor.equalsIgnoreCase("Vermelho")) {
			System.out.println("Cor vibrante");
		}else {
			System.out.println("cor errada");
		}
//		7 - Verificação de vogal
		
		System.out.print("Informe uma Letra: ");
		String letra = scanner.next();
		if(letra.equalsIgnoreCase("A")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("E")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("I")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("O")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("U")) {
			System.out.println("É uma vogal.");
		}else {
			System.out.println("Não e vogal");
		}

	}

}
