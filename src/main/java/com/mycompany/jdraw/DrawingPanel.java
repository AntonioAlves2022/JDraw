/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdraw;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

/**
 *
 * @author anton
 */
public class DrawingPanel extends JPanel{
    private Tool currentTool;

    public DrawingPanel(Tool initialTool) {
        this.currentTool = initialTool;
        setBackground(Color.WHITE); 
        
        /*
        Adicionar um listener para o aplicativo
        "ouvir" os eventos de clique mouse*/
        addMouseListener(new MouseAdapter(){
            public void mousePressed(java.awt.event.MouseEvent evt){
                currentTool.mousePressed(evt);
            }
        });
        
        // Listener do evento de arrastar o mouse
        addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(java.awt.event.MouseEvent evt){
                currentTool.mouseDragged(evt);
            }
        });
           
    }
    
    public void setTool(Tool tool){
        this.currentTool = tool;
    }
    
    
}
