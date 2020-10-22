/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrunnableproject;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Benjamin Haedt
 */
public class MyRunnableProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */

     public static void main(String [] args) throws Exception
    {
        MyCurrentDate[] myArray = new MyCurrentDate[3];
        for ( int i = 0; i < 3; i++){
          System.out.print("Thread " + i);
        
            MyCurrentDate tee = new MyCurrentDate(i + " ");
            Thread x = new Thread(tee);
            
            x.start();

            myArray[i] = tee;
        }
        
         for (MyCurrentDate myArray1 : myArray) {
             try {
                 TimeUnit.MILLISECONDS.sleep(3000);
                 myArray1.flag = false;
             } catch (InterruptedException ex) {
                 System.out.println("Catch");
             }
         }
//        myArray[0].stop();
//        myArray[1].stop();
//        myArray[2].stop();
//        TimeUnit.MILLISECONDS.sleep(3000);
//        myArray[1].stop();
//        TimeUnit.MILLISECONDS.sleep(3000);
//        myArray[2].stop();
//        TimeUnit.MILLISECONDS.sleep(3000);
//        myArray[3].stop();
//        Scanner console = new Scanner(System.in);
//        
//
//        
//        System.out.println("Which thread should be killed??");
//        System.out.println(" Thread 1: " + myArray[0] + " . Thread 2: " + myArray[1] + " .Thread 3: " + myArray[2] + " 0 to exit");  
//        int toKill = console.nextInt();
//        while (toKill != 0){
//        toKill = console.nextInt();
//        switch (toKill){
//            case 1:
//                myArray[0].flag = false;
//                System.out.println("Thread " + myArray[0] + " Stopped.");
//                break;
//            case 2:
//                myArray[1].flag = false;
//                System.out.println("Thread " + myArray[1] + " Stopped.");
//                break;
//            case 3:
//                myArray[2].flag = false;
//                System.out.println("Thread " + myArray[2] + " Stopped.");
//                break;
//    }
//        }
//        System.out.println("Goodbye");
    }
    
}
