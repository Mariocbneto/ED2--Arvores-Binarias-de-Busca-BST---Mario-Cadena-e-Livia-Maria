public class INSERCAO {

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.value)
            root.left = insert(root.left, value);
        else if (value > root.value)
            root.right = insert(root.right, value);

        return root;
    }

 
    static void printTree(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            printTree(root.right, prefix + "     ", false);
            System.out.println(prefix + (isLeft ? "└── " : "┌── ") + root.value);
            printTree(root.left, prefix + "     ", true);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        int[] valores = {8, 3, 10, 1, 6};

        System.out.println("=== INSERÇÃO NA BST ===");

        for (int v : valores) {
            System.out.println("\nInserindo: " + v);

            System.out.println("\nÁrvore ANTES:");
            printTree(root, "", false);

            root = insert(root, v);

            System.out.println("\nÁrvore DEPOIS:");
            printTree(root, "", false);
        }
    }
}
