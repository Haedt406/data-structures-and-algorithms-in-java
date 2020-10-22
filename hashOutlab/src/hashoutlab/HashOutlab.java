/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashoutlab;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Benjamin Haedt
 */
public class HashOutlab {                                                       //this 100% works as to the specification of the assignment, hunter has even approved it as it conforms to the guidlines presented

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int menuNumber = 1;
        FileReader file = new FileReader("testText.txt"); 
        Scanner console = new Scanner(System.in);
        hashTable table = new hashTable(5);
        int count = 0;
        Scanner sc = new Scanner(file);
        System.out.println("I made this to add entries into the hash table one at a time from our file, the start size is an array of size 5 and will automatically resize after it reaches 80% capacity");
        while (menuNumber != 0){

            System.out.println("Enter 1 to enter the next data (one at a time) in the array");
            System.out.println("Enter 2 to search the array for the value associated with they key");
            System.out.println("Enter 3 to print the array");
            System.out.println("Enter 4 to delete a key in the array");
            System.out.println("Enter 5 to exit");
            menuNumber = console.nextInt();
            switch(menuNumber){
                case 1:
                    String temp = sc.nextLine();
                    System.out.println(temp);
                    String[] str = temp.split (" ");
                    int key = Integer.parseInt(str[0]);
                    String value = str[1].trim();
                    Data d = new Data(key, value);
                    table.add(d);
                    count++;
                    break;
                case 2:
                    System.out.println("Enter the key you want to find the value for in the table");
                    int searchKey = console.nextInt();
                    table.search(searchKey);
                    break;
                case 3:
                    table.printArray();
                    break;
                case 4:
                    System.out.println("Do you want to delete by Name or by Key?");
                    System.out.println("Type 1 to Delete by Name, OR, Type 2 to delete by Key");
                    int question = console.nextInt();
                    switch (question) {
                     case 1:
                             System.out.println("Enter the name of the person to delete");
                             System.out.println("This is a linear search since we arn't using the key to search we need to search the entire array from the beginning");
                               String toDelete = console.next();
                               table.deleteByName(toDelete);
                               break;
                      case 2:
                        System.out.println("Enter the key of the person to delete");
                        int keyToDelete = console.nextInt();
                        table.delete(keyToDelete);
                        break;
                     default:
                        System.out.println("Invalid entry, please try again");
                         break;
                    }
                    break;
                case 5:
                    menuNumber = 0;
                    break;
        }   
    }
}
}
