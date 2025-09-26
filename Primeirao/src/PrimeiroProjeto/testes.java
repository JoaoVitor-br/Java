package PrimeiroProjeto;
import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] parismo = new int[10];
		for(int e = 0; e<10;e++) {
			System.out.println("Digite um numero: ");
			parismo[e] =scanner.nextInt();
		}
		for(int e=0;e<10;e++) {
			if(parismo[e] % 2 ==0) {
			System.out.println(parismo[e]);
			}}
	}
}
