public class FindDepth {
    public int maxDepth(TreeNode root) {
        return maxDepthHelper(root);
    }

    //[3,9,20]
    //[9,null, null]
    //[20, 15, 7]
    //1, 2
    public int maxDepthHelper(TreeNode node){
        if(node == null){ return 0;}
        int left = maxDepthHelper(node.left);
        int right = maxDepthHelper(node.right);
        return 1 + Math.max(left,right);
    }

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      @Override
      public String toString(){
          return "" + val;
      }
  }
    public static void main(String[] args){
        FindDepth fd = new FindDepth();
        TreeNode root = new TreeNode(3, new TreeNode(9,null,null), new TreeNode(20, new TreeNode(15,null,null), new TreeNode(7,null,null)));
       System.out.println(fd.maxDepth(root));
    }
}
