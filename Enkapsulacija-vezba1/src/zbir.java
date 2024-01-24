import java.util.Scanner;
public class zbir {
    public static void main(String[] args) {
        broevi broevi = new broevi();
        Scanner tastatura = new Scanner(System.in);
        System.out.print("Vnesi vrednost za a: ");
        int aValue = tastatura.nextInt();
        broevi.setA(aValue);
        System.out.print("Vnesi vrednost za b: ");
        int bValue = tastatura.nextInt();
        broevi.setB(bValue);
        int c = broevi.getA() + broevi.getB();
        System.out.println("Zbirot e : " + c);
    }
}