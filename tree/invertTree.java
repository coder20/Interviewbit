package tree;
/*Given a binary tree, invert the binary tree and return it. 
Look at the example for more details.

Example : 
Given binary tree

     1
   /   \
  2     3
 / \   / \
4   5 6   7
invert and return

     1
   /   \
  3     2
 / \   / \
7   6 5   4
*/
public class invertTree {
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	 public TreeNode invertTree(TreeNode root) {
	        if(root == null){
	            return null;
	        }
	        
	        root.left = invertTree(root.left);
	        root.right =invertTree(root.right);
	        TreeNode temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	      
	        return root;
	    }

}
