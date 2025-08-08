import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá mundo");
		
		//declaração de variável
		int idade = 24;
		double salario = 2000.50;
		char letra ='j';
		String nome = "joão";
		boolean chuva = true;
		System.out.println(idade);
		System.out.println("O salario é: "+ salario+" dinheiros");
		System.out.println("Letra: "+ letra);
		System.out.println("O vagabundo é "+ nome);
		System.out.println(chuva);
		
		// operadores
		int num1 = 10;
		double num2 = 1.3;
		double soma = num1 + num2;
		double sub = num1 + num2;
		double div = num1 + num2;
		double mult = num1 * num2;
		double resto = num1 % num2;
		
		// Entrada de dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("qual e o seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Ola "+ nome1);
		
		
		//Peça o ano de nacimento do usuario e mostre quantos anos ele tem
		int ano_nacimento;
		int ano = 2025;
		System.out.println("Em que ano voce naceu? ");
		ano_nacimento = scanner.nextInt();
		int total = ano - ano_nacimento;
		
		//
		double preco;
		double desconto;
		System.out.println("Qual o valor do seu produto? ");
		preco =scanner.nextDouble();
		System.out.println("Qual o valor do desconto? ");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: "+ pagar);
		
		//peça duas notas decimais para o usuário, calcule média e mostre.
		 double nota1;
		 double nota2;
		 System.out.println("digite a sua primeira nota: ");
		 nota1 = scanner.nextDouble();
		 System.out.println("digite a sua segunda nota: ");
		 nota2 = scanner.nextDouble();
		 double media = (nota1 + nota2)/2;
		 System.out.println("sua media final e "+ media);
	}

}
