/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab3turtle;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Benjamin Haedt
 */
public class Panel extends JPanel{
    private static Panel inst;
    private BufferedImage image;
    private Graphics2D g2;
   // public Turtle ourTurtle;
//    BufferedImage grid;
//    Graphics2D gc;
public static Panel getInstance(){
        if(inst == null)
            inst = new Panel();
        return inst;
    }
    private Panel(){
    }
@Override
 public void paintComponent(Graphics g){ 
         super.paintComponent(g);  
        // super.paint(g);
         if(image == null){
//            int w = this.getWidth();
//            int h = this.getHeight();
//            image = (BufferedImage)(this.createImage(w,h));
//            g2 = (Graphics2D)g;
                image = (BufferedImage)createImage(getSize().width, getSize().height);
            g2 = (Graphics2D) image.getGraphics();
              g2.setBackground(Color.yellow);
              
         }
         g.drawImage(image, 250,250,null);
    }
    public void draw(int xStart, int yStart, int xEnd, int yEnd, int sleep) throws InterruptedException{
       Thread.sleep(sleep * 100);
       
        g2.drawLine(xStart, yStart, xEnd, yEnd);
       Thread.sleep(100 *sleep);
        repaint();
       
    }
// 
    public void setColor(int r, int g, int b){
        g2.setColor(new Color(r,g,b));
    }
    public void clearPanel(){
        super.paintComponent(g2);
        repaint();
    }
}
