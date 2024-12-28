import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class binaryTree {



    //preorder dfs
    public static void preorderDFS(TreeNode node) {
        if (node != null) {
        System.out.print(node.val + " ");
        preorderDFS(node.left);
        preorderDFS(node.right);
        }  
    }



    //inorder dfs
    public static void inorderDFS(TreeNode node){
        if(node != null){
            inorderDFS(node.left);
            System.out.print(node.val + " ");
            inorderDFS(node.right);
        }
    }



    //postorder dfs
    public static void postorderDFS(TreeNode node) {
        if(node!=null){
            postorderDFS(node.left);
            postorderDFS(node.right);
            System.out.print(node.val + " ");
        }
    }



    //bfs
    public static void BFS(TreeNode node){
        if(node == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size()!=0) {
            TreeNode currNode = queue.remove();
            System.out.print(currNode.val+ " ");
            if(currNode.left!=null){
                queue.add(currNode.left);
            }
            if(currNode.right!=null){
                queue.add(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        // Create the tree
        // Example:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        

        // System.out.println("Preorder Traversal:");
        // preorderDFS(root);

        // System.out.println("max depth of given tree is: "+maxDepth(root));
        
        // binaryTree binaryTree = new binaryTree();  // static keyword is not use in isBST function thats why we have to make object of it to call in main
        // int[] preorder = {3,9,20,15,7};
        // int[] inorder = {9,3,15,20,7};
        // TreeNode root1 = binaryTree.builTreeNode(preorder, inorder);
        // System.out.println("ans: ");
        // inorderDFS(root1);
        }
        
        
                // 1. maximum depth
            public static int maxDepth(TreeNode root){
                if(root == null) return 0;
                return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
            }
        
                // 2. validate Binary Search tree 
                Stack<Integer> stack = new Stack<>();
                public  boolean isBST(TreeNode root){
                    fillStack(root);
                    
                    while(!stack.isEmpty()){
                        int elem = stack.pop();
                        if(stack.isEmpty()){
                            return true;
                        }
                        if(elem<=stack.peek()){
                            return false;
                        }
                    }
                    return true;
                }
                public void fillStack(TreeNode root){
                    if(root != null){
                        fillStack(root.left);
                        stack.push(root.val);
                        fillStack(root.right);
                    }
                }
        
                // //3. symetric tree
                // public boolean isSymetric(TreeNode root){
                //     if(root == null){
                //         return true;
                //     }
                //     return helper(root.left, root.right);
                // }
                // public boolean helper(TreeNode left, TreeNode right){
                //     if(left == null && right==null){
                //         return true;
                //     }
                //     if(left == null || right==null){
                //          return false;
                //     }
                //     return helper(left.left, right.right) && helper(left.right, right.left);
                // }

        
                // 4. binary order level traversal
                public  List<List<Integer>> levelOrder(TreeNode root){
            List<List<Integer>> result = new ArrayList<>();
            if( root == null){
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> curr = new ArrayList<>();
                for(int i = 0; i<size; i++){
                    TreeNode currLevel = queue.poll();
                   curr.add(currLevel.val);
                   if(currLevel.left != null){
                    queue.add(currLevel.left);
                   }
                   if(currLevel.right != null){
                    queue.add(currLevel.right);
                   }
                }
                result.add(curr);
            }
            return result;
        }


        // // 5. convert sorted to BST
        // public TreeNode sortedArrayToBST(int[] nums){
        //     return helper(nums, 0, nums.length-1);
        // }
        // public TreeNode helper(int[] nums, int left, int right){
        //     if(left>right){
        //         return null;
        //     }
        //     int mid = left + (right-left)/2;
        //     TreeNode root = new TreeNode(nums[mid]);
        //     root.left = helper(nums, left, mid-1);
        //     root.right = helper(nums, mid+1, right);
        //     return root;
        // }


        // 6. binary zigzag order level traversal
        public  List<List<Integer>> ZigzagLevelOrder(TreeNode root){
            List<List<Integer>> result = new ArrayList<>();
            if( root == null){
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean isLeftToRight = true;               // flag is set for traversal
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> curr = new ArrayList<>();
                for(int i = 0; i<size; i++){
                    TreeNode currLevel = queue.poll();
                    if(isLeftToRight){
                        curr.add(currLevel.val);
                    }else{
                        curr.add(0, currLevel.val);  // add at 0th index
                    }
                   if(currLevel.left != null){
                    queue.add(currLevel.left);
                   }
                   if(currLevel.right != null){
                    queue.add(currLevel.right);
                   }
                }
                isLeftToRight = !isLeftToRight;
                result.add(curr);
            }
            return result;
        }


        // 7. construct a binary tree from preorder and inorder 
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        public TreeNode builTreeNode(int[] preorder, int[] inorder){
            for(int i = 0; i<inorder.length; i++){
                map.put(inorder[i], i);
            }
            return helper(preorder, 0, preorder.length-1);
        }
        public TreeNode helper(int[] preorder, int left, int right){
            if(left>right){
                return null;
            }
            int val = preorder[count++];
            TreeNode root = new TreeNode(val);
            root.left = helper(preorder, left, map.get(val)-1);
            root.right = helper(preorder,map.get(val)+1, right);
            return root;
        }

}
