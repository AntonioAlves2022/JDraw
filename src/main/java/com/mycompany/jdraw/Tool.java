
package com.mycompany.jdraw;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;


public abstract class Tool {
    protected PaintModel model;
   
    public Tool(PaintModel model) {
        this.model = model;
    }
    
    public abstract void draw(Graphics2D g2d,int x1, int y1, int x2, int y2);
    public abstract void mousePressed(MouseEvent evt);
    public abstract void mouseDragged(MouseEvent evt);
    
}
