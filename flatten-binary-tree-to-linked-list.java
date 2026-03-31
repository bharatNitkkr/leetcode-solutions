
class Solution {
    public void flatten(TreeNode root) {

        if(root==null) return;
        if(root.right==null && root.left==null) return;


        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;
        flatten(leftTree);
        flatten(rightTree);
        root.right = leftTree;
        if(leftTree!=null){

            TreeNode temp = leftTree;

             while(temp.right!=null){
              temp=temp.right;
        
             }
         temp.right = rightTree;
        }

        else{
            root.right = rightTree;
        }

        root.left = null;

    
    }
}
