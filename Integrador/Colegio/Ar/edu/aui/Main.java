package Integrador.Colegio.Ar.edu.aui;
import Integrador.Colegio.Ar.edu.aui.business.Login;
import Integrador.Colegio.Ar.edu.aui.persist.DataBase;
import Integrador.Colegio.Ar.edu.aui.front.Presentation;
import javax.swing.*;

public class Main {
    public static void main(String[] args){

        DataBase b1 = new DataBase();

        //login window
        Presentation p1 = new Presentation();
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setVisible(true);
    }
}



