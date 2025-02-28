/**
 * Node class: represents a node in a linked list.
 * Each node stores an integer value (e.g., destination floor)
 * and a reference to the next node in the list.
 */
public class Node {
    int data;     // The data stored in the node (e.g., destination floor)
    Node next;    // Reference to the next node

    /**
     * Constructor: initializes the node with the provided data.
     * @param data The integer data to store in the node.
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
