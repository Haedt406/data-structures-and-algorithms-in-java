/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicks;

import static java.lang.Integer.max;

/**
 *
 * @author Benjamin Haedt
 */
public class kS {
  int n;
  int  i;
  int v[] = {21, 16, 8, 26, 35, 21};
  int w[] = {30,20,25,35,45,19};
  int table[][];
    kS(int n, int i){
        
        this.n = n;
        this.i = i; 
    }
    
    public int solve(int n1, int i) {
        if (i>n1){
            table[n1,i]=0;
            return table[n1,i];
           // return 0;
        }
        if (n <w[i]){
            if (table[n1, i+1] == null){
            table[n1,i+1] = kS(n1,i+1);
     
        }
            return table[n1,i+1];
            // return solve(n, i+1);
        }
        else{
            if (table[n1, i+1]== null){
            table[n1,i+1] = kS(n1,i+1);
        }
            if(table[n1-w[i], n1+1] ==null){
            table[n1-w[i], i+1] = kS(n1,i+1);
        }
            return max(table[n1,i+1], v[i] + table(n1-w[i],i+1));
          // return max(solve(n, i+1), v[i] + solve(n-w[i],i+1));
           
        }  
        System.out.println(max(table[n1,i+1], v[i] + table(n1-w[i],i+1)));
        return max(table[n1,i+1], v[i] + table(n1-w[i],i+1));
    }

    
    
            
    

}