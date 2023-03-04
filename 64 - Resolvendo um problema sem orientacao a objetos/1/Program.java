//SEM CLASSES
//Passar 3 valores para Triangulo A e 3 valores para Triangulo B... E verificar qual o MAIOR TRIANGULO


import java.util.Scanner;

//classe publica program
public class Program {

//funcao Main
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double xA, xB, xC, yA, yB, yC;

//recebendo os valores dos 3 lados do triangulo X e Y
System.out.println("enter the measures of triangules X: ");
xA = sc.nextDouble();
xB = sc.nextDouble();
xC = sc.nextDouble();

System.out.println("enter the measures of triangules Y: ");
yA = sc.nextDouble();
yB = sc.nextDouble();
yC = sc.nextDouble();



//calculando a area do triangulo X e Y
double p = (xA + xB + xC) / 2.0;
double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

p = (yA + yB + yC) / 2.0;
double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

System.out.printf("triangle X area: %.4f%n ", areaX);
System.out.printf("triangle Y area: %.4f%n ", areaY);


if(areaX > areaY) {

System.out.println("Larger area: X");

}
else {
System.out.println("Larger area: Y");
}

}
}
