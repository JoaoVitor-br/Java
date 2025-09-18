package PrimeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 - Contador:

		for(int d = 10;d <= 30 ;d ++) {
			System.out.println(d);
		}
		
//		2 - Classificação de Idades:

		for(int i = 0;i <= 10; i++) {
		int idade;
		System.out.println("digite sua idade: ");
		idade = scanner.nextInt();
		if(idade <= 18) {
			System.out.println("Menor de idade.");
		}else {
		System.out.println("Maior de idade.");
		}}
		
//		3 - Eleição:
		
		for(int e = 0;e <=5; e++) {
			int candidato;
			System.out.println("vote no seu candidato: ");
			candidato = scanner.nextInt();
			switch(candidato) {
			case 1,2,3,4:
				System.out.println("Voce votou no respequitivo candidato");
			break;
			case 5:
				System.out.println("Voto nulo");
				break;
			case 6:
				System.out.println("Voto em branco");
				break;
		}}
		
//		4 - Repetição de Frase
		
		int contagem;
		String frase;
		System.out.println("Escreva uma frase: ");
		frase = scanner.next();
		System.out.println("Qunatas vezes voce quer que lea repita: ");
		contagem = scanner.nextInt();
		for(int c = 0;c<=contagem; c++) {
			System.out.println(frase + c);
		}
		
//		5 - Sequência
		 for(int e = 50;e >= 50;e --){
		System.out.println(e);
		 }
		 
//		 6 - Números Alternados
		 for(int d = 1;d <= 50;d =+2) {
			 System.out.println(d);
		 }
	
	}
}
