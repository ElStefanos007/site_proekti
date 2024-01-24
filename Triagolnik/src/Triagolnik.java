import java.util.Scanner;
public class Triagolnik {
public static void main(String[] args) {
int a, b ,c;
Scanner tastatura = new Scanner(System.in);
System.out.println("Vnesi vrednost za A");
a=tastatura.nextInt();
System.out.println("Vnesi vrednost za B");
b=tastatura.nextInt();
System.out.println("Vnesi vrednost za C");
c=tastatura.nextInt(); 
if (a+b>c && b+c>a && a+c>b) {
System.out.println("Moze da se formira triagolnik");
} else { 
System.out.println("Ne moze da se formira triagolnik");
System.exit(0);
}

if (c*c==a*a+b*b) {
System.out.println("Ovoa e pravoagolen triagolnik");
} else if (c*c>a*a+b*b) {
	System.out.println("Ovoa e tapoagolen triagolnik");
}
else if (c*c<a*a+b*b) {
	System.out.println("Ovoa e ostroagolen triagolnik");
}
}
}