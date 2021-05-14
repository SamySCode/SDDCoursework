/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author samuelasare
 */


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
JLabel NameOfPage = new JLabel("");
private JLabel Listofstudent = new JLabel("Students");
private JLabel Listofprojects = new JLabel("Projects");
private JLabel ListofStudentsAllocated = new JLabel("Students Allocated");

 private JTextArea textboxstudents = new JTextArea();
private JTextArea textboxprojects = new JTextArea();
private JTextArea textboxStudentsAllocated = new JTextArea();

 GUI2(){
NameOfPage.setBounds(0, 0, 200, 35);
NameOfPage.setFont(new Font(null, Font.PLAIN, 25));

 Listofstudent.setBounds(400, 30, 250, 35);
Listofstudent.setFont(new Font(null, Font.BOLD, 20));

 Listofprojects.setBounds(100, 30, 250, 35);
Listofprojects.setFont(new Font(null, Font.BOLD, 20));

 ListofStudentsAllocated.setBounds(700, 30, 250, 35);
ListofStudentsAllocated.setFont(new Font(null, Font.BOLD, 20));

 textboxstudents.setBounds(400, 80, 230, 400);
textboxstudents.setForeground(Color.black);
textboxstudents.setFont(new Font("Arial", Font.ITALIC, 14));
textboxstudents.setLineWrap(true);
textboxstudents.setRows(10);

 textboxprojects.setBounds(100, 80, 230, 400);
textboxprojects.setForeground(Color.BLACK);
textboxprojects.setFont(new Font("Arial", Font.ITALIC, 14));
textboxprojects.setLineWrap(true);

 textboxStudentsAllocated.setBounds(700, 80, 230, 400);
textboxStudentsAllocated.setForeground(Color.BLACK);
textboxStudentsAllocated.setFont(new Font("Arial", Font.ITALIC, 14));
textboxStudentsAllocated.setLineWrap(true);

 frame.add(textboxStudentsAllocated);
frame.add(textboxprojects);
frame.add(textboxstudents);
frame.add(ListofStudentsAllocated);
frame.add(Listofstudent);
frame.add(Listofprojects);
frame.add(NameOfPage);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(1000, 800);
frame.setLayout(null);
frame.setVisible(true);
}
}
