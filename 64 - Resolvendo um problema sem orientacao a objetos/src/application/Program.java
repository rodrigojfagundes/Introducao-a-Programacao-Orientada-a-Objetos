package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("enter the measures of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		
		System.out.printf("triangule X area: %4f%n", areaX);
		System.out.printf("triangule Y area: %4f%n", areaY);
		
		if (areaX > areaY) {System.out.println("larger is area X");
		
		} else {
			
			System.out.println("larger is area: Y");
		}
		
		
		
		
				
		
		sc.close();

	}

}
