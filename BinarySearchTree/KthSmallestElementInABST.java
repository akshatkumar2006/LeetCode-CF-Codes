package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int kthSmallest(TreeNode root, int k) {
			List<Integer> ll = new ArrayList<>();
			inorder(root, ll);
			return ll.get(k);
		}

		public void inorder(TreeNode node, List<Integer> ll) {
			// TODO Auto-generated method stub
			if(node == null) {
				return;
			}
			
			inorder(node.left, ll);
			ll.add(node.val);
			inorder(node.right, ll);
		}
	}
}
