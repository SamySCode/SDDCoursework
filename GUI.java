package ourfirstgui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import ourfirstgui.GUI2;

/**
 *
 * @author mssaib
 */
public class GUI implements ActionListener {

    int count = 0;
    private static JLabel success;
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;

    public GUI() {
        frame = new JFrame();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(null);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.setSize(350, 200);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("User") && password.equals("12345")) {
            success.setText("Login Successful");
            success.setForeground(Color.GREEN);
            frame.dispose();
            GUI2 GUI2;
            GUI2 = new GUI2();
        }
        else {
            success.setForeground(Color.red);
            success.setText("Please try again!");
            }

    }

}