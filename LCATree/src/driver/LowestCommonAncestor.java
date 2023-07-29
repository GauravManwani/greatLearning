package driver;

import TreeNode.TreeNode;

//1: cur==p or cur==q
//2: p==left q=right
//3: p and q both on left or right
//4: p and q not exists
public class LowestCommonAncestor {
	
	public TreeNode lca(TreeNode root, int p, int q) {
		if(root==null || p==root.val || q==root.val) {
			return root;
		}
		
		TreeNode left=lca(root.left,p,q);
		TreeNode right=lca(root.right,p,q);
		
		if(left==null) {
			return right;
		}else if(right == null) {
			return left;
		}else {
			return root;
		}
		
	}
	
	public static void main(String args[]) {
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(4);
		node.left.right=new TreeNode(5);
		node.left.right.left=new TreeNode(6);
		node.left.right.right=new TreeNode(7);
		
		node.right.left=new TreeNode(8);
		node.right.right=new TreeNode(9);
		LowestCommonAncestor lowestCommonAncestor=new LowestCommonAncestor();
		int p=2;
		int q=7;
		TreeNode returnNode=lowestCommonAncestor.lca(node,p,q);
		System.out.print("LCA of "+p+" And "+q+" is: "+returnNode.val);
	}

}
