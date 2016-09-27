package LabChapter6.SixDotFortyOne;

import LabChapter6.ArraySortedList;

import java.util.Scanner;
/**
 * Created by nraley on 10/18/15.
 */
public class Countries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArraySortedList<String> countryList = new ArraySortedList<String>();
        boolean done = false;
        while (!done) {
            System.out.println("Enter a country or '0' to end: ");
            String country = scanner.nextLine();
            if (country.equals("0")) {
                done = true;
            } else if (!countryList.contains(country)) {
                countryList.add(country);
            }
        }
        System.out.println(countryList);
    }
}
