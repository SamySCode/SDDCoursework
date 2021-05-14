/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourfirstgui;

/**
 *
 * @author mssaib
 */

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class GUI2 {

 JFrame frame = new JFrame();
JLabel pageLabel = new JLabel("");
private JLabel studentLabel = new JLabel("Students");
private JLabel projectLabel = new JLabel("Projects");
private JLabel studentsProjectLabel = new JLabel("Students Allocated");

 private JTextArea studentstextfield = new JTextArea();
private JTextArea projectstextfield = new JTextArea();
private JTextArea studentsallocatedtextfield = new JTextArea();

 GUI2(){
pageLabel.setBounds(0, 0, 200, 35);
pageLabel.setFont(new Font(null, Font.PLAIN, 25));

 studentLabel.setBounds(400, 30, 250, 35);
studentLabel.setFont(new Font(null, Font.BOLD, 20));

 projectLabel.setBounds(100, 30, 250, 35);
projectLabel.setFont(new Font(null, Font.BOLD, 20));

 studentsProjectLabel.setBounds(700, 30, 250, 35);
studentsProjectLabel.setFont(new Font(null, Font.BOLD, 20));

 studentstextfield.setBounds(400, 80, 230, 400);
studentstextfield.setForeground(Color.black);
studentstextfield.setFont(new Font("Arial", Font.ITALIC, 14));
studentstextfield.setLineWrap(true);
studentstextfield.setRows(10);

 projectstextfield.setBounds(100, 80, 230, 400);
projectstextfield.setForeground(Color.BLACK);
projectstextfield.setFont(new Font("Arial", Font.ITALIC, 14));
projectstextfield.setLineWrap(true);

 studentsallocatedtextfield.setBounds(700, 80, 230, 400);
studentsallocatedtextfield.setForeground(Color.BLACK);
studentsallocatedtextfield.setFont(new Font("Arial", Font.ITALIC, 14));
studentsallocatedtextfield.setLineWrap(true);

 frame.add(studentsallocatedtextfield);
frame.add(projectstextfield);
frame.add(studentstextfield);
frame.add(studentsProjectLabel);
frame.add(studentLabel);
frame.add(projectLabel);
frame.add(pageLabel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(1000, 800);
frame.setLayout(null);
frame.setVisible(true);
}
}