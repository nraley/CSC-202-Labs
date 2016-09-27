package LabChapter6.SixDotFiftyFive;

/**
 * Created by nraley on 10/18/15.
 */
public class Test {
    public static void main(String[] args) {
        RefUnsortedListEndInsert test = new RefUnsortedListEndInsert();

        for (int i = 2; i <= 5; i++) {
            test.add(i);
        }
        test.endInsert(1);
        System.out.println(test);
    }
}
