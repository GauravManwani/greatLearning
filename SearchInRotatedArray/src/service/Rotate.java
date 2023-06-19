package service;

public class Rotate {
	
	public static void rotateArr(int[] arr, int k) {
		k=k%arr.length; //4%7=> 4|| 4%3=> 1
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
		//timeComplexity=> O(n)
		//spaceComplexity=> O(1)
//		int temp,prv;
//		
//		for(int i=0;i<k;i++) {
//			prv=arr[arr.length-1];
//			for(int j=0;j<arr.length;j++) {
//				temp=arr[j];
//				arr[j]=prv;
//				prv=temp;
//			}
//		}
		
	}
	
	public static void reverse(int[] arr, int start, int end) {
		//reverse whole arr
		//reverse first k elements
		//reverse last n-k elements
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
