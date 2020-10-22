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
public class TreesWithGenericComparables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeMaster ourTree = new TreeMaster();
        Dog dog1 = new Dog("F", "F", "F");
        Dog dog2 = new Dog("B", "B", "B");
        Dog dog3 = new Dog("G", "G", "G");
        Node dog1N = new Node(dog1);
        Node dog2N = new Node(dog2);
        Node dog3N = new Node(dog3);
        Node dog4N = new Node(new Dog("A", "A", "A"));
        Node dog5N = new Node(new Dog("D", "D", "D"));
        Node dog7N = new Node(new Dog("H", "H", "H"));
        Node dog8N = new Node(new Dog("C", "C", "C"));
        Node dog9N = new Node(new Dog("E", "E", "E"));
        Node dog10N = new Node(new Dog("I", "I", "I"));
        Node dog11N = new Node(new Dog("J", "J", "J"));
        ourTree.add(dog1N, dog1N);
        ourTree.add(dog1N, dog2N);
        ourTree.add(dog1N, dog3N);
        ourTree.add(dog1N, dog4N);
        ourTree.add(dog1N, dog5N);
        ourTree.add(dog1N, dog7N);
        ourTree.add(dog1N, dog8N);
        ourTree.add(dog1N, dog9N);
        ourTree.add(dog1N, dog10N);
        ourTree.add(dog1N, dog11N);
        
        System.out.println("Post Order: ");
        ourTree.postOrder(dog1N);
        System.out.println(" ");
        System.out.println("Pre Order: ");
        ourTree.preOrder(dog1N);
        System.out.println(" ");
        System.out.println("In Order: ");
        ourTree.inOrder(dog1N);
        System.out.println(" ");
        ourTree.delete(dog1N, dog9N);
        System.out.println(" ");
        System.out.println("In Order: ");
        ourTree.inOrder(dog1N);
        System.out.println(" ");
        
    }
    
}
