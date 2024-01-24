import java.util.Scanner;
public class Kamata {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Vnesi go depozitot");
double depozit = input.nextDouble();
System.out.println("Vnesi ja kamatnata stapka");
double kamata = input.nextDouble();
double iznosmesec = (((depozit / 100) * kamata) + depozit);
double iznoskamata = ((depozit / 100 * kamata) * 12 + depozit);
System.out.println("Kamatna stapka posle eden mesec iznesuva:" +iznosmesec);
System.out.println("Kamatnata stapka posle edna godina iznesuva:" +iznoskamata);
}
}