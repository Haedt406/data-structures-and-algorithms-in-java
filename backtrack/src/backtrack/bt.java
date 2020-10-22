/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack;

/**
 *
 * @author Benjamin Haedt
 */
public class bt {
   
    int[][] multi;
    int current;
    int total;
    bt(int current, int[][] multi){
        
        this.multi = multi;
        this.current = current; 
    }
    
    public void solve() {
        if(Math.sqrt(multi.length) == 3){
            int total = 15;
        }
        
        sR(total, 1);
    }

    private void sR(int total, int current) {
            for (int i =0; i < multi.length; i++){
            for (int j = 0; j < multi.length; j++){
            if(multi[i][j] == 0){
            multi[i][j] = current;
        
            for (int k = 0; k < 3; k++){
                if (total == 15){
                    sR(total, current);
                   
                }
                for(int h = 0; h <3 ; h++){
                    total += multi[k][h];
                }
            }
            } 
            }
        }
            for(int i =0; i < Math.sqrt(multi.length); i++){
                for (int j = 0; j < Math.sqrt(multi.length); j++){
                    System.out.print(multi[i][j]);
                }
                
            }
       
    }
    
            
    

}
