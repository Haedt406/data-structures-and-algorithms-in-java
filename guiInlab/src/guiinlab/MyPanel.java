/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinlab;

/**
 *
 * @author Benjamin Haedt
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.*;
public class MyPanel extends JPanel{
    private static MyPanel inst;
    private BufferedImage image;
    private Graphics2D g2;

    public static MyPanel getInstance()
    {
        if(inst == null)
            inst = new MyPanel();
        return inst;
    }

    private MyPanel()
    {
           
    }



    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g = (Graphics2D)g;
        
        if (image == null) {
            image = (BufferedImage)createImage(getSize().width, getSize().height);
            
            g2 = (Graphics2D) image.getGraphics(); 
            //g2.fillRect(100, 100, 100, 200);
            
        }
       
       g.drawImage(image, 0, 0, null);
    }
    
    public void draw()
    {
        int randomStart = (int) (Math.random() * (500 - 0));
        int randomEnd = (int) (Math.random() * (500 - 0));
        g2.drawLine(0, randomStart, 500, randomEnd);
//        g2.setColor(Color.yellow);
//        g2.fillRect(100, 0, 100, 200);
        repaint();
       
    }
    
}
