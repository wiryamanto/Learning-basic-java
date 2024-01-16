import java.util.ArrayList;
import java.util.Random;

public class PomBensinApp {

    static ArrayList<Integer> pertaliteSales = new ArrayList<>();
    static ArrayList<Integer> pertamaxSales = new ArrayList<>();
    static ArrayList<Integer> pertamaxTurboSales = new ArrayList<>();
    static ArrayList<Integer> pertadexSales = new ArrayList<>();

    static int pertaliteStock = 2000;
    static int pertamaxStock = 2500;
    static int pertamaxTurboStock = 1700;
    static int pertadexStock = 2800;

    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int pertaliteSold = random.nextInt(100);
            int pertamaxSold = random.nextInt(100);
            int pertamaxTurboSold = random.nextInt(100);
            int pertadexSold = random.nextInt(100);

            updateSales(pertaliteSold, pertamaxSold, pertamaxTurboSold, pertadexSold);
            displaySalesAndStock();

            try {
                Thread.sleep(3000); // Pause for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void updateSales(int pertaliteSold, int pertamaxSold, int pertamaxTurboSold, int pertadexSold) {
        pertaliteSales.add(pertaliteSold);
        pertamaxSales.add(pertamaxSold);
        pertamaxTurboSales.add(pertamaxTurboSold);
        pertadexSales.add(pertadexSold);

        pertaliteStock -= pertaliteSold;
        pertamaxStock -= pertamaxSold;
        pertamaxTurboStock -= pertamaxTurboSold;
        pertadexStock -= pertadexSold;
    }

    static void displaySalesAndStock() {
        System.out.println("===== Penjualan dan Stok Bahan Bakar =====");
        System.out.println("Pertalite: " + pertaliteSales + " | Stok: " + pertaliteStock);
        System.out.println("Pertamax: " + pertamaxSales + " | Stok: " + pertamaxStock);
        System.out.println("Pertamax Turbo: " + pertamaxTurboSales + " | Stok: " + pertamaxTurboStock);
        System.out.println("Pertadex: " + pertadexSales + " | Stok: " + pertadexStock);
        System.out.println("=========================================");
    }
}
