/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator_gridlayout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author musialantoni
 */
public class Calculator_GridLayout {
    private static Frame f1;
    private static JTextArea ta;
    private static Button minus;
    private static Button multiplication;
    private static Button reset;
    private static Button seven;
    private static Button eight;
    private static Button nine;
    private static Button six;
    private static Button five;
    private static Button four;
    private static Button three;
    private static Button two;
    private static Button one;
    private static Button zero;
    private static Button doubleZero;
    private static Button point;
    private static Button division;
    private static Button plus;
    private static Button equalSign;
    
    public static void Calculator_GridLayout() {
        f1 = new Frame ("nwm.");
        f1.setLayout (new GridLayout(3, 4));
        f1.setSize (675, 900);
        
        ta = new JTextArea(625, 270);
        JScrollPane scrollPane = new JScrollPane(ta); 
        ta.setEditable(false);
        
        multiplication = new Button ("×");
        minus = new Button ("-");
        reset = new Button ("C");
        seven = new Button ("7");
        eight = new Button ("8");
        nine = new Button ("9");
        six = new Button ("6");
        five = new Button ("5");
        four = new Button ("4");
        three = new Button ("3");
        two = new Button ("2");
        one = new Button ("1");
        zero = new Button ("0");
        doubleZero = new Button ("00");
        point = new Button ("•");
        division = new Button ("÷");
        plus = new Button ("+");
        equalSign = new Button ("=");
        
        f1.add(ta);
        f1.add(multiplication);
        f1.add(minus);
        f1.add(reset);
        f1.add(seven);
        f1.add(eight);
        f1.add(nine);
        f1.add(six);
        f1.add(five);
        f1.add(four);
        f1.add(three);
        f1.add(two);
        f1.add(one);
        f1.add(zero);
        f1.add(doubleZero);
        f1.add(point);
        f1.add(division);
        f1.add(plus);
        f1.add(equalSign);
        
        f1.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        Calculator_GridLayout();
        System.out.println("Hello World!");
    }
}
