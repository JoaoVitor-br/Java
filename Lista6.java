package PrimeiroProjeto;

import java.util.Scanner;

public class Lista6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		1 - Intervalo numérico
		
		System.out.println("Escreva um numero: ");
		int dex_vinte = scanner.nextInt();
		if(dex_vinte >= 10 && dex_vinte<=20) {
			System.out.println("Esta entre 10 e 20.");
		}else {
			System.out.println("Não esta entre de 10 e 20");
		}
		
//		2 - Acesso à festa
		
		System.out.println("Voce tem o convite(sim/não):");
		String convite = scanner.next();
		System.out.println("Voce tem 18 anos:");
		String idade_festa = scanner.next();
		if(convite.equalsIgnoreCase("sim")||idade_festa.equalsIgnoreCase("Sim")) {
			System.out.println("Entrada permitida");
		}else {
			System.out.println("Entrada negada");
		}
		
//		3 - Categoria de esporte

		System.out.println("Quantos anos voce tem: ");
		int idade_esporte = scanner.nextInt();
		if(idade_esporte <= (12) || idade_esporte>=(65)) {
			System.out.println("Categoria especial");
		}else {
			System.out.println("Categoria normal");
		}
		
//		4 - Desconto no produto
		
		System.out.println("qual é a forma de pagamento(cartão/avista): ");
		String pagamento = scanner.next();
		System.out.println("quanto ficou: ");
		double preco = scanner.nextDouble();
		if(pagamento.equalsIgnoreCase("avista")&& preco>=(100)) {
			System.out.println("voce ganhou 10% de desconto e ficou: "+ (preco-(preco*0.1))+" R$");
		}else {
			System.out.println("Não ganhou desconto");
		}
		
//		5 - Triagem médica
		
		System.out.println("Voce esta com algum sintoma: ");
		String sintomas = scanner.next();
		System.out.println("qual e a sua temperatura: ");
		double temp = scanner.nextDouble();
		if(sintomas.equalsIgnoreCase("sim")&& temp>=(38)) {
			System.out.println("Recomenda-se procurar um médico. ");
		}else {
			System.out.println("Sem sinais preocupantes.");
		}
		
//		6 - Votação

		System.out.println("Voce é brasileiro: ");
		String nacionalidade = scanner.next();
		System.out.println("quanto anos voce tem: ");
		double idade_voto = scanner.nextDouble();
		if(nacionalidade.equalsIgnoreCase("sim")&& idade_voto>=(16)) {
			System.out.println("Voce tem que votar. ");
		}else {
			System.out.println("Não pode votar.");
		}
		
//		7 - Bônus de funcionário

		System.out.println("Quantas horas extras voce trabalhou: ");
		int horas_extras = scanner.nextInt();
		System.out.println("Quantas faltas voce teve: ");
		double falta = scanner.nextDouble();
		if(horas_extras >(20)&& falta<(16)) {
			System.out.println("Voce ganhou bonus. ");
		}else {
			System.out.println("Voce não ganhou bonus.");
		}
		
//		8 - Autorização para dirigir

		System.out.println("Voce tem carteira de motorista: ");
		String carteira_motorista = scanner.next();
		System.out.println("quanto anos voce tem: ");
		double idade_dirigis = scanner.nextDouble();
		if(carteira_motorista.equalsIgnoreCase("sim")&& idade_dirigis>=(18)) {
			System.out.println("Voce pode dirigir. ");
		}else {
			System.out.println("Não pode dirigir.");
		}
		
	}

}
