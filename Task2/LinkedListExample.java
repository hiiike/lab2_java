package Task2;

public class LinkedListExample {
    public static void main(final String[] args) {

        final Node node4 = new Node(7, null); //head
        final Node node3 = new Node(600, node4);
        final Node node2 = new Node(-98, node3);
        final Node node1 = new Node(3, node2);


        final LinkedList stack = new LinkedList(node1);

        stack.add(9);
        stack.print();

        for (final Object value : stack) {
            System.out.println(value + "  ");
        }

        System.out.println("size =" + stack.size());

    }
}
