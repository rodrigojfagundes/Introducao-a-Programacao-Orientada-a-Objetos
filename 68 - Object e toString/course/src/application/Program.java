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
		
		System.out.print(product); 
		
		sc.close();
	}

}
