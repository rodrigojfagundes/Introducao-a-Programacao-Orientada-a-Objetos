package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Priece: ");
		product.priece = sc.nextDouble();
		System.out.print("quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.print("Product data: "+ product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.print("Update data: "+ product);
		
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: "+ product);
		
		
		
		sc.close();
	}

}
