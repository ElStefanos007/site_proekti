import java.util.Scanner;
public class deliviso4i7 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Vnesi broj na clenovi vo nizata");
int n = input.nextInt();
int niza[] = new int[n];
System.out.println("Vnesi gi vrednostite na clenovite vo nizata");
for (int i=0; i<=niza.length; i++) {
	if(i%4 ==0 && i%7 == 0)
	System.out.println("===>" +i);
niza[i] = input.nextInt();
	System.out.println("Niza[" +n+ "] = " + niza[n]);
}
	}

}
