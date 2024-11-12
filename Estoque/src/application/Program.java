package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import utils.UI;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ArrayList<Product> products = new ArrayList<>();
		UI menu = new UI();
				
		menu.printMenu();
		int menuOption = sc.nextInt();
		
		while (menuOption != 0) {
			switch (menuOption) {
				case 1:
					System.out.println();
					System.out.println("-- CADASTRO NOVO PRODUTO --");
					System.out.print("Nome do Produto: ");
					String name = sc.next();
					System.out.print("Categoria: ");
					String cagory = sc.next();
					System.out.print("Quantidade: ");
					int quantity = sc.nextInt();
					System.out.print("Preço: ");
					double price = sc.nextDouble();
					System.out.print("Localização no Estoque: ");
					String localStok = sc.next();
					
					Product product = new Product(name, cagory, quantity, price, localStok);
					products.add(product);
					System.out.println();
					System.out.println("Produto salvo com sucesso!");
					System.out.println();
					menu.printMenu();
					menuOption = sc.nextInt();
			}
		}
		System.out.print("Programa Finalizado!");
		
		sc.close();
	}

}
