package PrimeiroProjeto;
import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] reverso = new int[7];
		for(int e = 0;e<7;e++) {
			System.out.println("escreva um numero: ");
			reverso[e] = scanner.nextInt();
		}
		for(int e =6;e>=0;e--) {
			System.out.println(reverso[e]);
		}
	}
}
