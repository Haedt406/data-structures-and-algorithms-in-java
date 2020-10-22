/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab3turtle;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Benjamin Haedt
 */
public class Turtle extends JFrame{
    private int[] location = new int[2];
    private int speed =1;
    private double heading;
    private boolean penUpVal = false;
    private static Turtle inst;
//    private int currentLocationX=0;
//    private int currentLocationY=0;
    private int[] polar = new int[2];
    public static Turtle getInstance(int width, int height){
        if (inst == null){
            inst = new Turtle(width, height);
            
        }
        return inst;
    }

    private Turtle(int height, int width) {
        super("Fuck this outlab");
        setSize(width, height);
        //setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel mp = Panel.getInstance();
        getContentPane().add(mp);
       //mp.add(BorderLayout.CENTER);
       // location[0] = 250;
       // location[1] = 250;
       // heading=0;
        setVisible(true);
    }
   

    public void speed(int inputSpeed) {
        if(inputSpeed <=5 || inputSpeed>=1){
            speed = inputSpeed;
        }
        else{
            speed = 1;
        }
    }

    public void goTo(int x, int y) throws InterruptedException {
        if(penUpVal == false){
           Panel.getInstance().draw(location[0], location[1], x, y, speed);
           
        }
       location[0] = x;
       location[1]=y;
    }

    public void penUp() {
        penUpVal = true;
    }

    public void penSize(int newSize) throws InterruptedException {
           //Panel.getInstance().setSize(newSize);
           Panel.getInstance().setSize(newSize, newSize);
    }

    public void penDown() {
        penUpVal = false;
    }

    public void penColor(int r, int g, int b) {
        Panel.getInstance().setColor(r, g, b);
        
    }

    public void left() {
        heading += 90;
    }

    public void fd(double i) throws InterruptedException {
        
        polar[0] = (int)Math.toRadians(i);
        polar[1] = (int)Math.toRadians(i);
        int[] toMove = new int[]{polar[0]+location[0],location[1]-polar[1]};
        if(penUpVal == false){
            Panel.getInstance().draw(location[0],location[1],toMove[0],toMove[1],speed);
        }
        location = toMove;
    }

    public void setHeading(double d) {
     heading =d;
    }

    public void clear() throws InterruptedException {
        Panel.getInstance().clearPanel();
    }


    public void right() {
        heading -= 90;
    }

    public void home() {
        location[0] = 0;
        location[1] = 0;
        heading = 0; 
    }
//    @Override
//    public int getWidth(){
//        return this.location[0];
//    }
//    @Override
//    public int getHeight(){
//        return this.location[1];
//    }

    
}
