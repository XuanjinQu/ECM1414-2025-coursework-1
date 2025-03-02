public class PriorityQueueTest {
    public void testDirectionPriority() {
    public void testDirectionPriority() {
        PriorityQueue queue = new PriorityQueue();
        // the current lift direction is UP
        queue.insert(3, "UP");
        queue.insert(5, "DOWN");
        assertEquals(3, queue.extractMin("UP"));
        assertEquals(5, queue.extractMin("DOWN"));
    }

    @Test
    public void testDynamicUpdate() throws InterruptedException {
        PriorityQueue queue = new PriorityQueue();
        queue.insert(2, "UP");
        Thread.sleep(2000); // let the request wait 2 seconds
        queue.updatePriority(2, "UP", "UP"); // update priority
        // Suppose a new request is inserted at this point, but since request #2 is waiting longer, it has a higher priority
        queue.insert(4, "UP");
        assertEquals(2, queue.extractMin("UP"));
    }
}
