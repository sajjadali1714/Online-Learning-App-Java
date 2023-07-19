/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sajjad.ali
 */
public class MsgBox {

    static JFrame f;

    MsgBox() {
        
    }
    public static void showMsg(String Msg){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, Msg);
    }
}
