//package LabChapters8and9.NineDotNine;
//
//import LabChapters8and9.Heap;
//import LabChapters8and9.PriQueueInterface;
//
///**
//* Created by nraley on 11/30/15.
//*/
//public class RecursiveReheapDown<T> extends Heap {
//
//    public RecursiveReheapDown(int maxSize) {
//        super(maxSize);
//    }
//
//    private void recReheapDown(T element) {
//
//    }
//
//    private void reheapDown(T element)
//    // Current root position is "empty";
//    // Inserts element into the tree and ensures shape and order properties.
//    {
//        int hole = 0;      // current index of hole
//        int newhole;       // index where hole should move to
//
//        newhole = newHole(hole, element);   // find next hole
//        while (newhole != hole)
//        {
//            elements.set(hole,elements.get(newhole));  // move element up
//            hole = newhole;                            // move hole down
//            newhole = newHole(hole, element);          // find next hole
//        }
//        elements.set(hole, element);           // fill in the final hole
//    }
//}
