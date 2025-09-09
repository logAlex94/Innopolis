package homeworks.homework06;

import java.util.Objects;

public class Product {

    private String name;

    private Double price;

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Имя продукта не может быть пустым");
        }
    }

    public void setPrice(Double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Стоимость продукта не может быть отрицательной");
        }
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name;
    }

    public Product(String name, Double price) {
        this.setName(name);
        this.setPrice(price);
    }
}
