// base condition ---> if root is null return 0
// hypothesis     ---> fuction returns height from (left, right) subtree
// induction      ---> if root is not null then add 1 to the max height of (left, right) subtree


package Recursion;

public class HeightOfBinaryTree {
	
	static int height( Node root) {
		
		if(root == null) {
			return 0;
		} else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
}
