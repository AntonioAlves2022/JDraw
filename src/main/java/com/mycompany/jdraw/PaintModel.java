/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdraw;

import java.awt.Color;

/**
 *
 * @author anton
 */
public class PaintModel {
    // Controla a cor do pincel 
    private Color currentColor;
    // Controla o tamanho do pincel
    private int brushSize;

    public PaintModel() {
        this.brushSize = 1; // pincel de 1px
        this.currentColor = Color.BLACK; // cor preta
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    public int getBrushSize() {
        return brushSize;
    }

    public void setBrushSize(int brushSize) {
        this.brushSize = brushSize;
    }
    
    
    
    
}
