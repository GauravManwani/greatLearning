package PairSum;

import PairSum.PairSum.Node;

public class Client {
	
	public static void main(String[] args) {
		Node root=null;
		PairSum pairSum=new PairSum();
		root=pairSum.insertData(root, 40);
		root=pairSum.insertData(root, 20);
		root=pairSum.insertData(root, 60);
		root=pairSum.insertData(root, 10);
		root=pairSum.insertData(root, 30);
		root=pairSum.insertData(root, 50);
		root=pairSum.insertData(root, 70);
		
		int sum=140;
		
		pairSum.findPairWithSum(root, sum);
	}

}
