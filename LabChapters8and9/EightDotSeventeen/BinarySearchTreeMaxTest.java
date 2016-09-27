package LabChapters8and9.EightDotSeventeen;

import LabChapter6.Golfer;
import LabChapters8and9.BSTInterface;
import LabChapters8and9.BinarySearchTree;

/**
 * Created by nraley on 11/27/15.
 */
public class BinarySearchTreeMaxTest {

    public static void main(String[] args) {

        BinarySearchTree<Golfer> myTree = new BinarySearchTree<Golfer>();

        myTree.add(new Golfer("Bob", 4));
        myTree.add(new Golfer("Jon", 5));
        myTree.add(new Golfer("Joe", 3));
        myTree.add(new Golfer("Louis", 1));
        myTree.add(new Golfer("Steve", 2));

        BinarySearchTreeMaxTest myCountless = new BinarySearchTreeMaxTest();
        System.out.println(myCountless.max(myTree));
    }

    Golfer max(BinarySearchTree<Golfer> tree) {

        int size = tree.reset(BSTInterface.INORDER);

        Golfer maximumGolfer = tree.getNext(BSTInterface.INORDER);

        for (int i = 1; i < size; i++) {

            Golfer next = tree.getNext(BSTInterface.INORDER);

            if (next.getScore() > maximumGolfer.getScore()) {
                maximumGolfer = next;
            }
        }

        return maximumGolfer;
    }
}
