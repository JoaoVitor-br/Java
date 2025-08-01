public class MyClass {
  public static void main(String args[]) {
    
    
    int idade = 24;
    double salario = 1.25;
    char letra = 'j';
    boolean estudante = true;
    String nome = "juliana";
    
    System.out.println(idade);
    System.out.println("Minha idade é "+ idade);
    System.out.println("O salario é "+ salario);
    System.out.println("A letra escolida é " +letra);
    System.out.println("A algun estudante? "+ estudante);
    System.out.println("O nome selecionado é "+ nome);
    
    // Operadores Aritimeticos
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    System.out.println("O resultado da soma é "+ soma);
    System.out.println("A diferença dos numeros é "+ sub);
    System.out.println("Cada um recebera é "+ div);
    System.out.println("O produto dessa multiplicação é "+ mult);
    
    // calculo de area
    
    int reta1 = 15;
    int reta2 = 10;
    double area = reta2 * reta1;
    System.out.println("A area da figura é " + area);
    
    // calculo de desconto
    
    double valor = 100;
    double desconto = 15;
    double valordesc = valor * (desconto / 100);
    double valorfinal = valor - valordesc;
    System.out.println("A pagar "+ valorfinal);
    
  }
}