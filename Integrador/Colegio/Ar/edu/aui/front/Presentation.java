package Integrador.Colegio.Ar.edu.aui.front;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Integrador.Colegio.Ar.edu.aui.persist.DataBase;

public class Presentation extends JFrame implements ActionListener {
    private JTextField user;
    private JPasswordField password;
    private JLabel askUser, askPassword;
    private JButton join;
    
    private Toolkit window;
    private Dimension size;
    private int heigth;
    private int width;

    public Presentation (){

        super("Sistema de Gestion: UAI");
        this.window = Toolkit.getDefaultToolkit();
        this.size = window.getScreenSize();
        this.heigth = size.height;
        this.width = size.width; 
        setSize(width/2,heigth/2);
        setLocation(width/4,heigth/4);
        setResizable(true);
        //setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(null);
        askUser = new JLabel("Usuario: ");
        askUser.setForeground(Color.black);
        askUser.setBounds(120,50,200,40);
        askPassword = new JLabel("Contrasenia: ");
        askPassword.setForeground(Color.black);
        askPassword.setBounds(120,150,200,40);
        user = new JTextField(10);
        user.setBounds(120,100,180,30);
        password = new JPasswordField(8);
        password.setBounds(120,200,180,30);
        join = new JButton("ingresar");
        join.setBounds(250, 300, 120, 40);
        join.setBackground(Color.LIGHT_GRAY);
        join.setForeground(Color.BLACK);
        
        add(join);
        add(askUser);
        add(user);
        add(askPassword);
        add(password);
        
        join.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==join){ 
            if(user.getText().trim().equals(DataBase.users[0].getUser())){
                if(password.getText().trim().equals(DataBase.users[0].getPassword())){
                    if(user.getText().trim().equals("admin")){
                        //abre perfil director
                    }
                    else{
                        //abre perfil alumno
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"usuario o contraseña incorrectos");  
            }
        }  
    }
}
