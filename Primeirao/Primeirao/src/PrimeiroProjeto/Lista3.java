package PrimeiroProjeto;

import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Resultado de dois números
		//Escreva um programa que leia dois números inteiros do usuário e exiba a soma desses números.

		double num1;
		double num2;
		System.out.println("digite a sua primeiro numero: ");
		num1 = scanner.nextDouble();
		System.out.println("digite a sua segundo numero: ");
		num2 = scanner.nextDouble();
		double soma = num1 + num2; 
			 
		System.out.println("sua Soma final e "+ soma);
		
		//2 - Divisão e Resto
		//Escreva um programa que leia dois números inteiros e exiba o resultado da divisão inteira e o resto da divisão.

		double num_licao2;
		double num2_licao2;
		System.out.println("digite a sua primeiro numero: ");
		num_licao2 = scanner.nextDouble();
		System.out.println("digite a sua segundo numero: ");
		num2_licao2 = scanner.nextDouble();
		double div = num_licao2 / num2_licao2;
		double resto = num_licao2 % num2_licao2;	 
		System.out.println("sua divisão final e "+ div);
		System.out.println("e o resto e "+ resto);
		
		//3 - Perímetro de um triângulo
		//Escreva um programa que leia os comprimentos dos três lados de um triângulo (números reais) e calcule seu perímetro. Exiba o resultado com duas casas decimais.
		//Fórmula: Perímetro = lado1 + lado2 + lado3

		
		double num_licao3;
		double num2_licao3;
		double num3_licao3;
		System.out.println("digite o primeiro lado: ");
		num_licao3 = scanner.nextDouble();
		System.out.println("digite o segundo lado: ");
		num2_licao3 = scanner.nextDouble();
		System.out.println("digite o terceiro lado: ");
		num3_licao3 = scanner.nextDouble();
		double peri = num_licao3 + num2_licao3 + num3_licao3;
		System.out.println("O perimetro do triangolo e "+peri);
		
		//4 - Calculadora de Gorjeta
		//Escreva um programa que leia o valor de uma conta em um restaurante e a porcentagem de gorjeta desejada. Calcule o valor da gorjeta e o total a pagar (conta + gorjeta). Exiba ambos com duas casas decimais.

		double conta;
		double porcentagem;
		System.out.println("digite o valor da conta: ");
		conta = scanner.nextDouble();
		System.out.println("digite a porcentagem da gorjeta: ");
		porcentagem = scanner.nextDouble();
		double gorjeta = conta*(porcentagem/100);
		double total = gorjeta + conta;
		System.out.println("O valor final foi de R$ " + total);
		
		//5 - Calculadora de área de círculo
		//Escreva um programa que leia o raio de um círculo (em metros) e calcule sua área. Use a constante π = 3.14159. Exiba o resultado com duas casas decimais.

		double raio;
		System.out.println("qual e o raio do circulo: ");
		raio = scanner.nextDouble();
		double area_cir = 3.14159*(raio*raio);
		System.out.println("A area do círculo é " + area_cir);
		
		//6 - Conversor de idade em dias
		//Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule o total de dias vividos, considerando que cada ano tem 365 dias e cada mês tem 30 dias (aproximação). Exiba o resultado.

		int anos;
		int mes;
		int dia;
		System.out.println("digite quantos anos voce tem: ");
		anos = scanner.nextInt();
		System.out.println("digite quantos meses voce tem: ");
		mes = scanner.nextInt();
		System.out.println("digite quantos dias voce tem: ");
		dia = scanner.nextInt();
		int total_dias = (anos*365)+(mes*30)+dia;
		System.out.println("O total de dias que voce tem é "+ total_dias);
		
		//7 - Calculadora de pagamento por hora
		//Escreva um programa que leia o número de horas trabalhadas e o valor pago por hora. Calcule o salário bruto, o imposto retido (10% do salário bruto) e o salário líquido. Exiba todos os valores com duas casas decimais.

		double horas_trabalhadas;
		double valor_hora = 20;
		double desconto = 0.10;
		System.out.println("quantas horas voce trabalhou: ");
		horas_trabalhadas = scanner.nextDouble();
		double sal_bruto = horas_trabalhadas * valor_hora;
		double imposto = sal_bruto * desconto;
		double sal_niquido = sal_bruto-imposto;
		System.out.println("O total recebido foi R$ "+sal_niquido);          
		
		
	}

}
