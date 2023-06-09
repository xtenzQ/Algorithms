# Merge K Sorted Lists Solution

![Hard difficulty](https://img.shields.io/badge/Difficulty-Hard-red.svg)
[![LeetCode](https://img.shields.io/badge/LeetCode-Link-gold?logo=leetcode)](https://leetcode.com/problems/merge-k-sorted-lists/)
[![LeetCode](https://img.shields.io/badge/Source%20Code-Link-blue?logo=github)](MergeKSortedLists.java)

| Time Complexity | Space Complexity |
|-----------------|------------------|
| \$O(N log k)$   | \$O(k)$          |

where \$N$ is the total number of nodes in all lists and \$k$ is the number of linked lists. Each insertion and extraction operation on the priority queue takes \$O(log k)$ time, and we perform \$N$ such operations.

## Data structure
We're gonna use `PriorityQueue<ListNode>` here. Here's why a priority queue is used:

- **Efficient Selection of the Smallest Element**: The priority queue allows us to efficiently select the smallest element among a collection of nodes. In this case, the smallest element refers to the node with the lowest value among the current heads of the linked lists. The priority queue ensures that the smallest element is always at the front of the queue, making it easy to retrieve using the `poll()` operation in \$O(log k)$ time. 
- **Maintaining Sorted Order**: By using a priority queue, we can maintain the sorted order of the linked lists while merging them. The priority queue automatically places the nodes in the correct order based on their values, as defined by the comparator used during initialization. This eliminates the need for manual comparisons and ensures that the nodes are processed in ascending order. 
- **Efficiently Handling Next Smallest Elements**: As we merge the linked lists, we need to consider the next smallest elements from each list after extracting the current smallest element. The priority queue allows us to efficiently insert the next nodes into the queue using the `offer()` operation. This ensures that the next smallest elements are readily available for selection during the merging process.
