package com.thepanas.CineAdmin.Screens.AdminScreen;

import com.thepanas.CineAdmin.Main;
import com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens.CreateMovie;
import com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens.CreateMovieFunction;
import com.thepanas.CineAdmin.Screens.AdminScreen.AdminScreens.CreateSupervisorScreen;
import com.thepanas.CineAdmin.Screens.EditDataScreen;
import com.thepanas.CineAdmin.Screens.SupervisorScreen.CrearAfiliado;
import com.thepanas.CineAdmin.GUILib.TButton;
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
    TButton registerMovieButton = new TButton();
    TButton createMovieFunctionButton = new TButton();
    TButton createAffiliateButton = new TButton();
    TButton createAdmin = new TButton();
    //Paneles hijos
    CreateMovieX createMovieX;
    CreateSupervisorScreen createSupervisorScreen; //0
    CreateAdmin createAdminScreen; //1
    CrearAfiliado crearAfiliado; //2
    CreateMovie createMovie; //3
    EditDataScreen editDataScreen;//4
    CreateMovieFunction createMovieFunction; //5

   public void hideAll(){
       createSupervisorScreen.setVisible(false);
       createAdminScreen.setVisible(false);
       crearAfiliado.setVisible(false);
       createMovie.setVisible(false);
       editDataScreen.setVisible(false);
       createMovieFunction.setVisible(false);
   }

    public void changeOption(int option){
       hideAll();
        switch (option){
            case 0:
                createSupervisorScreen.setVisible(true);
                break;
            case 1:
                createAdminScreen.setVisible(true);
                break;
            case 2:
                crearAfiliado.setVisible(true);
                break;
            case 3:
                createMovie.setVisible(true);
                break;
            case 4:
                editDataScreen.setVisible(true);
                break;
            case 5:
                createMovieFunction.setVisible(true);
                break;
        }
    }

    public AdminLateralPanel(Main mainFrame) {
        /*
         * Se le da valor al objeto panel changer con el frame principal dado en el
         * momento de la definicion del objeto en el main
         */
        this.mainFrame = mainFrame;

        createMovieFunction = new CreateMovieFunction(mainFrame);
        this.add(createMovieFunction);
        createMovieFunction.setVisible(false);

        createSupervisorScreen = new CreateSupervisorScreen(mainFrame);
        this.add(createSupervisorScreen);
        createSupervisorScreen.setVisible(false);

        createAdminScreen = new CreateAdmin(mainFrame);
        this.add(createAdminScreen);
        createAdminScreen.setVisible(false);

        crearAfiliado = new CrearAfiliado(mainFrame);
        this.add(crearAfiliado);
        crearAfiliado.setVisible(false);

        createMovie = new CreateMovie(mainFrame);
        editDataScreen = new EditDataScreen(mainFrame);
        this.add(editDataScreen);
        editDataScreen.setVisible(false);


        this.setSize(1024, 768);
        this.setLayout(null);

        /// Componentes///
        logoutButton.setLocation(90, 600);
        logoutButton.setSize(100, 45);
        logoutButton.setText("Cerrar Sesion");

        createSupervisorButton.setLocation(73, 170);
        createSupervisorButton.setSize(140, 48);
        createSupervisorButton.setText("Crear Supervisor");

        createAdmin.setLocation(73, 70);
        createAdmin.setSize(139, 48);
        createAdmin.setText("Crear Admin");

        createAffiliateButton.setLocation(73, 270);
        createAffiliateButton.setSize(140, 48);
        createAffiliateButton.setText("Crear Afiliado");

        registerMovieButton.setLocation(73, 370);
        registerMovieButton.setSize(140, 48);
        registerMovieButton.setText("Registrar Pelicula");

        createMovieFunctionButton.setLocation(73, 470);
        createMovieFunctionButton.setSize(140, 48);
        createMovieFunctionButton.setText("Estadistica");

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
        registerMovieButton.paintComponent(g2D);
        createMovieFunctionButton.paintComponent(g2D);
        createAffiliateButton.paintComponent(g2D);
        createAdmin.paintComponent(g2D);
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
            this.add(createSupervisorScreen).setVisible(true);
            this.add(createMovie).setVisible(true);
            this.add(crearAfiliado).setVisible(true);
            this.add(createAdminScreen).setVisible(true);
        }

        if(registerMovieButton.evenListener(e)){
            this.add(createMovie).setVisible(true);
            this.add(createSupervisorScreen).setVisible(true);
            this.add(crearAfiliado).setVisible(true);
            this.add(createAdminScreen).setVisible(true);
        }

        if(createAffiliateButton.evenListener(e)){
            this.add(crearAfiliado).setVisible(true);
            this.add(createMovie).setVisible(true);
            this.add(createSupervisorScreen).setVisible(true);
            this.add(createAdminScreen).setVisible(true);
        }

        if (createAdmin.evenListener(e)){
            this.add(createAdminScreen).setVisible(true);
            this.add(crearAfiliado).setVisible(true);
            this.add(createMovie).setVisible(true);
            this.add(createSupervisorScreen).setVisible(true);
        }

        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        logoutButton.onRelease();
        createSupervisorButton.onRelease();
        registerMovieButton.onRelease();
        createAffiliateButton.onRelease();
        createAdmin.onRelease();
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
