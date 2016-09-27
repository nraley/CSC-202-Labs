package LabChapters8and9.EightDotTwentyThree;

import LabChapters8and9.BSTNode;
import LabChapters8and9.BinarySearchTree;

/**
 * Created by nraley on 11/29/15.
 */
public class BinarySearchTreeSingleParentCount<T> extends BinarySearchTree {

    public int singleParentCount() {
        return recSingleParentCount(root);
    }

    int recSingleParentCount(BSTNode node) {

        int count = 0;

        if ((node.getLeft() == null && node.getRight() != null) || (node.getLeft() != null && node.getRight() == null))
            count++;
        if (node.getLeft() != null)
            count += recSingleParentCount(node.getLeft());
        if (node.getRight() != null)
            count += recSingleParentCount(node.getRight());

        return count;
    }
}