package LabChapter6.SixDotForty;

import LabChapter6.ArrayUnsortedList;

/**
 * Created by nraley on 10/18/15.
 */
public class CarTest {


//    public double totalPrice(ArrayUnsortedList<Car> carList) {
//        carList.reset();
//        double price = 0;
//        for (int i = 0; i < carList.size(); i++) {
//            price += carList.getNext().getPrice();
//        }
//        return price;
//    }

    public static void main(String[] args) {
//        ArrayUnsortedList<Car> carList = new ArrayUnsortedList<Car>();
        ArrayUnsortedList carList = new ArrayUnsortedList();


        carList.add(new Car(1998, "Ford", "Fiesta", 19999.99));
        carList.add(new Car(2015, "Tesla", "Model S", 14999.99));
        carList.add(new Car(2008, "Audi", "R8", 68999.99));

        CarTest test = new CarTest();

        System.out.println(carList);
        System.out.println("Total price:");
        System.out.println(test.totalPrice(carList));
    }

    public double totalPrice(ArrayUnsortedList carList) {
        carList.reset();
        double price = 0;
        for (int i = 0; i < carList.size(); i++) {
            price += ((Car) carList.getNext()).getPrice();
        }
        return price;
    }
}
