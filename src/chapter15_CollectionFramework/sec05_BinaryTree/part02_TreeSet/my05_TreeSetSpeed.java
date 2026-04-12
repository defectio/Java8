package chapter15_CollectionFramework.sec05_BinaryTree.part02_TreeSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class my05_TreeSetSpeed {

	//ArraySort() 와 TreeSet 성능 비교 -> TreeSet이 훨씬 빠름
	public static void main(String[] args) {
		long startTime;
		long endTime;
		long arrayTime;
		long treeSetTime;
		
		int[] array = new int[100];
		
		startTime = System.nanoTime();
		for(int i=0 ; i<100 ; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		Arrays.sort(array);
		for(int a : array) {
			System.out.println(a);
		}
		endTime = System.nanoTime();
		arrayTime = endTime - startTime;
		
		TreeSet<Integer> tree = new TreeSet<>();
		startTime = System.nanoTime();
		for(int i=0 ; i<100 ; i++) {
			tree.add((int) (Math.random() * 100) + 1);
		}
		Iterator<Integer> iterator = tree.iterator();
		while(!iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		endTime = System.nanoTime();
		treeSetTime = endTime - startTime;
		
		System.out.println("Array.sort() : "+arrayTime);
		System.out.println("TreeSet : "+treeSetTime);
		System.out.println(arrayTime > treeSetTime ? "TreeSet이 빠름 " : "Arrays.sort()가 빠름");
	}
}
