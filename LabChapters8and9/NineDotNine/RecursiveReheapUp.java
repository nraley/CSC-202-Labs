//package LabChapters8and9.NineDotNine;
//
//import LabChapters8and9.Heap;
//
///**
//* Created by nraley on 11/30/15.
//*/
//public class RecursiveReheapUp<T> extends Heap {
//
//    public RecursiveReheapUp(int maxSize) {
//        super(maxSize);
//    }
//
//    private void recReheapUp(T element) {
////        int hole = lastIndex;
////        while ((hole > 0)    // hole is not root and element > hole's parent
////                &&
////                (element.compareTo(elements.get((hole - 1) / 2)) > 0))
////        {
////            // move hole's parent down and then move hole up
////            elements.set(hole,elements.get((hole - 1) / 2));
////            hole = (hole - 1) / 2;
////        }
////        elements.set(hole, element);  // place element into final hole
//    }
//
//    private void reheapUp(T element)
//    // Current lastIndex position is empty.
//    // Inserts element into the tree and ensures shape and order properties.
//    {
//        int hole = lastIndex;
//        while ((hole > 0)    // hole is not root and element > hole's parent
//                &&
//                (element.compareTo(elements.get((hole - 1) / 2)) > 0))
//        {
//            // move hole's parent down and then move hole up
//            elements.set(hole,elements.get((hole - 1) / 2));
//            hole = (hole - 1) / 2;
//        }
//        elements.set(hole, element);  // place element into final hole
//    }
//}
