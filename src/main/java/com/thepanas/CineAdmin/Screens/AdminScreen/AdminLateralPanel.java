package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Screens.AdminScreen.LateralPanelScreens.CreateSupervisorScreen;
import com.thepanas.CineAdmin.Utils.MakeDialog;
import com.thepanas.GUILib.TButton;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class AdminLateralPanel extends JPanel implements MouseInputListener {

    /*
     * Se define un objeto main para poder acceder al metodo panelchanger
     */
    Main mainFrame;
    TButton logoutButton = new TButton();
    TButton createSupervisorButton = new TButton();
    TButton createBillBoardButton = new TButton();
    TButton createShow = new TButton();

    //Paneles hijos
    CreateSupervisorScreen createSupervisorScreen;

    public AdminLateralPanel(Main mainFrame) {
        /*
         * Se le da valor al objeto panel changer con el frame principal dado en el
         * momento de la definicion del objeto en el main
         */
        this.mainFrame = mainFrame;
        createSupervisorScreen = new CreateSupervisorScreen(mainFrame);
        this.setSize(1024, 768);
        this.setLayout(null);

        /// Componentes///
        logoutButton.setLocation(83, 500);
        logoutButton.setSize(100, 45);
        logoutButton.setText("Cerrar Sesion");

        createSupervisorButton.setLocation(73, 71);
        createSupervisorButton.setSize(120, 45);
        createSupervisorButton.setText("Crear Supervisores");

        createBillBoardButton.setLocation(73, 201);
        createBillBoardButton.setSize(113, 48);
        createBillBoardButton.setText("Registrar película");

        createShow.setLocation(73, 331);
        createShow.setSize(113, 48);
        createShow.setText("Crear función");

        this.addMouseListener(this);

        // Leave here
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {

        // Detecta si hay un usuario valido en currentUSer, si no, entonces devuelve el
        // usuario al login
        /*
        if (mainFrame.currentUser == null) {
            MakeDialog.makeErrorDialog("La Sesion Expiró", "Error");
            mainFrame.panelChanger(2);
        }
        // Detecta si el usuario actual tiene permisos de administrador
        if (mainFrame.currentUser != null && mainFrame.currentUser.getAccessLevel() != 0) {
            MakeDialog.makeErrorDialog("Usuario no autorizado", "Error de autorizacion");
            mainFrame.panelChanger(2);
        }
        */

        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.fillRect(0, 0, 258, this.getHeight());
        logoutButton.paintComponent(g2D);
        createSupervisorButton.paintComponent(g2D);
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
        if (createSupervisorButton.evenListener(e)) {
            
            this.add(createSupervisorScreen);
        }
        createBillBoardButton.evenListener(e);

        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        logoutButton.evenListener(e);
        createSupervisorButton.evenListener(e);
        createBillBoardButton.evenListener(e);

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
