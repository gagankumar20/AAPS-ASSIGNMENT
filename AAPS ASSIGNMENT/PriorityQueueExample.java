// Question 45:
// Explain the concept of priority queues and their applications in algorithm design.

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Creating a min-heap PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements into the PriorityQueue
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("Elements polled from the PriorityQueue:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

/*
Output:
Elements polled from the PriorityQueue:
5
10
20
30

Explanation:
- PriorityQueue is a special type of queue where elements are ordered based on their priority.
- In Java, by default, it is a Min-Heap (smallest element at the head).
- Applications:
  - Dijkstra's shortest path algorithm
  - Huffman encoding
  - CPU scheduling
  - A* search algorithm

Time Complexity:
- Insertion: O(log n)
- Deletion (polling the min element): O(log n)

Space Complexity:
- O(n), where n is the number of elements stored in the PriorityQueue.
*/