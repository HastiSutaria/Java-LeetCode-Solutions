class Solution {
	TreeNode newNode = new TreeNode(0);
	TreeNode temp = newNode;
	public TreeNode increasingBST(TreeNode root) {
		if(root==null) 
            return root;

		increasingBST(root.left);

		temp.right = root;
		temp = temp.right;
		root.left = null;

		increasingBST(root.right);
		return newNode.right;
	}
}