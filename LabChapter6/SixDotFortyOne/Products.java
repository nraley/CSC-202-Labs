package LabChapter6.SixDotFortyOne;

import LabChapter6.ArraySortedList;

import java.util.Scanner;
/**
 * Created by nraley on 10/18/15.
 */
public class Products {
    public static void main(String[] args) {

        ArraySortedList<Product> myList = new ArraySortedList<Product>();

        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (true) {
            System.out.println("Enter a product description or '0' to end: ");
            String description = scanner.nextLine();
            if (description.equals("0")) {
                break;
            }
            System.out.println("Enter a product cost: ");
            double cost = scanner.nextDouble();
            scanner.nextLine();
            myList.add(new Product(description, cost));
        }

        while(true) {
            System.out.println("Enter a lower bound for price range ('-1' to end): ");
            double lowerBound = scanner.nextDouble();
            if (lowerBound == -1) {
                break;
            }
            System.out.println("Enter an upper bound for price range: ");
            double upperBound = scanner.nextDouble();

            myList.reset();
            for (int i = 0; i < myList.size(); i++) {
                Product p = myList.getNext();
                if (p.getPrice() >= lowerBound && p.getPrice() <= upperBound) {
                    System.out.println(p);
                }
            }
            System.out.println();
        }
    }
}
