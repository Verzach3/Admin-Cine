package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Types.User;
import com.thepanas.CineAdmin.Utils.MakeDialog;
import com.thepanas.GUILib.TButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class AdminLateralPanel extends JPanel{

    /*
    Se define un objeto main para poder acceder al metodo panelchanger
     */
    Main mainFrame;
    TButton logoutButton = new TButton();
    TButton createUserButton = new TButton();
    TButton createBillBoardButton = new TButton();
    TButton createShow = new TButton();

    public AdminLateralPanel(Main mainFrame, ArrayList<User> dataBase){
        /*
        Se le da valor al objeto panel changer con el frame principal dado en el momento de la definicion del objeto en
        el main
         */
        this.mainFrame = mainFrame;

        this.setSize(258,768);
        this.setLayout(null);

        ///Componentes///
        logoutButton.setLocation(83,500);
        logoutButton.setSize(97,45);
        logoutButton.setText("Cerrar Sesion");

        createUserButton.setLocation(73,71);
        createUserButton.setSize(113,45);
        createUserButton.setText("Crear Usuarios");

        createBillBoardButton.setLocation(73, 201);
        createBillBoardButton.setSize(113, 48);
        createBillBoardButton.setText("Registrar película");

        createShow.setLocation(73, 331);
        createShow.setSize(113,48);
        createShow.setText("Crear función");

        //Leave here
        eventosMouse();
    }

    //Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g){

        //Detecta si hay un usuario valido en currentUSer, si no, entonces devuelve el usuario al login
        if (mainFrame.currentUser == null) {
            MakeDialog.makeErrorDialog("La Sesion Expiró", "Error");
            mainFrame.panelChanger(2);
        }
        //Detecta si el usuario actual tiene permisos de administrador
        if (mainFrame.currentUser != null && mainFrame.currentUser.getAccessLevel() != 0){
            MakeDialog.makeErrorDialog("Usuario no autorizado", "Error de autorizacion");
            mainFrame.panelChanger(2);
        }
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.fillRect(0,0,this.getWidth(),this.getHeight());
        logoutButton.paintComponent(g2D);
        createUserButton.paintComponent(g2D);
        createBillBoardButton.paintComponent(g2D);
        createShow.paintComponent(g2D);
        //Remover


    }


    public void onExit(){
        this.setVisible(false);

        //El return se usa para decirle al mainframe que Panel deberia de estar mostrandose

    }

    //Mouse Handler // Maneja los eventos del mouse
    public void eventosMouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);

                //Leave here
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);

                if (logoutButton.evenListener(e)){
                    mainFrame.currentUser = null;
                    mainFrame.panelChanger(2);
                }
                createUserButton.evenListener(e);
                createBillBoardButton.evenListener(e);




                //Leave here
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);

                logoutButton.evenListener(e);
                createUserButton.evenListener(e);
                createBillBoardButton.evenListener(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);

                //Leave here
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                //Leave here
                repaint();
            }
        });
    }
}
