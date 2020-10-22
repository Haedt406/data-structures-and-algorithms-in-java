/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinlab;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author Benjamin Haedt
 */
public class MyButtonPanel extends JPanel implements ActionListener{
    MyPanel mp;
     MyButtonPanel()
     {
         //setBackground(new Color(255, 0, 255));
         JButton button = new JButton("Shoot");
         button.addActionListener(this);
         add(button);
         mp = MyPanel.getInstance();
     }
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        mp.draw();
    }
}
