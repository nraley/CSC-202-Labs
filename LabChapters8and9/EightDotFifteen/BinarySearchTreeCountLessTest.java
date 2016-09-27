package LabChapters8and9.EightDotFifteen;

import LabChapter6.Golfer;
import LabChapters8and9.BSTInterface;
import LabChapters8and9.BinarySearchTree;

/**
 * Created by nraley on 11/27/15.
 */
public class BinarySearchTreeCountLessTest {

    public static void main(String[] args) {

        BinarySearchTree<Golfer> myTree = new BinarySearchTree<Golfer>();

        myTree.add(new Golfer("Bob", 4));
        myTree.add(new Golfer("Joe", 3));
        myTree.add(new Golfer("Steve", 2));
        myTree.add(new Golfer("Jon", 5));
        myTree.add(new Golfer("Louis", 1));

        BinarySearchTreeCountLessTest myCountless = new BinarySearchTreeCountLessTest();
        System.out.println(myCountless.countLess(myTree, new Golfer("Max", 3)));

    }

    int countLess(BinarySearchTree<Golfer> tree, Golfer maxValue) {
        int count = 0;
        int size = tree.reset(BSTInterface.INORDER);

        for (int i = 0; i < size; i++) {
            if (tree.getNext(BSTInterface.INORDER).getScore() <= maxValue.getScore()) {
                count++;
            }
        }

        return count;
    }
}
