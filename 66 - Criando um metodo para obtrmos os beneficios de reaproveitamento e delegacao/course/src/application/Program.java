package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("enter the measures of triangle X:");
		//passando os valores para os atributos/variaveis da classe Triangle... pois o X e Y e um objeto do tipo TRIANGLE
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		

		double areaX = x.area();
		
		
		double areaY = y.area();

		
		System.out.printf("triangule X area: %4f%n", areaX);
		System.out.printf("triangule Y area: %4f%n", areaY);
		
		if (areaX > areaY) {System.out.println("larger is area X");
		
		} else {
			
			System.out.println("larger is area: Y");
		}
		sc.close();

	}

}
