package PrimeiroProjeto;

import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
//		1 - Classificação de Dia da Semana
		System.out.println("digite um numero de um dia da semana");
		int semana = scanner.nextInt();
		switch(semana) {
			case 2,3,4,5,6:
				System.out.println("dia útil.");
		break;
			case 1,7:
				System.out.println("Fim de semana");
		break;
		default:
			System.out.println("dia inválido");
		}
		
//		2 - Menu de Bebidas
		System.out.println("1 = Café, 2 = Chá, 3 = Suco, 4 = Refrigerante");
		System.out.println("Qual é o numero da sua bebida: ");
		int bebida = scanner.nextInt();
		switch(bebida) {
		case 1:
			System.out.println("Café = R$5,00");
			break;
		case 2: 
			System.out.println("Chá = R$3,50");
			break;
		case 3:
			System.out.println("Suco = R$4,00");
			break;
		case 4:
			System.out.println("Refrigerante = R$4,50");
			break;
		default:
			System.out.println("Código invalido");
		}
		
//		3 - Tipo de Veículo
		System.out.println("1 = Carro, 2 = Moto, 3 = Caminhão");
		System.out.println("Qual o numero do veicolo: ");
		int carros = scanner.nextInt();
		switch(carros) {
		case 1:
			System.out.println("Carro = \"Leve\"");
			break;
		case 2: 
			System.out.println("Moto = \"Motocicleta\"");
			break;
		case 3:
			System.out.println("Caminhão = \"Pesado\"");
			break;
		default:
			System.out.println("veiclo invalido");
		}
			
//			4 - Escolha de Plano de Assinatur
			
			System.out.println("1 = Básico, 2 = Intermediário, 3 = Premium");
			System.out.println("Qual o numero do plano");
			int veiculo= scanner.nextInt();
			switch(veiculo) {
			case 1:
				System.out.println("Básico = \"Acesso limitado\"");
				break;
			case 2:
				System.out.println("Intermediário = \"Acesso padrão + suporte\"");
				break;
			case 3:
				System.out.println("Acesso total + suporte prioritário\"");
			default:
				System.out.println("Plano inválido");
			}
			
//			5 - Seleção de Mês
			
			System.out.println("Digite o numero de um mes: ");
			int sem= scanner.nextInt();
			switch(sem) {
			case 12,1,2:
				System.out.println("Verão");
				break;
			case 3,4,5:
				System.out.println("Outono");
				break;
			case 6,7,8:
				System.out.println("Inverno");
				break;
			case 9,10,11:
				System.out.println("Primavera");
				break;
			default:
				System.out.println("Mês inválido");
			}
			
//			6 - Tipo de Ingresso
			
			System.out.println("Informe o seu ingresso: ");
			int ingreco= scanner.nextInt();
			switch(ingreco) {
			case 1:
				System.out.println("Inteira R$ 50,00");
				break;
			case 2:
				System.out.println("Meia-entrada R$ 25,00");
				break;
			case 3:
				System.out.println("VIP R$ 100,00");
				break;
			default:
				System.out.println("Ingresso inválido");
				break;
			}
			
//			7 - Escolha de Idioma

			System.out.println("Qual e o seu idioma");
			int lingua = scanner.nextInt();
			 switch (lingua) {
			case 1:
				System.out.println("Olá!");
				break;
			case 2:
				System.out.println("Hello!");
				break;
			case 3:
				System.out.println("hola!");
			default:
				System.out.println("idioma inválido");
				break;
			 }
				
//			8 - Nível de Acesso
				
				System.out.println("Qual e o seu nivel de acesso");
				int nivel = scanner.nextInt();
				 switch (nivel) {
				case 1:
					System.out.println("Acesso básico");
					break;
				case 2:
					System.out.println("Acesso básico + edição");
					break;
				case 3:
					System.out.println("Acesso total");
				default:
					System.out.println("idioma inválido");
					break;
			}
				 
//			9 - Tipo de Pagamento
				 System.out.println(" (1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix).");
				 System.out.println("Qual e a forma de pagamento");
					int pagamento = scanner.nextInt();
					 switch (pagamento) {
					case 1:
						System.out.println("Pagamento em dinheiro confirmado");
						break;
					case 2:
						System.out.println("Pagamento com cartão processado");
						break;
					case 3:
						System.out.println("Pagamento via Pix realizado");
					default:
						System.out.println("Método inválido");
						break;
				} 
			
	}

}
