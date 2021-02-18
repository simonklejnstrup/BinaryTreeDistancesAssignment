package demo;

public class Main {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        Node node = new Node(0, "Aarhus");

        bt.add(0, "Aarhus");
        bt.add(118, "Aalborg");
        bt.add(154, "Aabenraa");
        bt.add(61, "Viborg");
        bt.add(71, "Vejle");
        bt.add(178, "Tønder");

        bt.traverseInOrder(node);

    }


}
