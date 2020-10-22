/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashoutlab;

/**
 *
 * @author Benjamin Haedt
 */
public class hashTable {
    Data[] ourArray;
    int size;
    int count=0;
    float checkSize = (float) 0.8;
    
    hashTable(int size){                
        Data[] ourArray = new Data[size];
        this.ourArray = ourArray;
        this.size = size;
        }
    
    public void add(Data data){                                                 //takes our data, uses the key to find its mod value and then puts it in the table according to its mod value
        float check = (checkSize * (float) size);
        int position = data.getKey()%size;
        if (ourArray[position] == null ){
            ourArray[position] = data;
            count++;
        }
        else if (ourArray[position] != null){
            while(ourArray[position] != null){
                position++;
                if (position == ourArray.length){
                    position = 0;
                }
        }
            ourArray[position] = data;
            count++;
        }
        if (count >= check){
            rehash();
        }
        
    }
    public void printArray(){                                                   //prints the array starting from position 0 and going until it reaches the end.
        for (int i =0; i < ourArray.length; i++){
            if (ourArray[i] != null){
                System.out.print("STRING: " + ourArray[i].getString() + " |KEY: "+ ourArray[i].getKey() + " |MOD VALUE: "+ ourArray[i].getKey()%size);
                System.out.println();
            }
            else System.out.println("EMPTY SLOT");
        }
        System.out.println(ourArray.length);
    }
    @SuppressWarnings("empty-statement")
    public void rehash(){                                                       //this rehash function works when the add function detects that our table is at 80% capacity, it creates a temporary table to store all the data, then deletes and resizes our hash table, then takes the data from the temp table and adds them into the new hashtable by re calculating positions.
        Data[] temp = new Data[size];
        System.arraycopy(ourArray, 0, temp, 0, size);
        this.size = size*2;
        for (int i = 0; i < ourArray.length; i++){
            ourArray[i] = null;
        }
         Data[] ourArray = new Data[size];
         this.ourArray = ourArray;
        for (int i = 0; i < temp.length; i++){
            if ((temp[i]  == null) || (temp[i].getKey() == 0)){;}
            else{
                int position = temp[i].getKey()%size;
                if (ourArray[position] == null){
                 ourArray[position] = temp[i];
                 System.out.println(" Data " + ourArray[position].getString() + " : has new mod value : "+ position);
                }
                else if (ourArray[position] != null){
                    while(ourArray[position] != null){
                        position++;
                        if (position > ourArray.length){
                          position = 0;
                        }
                    }  
                ourArray[position] = temp[i];
                System.out.println(" Data " + ourArray[position].getString() + " : has new mod value : "+ position);
                }
              }
        }
    }
    public void search(int key){                                                // the search is very similar to the delete function, it takes a key, mods it to find where in the table it should be, and then does a linear search until it finds it or it hits an empty slot
        int searchKey = key%size;
        boolean isFound = false;
        while(!isFound){
            if (ourArray[searchKey] == null){System.out.println("The key " + key + ", has no associated value.");isFound = true;}
            else if (ourArray[searchKey].getKey() != key){
                    System.out.println("Current node we are at " + ourArray[searchKey].getString());
                    searchKey++;
                     if (searchKey == size){
                         System.out.println(" wrap around to start ");
                         searchKey = 0;
                        }
            }
            else if (ourArray[searchKey].getKey() == key){
                  System.out.println("Data found, Value: " + ourArray[searchKey].getString());
                  isFound = true;}
        }
    }

        public void deleteByName(String toDelete) {                             //this is a fun function i added to delete  by name, it only works by doing a linear search, starting from the beginning and iterating through the entire table
            int linearCount = 0;
            for (int i = 0; i < size; i++){
                if (ourArray[i] == null){linearCount++;System.out.println("Null valaue");}
                else if (ourArray[i].getString().compareTo(toDelete) == 0){
                    System.out.println("Value: " + ourArray[i].getString() + " | String: " + ourArray[i].getKey() + " , Deleted");
                    ourArray[i] = new Data(0, "DUMMY");
                }
                else{System.out.println("not at " + ourArray[i].getString());linearCount++;}}
            if (linearCount == size){
                System.out.println("Value: " + toDelete + " is not in our table. Please try again");
            }
        }

    public void delete(int key) {                                               //this is a way to delete by the key associated with the data, it mods the key to find its position in the table, starts there, and then if it gets to an empty slot it knows the key is not a value in our table
        int searchKey = key%size;                                               //anything deleted is replaced with a dummy input into the table so our search and delete funcitons work properly and keep the time complexity as small as possible
        boolean isFound = false;
        while(!isFound){
            if (ourArray[searchKey] == null){System.out.println("The key " + key + ", has no associated value.");isFound = true;}
            else if (ourArray[searchKey].getKey() != key){
                    System.out.println("Current node we are at " + ourArray[searchKey].getString());
                    searchKey++;
                     if (searchKey == size){
                         System.out.println(" wrap around to start ");
                         searchKey = 0;}
            }
            else if (ourArray[searchKey].getKey() == key){
                    System.out.println("Value: " + ourArray[searchKey].getString() + " | String: " + ourArray[searchKey].getKey() + " , Deleted");
                    ourArray[searchKey] = new Data(0, "DUMMY");
                    isFound = true;
            }
    }
}
}
