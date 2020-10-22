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
public class Data {
    private int key;
    private String value;

    
    Data(int key, String value){
        this.key = key;
        this.value = value;
    }

    public int getKey(){return this.key;}
    public String getString(){return this.value;}
}
