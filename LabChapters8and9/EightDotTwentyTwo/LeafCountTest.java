package LabChapters8and9.EightDotTwentyTwo;

/**
 * Created by nraley on 11/28/15.
 */
public class LeafCountTest {
    public static void main(String[] args) {
        BinarySearchTreeLeafCount<Integer> myTree = new BinarySearchTreeLeafCount<Integer>();

        myTree.add(4);
        myTree.add(3);
        myTree.add(2);
        myTree.add(7);
        myTree.add(9);
        myTree.add(5);

        System.out.println(myTree.leafCount());
    }
}
