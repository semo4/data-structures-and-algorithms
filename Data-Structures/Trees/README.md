# Trees


## Challenge
- Create a Node class that has properties for the value stored in the node,the left child node, and the right child node.
- Create a BinaryTree class
- Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
- Create a BinarySearchTree class
- Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
- Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
- For depth first traversals, I use recursion to traverse and ArrayList to store my values in the specified order. 
- Preorder traversal requires me to add the current node value to the ArrayList first and recurse through the left node of the current node then recurse through the right. 
- Inorder would have me recurse through the left node first then add the value to the ArrayList then recurse through the right. 
- PostOrder is recursing through both the left and right first then add the value to the ArrayList. 
- All traversals would take O(n) time and space since every values in the binary tree would have to be visited and we are storing those values in an ArrayList.

- Adding node to Binary Search Tree is fairly straightforward. Starting at the root, check first the node is null. If it is, then the current node will be the new node that contains the input value. If not, then check if the value that you want to add is less than or greater than the current node's value. Go down tree either left or right depends on if the value is less than or greater than and recursively repeat the process.

- Searching is as straightforward since you are doing the same thing but at each node, you are checking if the node's value is equal to the input value. Otherwise just go left or right depending of if the value is less than or greater than. If you hit a node that is null, then that means the value is not in the tree so return false. Searching and adding would takes O(log(n)).
## API
### Binary Tree

- void add(int value) - takes in a value and randomly choose a spot on the tree to store the value.
- ArrayList<Integer> preOrder() - perform preOrder traversal and return an ArrayList of values in preOrder order.
- ArrayList<Integer> inOrder() - perform preOrder traversal and return an ArrayList of values in preOrder order.
- ArrayList<Integer> postOrder() - perform preOrder traversal and return an ArrayList of values in preOrder order.

### Binary Search Tree

- void add(int value) - takes in a value and add the value in the correct spot in BST.
- boolean contains(int value) - search the tree if the value is in the tree. Return true or false.