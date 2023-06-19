package service;

public class Search {
	
	public static int search(int[] arr,int key) {
		int start=0,end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>=arr[start]) {
				if(key>=arr[start] && key<arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
			else {
				if(key<=arr[end] && key>arr[mid]) {
					start=mid+1;
				}
			}
			
		}
		return -1;
	}

}
