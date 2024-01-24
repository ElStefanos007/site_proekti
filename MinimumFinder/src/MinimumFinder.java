import java.util.Scanner;
public class MinimumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внеси прв број:");
        double broj1 = scanner.nextDouble();
        System.out.println("Внеси втор број:");
        double broj2 = scanner.nextDouble();
        System.out.println("Внеси трет број:");
        double broj3 = scanner.nextDouble();
        // Повикај го методот за наоѓање најмалиот број
        double najmali = najdiNajmali(broj1, broj2, broj3);
        System.out.println("Најмалиот број е: " + najmali);
   scanner.close();
    }
    // Метод за наоѓање најмалиот број помеѓу три броеви
    public static double najdiNajmali(double a, double b, double c) {
        return Math.min(Math.min(a, b), c); 
}
}
