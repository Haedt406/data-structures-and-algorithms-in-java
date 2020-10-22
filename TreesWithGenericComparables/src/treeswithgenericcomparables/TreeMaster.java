/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeswithgenericcomparables;

/**
 *
 * @author Benjamin Haedt
 */
public class TreeMaster <E extends Comparable> {
    //protected Node<E> root = null;
    protected Node<E> root;
    private int size = 0;
    
    TreeMaster(){
        root = null;
    }
    
    public boolean add(Node<E> currentNode, Node<E> nodeToAdd){
        int compareResults = nodeToAdd.getData().compareTo(currentNode.getData());
       //System.out.println("CT" + compareResults);
        if (root == null){
            root = nodeToAdd;
            //System.out.println(nodeToAdd.getData() +" set as the root node.");
            return true;
        }
        else if (compareResults == 0){
            //System.out.println("Node: " + nodeToAdd.getData() + ", is already a data set in the tree");
            return false;
        }
        else if (compareResults == -1){
            if (currentNode.getLeft() == null){
                currentNode.setLeft(nodeToAdd);
                nodeToAdd.setParent(currentNode);
                //System.out.println("Node: " + nodeToAdd.getData() + ", added to left side of the tree, Parent: " + nodeToAdd.getParent().getData());
            }
            else{
                add(currentNode.getLeft(), nodeToAdd);
            }
        }
        else if (compareResults == 1){
            if (currentNode.getRight() == null){
                currentNode.setRight(nodeToAdd);
                nodeToAdd.setParent(currentNode);
                //System.out.println("Node: " + nodeToAdd.getData() + ", added to right side of the tree, Parent: " + nodeToAdd.getParent().getData());
            }
            else{
                add(currentNode.getRight(), nodeToAdd);
            }
        }
        return true;
    }
    
    public boolean delete(Node<E> currentNode, Node<E> toDelete){
       int compareResults = toDelete.getData().compareTo(currentNode.getData());
       if (root==null){
           System.out.println("No nodes currently in the tree ");
           return false;
       }
       else if (toDelete == root){
           System.out.println("");
           System.out.println("ROOT NODE " + root.getData() + " DELETED");
           root = null;
       }
       else if (compareResults == 0){
           Node<E> parentNode = currentNode.getParent();
           compareResults = toDelete.getData().compareTo(parentNode.getData());
           if (compareResults < 0){
               if (toDelete.getLeft() == null && toDelete.getRight() == null){
               parentNode.setLeft(null);
               }
               else if (toDelete.getRight() != null && toDelete.getLeft() != null){
                   parentNode.setLeft(toDelete.getLeft());
                   add(toDelete.getParent(), toDelete.getRight());
               }
               else if (toDelete.getRight() == null && toDelete.getLeft() != null){
                   parentNode.setLeft(toDelete.getLeft());
               }
               else if (toDelete.getRight() != null && toDelete.getLeft() == null){
                   add(toDelete.getParent(),toDelete.getRight());
               }
           }
           else{
               if (toDelete.getLeft() == null && toDelete.getRight() == null){
               parentNode.setRight(null);
               }
               else if (toDelete.getLeft() != null && toDelete.getRight() != null){
                   parentNode.setRight(toDelete.getRight());
                   add(toDelete.getParent(), toDelete.getLeft());
               }
               else if (toDelete.getLeft() == null && toDelete.getRight() != null){
                   parentNode.setRight(toDelete.getRight());
               }
               else if (toDelete.getLeft() != null && toDelete.getRight() == null){
                   add(toDelete.getParent(),toDelete.getLeft());
               }
           }
           currentNode.setParent(null);
           System.out.println("NODE " + toDelete.getData() + " DELETED");
           return true;
       }
       else if (compareResults < 0){
           currentNode = currentNode.getLeft();
           delete(currentNode, toDelete);
       }
       else if (compareResults > 0){
           currentNode = currentNode.getRight();
           delete(currentNode, toDelete);
       }
       return true;
    }
    
    public void preOrder(Node<E> current){
        if (current == null){
            return;
        }
        System.out.println(current.getData() + " ");
        preOrder(current.getLeft());
        preOrder(current.getRight());
    }
    
    public void postOrder(Node<E> current){
        if (current==null){
            return;
        }
        postOrder(current.getLeft());
        postOrder(current.getRight());
        System.out.println(current.getData() + " ");
    }
    
    public void inOrder(Node<E> current){
        if (current == null){
            return;
        }
        else if (root == null){
            return;
        }
        inOrder(current.getLeft());
        System.out.println(current.getData() + " ");
        inOrder(current.getRight());
    }   
}
