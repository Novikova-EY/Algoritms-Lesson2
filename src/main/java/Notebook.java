import java.util.Arrays;
import java.util.Random;

public class Notebook {
    private static final Random random = new Random();
    private final int price;
    private final int ram;
    private final String brand;
    private final String[] arrBrand = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

    public Notebook() {
        this.price = getRandomPrice();
        this.ram = getRandomRam();
        this.brand = getRandomBrand();
    }

    private int getRandomPrice() {
        int priceMin = 500;
        int priceMax = 3000;
        int priceStep = 50;
        return (random.nextInt((priceMax - priceMin + 1)) % priceStep * priceStep) + priceMin;
    }

    private int getRandomRam() {
        int ramMin = 4;
        int ramMax = 24;
        int ramStep = 4;
        return (random.nextInt(ramMax - ramMin + 1) % ramStep * ramStep) + ramMin;
    }

    private String getRandomBrand() {
        return arrBrand[random.nextInt(arrBrand.length)];
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getBrand() {
        return Arrays.asList(arrBrand).indexOf(brand);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                '}' +
                "\n";
    }

    public boolean compareTo(Notebook n) {
        if (this.price > n.getPrice()) {
            return true;
        } else if (this.price == n.getPrice()) {
            if (this.ram > n.getRam()) {
                return true;
            } else if (this.ram == n.getRam()) {
                if (Arrays.asList(arrBrand).indexOf(brand) > n.getBrand()) {
                    return true;
                }
            }
        }
        return false;
    }
}
