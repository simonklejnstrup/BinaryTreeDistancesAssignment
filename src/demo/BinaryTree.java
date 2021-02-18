package demo;

public class BinaryTree {
    Node root;

    public void add(int distance, String cityName) {
        root = addRecursive(root, distance, cityName);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(node.cityName + " " + node.distance);
            traverseInOrder(node.right);
        }
    }

    private Node addRecursive(Node current, int distance, String cityName) {
        if (current == null) {
            return new Node(distance, cityName);
        }

        if (distance < current.distance) {
            current.left = addRecursive(current.left, distance, cityName);
        } else if (distance > current.distance) {
            current.right = addRecursive(current.right, distance, cityName);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current, int distance) {
        if (current == null) {
            return false;
        }
        if (distance == current.distance) {
            return true;
        }
        return distance < current.distance
                ? containsNodeRecursive(current.left, distance)
                : containsNodeRecursive(current.right, distance);
    }

}
