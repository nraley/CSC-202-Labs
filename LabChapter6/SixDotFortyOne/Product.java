package LabChapter6.SixDotFortyOne;

import java.util.Comparator;

/**
 * Created by nraley on 10/18/15.
 */
public class Product implements Comparable<Product> {

    String description;

    public double getPrice() {
        return price;
    }

    double price;
    Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() < o.getPrice()) {
            return -1;
        } else if (this.getPrice() == o.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
