package ccInterview;

import ccInterview.MyTree.TreeNode;

//Problem Statement: Given a stored array with unique integer elements, write an algorithm to create 
//a binary search tree with minimum height
public class MinimalTree {
 static MyTree tree = new MyTree();
 static int[] arr = {2,4,6,7,8,12,15,18,19,23};
	public static void main(String[] args) {	 
		tree.root = insertBSTNodes(0, arr.length-1);
		inOrderTraversal(tree.root);
	}

	static void inOrderTraversal(TreeNode node) {
		if(node != null){
		inOrderTraversal(node.left);
		visit(node);
		inOrderTraversal(node.right);
		}
	}
	static void visit(TreeNode node){
		System.out.print(node.value+ " ");
	}

	private static MyTree.TreeNode insertBSTNodes(int start, int end) {
		if(end<start) return null;
		int mid = (start+end)/2;
		MyTree.TreeNode node = new MyTree.TreeNode(arr[mid]);
		node.left = insertBSTNodes(start, mid-1);
		node.right = insertBSTNodes(mid+1, end);
		return node;
	}
	
}
class MyTree{
	TreeNode root;
	MyTree(){
		root = null;
	}
 static class TreeNode{
	 int value;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int value){
		 this.value = value;
	 }
 }
}