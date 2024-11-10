package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("------------------------------------");
		System.out.println("--------------Estoque---------------");
		System.out.println("-                                  -");
		System.out.println("1 - Cadastrar produto              -");
		System.out.println("2 - Cadastar nova compra           -");
		System.out.println("3 - Lançar venda                   -");
		System.out.println("4 - Listar produtos Cadastrados-   -");
		System.out.println("5 - Relatório                      -");
		System.out.println("------------------------------------");
		
		
		sc.close();
	}

}
