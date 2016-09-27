package LabChapter6.SixDotFiftyOne;

/**
 * Created by nraley on 10/18/15.
 */
public class Test {
    public static void main(String[] args) {
        RefUnsortedListRemoveAll test = new RefUnsortedListRemoveAll();

        for (int i = 0; i < 5; i++) {
            test.add(1);
            test.add(2);
        }
        System.out.println(test);
        test.removeAll(2);
        System.out.println(test);
    }
}
