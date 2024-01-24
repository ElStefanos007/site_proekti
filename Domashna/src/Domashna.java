import java.util.Scanner; 
public class Domashna {
	public static void main(String[] args) {
	Scanner tastatura = new Scanner(System.in);
    double strana, povrsina, perimetar;
	System.out.println("Ovaa programa presmetuva povrsina i perimetar na osmoagolnik.");
	System.out.print("Vnesi ja dolzinata na stranite na osmoagolnikot: ");
    strana = tastatura.nextDouble();
    povrsina = 2*(1+1.41)*strana*strana;
    perimetar = 8*strana;
    System.out.println("Povrsina na osmoagolnik: " + povrsina);
    System.out.println("Perimetar na osmoagolnik: " + perimetar);
	}

}