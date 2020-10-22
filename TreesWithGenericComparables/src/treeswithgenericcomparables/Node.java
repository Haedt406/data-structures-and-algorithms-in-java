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
public class Node<E> {
    
    private E data;
    private Node<E> parent;
    private Node<E> left;
    private Node<E> right;
    
    public Node(E e){
            this.data = e;
    }
    
    public E getData(){ 
//        if (data == null){
//            System.out.println("Node does not exist");
//            return null;
//        }
            return data;
        } 
    public Node<E> getParent() { return parent; }
    public Node<E> getLeft(){ return left; }
    public Node<E> getRight() { return right;}
    
    public void setData(E e){ data = e;}
    public void setParent(Node<E> parent) { this.parent = parent; }
    public void setLeft(Node<E> left) { this.left = left;}
    public void setRight(Node<E> right) { this.right = right; }
    
}
