// Node class: represents a node in a linked list.
// Stores an integer (e.g., a floor number) and a pointer to the next node.
public class Node {
    int data;     // floor number
    Node next;    // pointer to the next node

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
