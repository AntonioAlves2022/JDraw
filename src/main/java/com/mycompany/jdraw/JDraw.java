/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdraw;

import javax.swing.JFrame;

/**
 *
 * @author anton
 */
public class JDraw {

    public static void main(String[] args) {
        JFPaint form = new JFPaint();
        form.setExtendedState(JFrame.MAXIMIZED_BOTH);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
        
    }
}
