import java.util.Scanner;
public class Konverter {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double C, F;
System.out.println("Vnesi Celziusovi stepeni: ");
C = input.nextDouble();
F = (9*C) / 5 + 32;
System.out.println(C + " Celziusovi stepeni");
System.out.print(F + " Farenhajtovi stepeni");
	}

}
