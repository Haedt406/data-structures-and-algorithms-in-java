/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphlab;
/**
 *
 * @author Benjamin Haedt
 */
public class Graph {
    int matrix[][];
    private Node[] vertex;
    int size;
    
    Graph(int size) {
       this.size = size;
        matrix = new int[size][size];
        vertex = new Node[size]; 
    }

    public void addNode(int data) {
        vertex[data] = new Node(data);
    }

    public void addEdge(int i, int j) {
        matrix[i][j] = 1;
    }
    public void addEdge(int i, int j, int digit){
        matrix[i][j] = digit;
    }

    void printGraph() {
        System.out.println("Graphs: (Adjacency Matrix)");
        for (int i = 0 ; i < this.size; i++){
            System.out.println();
            for (int j = 0; j < this.size; j++){
                System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
        }
    }

    void dfs(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bfs(int start) {
        setVisits();
        String search = "";
        int current;
        int next = 0;
        Node[] queueBFS = new Node[this.size];
        vertex[start].visited = true;
        queueBFS[0] = vertex[start];
        while (queueBFS[0] != null){
            current = queueBFS[0].data;
            queueBFS[0] = queueBFS[1];            
        for (int i = 0; i < size; i++){
            if (matrix[current][i] > 0 && vertex[i].visited == false){
                search += " " + vertex[i].data;
                vertex[i].visited = true;
                while (queueBFS[i] != null){
                    next++;
                }
                queueBFS[next] = vertex[i]; 
            }
        }
        }
        System.out.println("Using BFS and starting from index 2 we can reach indexes = " +search);
        setVisits();
    }
//        for (int i = 0; i< size; i++){
//            if (matrix[start][i] > 0){
//                search += " " +  i;
//                queueBFS[i] = i;
//                System.out.println("Herein first for loop");
//            }
//            System.out.println("here after first for loop");
//            while (queueBFS.length > 0 ){
//                System.out.println("in while loop");
//                for (int x = 0; x < queueBFS.length; x++){
//                    System.out.println("first for loop");
//                    if (queueBFS[x] != 0 || queueBFS[0] == 0){ 
//                        if (vertex[x].visited == false){
//                                vertex[x].visited = true;
//                        System.out.println("in if");
//                    for (int z = 0; z< size; z++){
//                        System.out.println("hin last for loop");
//                        if (matrix[x][z] > 0){
//                            System.out.println("in last if looop");
//                            search += " " +  i;
//                            queueBFS[i] = i;
//            }
//                    }
//                }
//            }
//        }
//     
//    }
//        System.out.println("Using BFS and starting from index 2 we can reach indexes = " +search);
//    }

    void warshall(int i) {

        for(int k = 0; k < size; k++) {
           for(int m = 0; m < size; m++) {
              for(int j = 0; j < size; j++) {
                  if( matrix[i][j] > matrix[i][k] + matrix[k][j]){
                    matrix[i][j] = matrix[i][k] + matrix[k][j];
    }
}
}
    }
    }

    public void dijk(int start, int end) {
//        int nextNodeNum =0;
//        Node nextNode;
//        int currentDist =0;
//        Node[] tempArray = new Node[size];
//        vertex[start].visited = true;
//        for (int i = 0; i < size; i++){
//            if (matrix[start][i] > 0){
//                tempArray[i] = vertex[i];
//                
//            }
//        }
//        for (int j = 0; j < tempArray.length; j++){
//            
//            if (tempArray[j].distTo > currentDist){
//                currentDist
//            }
//        }
//        for (int i = 0; i < size; i++){
//            if (matrix[start][i] > 0){
//                vertex[i].distTo = matrix[start][i];
//                if (nextNodeNum < matrix[start][i]){
//                    nextNode = vertex[i];
//                }     
//            } 
//        }
//        
//        for (int i = 0; i < size; i++ ){
//            if (mat)
//        }
        
        
//        int totalRoutes=0;
//        int currentD=9001;
//        String path = "";
//        for (int j = 0; j < size; j++){
//              if(matrix[start][j] > 0){
//                    if (currentD > matrix[start][j]){
//                        currentD = matrix[start][j];
//                    }
//                }
//              
//        }
//        for (int i = 0; i < totalRoutes; i++){
//            
//        }
//        System.out.println();
        
        
    }
    public void setVisits(){
        for (int i = 0; i < this.size; i++){
            vertex[i].visited = false;
    }
    }
//        public void setVisits(int c){
//        if (c == 0){
//            return;
//        }
//        else{
//            for (int i = 0; i < this.size; i++){
//            vertex[i].visited = false;
//            }
//        }
//    }
    

    private class Node{
        int data;
        boolean visited;
        Node parent;
        int distTo;

        private Node(int data) {
            this.data = data;
        }

        
        
    }
    
//    public int getNeighborts(int current){
//        for (int i = 0; i < size; i++){
//            if (vertex[i] > 0){
//                
//            }
//        }    
//    }
//        public ArrayList<Integer> findNeighbors2(int current){
//           ArrayList<Integer> ourList = new ArrayList<>();
//           int currentI = 0;
//        for (int i = 0; i < size; i++){
//            for (int j = 0; j < size; j++){
//                if(matrix[i][j] > 0){
//                    while(ourList.get(currentI) != 0){
//                        currentI++;
//                    }
//                    ourList.set(currentI, vertex[i].data);
//                }
//            }  
//        }
//        System.out.println(ourList);
//        return ourList;
//    }
    public void findNeighbors(){
        for (int i = 0; i < size; i++){
            System.out.println();
            System.out.print("Node " + vertex[i].data + " is connected to:");
            for (int j = 0; j < size; j++){
                if(matrix[i][j] > 0){
                    System.out.print(" " + j);
                }
            }  
        }
        System.out.println();
    }
    
    
    
//    public void bfs(int start){
//        System.out.println(" Using BFS and starting from index " + start + ", we can reach indexes = ");
//        int[] queueBFS = new int[size];
//        int next;
//        vertex[start].visited = true;
//        for (int i = 0; i < size; i++){
//            int j = i;
//            if (matrix[start][i] > 0){
//                System.out.print(" " + i);
//                while (queueBFS[j] != 0){
//                    j++;
//                }
//                queueBFS[j] = matrix[start][i];
//            }
//        }
//        for (int i = 0; i < queueBFS.length; i++){
//           bfsRecursion(queueBFS[i], queueBFS); 
//        }
//       
//       
//        
//    }
//    
//    public void bfsRecursion(int current, int[] queueBFS){
//       if (vertex[current].visited = true){
//            return;
//        }
//        else{
//        vertex[current].visited = true;
//        }
//        for (int i = 0; i < size; i++){
//            int j = i;
//            if (matrix[current][i] > 0){
//                System.out.print(" " + i);
//                while (queueBFS[j] != 0){
//                    j++;
//                }
//                queueBFS[j] = matrix[current][i];
//            }
//        }
//        for (int i = 0; i < queueBFS.length; i++){
//           bfsRecursion(queueBFS[i], queueBFS); 
//        }
//    }
}        
        
//        while (queueBFS[0].data > 0){
//        for (int i = 0; i < size; i++){
//            if (matrix[start][i] > 0){
//                int x = 0;
//                while (queueBFS[i].data > 0){
//                    x++
//                }
//                queueBFS[i] = 
//            }
//        }            
//        }
        
        
        
//        queueBFS[0] = vertex[start];
//        while (queueBFS.length < 0){
//            for (int j = 0; j < size; j++){
//                if(matrix[start][j] > 0){
//                    queueBFS[j+1]
//                }
//            }
//        }
//        if (vertex[start].visited == true){
//            return;
//        }
//        else {
//            for (int j = 0; j < size; j++){
//            if(matrix[start][j] > 0){
//              next = matrix[start][j];
//              System.out.println(vertex[j].data);
//              bfs(next);
//           }
//        }
//        }

    
   
    
    //graph constructor

