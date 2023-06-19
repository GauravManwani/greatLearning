package service;

public class MergeSort {
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(right>left) {
			int middle=(left+right)/2; //left+((right-left)/2)
			mergeSort(arr,left,middle);
			mergeSort(arr,middle+1,right);
			merge(arr,left,middle,right);
		}
	}
	
	static void merge(int[] arr,int left, int middle, int right) {
	
		int[] leftTempArr=new int[middle-left+2];
		int[] rightTempArr=new int[right-middle+1];
		
		//insert data
		for(int i=0;i<=middle-left;i++) {
			leftTempArr[i]=arr[left+i];
		}
		//insert data
		for(int i=0;i<right-middle;i++) {
			rightTempArr[i]=arr[middle+1+i];
		}
		
		leftTempArr[middle-left+1]=Integer.MAX_VALUE;
		rightTempArr[right-middle]=Integer.MAX_VALUE;
		
		//two pointer check
		int i=0,j=0;
		
		for(int k=left;k<=right;k++) {
			if(leftTempArr[i]<rightTempArr[j]) {
				arr[k]=leftTempArr[i];
				i++;
			}else {
				arr[k]=rightTempArr[j];
				j++;
			}
		}
	
	}

}
