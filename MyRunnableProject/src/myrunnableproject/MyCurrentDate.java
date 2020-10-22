/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrunnableproject;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Benjamin Haedt
 */
public class MyCurrentDate implements Runnable{
Date date = new Date();
public boolean flag = true;
private String name;

MyCurrentDate(String name){
    this.name = name;
}

    @Override
    public void run() {
        while(flag){
            System.out.println(name + " " + date.toString());
            try {
                Thread.sleep(100);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(MyCurrentDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

//   public void start(String name) throws InterruptedException {
//                while(flag){
//                    System.out.println(name + " " + date.toString());
//            try {
//                Thread.sleep(100);
//                
//            } catch (InterruptedException ex) {
//               
//            }
//         
//        }
//    }
   public void stop(){
           flag = false;
   }
}
