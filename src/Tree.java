public class Tree {

    TreeNode root;

    public void addTreeNode(int key, String name) {
        TreeNode newTreeNode = new TreeNode(key, name);
        if(root == null) {
            root = newTreeNode;
        } else {
            TreeNode focusTreeNode = root;
            TreeNode parent;
            while (true){
                parent = focusTreeNode;

                if(key < focusTreeNode.key) {
                    focusTreeNode = focusTreeNode.leftChild;
                    if(focusTreeNode == null) {
                        parent.leftChild = newTreeNode;
                        return;
                    }
                } else {
                    focusTreeNode = focusTreeNode.rightChild;
                    if(focusTreeNode == null) {
                        parent.rightChild = newTreeNode;
                        return;
                    }
                }
            }
        }
    }

}
