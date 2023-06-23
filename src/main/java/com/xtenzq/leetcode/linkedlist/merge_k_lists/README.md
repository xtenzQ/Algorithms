# Merge K Sorted Lists

| Approach                      | Time Complexity | Space Complexity |
|-------------------------------|-----------------|------------------|
| Priority Queue               | \$O(N log k)$   | \$O(k)$          |

## Data structure
We're gonna use `PriorityQueue<ListNode>` here. Here's why a priority queue is used:

- **Efficient Selection of the Smallest Element**: The priority queue allows us to efficiently select the smallest element among a collection of nodes. In this case, the smallest element refers to the node with the lowest value among the current heads of the linked lists. The priority queue ensures that the smallest element is always at the front of the queue, making it easy to retrieve using the `poll()` operation in \$O(log k)$ time. 
- **Maintaining Sorted Order**: By using a priority queue, we can maintain the sorted order of the linked lists while merging them. The priority queue automatically places the nodes in the correct order based on their values, as defined by the comparator used during initialization. This eliminates the need for manual comparisons and ensures that the nodes are processed in ascending order. 
- **Efficiently Handling Next Smallest Elements**: As we merge the linked lists, we need to consider the next smallest elements from each list after extracting the current smallest element. The priority queue allows us to efficiently insert the next nodes into the queue using the `offer()` operation. This ensures that the next smallest elements are readily available for selection during the merging process.
