public class TRAVESSIA {

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

        if (value < root.value) root.left = insert(root.left, value);
        else if (value > root.value) root.right = insert(root.right, value);

        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
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

        for (int v : valores) root = insert(root, v);

        System.out.println("=== Árvore atual ===");
        printTree(root, "", false);

        System.out.print("\nIn-Order (ordenado): ");
        inorder(root);

        System.out.print("\nPre-Order: ");
        preorder(root);

        System.out.print("\nPost-Order: ");
        postorder(root);
    }
}
