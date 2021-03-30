package com.thepanas.CineAdmin.Screens;

import com.thepanas.CineAdmin.Types.Usuario;
import com.thepanas.GUILib.TButton;
import com.thepanas.GUILib.TLabel;

import com.thepanas.CineAdmin.Main;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class FirstOpenScreen extends JPanel {

    /**
     * Cada panel tiene que tener definido un objeto de tipo main para poder
     * modificar el frame padre definiendo este main aqui se hace global por lo que
     * se puede modificar desde cualquier sitio.
     */
    private Main admin;

    /**
     * Los componentes tambien se definen como variables globales por la misma razon
     * que el objeto main.
     */
    TButton button1 = new TButton();
    TLabel label1 = new TLabel();
    CreateAdminScreen createAdminScreen;

    /**
     * Constructor del screen, recibe un objeto de tipo main, que contiene un JFrame
     * y un ArrayList que es la base de datos de los usuarios.
     * 
     * @param jframe
     * @param dataBase
     */
    public FirstOpenScreen(Main jframe, ArrayList<Usuario> dataBase) {

        /**
         * El admin se iguala al jframe que le entra para que la variable global tenga
         * un valor
         */
        admin = jframe;

        // Tamaño del panel
        this.setSize(1024, 768);
        // Layout manager del panel
        this.setLayout(null);
        // Tamaño de el boton
        button1.setSize(110, 40);
<<<<<<< Updated upstream
        // Unicacion del boton
        button1.setLocation(500, 400);
        // Texto de el boton
        button1.setText("Comenzar");
        // Ubicacion de el label
        label1.setLocation(400, 40);
        // Texto de el label
=======
        //Unicacion del boton
        button1.setLocation(450, 350);
        //Texto de el boton
        button1.setText("Comenzar");
        //Ubicacion de el label
        label1.setLocation(225, 40);
        //Texto de el label
>>>>>>> Stashed changes
        label1.setText("Bienvenido al Panel de Control de CinemaFilms");
        //Tamaño del texto
        label1.setSize(25);

        eventosMouse();
    }

    // Aqui van los metodos .paintComponent de los componentes
    public void paint(Graphics g) {
        // Se castea(convierte) de Graphics a Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        // Dibujo de los componentes
        button1.paintComponent(g2D);
        label1.paintComponent(g2D);
    }

    // Mouse Handler // Maneja los eventos del mouse
    public void eventosMouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (button1.evenListener(e)) {
                    /* Forma #1 */
                    // Se le asigna valor a la variable del panel definido anteriormente
                    createAdminScreen = new CreateAdminScreen(admin, admin.dataBase);
                    // Se obtienen todos los paneles que tiene el frame y los elimina
                    admin.getContentPane().removeAll();
                    /**
                     * Se pone el panel que definimos anteriormente, a partir de este punto este
                     * panel ya no cuenta y todo pasa al panel que se pone
                     */
                    admin.setContentPane(createAdminScreen);

                    // -----------------------------------------
                    /* Forma #2 */
                    // admin.panelChanger(createAdminScreen, admin); // Solo es comentar la forma #1
                    // y descomentar esta
                }
                // Leave here
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                button1.evenListener(e);
                // Leave here
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                // Leave here
                repaint();
                button1.onRelease();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);

                // Leave here
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                // Leave here
                repaint();
            }
        });
    }
}
