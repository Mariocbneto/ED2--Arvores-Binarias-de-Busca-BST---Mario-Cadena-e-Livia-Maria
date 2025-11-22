import java.util.Random;
import java.util.Scanner;

public class ComparacaoBST {

   
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    
    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        
        return root;
    }

    
    static boolean searchBST(Node root, int target) {
        if (root == null) return false;
        if (target == root.value) return true;
        if (target < root.value) {
            return searchBST(root.left, target);
        } else {
            return searchBST(root.right, target);
        }
    }

    
    static boolean buscaLinear(int[] dados, int target) {
        for (int v : dados) {
            if (v == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final int N = 1_000_000;   
        final int REPETICOES = 50; 

        System.out.println("Gerando " + N + " números aleatórios...");
        int[] dados = new int[N];
        Random rand = new Random(42); 

        Node raiz = null;

        
        for (int i = 0; i < N; i++) {
            int valor = rand.nextInt(10_000_000); 
            dados[i] = valor;
            raiz = insert(raiz, valor);
        }

        System.out.println("Dados carregados!");

        
        int target = dados[N / 2];
        System.out.println("\nValor a ser procurado: " + target);

      
        System.out.println("\n=== BUSCA LINEAR NA LISTA ===");
        long inicioLista = System.nanoTime();
        boolean achouLista = false;
        for (int i = 0; i < REPETICOES; i++) {
            achouLista = buscaLinear(dados, target);
        }
        long fimLista = System.nanoTime();

        double tempoTotalListaMs = (fimLista - inicioLista) / 1_000_000.0;
        double tempoMedioListaMs = tempoTotalListaMs / REPETICOES;

        System.out.println("Achou na lista? " + achouLista);
        System.out.printf("Tempo TOTAL lista (repetindo %d vezes): %.3f ms%n",
                REPETICOES, tempoTotalListaMs);
        System.out.printf("Tempo MÉDIO por busca (lista): %.3f ms%n",
                tempoMedioListaMs);

        System.out.println("\n>>> Pressione ENTER para fazer a mesma busca na BST...");
        scanner.nextLine();

       
        System.out.println("\n=== BUSCA NA ÁRVORE BINÁRIA DE BUSCA (BST) ===");
        long inicioBST = System.nanoTime();
        boolean achouBST = false;
        for (int i = 0; i < REPETICOES; i++) {
            achouBST = searchBST(raiz, target);
        }
        long fimBST = System.nanoTime();

        double tempoTotalBSTMs = (fimBST - inicioBST) / 1_000_000.0;
        double tempoMedioBSTMs = tempoTotalBSTMs / REPETICOES;

        System.out.println("Achou na BST? " + achouBST);
        System.out.printf("Tempo TOTAL BST (repetindo %d vezes): %.3f ms%n",
                REPETICOES, tempoTotalBSTMs);
        System.out.printf("Tempo MÉDIO por busca (BST): %.3f ms%n",
                tempoMedioBSTMs);

        scanner.close();
    }
}
