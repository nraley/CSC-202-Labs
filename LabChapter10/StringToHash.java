package LabChapter10;

/**
 * Created by nraley on 12/7/15.
 */

import java.util.Scanner;
public class StringToHash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to be converted to hash code, or 'end' to end: ");
        String value = scanner.next();
        while (!value.equals("end")) {
            System.out.println(value.hashCode());
            System.out.println("Enter a string to be converted to hash code, or 'end' to end: ");
            value = scanner.next();
        }
    }
}
