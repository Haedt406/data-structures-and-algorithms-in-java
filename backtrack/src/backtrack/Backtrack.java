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
public class Backtrack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] multi = new int[3][3];
        
        int ft = 15;
        bt bt = new bt(1, multi);
        bt.solve();
    }      
    
}
