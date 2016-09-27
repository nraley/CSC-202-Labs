package LabChapter4.FourDotTwentyTwo;

/**
* Created by nraley on 10/17/15.
*/
public class PartD {

    public static void main(String[] args) {
        PartD D = new PartD();

        System.out.println(D.isPalindromeNonRecursive("ana"));
        System.out.println(D.isPalindromeNonRecursive("lala"));
        System.out.println(D.isPalindromeNonRecursive("sasas"));
    }
    public boolean isPalindromeNonRecursive(String string) {
        if (string.length() < 2) {
            return true;
        }
        String x = string;
        while (x.length() > 1) {
            if (x.charAt(0) == x.charAt(x.length() - 1)) {
                x = x.substring(1, x.length() - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
