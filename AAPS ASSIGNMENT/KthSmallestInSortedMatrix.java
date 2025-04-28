/*
15. Find the k-th smallest element in a sorted matrix.
    Write its algorithm, program. Find its time and space complexities.
    Explain with suitable example.
*/

import java.util.PriorityQueue;

public class KthSmallestInSortedMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int[] row : matrix) {
            for (int num : row) {
                minHeap.offer(num);
            }
        }
        
        while (k > 1) {
            minHeap.poll();
            k--;
        }
        
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println("Kth Smallest Element: " + kthSmallest(matrix, k));
    }
}

/*
Time Complexity: O(n^2 log n)
Space Complexity: O(n^2)

Example:
Input: 
[
 [1, 5, 9],
 [10, 11, 13],
 [12, 13, 15]
], k = 8
Output: 13
*/
