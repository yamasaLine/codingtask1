# CodingTask1 Tree Level Tranversal
Given the **root** of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Note: Simple and basic Java collection classes are allowed to use, **but any tree classes from Jdk or other 3rd party libraries are forbidden to use**. You should use the class “TreeNode” provided below as your backbone tree class and complete Task1.
![image](https://user-images.githubusercontent.com/19356295/163707240-3faf49e7-c8e4-45a6-ade8-c4d70da7bb79.png)

Example inputs & outputs:
+	Input: root = [3,9,20,null,null,15,7]
  Output: [[3],[9,20],[15,7]]
+	Input: root = [1]
  Output: [[1]]
+	Input: root = []
  Output: []
  
Your Tasks:
+ Apply a TDD developing method, try to write tests for the class.
+ Make sure your UTs fail without empty implementation, and your UTs cover green cases and edge cases for the coding task
+ Complete the implementation for method: `public static List<List<Integer>> levelTranversal(TreeNode root)`.
+ Rerun your tests to make sure they all will pass.
