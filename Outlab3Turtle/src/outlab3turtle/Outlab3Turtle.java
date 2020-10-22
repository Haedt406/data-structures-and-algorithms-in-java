/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab3turtle;

/**
 *
 * @author Benjamin Haedt
 */
public class Outlab3Turtle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
        Turtle t = Turtle.getInstance(500, 500);


t.speed(1);
t.goTo(50, 50);
t.penUp();
t.goTo(150, -150);
t.penSize(5);
t.penDown();
t.speed(5);
t.goTo(-150, -15);
t.penSize(2);
t.penColor(122, 255, 122);
t.speed(1);

t.goTo(110, -1);
t.left();
t.fd(50);
t.setHeading(66.5);
t.fd(66.5);
t.clear();
  
// random left/right

for(int i = 0; i < 5; i++) {
  int x=-t.getWidth()/2+(int)(Math.random()*t.getWidth()), y=-t.getHeight()/2+(int)(Math.random()*t.getHeight());
  t.penColor((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
  if(Math.random()>0.5) t.left();
  else if(Math.random()>0.5) t.right();
  t.fd(50);
}

// random positions with highest speed: instant drawing

t.speed(0);

for(int i = 0; i < 5; i++) {
  int x = -t.getWidth()/2 + (int)(Math.random()*t.getWidth()), y=-t.getHeight()/2+(int)(Math.random()*t.getHeight());
  t.penColor((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
  if(Math.random() > 0.5) t.left();
  else if(Math.random() > 0.5) t.right();
  t.goTo(x, y);
}
  
t.home();
    }
    
}
