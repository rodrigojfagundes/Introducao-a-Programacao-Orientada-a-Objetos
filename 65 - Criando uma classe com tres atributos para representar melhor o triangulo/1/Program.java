//package application;
//import entities.Triangle;


public class Program {



public static void main (String[] args) {

Scanner sc = new Scanner(System.in);

Triangle x, y;
x = new Triangle();
y = new Triangle();

System.out.println("Enter the measure of triangle: ");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();

System.out.println("Enter the measures of triangle Y: ");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();

double p = (x.a + x.b + x.c) / 2.0;
double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

double p = (y.a + y.b + y.c) / 2.0;
double areaX = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

System.out.printf("triangle X area: %.4f%n", areaX);
System.out.printf("triangle Y area: %.4f%n", areaY);

if (areaX > areaY) {

System.out.println("larger area: X");

} else {

System.out.println("larger area is: Y");

}
sc.close();
}
}
