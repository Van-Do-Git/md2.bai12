package BST;

public class test {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        BinarySearchTree<Integer> tree2 = new BinarySearchTree<>();
        tree2.insert(18);
        tree2.insert(5);
        tree2.insert(5);
        tree2.insert(13);
        tree2.insert(4);
        tree2.inorder();
    }
}
