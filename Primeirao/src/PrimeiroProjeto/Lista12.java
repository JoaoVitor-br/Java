package PrimeiroProjeto;

import java.util.Scanner;

public class Lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		1 - Contador
		int contagem = 10;
		 do {
			System.out.println(contagem);
			contagem = contagem +1;
		}while (contagem <=30);
		 
//		2 - Adivinhação de número:
		 int adivinhacao;
		 do {
			 System.out.println("Adivinhe o numero");
			 adivinhacao = scanner.nextInt();
		 }while (adivinhacao != 5);
			
//		3 - Verificação de peso na mala:
		 
		 int peso;
		 do {
			 System.out.println("Digite o peso da sua mala: ");
			 peso = scanner.nextInt();
			 if(peso >23) {
				 System.out.println("peso excedido tente novamente.");
			 } 
		 }while (peso > 23);
		 
//		4 - Verificar quantidade de páginas lidas na semana:
		 
		 int contagem2 = 1;
			int somativa;
			int somativa2 = 0;
			do {
		 System.out.println("Quantas paginas você leu hoje: ");
			somativa = scanner.nextInt();
				somativa2 = somativa + somativa2;
				
				contagem2 ++;
			}while(contagem2 >=7);
	System.out.println(somativa2);
	
//		5 - Testar código de acesso:
		int senha;
		do {
			System.out.println("escreva o codigo de verificação: ");
				senha = scanner.nextInt();
			if(senha != 654) {
				System.out.println("Codigo invalido tente novamente!");
			}
		}while (senha != 654);
		
//		6 - Verificar nível de combustivel:
		
		int gas;	
		do {
			System.out.println("Quanto a no tanque de gasolina: ");
				gas = scanner.nextInt();
			if(gas <= 10) {
				System.out.println("Gasolina acabando reabasteça.");
			}
		}while (gas <= 10);
		
//		7 - Contar Kilômetros Percorridos:

		int kilometros;
		int kilometros_final = 0;
		do {
			System.out.println("quantos kilometros faltam para a viagem acabar: ");
				kilometros = scanner.nextInt();
			kilometros_final = kilometros_final + kilometros;
		}while(kilometros <=0);
		System.out.println("A kilometragem final foi "+ kilometros_final);
	}
}
