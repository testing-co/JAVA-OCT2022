/****
 * Class to represent a Node in a Binary Search Tree (BST).
 * The properties in the constructor are how this node is 
 * connected to other nodes to form the tree. 
 * Similar to .next in a SinglyLinkedList except a BST node can
 * be connected to two other nodes. To start, new nodes are not
 * connected to any other nodes, these properties will be set 
 * after the new node is instantiated.
  * Reference: http://btv.melezinek.cz/binary-search-tree.html
 */
 class BSTNode {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null; 
  }
}

/**
 * Represents an ordered tree of nodes where 
 * the data of left nodes are <= to their parent and
 * the data of nodes to the right are > their parent's data.
 */
class BinarySearchTree {
  constructor() {
    this.root = null;
  }
// ------------------------W2D1 ------------------------
/**
   * Determines if this tree is empty.
   * @returns {boolean} Indicates if this tree is empty.
   */
  isEmpty() {
    if (this.root === null) {
      return true
    }
    return false
  }
  /**
   * Retrieves the smallest integer data from this tree.
   * - Time: O(?).
   * - Space: O(?).
   * @param {Node} current is default as root of the tree
   *    the tree is being traversed.
   * @returns {number} The smallest integer from this tree.
   */
  min(current = this.root) {
    if(!current) return null
    while (current.left) {
      current = current.left;
    }
    return current.data
  }
          //         10
          //
          //   5          15
          //
          // 2   4     13   20
  /**
   * Retrieves the smallest integer data from this tree.
   * - Time: O(?).
   * - Space: O(?).
   * @param {Node} current is default as root of the tree
   *    the tree is being traversed.
   * @returns {number} The smallest integer from this tree.
   */
  // minRecursive(current = this.root) {
  //   if (current.left == null) {
  //     return current.data
  //   }
  //   return this.minRecursive(current.left);
  // }
  minRecursive(current = this.root) {
    if (current && current.left != null) {
      return this.minRecursive(current = current.left);
    }
    return current.data
  }
  /**
   * Retrieves the largest integer data from this tree.
   * - Time: O(?).
   * - Space: O(?).
   * @param {Node} current is default as root of the tree
   * @returns {number} The largest integer from this tree.
   */
  max(current = this.root) {
    while (current && current.right != null) {
      current = current.right;
    }
    return current.data;
  }

  /**
   * Retrieves the largest integer data from this tree.
   * - Time: O(?).
   * - Space: O(?).
   * @param {Node} current is default as root of the tree
   *    the tree is being traversed.
   * @returns {number} The largest integer from this tree.
   */
  maxRecursive(current = this.root) {
    if (current && current.right == null) {
      return current.data
    }
    return this.maxRecursive(current.right);
  }





  // ------------------------W2D2 ------------------------
  /**
   * Determines if this tree contains the given searchVal.
   * - Time: O(?).
   * - Space: O(?).
   * @param {number} searchVal : The number to search for
   * @returns {boolean} : Indicates if the searchVal was found.
   */
  contains(searchVal) {
    let current = this.root
    while(current != null){
      if (current.data == searchVal) {
        return true;
      }
      if (searchVal < current.data) {
        current = current.left
      }
      if (searchVal > current.data) {
        current = current.right
      }
    }
    return false;
  }
    
  /**
 * Determines if this tree contains the given searchVal.
 * - Time: O(?).
 * - Space: O(?).
 * @param {number} searchVal: The number to search for in the node's data.
 * @returns {boolean} : Indicates if the searchVal was found.
 */
  containsRecursive(searchVal, current = this.root) {
    if (!current){
      return false
    }
    if(searchVal == current.data){
        return true;
    }
    if(searchVal < current.data){
        return this.containsRecursive(searchVal, current.left)
    }
    if(searchVal > current.data){
        return this.containsRecursive(searchVal, current.right)
    }

  }


  /**
   * Calculates the range (max - min) from the given startNode.
   * - Time: O(?).
   * - Space: O(?).
   * @param {Node} startNode : The node to start from 
   * @returns {number|null} : The range of this tree or a sub tree 
   * depending on if the startNode is the root or not.
   *   
   */
    minRecursive(current = this.root) {
        if (current.left == null) return current.data
        return this.minRecursive(current.left);
    }
    maxRecursive(current = this.root) {
      if (current.right == null) return current.data
      return this.maxRecursive(current.right);
    }
  
  range(startNode = this.root) {
    let minVal = this.minRecursive(startNode);
    let maxVal = this.maxRecursive(startNode);
    return maxVal - minVal;
  }


