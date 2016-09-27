package LabChapters8and9.EightDotSixteen;

import LabChapter6.Golfer;
import LabChapters8and9.BSTInterface;
import LabChapters8and9.BinarySearchTree;

/**
* Created by nraley on 11/27/15.
*/
public class BinarySearchTreeMinTest {

    public static void main(String[] args) {

        BinarySearchTree<Golfer> myTree = new BinarySearchTree<Golfer>();

        myTree.add(new Golfer("Bob", 4));
        myTree.add(new Golfer("Joe", 3));
        myTree.add(new Golfer("Louis", 1));
        myTree.add(new Golfer("Steve", 2));
        myTree.add(new Golfer("Jon", 5));

        BinarySearchTreeMinTest myCountless = new BinarySearchTreeMinTest();
        System.out.println(myCountless.min(myTree));
    }

    Golfer min(BinarySearchTree<Golfer> tree) {

        int size = tree.reset(BSTInterface.INORDER);

        Golfer minimumGolfer = tree.getNext(BSTInterface.INORDER);

        return minimumGolfer;
    }
}