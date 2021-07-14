import java.util.ArrayList;
import java.util.List;

class leetcode145 {

    // 递归解法 二叉树后序遍历
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        inorder(root, res);
        return res;
    }

    private static void inorder(TreeNode node, List<Integer> res) {
        if (node == null) return;

        inorder(node.left, res);
        inorder(node.right, res);
        res.add(node.val);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode1.right = treeNode5;
        treeNode5.left = treeNode6;

        System.out.println(inorderTraversal(treeNode1));
    }

}