  // ------------------------W2D3 ------------------------
    /**
   * Inserts a new node with the given newVal in the right place to preserver
   * the order of this tree.
   * - Time: O(?).
   * - Space: O(?).
   * @param {number} newVal The data to be added to a new node.
   * @returns {BinarySearchTree} This tree.
   */
  insert(newVal, curr = this.root) {
    let newNode = new BSTNode(newVal);
    if (!curr) {
      this.root = newNode;
      return "node inserted";
    }
    while (curr) {
      if (newVal < curr.data) {
        if (!curr.left) {
          curr.left = newNode
          return;
        }
        curr = curr.left;
      } else if (newVal >= curr.data) {
        if (!curr.right) {
          curr.right = newNode;
          return;
        }
        curr = curr.right
      }
    }
  }
  /**
   * Inserts a new node with the given newVal in the right place to preserver
   * the order of this tree.
   * - Time: O(?).
   * - Space: O(?).
   * @param {number} newVal The data to be added to a new node.
   * @param {Node} curr The node that is currently accessed from the tree as
   *    the tree is being traversed.
   * @returns {BinarySearchTree} This tree.
   */

  insertRecursive(newVal, curr = this.root) {
    if(!curr) {
      this.root = new BSTNode(newVal)
      return this
    }
    if(newVal < curr.data) {
      if(curr.left === null){
        curr.left = new BSTNode(newVal)
          return this
      }
      return this.insertRecursive(newVal, curr.left)
    }else{
      if (curr.right === null) {
        curr.right = new BSTNode(newVal)
        return this
      }
      return this.insertRecursive(newVal, curr.right)  
    }
  }
    




  // ------------------------W2D4 ------------------------

  /**
  * Depth first search
   * DFS Preorder: (CurrNode, Left, Right) 
   * Usage: create a copy of the tree,  
   * Converts this BST into an array following DFS preorder.
   * Example on the fullTree var:
   * [25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90]
   * @param {Node} node The current node during the traversal 
   * @param {Array<number>} vals The data that has been visited so far.
   * @returns {Array<number>} The vals in DFS Preorder once all nodes visited.
   */
  toArrPreorder(curr = this.root, vals = []) {
    if (!curr) {
      return;
    } else {
      vals.push(curr.data);
      this.toArrPreorder(curr.left, vals);
      this.toArrPreorder(curr.right, vals);
    }
    return vals;
  }

  /**
   * DFS Inorder: (Left, CurrNode, Right)
   * Usage: get the numbers in order
   * Converts this BST into an array following DFS inorder.
   * Example on the fullTree var:
   * [4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90]
   * @param {Node} node The current node during the traversal 
   * @param {Array<number>} vals The data that has been visited so far.
   * @returns {Array<number>} The vals in DFS Preorder once all nodes visited.
   */
  toArrInorder(node = this.root, vals = []) {
    if (!node) {
      return;
    }
    if (node) {
      this.toArrInorder(node.left, vals);
      vals.push(node.data);
      this.toArrInorder(node.right, vals);
    }
    return vals;
  }

  /**
   * DFS Postorder (Left, Right, CurrNode)
   * Usage: delete the tree
   * Converts this BST into an array following DFS postorder.
   * Example on the fullTree var:
   * [4, 12, 10, 18, 24, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25]
   * @param {Node} node The current node during the traversal 
   * @param {Array<number>} vals The data that has been visited so far.
   * @returns {Array<number>} The vals in DFS Preorder once all nodes visited.
   */
  toArrPostorder(node = this.root, vals = []) {
    if (!node) {
      return;
    } else {
      this.toArrPostorder(node.left, vals);
      this.toArrPostorder(node.right, vals);
      vals.push(node.data);
    }
    return vals;
  }




  // ------------------------W2D5 ------------------------

  
  // HELPER METHOD
  // Logs this tree horizontally with the root on the left.
  print(node = this.root, spaceCnt = 0, spaceIncr = 10) {
    if (!node) {
      return;
    }

    spaceCnt += spaceIncr;
    this.print(node.right, spaceCnt);

    console.log(
      " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
        `${node.data}`
    );

    this.print(node.left, spaceCnt);
  }
}

const emptyTree = new BinarySearchTree();
const oneNodeTree = new BinarySearchTree();
oneNodeTree.root = new BSTNode(10);
// oneNodeTree.print()

/* twoLevelTree
        root
        10
      /   \
    5     15
*/
const twoLevelTree = new BinarySearchTree();
twoLevelTree.root = new BSTNode(10);
twoLevelTree.root.left = new BSTNode(5);
twoLevelTree.root.right = new BSTNode(15);
// twoLevelTree.print()

/* threeLevelTree 
        root
        10
      /   \
    5     15
  / \    / \
2   4  13  20
*/
const threeLevelTree = new BinarySearchTree();
threeLevelTree.root = new BSTNode(10);
threeLevelTree.root.left = new BSTNode(5);
threeLevelTree.root.left.left = new BSTNode(2);
threeLevelTree.root.left.right = new BSTNode(4);
threeLevelTree.root.right = new BSTNode(15);
threeLevelTree.root.right.right = new BSTNode(20);
threeLevelTree.root.right.left = new BSTNode(13);
threeLevelTree.print()
/* fullTree
                    root
                <-- 25 -->
              /            \
            15             50
          /    \         /    \
        10     22      35     70
      /   \   /  \    /  \   /  \
    4    12  18  24  31  44 66  90
*/

