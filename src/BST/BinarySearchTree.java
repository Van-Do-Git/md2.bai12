package BST;

public class BinarySearchTree<E extends Comparable<E>> extends AbstracTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BinarySearchTree() {
    }

    public BinarySearchTree(E[] arrE) {
        for (int i = 0; i < arrE.length; i++)
            insert(arrE[i]);
    }

    @Override
    public boolean insert(E o) {
        if (root == null)
            root = createNewNode(o);
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (o.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (o.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (o.compareTo(parent.element) < 0)
                parent.left = createNewNode(o);
            else
                parent.right = createNewNode(o);
        }
        size++;
        return true;
    }

    public TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    public void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    public void postOrder() {
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.element + " ");
    }

    public void preOrder() {
        System.out.println(root.element + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public boolean searchBST(E e) {
        TreeNode<E> curentNode = root;
        while (curentNode != null) {
            if (e.compareTo(curentNode.element)>0){
                curentNode = curentNode.right;
            }else if (e.compareTo(curentNode.element)<0){
                curentNode = curentNode.left;
            }else return true;
        }
        return false;
    }
}

