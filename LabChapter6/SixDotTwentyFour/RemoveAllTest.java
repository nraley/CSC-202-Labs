package LabChapter6.SixDotTwentyFour;

/**
 * Created by nraley on 10/18/15.
 */
public class RemoveAllTest {
    public static void main(String[] args) {

        ArrayUnsortedListRemoveAll<Integer> test = new ArrayUnsortedListRemoveAll();

        for (int i = 0; i < 5; i++) {
            test.add(4);
            test.add(5);
        }
        System.out.println(test);
        System.out.println();
        System.out.println("Remove all '5's");
        System.out.println();
        System.out.println(test.removeAll(5));
        System.out.println();
        System.out.println(test);
    }
}
