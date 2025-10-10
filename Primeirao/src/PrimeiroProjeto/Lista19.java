package PrimeiroProjeto;

import java.util.Scanner;

public class Lista19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 – Classificando valores
		System.out.println("escreva um numero: ");
		int val = scanner.nextInt();
		Classificando(val);
		
//		2 – Maioridade
		System.out.println("Qual e a sua idade: ");
		int idade = scanner.nextInt();
		Maioridade(idade);
		
//		3 – Boas Vindas
		System.out.println("Digite o seu nome: ");
		String nome = scanner.next();
		Boasvindas(nome);
		
//		4 – Tabuada
		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
		Tabuada(num);
		
//		5 – Juntando palavras
		System.out.println("Digite uma palavra: ");
		String pala = scanner.next();
		System.out.println("Digite outra palavra");
		String vra = scanner.next();
		junto(pala+vra);
		
//		6 – Verificando par ou ímpar
		System.out.println("Escreva um numero: ");
		int par = scanner.nextInt();
		parimpar(par);
		
//		7 – Classificando temperatura
		System.out.println("Qual a temperatura atual: ");
		int temp = scanner.nextInt();
		temperatura(temp);
		
//		8 – Saudação por turno
		System.out.println("De qual turno voce é(manhã, tarde ou noite):");
		String turno = scanner.next();
		bomdia(turno);
		
//		9 – Calculando média
		int media = 0;
		for(int e = 0;e<=3;e++) {
			System.out.println("Qual e a sua nota: ");
			int nota = scanner.nextInt();
			media = media+nota;
		}media(media);
		
//		10 – Verificando aprovação
		
		}
	public static void Classificando(int num) {
		if(num>0) {
			System.out.println("Positivo");
		}else if(num<0){
			System.out.println("Negativo");
		}else {
			System.out.println("Zero");
		}
	}
	public static void Maioridade(int num) {
		if(num>=18) {
			System.out.println("Maior de idade");
		}else if(num<18){
			System.out.println("Menor de idade");
		}else {
			System.out.println("Fora de escopo");
		}
	}
	public static void Boasvindas(String men) {
		System.out.println("Seja bem vindo "+ men+" como vai o seu dia");
	}
	public static void Tabuada(int mult) {
		for(int e = 0;e <= 10; e++) {
			System.out.println((mult*e));
		}
	}
	public static void junto(String jun) {
		System.out.println(jun);
	}
	public static void parimpar(int par) {
		if(par % 2 ==0) {
			System.out.println("É par");
		}else if(par % 2 !=0) {
			System.out.println("É impar");
		}else {
			System.out.println("Sonic");
		}
	}
	public static void bomdia(String domtarde) {
		if(domtarde.equalsIgnoreCase("Manhã")) {
		System.out.println("Dom dia");
		}else if(domtarde.equalsIgnoreCase("tarde")) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite");
		}
	}
	public static void temperatura(int temp) {
		if(temp<15) {
			System.out.println("Frio");
		}else if(temp>15){
			System.out.println("Agradavel");
		}else {
			System.out.println("Quente");
		}
	}
	public static void media(int num) {
		System.out.println("Sua media é "+(num/3));
	}
	public static void aprovacao(int nota) {
		if(nota>7) {
			System.out.println("Aprovado");
		}//else if()
	}
}
