package driver;

import service.MergeSort;
import service.Rotate;
import service.Search;
import service.SelectionSort;

public class DriverClass {
	
	public static void main(String[] args) { 
//		int[] arr= {10,3,2,5,8,4,3,1,2,9,7,8};
		int[] arr= {3,4,2,1,9,8,7};
		
//		MergeSort.mergeSort(arr, 0, arr.length-1);
		SelectionSort.selectionSort(arr);
		System.out.println("SORTED");
		printArr(arr);
		int lengthArr=arr.length;
		int middle=(arr.length-1)/2;
		Rotate.rotateArr(arr, lengthArr-middle);
		System.out.println("");
		System.out.println("ROTATED");
		printArr(arr);
		System.out.println("");
		System.out.println("SEARCH");
		System.out.println(Search.search(arr, 8));
		
	}
	
	private static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	
	
//	Question (Problem solving)
//	Write a program to find the key element in sorted and rotated Array
	
//	Steps
//	1) Take input of an array n.
//	2) sort the array in nlogn(merge, quick) time complexity
//	3) Left Rotate the array by the mid element.
//	4) Write a program to search an element in time complexity O(logn)
	
//	Arr[] = { 3,4,2,1,9,8,7} // original array
//	Arr[] = {1,2,3,4,7,8,9} // sorted array // middleIndex=3, right=6, (right-middleIndex+1)=>4
				// 9,1,2,3,4,7,8
				// 8,9,1,2,3,4,7
				// 7,8,9,1,2,3,4
				// 4,7,8,9,1,2,3
//	Arr[] = {4,7,8,9,1,2,3} // rotated array
	
//	Key = 8
	
//	Output
//	Key found at position 2

}
