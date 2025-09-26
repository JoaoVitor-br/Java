package PrimeiroProjeto;

import java.util.Scanner;

public class Lista16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 - Criando um vetor de cores
		String[] cores = new String[6];
		for(int e = 0;e < 6;e ++) {
			System.out.println("escreva uma cor: ");
			cores[e] = scanner.next();
		}
		for(int e = 0;e < 6;e ++) {
			System.out.println(cores[e]);
		}

//		2 - Vetor de números decimais
		double[] decimenos = new double[8];
		for(int e = 0;e <8 ;e++) {
			System.out.println("Digite um numero: ");
			decimenos[e] = scanner.nextDouble();
		}
		for(int e = 0;e < 8;e++) {
			System.out.println(decimenos);
		}
		
//		3 - Mostrando apenas os pares
		int[] parismo = new int[10];
		for(int e = 0; e<10;e++) {
			System.out.println("Digite um numero: ");
			parismo[e] =scanner.nextInt();
		}
		for(int e=0;e<10;e++) {
			if(parismo[e] % 2 ==0) {
			System.out.println(parismo[e]);
			}}
		
//		4 - Menores que 50

		int[] cinquentao = new int[12];
		for(int e=0;e<12;e++) {
			System.out.println("Digite um numero:");
			cinquentao[e] = scanner.nextInt();
			}
		for(int e=0;e<12;e++) {
			if(cinquentao[e] < 50) {
				System.out.println("menor que 50");
			}
			else {
				System.out.println(cinquentao[e]);
			}
		}
		
//		5 - Procurando um nome no vetor
		
		String[] nome = new String[5];
		for(int e = 0; e < 5; e++) {
			System.out.println("Digite um nome: ");
			nome[e] = scanner.next();
		}
		for(int e = 0; e < 5; e++) {
			String achador;
			System.out.println("Qual nome voce esta procurando: ");
			achador = scanner.next();
			if(achador.equalsIgnoreCase(nome[e])) {
				System.out.println("Este nome existe");
			}
			else {
				System.out.println("Este nome não existe");
			}
		}
//		6 - Produto e preço
		String[] nome_produto = new String[4];
		double[] preco_procuto = new double[4];
		for(int e = 0;e <4;e++) {
			System.out.println("Digite o nome do produto: ");
			nome_produto[e] = scanner.next();
			System.out.println("Qual o preço desse produto: ");
			preco_procuto[e] = scanner.nextDouble();
		}
		for(int e = 0;e <4;e++) {
			System.out.println("O produto "+nome_produto[e]+" custa R$"+preco_procuto[e]);
		}
//		7 - Verificação de notas
		
		double[] nota = new double[6];
		for(int e=0;e<6;e++) {
			System.out.println("Digite a nota do aluno: ");
			nota[e] = scanner.nextDouble();
		}
		for(int e=0;e<6;e++) {
			if(nota[e]< 6) {
				System.out.println("aluno reprovado");
			}else if(nota[e]<6 && nota[e]<7) {
				System.out.println("aluno em recuperação");
			}
		}
	}

}
