package PrimeiroProjeto;
import java.util.Scanner;
public class Lista2 {

	public static void main(String[] args) {
		/* 1 - Resultado de dois números
		Peça para o usuário informar dois números e mostre:
		*/
		Scanner scanner = new Scanner(System.in);
		double num1;
		double num2;
		System.out.println("digite a sua primeiro numero: ");
		num1 = scanner.nextDouble();
		System.out.println("digite a sua segundo numero: ");
		num2 = scanner.nextDouble();
		double soma = num1 + num2; 
		double sub = num1 + num2;
		double div = num1 + num2;
		double mult = num1 * num2;	 
		System.out.println("sua Soma final e "+ soma);
		System.out.println("seu produto final e "+ mult);
		System.out.println("sua divisão final e "+ div);
		System.out.println("sua subtasão final e "+ sub);
		/* 2 - Cálculo de temperatura
		Peça para o usuário informar uma temperatura em Celsius e calcule a mesma temperatura para fahrenheit
		 */
		double temp;
		System.out.println("qual e a temperatura atual: ");
		temp = scanner.nextDouble();
		double fahr = (temp * 1.8) + 32;
		System.out.println("isso em fahrenheit é "+fahr);

		//3 - Conversão de valor
		//Um grupo de investidores solicitou um sistema onde faça a conversão de dólar para real, nesse sistema, o usuário informa um valor em reais e você faz a conversão para dólar.

		double real;
		System.out.println("quantos reais voce quer converter: ");
		real = scanner.nextDouble();
		double doll = real/5.70;
		System.out.println("isso deu $"+doll);
		
		//4 - Área do retângulo
		//Crie um programa que peça para o usuário a base e altura de um retângulo e exiba a área do retângulo
		
		double base;
		double altura;
		System.out.println("digite a medida da base: ");
		base = scanner.nextDouble();
		System.out.println("digite a altura da figura: ");
		altura = scanner.nextDouble();
		double area = base * altura;
		System.out.println("A area da figura e "+ area);
		
		//5 - Conversor de idade
		//Crie um programa que peça a idade do usuário em anos e mostre quantos meses ele ja viveu.
		double idade;
		System.out.println("quantos anos voce tem: ");
		idade = scanner.nextDouble();
		double mes = idade*12;
		System.out.println("Voce tem "+mes+" de vida");
		
		//6 - Conversor de minutos para segundos
		//Crie um programa que peça ao usuário um tempo em minutos e converta esse número para segundos
		double menets;
		System.out.println("digite uma minutagem:  ");
		menets = scanner.nextDouble();
		double secunds = menets*60;
		System.out.println("isso da "+secunds+" segundos");
		
		//7 - Custo da compra
		//Desenvolva um programa que solicite o preço de um produto e a quantidade comprada. Calcule o custo total e exiba.
		
		double preco;
		double quantidade_produto;
		System.out.println("quanto custa o produto: ");
		preco = scanner.nextDouble();
		System.out.println("quantos produtos foram: ");
		quantidade_produto = scanner.nextDouble();
		double preco_final = preco * quantidade_produto;
		System.out.println("O preço final e "+ preco_final);
		
		//8 - Divisão de uma conta de restaurante
		//Escreva um programa que peça o valor total de uma conta e o número de pessoas para dividir a conta. Calcule o valor por pessoa dividindo o total pelo número de pessoas. Exiba o resultado no formato: "Cada pessoa deve pagar R$[valor]."

		double valor_final;
		double pessoas_div;
		System.out.println("quanto custa o produto: ");
		valor_final = scanner.nextDouble();
		System.out.println("quantas pessoas foram: ");
		pessoas_div = scanner.nextDouble();
		double conta_div = valor_final / pessoas_div;
		System.out.println("O preço final e "+ conta_div);
		
		//9 - Cálculo de troco
		//Desenvolva um programa que solicite o valor de uma compra e o valor pago pelo cliente. Calcule o troco e exiba o resultado. 
		double valor;
		double pagamento;
		System.out.println("quanto custa o produto: ");
		valor = scanner.nextDouble();
		System.out.println("incira o pagamento: ");
		pagamento = scanner.nextDouble();
		double truco = pagamento- valor;
		System.out.println("O conta paga "+ truco);

	}

}
