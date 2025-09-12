package PrimeiroProjeto;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	System.out.println("Escolha um numero e veja uma cor: ");
	int numero = scanner.nextInt();
	
	switch(numero) {
	case 1:
		System.out.println("Vemelho");
		break;
	case 2:
		System.out.println("Azul");
		break;
	default:
		System.out.println("valor incorreto");
	}
	System.out.println("qual categoria voce pertence? ");
	String categoria = scanner.next();
	switch(categoria.toUpperCase()) {
	case "A":
		System.out.println("Infantil");
		break;
	case "B":
		System.out.println("Juvenil");
		break;
	default:
		System.out.println("categoria incorreta");
	}
	
	System.out.println("Escolha a oparação matematica de dois numeros");
	String operacao = scanner.next();
	
	switch(operacao) {
	case "+":
		int adicao = 5+5;
		System.out.println(adicao);
		break;
	case "-":
		int subtracao = 5-5;
		System.out.println(subtracao);
	break;
	case "*":
		int mult = 5-5;
		System.out.println(mult);
	break;
	case "/":
		int div = 5-5;
		System.out.println(div);
	break;
	default:
	System.out.println("operação icorreta");
	break;
	}

	}

}
