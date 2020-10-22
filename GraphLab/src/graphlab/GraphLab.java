/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphlab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Benjamin Haedt
 */
public class GraphLab {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println((0x0A)  & 0x01);
//       FileReader file = new FileReader("input.txt");                                  //reads in a file
//        Scanner sc = new Scanner(file);
//        int digit;
//       String sizeS = sc.next();
//       int size = Integer.parseInt(sizeS);
//        System.out.println(sizeS + " SIZE OF ARRAY");
//        Graph graph = new Graph(size);
//        sc.nextLine();
//        for (int i = 0; i < size; i++){
//            graph.addNode(i);
//            for (int j = 0; j < size; j++){               
//                digit = sc.nextInt();
//                if (digit == 1){
//                    graph.addEdge(i,j);
//                }
//            }
//        }
//        graph.printGraph();
//        System.out.println();
//        graph.findNeighbors();
//        System.out.println();
//        graph.bfs(2);
//        System.out.println();
//        graph.bfs(5);
//        System.out.println();
//        //graph.findNeighbors2(2);
////        graph.warshall(2);
////        graph.warshall(5);
////        System.out.println("\n");
////        graph.dfs(2);
////        System.out.println();
////        graph.dfs(5);
////        System.out.println();
//        
//
//       FileReader file2 = new FileReader("inputw.txt");                                  //reads in a file
//       Scanner sc2 = new Scanner(file2);
//       String sizeS2 = sc2.next();
//       int size2 = Integer.parseInt(sizeS2);
//        System.out.println(sizeS2 + " SIZE OF ARRAY");
//        Graph wGraph = new Graph(size2);
//        sc2.nextLine();
//        for (int i = 0; i < size2; i++){
//            wGraph.addNode(i);
//            for (int j = 0; j < size2; j++){
//                digit = sc2.nextInt();
//                if (digit  >0 ){
//                    wGraph.addEdge(i,j, digit);
//                }
//            }
//            
//        }
//        
//        wGraph.printGraph();
//        wGraph.findNeighbors();
//      System.out.println();
//      wGraph.setVisits();
//      wGraph.dijk(2,0);
      
    }
}
        










//        
//        while (switchNumber != 0){
//            System.out.println("*********************************************************");
//            System.out.println("Enter 1 to read in a file as an unweighted graph");
//            System.out.println("Enter 2 to read in a file as a weighted graph.");
//            System.out.println("Enter 2 to read in a file as a weighted graph.");
//            System.out.println("Enter 2 to read in a file as a weighted graph.");
//            System.out.println("*********************************************************"); 
//            System.out.println();  
//            System.out.println();  
//            switchNumber = console.nextInt();
//            switch(switchNumber){
//                case 1:
//                   
//                   //file = console.next();
//                    
//                  unweightedGraph("input.txt");
//                   //System.out.println("graph made");
//                  // System.out.println(unWeightedGraph[1][1]);
//                   //printArray(unWeightedGraph);
//                 
//                    break;
//                case 2:
//                   
//                 
//                    break;
//                case 0:
//                    break;
//                }
//    }
    
    
//    
//    public static void unweightedGraph(String input) throws FileNotFoundException{
//
//        }
     //  sc.nextLine();
        //System.out.println("in unweightedGraph before while loop");
//        while(sc.hasNext()){
//            size++;
//            sc.nextLine();
//        }
       // System.out.println(size);
        // System.out.println("past while loop in unweightedGraph");
        //int[][] graph = new int[sizeInt][sizeInt];
//        sizeInt -= 1;
//       sc.nextLine();

       //sc.nextLine();
//        while (sc.hasNext()){
//            System.out.println("ONE");
//            String temp = sc.next();
//            System.out.println(temp);
//            int tempConvert = Integer.parseInt(temp);
//            System.out.println(tempConvert);
//            graph[column][row] = tempConvert;
//            column++;
//            if (column == sizeInt){
//                column = 0;
//                row++;
//            }
//        }
//        Scanner test = new Scanner(file);
//        for (int i = 0; i<size*size; i++){
//            System.out.println("1");
//            graph[column][row] = test.nextInt();
//            System.out.println("2");
//           System.out.println(test.nextInt());
//            column++;
//            
//            if (column  == size){
//                column = 0;
//                row++;
//            }
//        }
//        int test2 = 0;
//        Scanner test = new Scanner(file);
//        while (test2 < size*size){
//           System.out.println("in while loop");
//           System.out.println(test.nextInt());
//           graph[column][row] = test.nextInt();
//          //System.out.println(test.nextInt());
//            column++;
//            if (column  == size){
//                column = 0;
//                row++;
//            }
//            test2++;
//        }

//    public static void printArray(int[][] graph){                                        
//        int column = 0;
//        int row = 0;
//        //System.out.println("in printArrray");
//        int size = graph.length;
//        //System.out.println(size);
//        //System.out.println(graph[1][1]);
//       // System.out.println("size printArrray");
//        for (int i = 0; i < size*size; i++){
//            System.out.print(graph[column][row]);
//            column++; 
//            System.out.print(" ");
//            if (column  == size){
//                System.out.println();
//                column = 0;
//                row++;
//            }       
//        }  
//    }
//    
//    
//        public static void weightedGraph(String input) throws FileNotFoundException{
//        FileReader file = new FileReader(input);                                  //reads in a file
//        Scanner sc = new Scanner(file);
//        
//        int column = 0;
//        int row=0;
//        int digit;
//
//       String sizeS = sc.next();
//       int size = Integer.parseInt(sizeS);
//        System.out.println(sizeS + " SIZE OF ARRAY");
//        Graph wGraph = new Graph(size);
//         sc.nextLine();
//        for (int i = 0; i < size; i++){
//            wGraph.addNode(i);
//            for (int j = 0; j < size; i++){
//                digit = sc.nextInt();
//                if (digit  >0 ) wGraph.addEdge(i,j, digit);
//            }
//            
//        }
//        }
//}
