package PrimeiroProjeto;

import java.util.Scanner;

public class lista04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1 - Verificar maioridade

		double idade;
		System.out.println("quantos anos voce tem: ");
		idade = scanner.nextDouble();
		if (idade < 18) {
			System.out.println("voce tem"+idade+" anos e é menor de idade");
		}
		else {
			System.out.println("Voce tem "+ idade +" anos e é maior de idade");
		}
		

		//2 - Comparar dois números
		
		int num1;
		int num2;
		System.out.println("digite a sua primeiro numero: ");
		num1 = scanner.nextInt();
		System.out.println("digite a sua segundo numero: ");
		num2 = scanner.nextInt();
		if (num1 > num2) {
			System.out.println("O primeiro número é maior");
		}
		else if (num2 > num1) {
			System.out.println("O segundo número é maior");
		}
		else {
			System.out.println("eles são iguais");
		}
		//3 - Aprovação por nota
		double nota ;
		System.out.println("coleque aqui a sua nota: ");
		nota = scanner.nextDouble();
		if (nota >=7 ) {
			System.out.println("Aprovado: sua nota foi"+nota);
		}
		else {
			System.out.println("eprovado: sua nota foi "+ nota);
		}
		//4 - Verificar número positivo
		
		int numero;
		System.out.println("digite um numero: ");
		numero = scanner.nextInt();
		if(numero > 0) {
			System.out.println("O número é positivo");
		}
		else {
			System.out.println("O número é negativo ou zero");
		}
		//5 - Cálculo de frete
		double ditancia;
		double preco;
		System.out.println("digite a sua distancia: ");
		ditancia = scanner.nextDouble();
		System.out.println("digite o preço do produto: ");
		preco = scanner.nextDouble();
		if(ditancia<=50){
			System.out.println("o frete custa R$ 10.00");
		}
		else {
			System.out.println("Valor do frete: R$ "+ (ditancia*0.50));
		}
		//6 - O Número é 10?
		
		int dez;
		System.out.println("digite a sua primeiro numero: ");
		dez = scanner.nextInt();
		if(dez ==10) {
			System.out.println("o número é 10");
		}
		else {
			System.out.println("o número não é 10");
		}
		
		//7 - Desconto para Associados
		String associado;
		System.out.println("Voce é associado da nossa loja: ");
		associado = scanner.next();
		if(associado=="sim") {
			System.out.println("você tem desconto");
		}
		else {
			System.out.println("você não tem desconto");
		}
		
		//8 - Cálculo de bônus por horas extras
		
		int horas;
		System.out.println("Quantas horas extras voce trabalhou: ");
		horas = scanner.nextInt();
		if (horas <10) {
			System.out.println("Bônus por hora extra R$"+horas*20);
		}
		else{
			System.out.println("Bônus por hora extra R$"+horas*15);
		}
	
	}
}
