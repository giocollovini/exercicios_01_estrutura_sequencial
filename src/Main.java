import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double pi = 3.14159;
		
		int a, b;
		int soma;
		
		System.out.println("------Soma Inteiros-------");
		System.out.println("Digite 1� valor Inteiro.");
		a = sc.nextInt();
		System.out.println("Digite 2� valor Inteiro.");
		b = sc.nextInt();
		soma = a + b;
		System.out.println("A soma dos valores �: " + soma); 
		
		//--------------------------------------------------- 
		
		double raio = 0.0;
		double area = 0.0;		
		
		System.out.println();
		System.out.println("------Area de um C�rculo-------");
		System.out.println("Digite o valor do Raio do C�rculo."); 		
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		System.out.printf("A �ea do C�rculo �: %.4f%n", area); 
		
		//---------------------------------------------------
		
		int n1, n2, n3, n4, produto;
		
		System.out.println();
		System.out.println("------Calculo de diferen�a de Produtos-------");
		System.out.println("Digite 1� valor Inteiro.");
		n1 = sc.nextInt();
		System.out.println("Digite 2� valor Inteiro.");
		n2 = sc.nextInt();
		System.out.println("Digite 3� valor Inteiro.");
		n3 = sc.nextInt();
		System.out.println("Digite 4� valor Inteiro.");
		n4 = sc.nextInt(); 		
		produto = (n1*n2 - n3*n4);		
		System.out.println("A diferen�a dos valores �: " + produto); 
		
		//---------------------------------------------------
		
		int cod_func, nr_horas;
		double vlr_hora = 0.0;
		double salario = 0.0;
		
		System.out.println();
		System.out.println("------Calculo de Sal�rio-------");
		System.out.println("Digite o C�digo do Funcion�rio.");
		cod_func = sc.nextInt();
		System.out.println("Digite o Numero de Horas Trabalhadas.");
		nr_horas = sc.nextInt();
		System.out.println("Digite o valor da Hora.");
		vlr_hora = sc.nextDouble();
		salario = nr_horas*vlr_hora;		
		System.out.println("O c�digo do funcion�rio �: " + cod_func); 
		System.out.printf("O valor do Sal�rio �:  U$  %.2f%n", salario); 
		
		//---------------------------------------------------
	
		int cod_peca1, nr_pecas1;
		double vlr_peca1 = 0.0;
		double vlr_Tot_Peca1 = 0.0;
		int cod_peca2, nr_pecas2;
		double vlr_peca2 = 0.0;
		double vlr_Tot_Peca2 = 0.0;
		
		System.out.println();
		System.out.println("------Calculo Custo de 2 pe�as-------");
		System.out.println("Informa��es da 1� Pe�a.");
		System.out.println("Digite o C�digo da Pe�a, Numero de Pe�as e o Custo da Pe�a.");
		cod_peca1 = sc.nextInt();
		nr_pecas1 = sc.nextInt();
		vlr_peca1 = sc.nextDouble();
		vlr_Tot_Peca1 = nr_pecas1*vlr_peca1;
		System.out.println("Informa��es da 2� Pe�a.");
		System.out.println("Digite o C�digo da Pe�a, Numero de Pe�as e o Custo da Pe�a.");
		cod_peca2 = sc.nextInt();
		nr_pecas2 = sc.nextInt();
		vlr_peca2 = sc.nextDouble();
		vlr_Tot_Peca2 = nr_pecas2*vlr_peca2;		
		System.out.printf("O valor total �:  R$  %.2f%n", vlr_Tot_Peca1 + vlr_Tot_Peca2); 
		
		//--------------------------------------------------- 
	
		double vlr1 = 0.0;
		double vlr2 = 0.0;
		double vlr3 = 0.0;
		double areaTriangulo = 0.0;
		double areaCirculo = 0.0;
		double areaTrapezio = 0.0;
		double areaQuadrado = 0.0;
		double areaRetangulo = 0.0;
				
		System.out.println();
		System.out.println("------Calculo de Area de Figuras Geom�tricas-------");
		System.out.println("Digite o 1� Valor:");
		vlr1 = sc.nextDouble();
		System.out.println("Digite o 2� Valor:");
		vlr2 = sc.nextDouble();
		System.out.println("Digite o 3� Valor:");
		vlr3 = sc.nextDouble();
		
		areaTriangulo = (vlr1*vlr3)/2;
		areaCirculo = pi * Math.pow(vlr3, 2.0);
		areaTrapezio = ((vlr1+vlr2)/2)*vlr3;
		areaQuadrado = Math.pow(vlr2, 2.0);
		areaRetangulo = vlr1*vlr2;
		
	
		System.out.printf("Area do Triangulo Retangulo de BASE %.2f e Altura %.2f �:  %.3f%n", vlr1, vlr3,  + areaTriangulo); 
		System.out.printf("Area do C�rculo de RAIO %.2f �:  %.3f%n", vlr3,  + areaCirculo);
		System.out.printf("Area do Trap�zio de BASE %.2f e de BASE %.2f e Altura %.2f �:  %.3f%n", vlr1, vlr2, vlr3,  + areaTrapezio);
		System.out.printf("Area do Quadrado de Lados %.2f �:  %.3f%n", vlr2,  + areaQuadrado);
		System.out.printf("Area do Retangulo de LADO %.2f e de LADO %.2f �:  %.3f%n", vlr1, vlr2,  + areaRetangulo);
		
		sc.close();

	}

}
