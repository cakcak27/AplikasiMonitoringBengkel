/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ikbal.app.ui.icon;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.Icon;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Ikbal Chahyadi
 */
public class CloseIcon implements Icon{
    
    private int width = 16;
    private int height = 16;
    
    private BasicStroke stroke = new BasicStroke(4);
    
    public void paintIcon(Component c, Graphics g, int x, int y){
       Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(x +1 ,y + 1,width -2 ,height -2);
        
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x +1 ,y + 1,width -2 ,height -2);
        
        g2d.setColor(Color.RED);
        
        g2d.setStroke(stroke);
        g2d.drawLine(x +10, y + 10, x + width -10, y + height -10);
        g2d.drawLine(x +10, y + height -10, x + width -10, y + 10);
        
        g2d.dispose();
    }
    
    public int getIconWidth() {
        return width;
    }
    
    public int getIconHeight() {
        return height;
    }
}
    