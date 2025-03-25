
package com.mycompany.jdraw;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;


public class BrushTool extends Tool{
    private int lastX, lastY;
    
    public BrushTool(PaintModel model) {
        super(model);
    }

    @Override
    public void draw(Graphics2D g2d, int x1, int y1, int x2, int y2) {
       g2d.setColor(model.getCurrentColor());
       g2d.setStroke(new java.awt.BasicStroke(model.getBrushSize()));
       g2d.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void mousePressed(MouseEvent evt) {
        lastX = evt.getX();
        lastY = evt.getY();
    }

    @Override
    public void mouseDragged(MouseEvent evt) {
       Graphics2D g2d = (Graphics2D)evt.getComponent().getGraphics();
       draw(g2d, lastX, lastY, evt.getX(), evt.getY());
       lastX = evt.getX();
       lastY = evt.getY();
       g2d.dispose();
       
    }

 
}
