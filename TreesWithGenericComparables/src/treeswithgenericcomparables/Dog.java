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
public class Dog implements Comparable{
    private String breed;
    private String color;
    private String name;
    
    Dog(String breed, String color, String name){
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
    @Override
    public int compareTo(Object otherDog){
        Dog other = (Dog) otherDog;
        //System.out.println("compare " + name + " to " + other.name);
        
        if (breed.compareTo(other.breed) < 0){
            //System.out.println("here1");
            return -1;
        }
        else if (breed.compareTo(other.breed) == 0){
            if(color.compareTo(other.color) < 0){
                //System.out.println("here2");
                return -1;
            }
            else if (color.compareTo(other.color) == 0){
                if(name.compareTo(other.name) < 0){
                    //System.out.println("here3");
                    return -1;
                }
                else if (name.compareTo(other.name) == 0){
                    return 0;
                }
                else return 1;
            }
            else
                return 1;
        }
        else{
       return 1; }
    }
    @Override
    public String toString(){
      return "Name of the puppy: " + this.name + ". Breed of puppy: " + this.breed + ". Color of puppy: " + this.color;  
    }
}
