 
import java.util.*;

public class AVLTree
{
  private Node root;
  private boolean increase;
   private boolean decrease;
  private boolean addReturn;
  private Scanner stop;

  public AVLTree()
  {
    root = null;
    addReturn = false;
    increase = false;
    stop = new Scanner(System.in);
  }  

public boolean add(int item) {

    System.out.println("Starting to search for a a place to put " + item);
    increase = false;
    root = add(root, item);
    return addReturn;
  }

  private Node add(Node localRoot, int item) {
     
    if (localRoot == null) {
      addReturn = true;
      increase = true;
       System.out.println("Added " + item);
      return new Node(item);
    }
   System.out.println("Add called with " + localRoot.getItem() + " as the root.");
    if (item == localRoot.getItem()) {                                //item is alreday in tree
      increase = false;
      addReturn = false;
      return localRoot;
    }

    else if (item  < localRoot.getItem()) {
       System.out.println("Branching left");						                        // item < data
      localRoot.setLeft(add(localRoot.getLeft(), item));

      if (increase) {
        decrementBalance(localRoot);
        if (localRoot.balance < Node.LEFT_HEAVY) {
          increase = false;
          return rebalanceLeft(localRoot);
        }
      }
      return localRoot;                                            // Rebalance not needed.
    }
    else {
      System.out.println("Branching right");                                                                   // item > data
      localRoot.setRight(add(localRoot.getRight(), item));
      if (increase) {
        incrementBalance(localRoot);
        if (localRoot.balance > Node.RIGHT_HEAVY) {
          return rebalanceRight(localRoot);
        }
        else {
          return localRoot;
        }
      }
      else {
        return localRoot;
      }
    }

  }

    private void decrementBalance(Node node) 
    {
        node.balance--;
         if (node.balance == Node.BALANCED) {
           increase = false;
         }
     }
     
      private Node rebalanceRight(Node localRoot) {
    // Obtain reference to right child
       Node  rightChild =  localRoot.getRight();
    // See if right-left heavy
    if (rightChild.balance < Node.BALANCED) {
      // Obtain reference to right-left child
      Node rightLeftChild = rightChild.getLeft();
      /* Adjust the balances to be their new values after
         the rotates are performed.
       */
      if (rightLeftChild.balance > Node.BALANCED) {
        rightChild.balance = Node.RIGHT_HEAVY;
        rightLeftChild.balance = Node.BALANCED;
        localRoot.balance = Node.BALANCED;
      }
      else if (rightLeftChild.balance < Node.BALANCED) {
        rightChild.balance = Node.BALANCED;
        rightLeftChild.balance = Node.BALANCED;
        localRoot.balance = Node.LEFT_HEAVY;
      }
      else {
        rightChild.balance = Node.BALANCED;
        localRoot.balance = Node.BALANCED;
      }
      /** After the rotates the overall height will be
          reduced thus increase is now false, but
          decrease is now true.
       */
      increase = false;
      decrease = true;
      // Perform double rotation
      localRoot.setRight(rotateRight(rightChild));
      return rotateLeft(localRoot);
    }
    if (rightChild.balance > Node.BALANCED) {
      /* In this case both the rightChild (the new root)
         and the root (new left child) will both be balanced
         after the rotate. Also the overall height will be
         reduced, thus increase will be fasle, but decrease
         will be true.
       */
      rightChild.balance = Node.BALANCED;
      localRoot.balance = Node.BALANCED;
      increase = false;
      decrease = true;
    }
    else {
      /* After the rotate the rightChild (new root) will
         be left heavy, and the local root (new left child)
         will be right heavy. The overall height of the tree
         will not change, thus increase and decrease remain
         unchanged.
       */
      rightChild.balance = Node.LEFT_HEAVY;
      localRoot.balance = Node.RIGHT_HEAVY;
    }
    // Now rotate the
    return rotateLeft(localRoot);
  }

  private Node rebalanceLeft(Node localRoot) {
    // Obtain reference to left child.
     Node leftChild =  localRoot.getLeft();
    // See whether left-right heavy.
    if (leftChild.balance > Node.BALANCED) {
      // Obtain reference to left-right child.
      Node leftRightChild = leftChild.getRight();
      /** Adjust the balances to be their new values after
          the rotations are performed.
       */
      if (leftRightChild.balance < Node.BALANCED) {
        leftChild.balance = Node.BALANCED;
        leftRightChild.balance = Node.BALANCED;
        localRoot.balance = Node.RIGHT_HEAVY;
      }
      else {
        leftChild.balance = Node.LEFT_HEAVY;
        leftRightChild.balance = Node.BALANCED;
        localRoot.balance = Node.BALANCED;
      }
      // Perform left rotation.
      localRoot.setLeft(rotateLeft(leftChild));
    }
    else { //Left-Left case
      /** In this case the leftChild (the new root)
          and the root (new right child) will both be balanced
          after the rotation.
       */
      leftChild.balance = Node.BALANCED;
      localRoot.balance = Node.BALANCED;
    }
    // Now rotate the local root right.
    return  rotateRight(localRoot);
  }

    private void incrementBalance(Node node) {
      node.balance++;
      if (node.balance > Node.BALANCED) {
         /* if now right heavy, the overall height has increased, but
         it has not decreased */
         increase = true;
         decrease = false;
      }
      else {
         /* if now balanced, the overall height has not increased, but
             it has decreased. */
         increase = false;
         decrease = true;
    }
  }
  
   private Node  rotateRight(Node  root) {
    System.out.println("Rotating Right");
    Node temp = root.getLeft();
    root.setLeft(temp.getRight());
    temp.setRight(root);
    return temp;
  }


   private Node rotateLeft(Node localRoot) {
     System.out.println("Rotating Left");
     Node temp = localRoot.getRight();
     localRoot.setRight(temp.getLeft());
     temp.setLeft(localRoot);
     return temp;
   }
   
}