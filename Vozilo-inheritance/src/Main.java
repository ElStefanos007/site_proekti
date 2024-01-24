public class Main {
    public static void main(String[] args) {
        Avtomobil avtomobil = new Avtomobil(100, 50.0, 4);
        System.out.println("Avtomobil Brzina: " + avtomobil.getSpeed());
        System.out.println("Avtomobil Kapacitet na Gorivo: " + avtomobil.getFuelCapacity());
        System.out.println("Avtomobil Broj Na Vrati: " + avtomobil.getNumberOfDoors());
        avtomobil.start();
    }
}