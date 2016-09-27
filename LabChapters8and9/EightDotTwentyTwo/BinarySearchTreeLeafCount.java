package LabChapters8and9.EightDotTwentyTwo;

import LabChapters8and9.BSTNode;
import LabChapters8and9.BinarySearchTree;

/**
 * Created by nraley on 11/27/15.
 */
public class BinarySearchTreeLeafCount<T> extends BinarySearchTree {

    public int leafCount() {
        return recLeafCount(root);
    }

    int recLeafCount(BSTNode node) {
        int count = 0;

        if (node.getLeft() == null && node.getRight() == null)
            count++;
        if (node.getLeft() != null)
            count += recLeafCount(node.getLeft());
        if (node.getRight() != null)
            count += recLeafCount(node.getRight());

        return count;
    }
}
