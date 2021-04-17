package com.thepanas.CineAdmin.Screens.SupervisorScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Utils.MakeDialog;
import com.thepanas.GUILib.TButton;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class SupervisorLateralPanel extends JPanel implements MouseInputListener {

    /*
     * Se define un objeto main para poder acceder al metodo panelchanger
     */
    Main mainFrame;
    TButton logoutButton = new TButton();
    TButton createUserButton = new TButton();
    TButton createBillBoardButton = new TButton();
    TButton modifyDate = new TButton();
    TButton createShow = new TButton();

    //----------------> Paneles Hijo
    CrearAfiliado crearAfiliado;

    public SupervisorLateralPanel(Main mainFrame) {
        crearAfiliado = new CrearAfiliado(mainFrame);
        /*
         * Se le da valor al objeto panel changer con el frame principal dado en el
         * momento de la definicion del objeto en el main
         */
        this.mainFrame = mainFrame;

        this.setSize(1024, 768);
        this.setLayout(null);

        /// Componentes///


        createUserButton.setLocation(70, 100);
        createUserButton.setSize(120, 45);
        createUserButton.setText("Crear Usuarios");

        createBillBoardButton.setLocation(70, 200);
        createBillBoardButton.setSize(120, 48);
        createBillBoardButton.setText("Registrar película");

        createShow.setLocation(70, 300);
        createShow.setSize(120, 48);
        createShow.setText("Crear función");

        logoutButton.setLocation(70, 400);
        logoutButton.setSize(120, 45);
        logoutButton.setText("Cerrar Sesion");


        this.addMouseListener(this);
        // Leave here
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {

        // Detecta si hay un usuario valido en currentUSer, si no, entonces devuelve el
        // usuario al login
        if (mainFrame.currentUser == null) {
            MakeDialog.makeErrorDialog("La Sesion Expiró", "Error");
            mainFrame.panelChanger(2);
        }
        // Detecta si el usuario actual tiene permisos de Supervisor
        if (mainFrame.currentUser != null && mainFrame.currentUser.getAccessLevel() != 1) {
            MakeDialog.makeErrorDialog("Usuario no autorizado", "Error de autorizacion");
            mainFrame.panelChanger(2);
        }
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.fillRect(0, 0, 300, this.getHeight());
        logoutButton.paintComponent(g2D);
        createUserButton.paintComponent(g2D);
        createBillBoardButton.paintComponent(g2D);
        createShow.paintComponent(g2D);
        // Remover

    }

    public void onExit() {
        this.setVisible(false);

        // El return se usa para decirle al mainframe que Panel deberia de estar
        // mostrandose

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (logoutButton.evenListener(e)) {
            mainFrame.currentUser = null;
            mainFrame.panelChanger(2);
        }
        if(createUserButton.evenListener(e)){
            this.add(crearAfiliado);
        }
        createShow.evenListener(e);
        createBillBoardButton.evenListener(e);

        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        logoutButton.onRelease();
        createUserButton.onRelease();
        createBillBoardButton.onRelease();
        createShow.onRelease();
        logoutButton.onRelease();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {

        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        repaint();
    }
}
