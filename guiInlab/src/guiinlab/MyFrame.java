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
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    private static MyFrame inst;
    
    public static MyFrame getInstance()
    {
        if(inst == null)
            inst = new MyFrame();
        return inst;
    }
    private MyFrame()
    {
        super("Hello CSCI 232");
        setSize(500, 500);
        setLocation(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        MyPanel mp = MyPanel.getInstance();
        MyButtonPanel mbp = new MyButtonPanel(); 
        getContentPane().add(mbp, BorderLayout.SOUTH);
        //getContentPane().
        add(mp, BorderLayout.CENTER);
        setVisible(true);
        
        
    }
    
}

