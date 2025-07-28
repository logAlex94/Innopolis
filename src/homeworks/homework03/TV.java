package homeworks.homework03;

public class TV {
    private String brand;
    private int diagonal;
    private int  refreshRate;
    private double price;

    public TV(String brand, int diagonal, int refreshRate, double price) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.refreshRate = refreshRate;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", diagonal=" + diagonal +
                ", refreshRate=" + refreshRate +
                ", price=" + price +
                '}';
    }

    public TV changePrice(double newPrice) {
        this.price = newPrice;
        return this;


    }
}
