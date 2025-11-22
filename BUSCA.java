public class BUSCA {

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

    static boolean search(Node root, int value) {
        if (root == null) return false;
        if (value == root.value) return true;

        return value < root.value
                ? search(root.left, value)
                : search(root.right, value);
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

        int procurar = 6;
        System.out.println("\nBuscando " + procurar + "...");
        System.out.println(search(root, procurar)
                ? "Valor encontrado na árvore!"
                : "Valor NÃO está na árvore.");
    }
}
