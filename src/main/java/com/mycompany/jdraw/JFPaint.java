/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdraw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author anton
 */
public class JFPaint extends JFrame{
    private PaintModel model;
    private DrawingPanel drawingPanel;
    private Tool brushTool;
    private Tool eraserTool;
    
    // Componentes de Interface
    private JPanel controlPanel;
    private JButton brushButton;
    private JButton eraserButton;
    private JComboBox<String> cbxColor;
    private JComboBox<String> cbxSize;
    
    public JFPaint(){
        setTitle("Java Drawing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Inicializar as ferramentas
        model = new PaintModel();
        brushTool = new BrushTool(model);
        eraserTool = new EraserTool(model);
        
        //Criar a tela de desenho
        drawingPanel = new DrawingPanel(brushTool);
        add(drawingPanel, BorderLayout.CENTER);
        
        // Criar a barra de ferramentas
        controlPanel = new JPanel();
        controlPanel.setBackground(new Color(152, 152, 152));
        controlPanel.setPreferredSize(new Dimension(0,50));
        
        //Criar o botão pincel
        brushButton = new JButton("Pincel");
        brushButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                drawingPanel.setTool(brushTool);
            }
        });
        
        //Criar o botão borracha
        eraserButton = new JButton("Borracha");
        eraserButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                drawingPanel.setTool(eraserTool);
            }
        });
        
        //Combo para a seleção das cores
    }
}
