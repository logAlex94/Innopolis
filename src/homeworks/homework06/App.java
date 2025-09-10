package homeworks.homework06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String personsInput = scanner.nextLine();
        String[] personsInputParts = personsInput.split(";");
        Person[] persons = new Person[personsInputParts.length];

        for (int i = 0; i < personsInputParts.length; i++) {
            String[] personsData = personsInputParts[i].split("=");
            String name = personsData[0].trim();
            Double money = Double.parseDouble(personsData[1].trim());
            persons[i] = new Person(name, money);
        }

        String productsInput = scanner.nextLine();
        String[] productsInputParts = productsInput.split(";");
        Product[] products = new Product[productsInputParts.length];

        for (int i = 0; i < productsInputParts.length; i++) {
            String[] productsData = productsInputParts[i].split("=");
            String name = productsData[0].trim();
            Double price = Double.parseDouble(productsData[1].trim());
            products[i] = new Product(name, price);
        }

        while (true) {
            String purchase = scanner.nextLine();
            if (purchase.equalsIgnoreCase("END")) {
                break;
            }
            String[] purchaseParts = purchase.split("-");
            String personName = purchaseParts[0];
            String productName = purchaseParts[1];

            Person person = findPersonByName(persons, personName);
            Product product = findProductByName(products, productName);
            if (person != null && product != null) {
                person.addProduct(product);
            }
        }
        for (Person person : persons) {
            System.out.println(person.toString().replace("[", "").replace("]", ""));
        }

    }

    private static Person findPersonByName(Person[] persons, String name) {
        for (Person person : persons) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    private static Product findProductByName(Product[] products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
