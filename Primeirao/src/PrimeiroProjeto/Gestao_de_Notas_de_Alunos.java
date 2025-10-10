package PrimeiroProjeto;

import java.util.Scanner;

public class Gestao_de_Notas_de_Alunos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome_aluno;
		String Ano_aluno;
		double nota_aluno =0 ;
		double nota_aluno2=0;
		double nota_aluno3=0;
		double media_aluno =0;
		int e =0;
		String sistema;
		do {
			System.out.println("Digite o nome do aluno: ");
			nome_aluno = scanner.next();
			System.out.println("Qual e o ano que este aluno esta:");
			Ano_aluno = scanner.next();
			while(e<1) {
				System.out.println("Qual a nota deste aluno: ");
				nota_aluno = scanner.nextDouble();
				System.out.println("Qual a nota deste aluno: ");
				nota_aluno2 = scanner.nextDouble();
				System.out.println("Qual a nota deste aluno: ");
				nota_aluno3 = scanner.nextDouble();
				if(nota_aluno >0 && nota_aluno <=10 && nota_aluno2 >0 && nota_aluno2 <=10 && nota_aluno3 >0 && nota_aluno3 <=10) {
					e++;
					media_aluno = media_aluno + nota_aluno + nota_aluno2 + nota_aluno3;
					
				}else {
					System.out.println("Valor invalido, insira um valor dentro do intervalo de 0 a 10");
				}
			}
				
			System.out.println(nome_aluno +" do ano "+Ano_aluno);
			System.out.println("Com as notas"+ nota_aluno +" "+nota_aluno2+" "+nota_aluno3);
			System.out.println("Com a media "+(media_aluno/3));
			if((media_aluno/3) <5) {
				System.out.println("O aluno esta REPROVADO");
			}else if((media_aluno/3) >5 && (media_aluno/3)<7) {
				System.out.println("O aluno esta RECUPERAÇÃO");
			}else if((media_aluno/3) >7) {
				System.out.println("O aluno esta Aprovado");
			}
			System.out.println("Quer continuar(Sim/Não):");
			sistema = scanner.next();
			
		}while(sistema.equalsIgnoreCase("Sim"));

	}
	
}
