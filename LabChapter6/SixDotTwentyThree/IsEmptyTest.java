package LabChapter6.SixDotTwentyThree;

/**
 * Created by nraley on 10/18/15.
 */
public class IsEmptyTest {
    public static void main(String[] args) {

        ArrayUnsortedListIsEmpty<Integer> test1 = new ArrayUnsortedListIsEmpty();
        ArrayUnsortedListIsEmpty test2 = new ArrayUnsortedListIsEmpty();

        test1.add(1);
        System.out.println(test1.isEmpty());
        System.out.println(test2.isEmpty());
    }
}
