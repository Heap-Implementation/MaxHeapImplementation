package com.kamaldwip.coding.heaps.max;

public class Main {

    public static void main(String[] args) {
	  HeapArrays heap = new HeapArrays(10);
	  heap.insert(80);
	  heap.insert(75);
	  heap.insert(60);
	  heap.insert(68);
	  heap.insert(55);
	  heap.insert(40);
	  heap.insert(52);
	  heap.insert(67);

	  System.out.println("********** Before Sorting ********** ");
	  heap.printHeap();
	  System.out.println("********** After Sorting ********** ");
	  heap.heapSort();
	  heap.printHeap();


	  //System.out.println(heap.peek());

//	  heap.delete(1);
//	  heap.printHeap();

//	  heap.delete(5);
//	  heap.printHeap();

//	  heap.delete(0);
//	  heap.printHeap();
//
//	  System.out.println(heap.peek());

    }
}
