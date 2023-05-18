package day_5;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberofVerticestoReachAllNodes_1557 {
    // Problem Statement: https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
}

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>(); // Initialize the result list
        
        int[] inDegree = new int[n]; // Initialize the in-degree array
        
        for (List<Integer> edge : edges) {
            inDegree[edge.get(1)]++; // Update the in-degree of the destination vertex
        }
        
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                result.add(i); // Add the vertex to the result list if its in-degree is 0
            }
        }
        
        return result; // Return the result list
    }
}

// Complexity Analysis:
// Time Complexity: O(n + e), where n is the number of vertices and e is the number of edges
// Space Complexity: O(n), where n is the number of vertices

