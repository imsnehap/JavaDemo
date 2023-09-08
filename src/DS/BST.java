package DS;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        private static Node insert(Node root, int val) {
            if (root == null) {
                root = new Node(val);
                System.out.print("\nRootNode null:: " + root.data);
                return root;
            }
            if (val < root.data) {
                System.out.print("\nleft:: " + root.data);
                root.left = insert(root.left, val);
            } else {
                System.out.print("\nright:: " + root.data);
                root.right = insert(root.right, val);
            }
            System.out.print("\n RootNode:: " + root.data);
            return root;
        }

        private static boolean search(Node root, int value) {
            if (root == null) {
                return false;
            }
            if (value < root.data) {
                return search(root.left, value);
            } else if (root.data == value) {
                return true;
            } else {
                return search(root.right, value);
            }
        }

        private static Node delete(Node root, int val) {
            if (root == null) {
                return null;
            }
            if (val < root.data) {
                root.left = delete(root.left, val);
            } else if (root.data < val) {
                root.right = delete(root.right, val);
            } else {
                if (root.left == null && root.right == null) {
                    return null;
                } else if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
                    Node IS = inOrderSuccesser(root.right);
                    root.data = IS.data;
                    root.right = delete(root.right, IS.data);
                }
            }
            return root;
        }

        private static Node inOrderSuccesser(Node node) {

            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        private static void inOrderTraveser(Node root) {
            if (root == null) {
                return;
            }
            inOrderTraveser(root.left);
            System.out.print(root.data + " ");
            inOrderTraveser(root.right);
        }

        public static void main(String args[]) {
            int[] values = {5, 1, 3, 4, 6, 8, 7};
            Node root = null;

            for (int i = 0; i < values.length; i++) {
                System.out.print("\n Insert started ==> " + values[i]);
                root = insert(root, values[i]);
            }
            System.out.println();

            inOrderTraveser(root);
            delete(root, 9);
            System.out.println();
            inOrderTraveser(root);

        }
    }
}
