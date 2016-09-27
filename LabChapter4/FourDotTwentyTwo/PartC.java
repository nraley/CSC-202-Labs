package LabChapter4.FourDotTwentyTwo;

/**
 * Created by nraley on 10/17/15.
 */
public class PartC {

    public static void main(String[] args) {
        PartC C = new PartC();

        System.out.println(C.isPalindrome("abba"));
        System.out.println(C.isPalindrome("kabookie"));
        System.out.println(C.isPalindrome("xox"));
    }

    public boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return true;
        }
//        char[] charArray = string.toCharArray();
//        if (charArray[0] == charArray[charArray.length - 1]) {
//            return isPalindrome(string.substring(1, (string.length() - 1)));
//        } else {
//            return false;
//        }
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return isPalindrome(string.substring(1, (string.length() - 1)));
        } else {
            return false;
        }
    }
}
