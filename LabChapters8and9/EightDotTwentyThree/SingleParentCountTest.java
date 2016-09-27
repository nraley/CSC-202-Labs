package LabChapters8and9.EightDotTwentyThree;

/**
 * Created by nraley on 11/29/15.
 */
public class SingleParentCountTest {
    public static void main(String[] args) {

        BinarySearchTreeSingleParentCount<Integer> myTree = new BinarySearchTreeSingleParentCount<Integer>();

        myTree.add(5);
        myTree.add(4);
        myTree.add(3);
        myTree.add(6);
        myTree.add(2);
        myTree.add(8);
        myTree.add(9);

        System.out.println(myTree.singleParentCount());
    }
}
