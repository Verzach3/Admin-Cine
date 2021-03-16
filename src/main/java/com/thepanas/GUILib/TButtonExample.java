package com.thepanas.GUILib;

import java.awt.Dimension;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;

class TButtonExample extends JFrame {

    private static final long serialVersionUID = 1L;
    TButton button = new TButton();
    TCheckBox checkBox = new TCheckBox();
    TLabel label = new TLabel();
    TInputBox inputbox = new TInputBox();

    TButtonExample(){
        this.setSize(new Dimension(1024,768));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        button.setSize(110, 40);
        button.setLocation(50, 50);

        checkBox.setSize(20);
        checkBox.setLocation(60, 150);

        label.setLocation(201, 60);
        label.setText("Hola mi pana");
        label.setSize(20);

        inputbox.setLocation(200, 100);
        inputbox.setSize(150, 20);

        eventosMouse();
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        button.paintComponent(g2D);
        checkBox.paintComponent(g2D);
        label.paintComponent(g2D);
        inputbox.paintComponent(g2D);
    }

    //Mouse Handler
    public void eventosMouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                
                //Leave here
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                //Click boton
                if(e.getX() >= button.getX() && e.getX() <= button.WIDTH + button.getX() && e.getY() >= button.getY() && e.getY() <= button.HEIGHT + button.getY()){
                  button.onClick();
                }
                //Click checkbox
                if(e.getX() >= checkBox.getX() && e.getX() <= checkBox.SIZE + checkBox.getX() && e.getY() >= checkBox.getY() && e.getY() <= checkBox.SIZE + checkBox.getY()){
                  checkBox.onClick();
                }
                //Click inputbox
                if(e.getX() >= inputbox.getX() && e.getX() <= inputbox.WIDTH + inputbox.getX() && e.getY() >= inputbox.getY() && e.getY() <= inputbox.HEIGHT + inputbox.getY()){

                    inputbox.onClick();
                }


                //Leave here
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                button.onRelease();
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

    public static void main(String[] args) {
        TButtonExample frame = new TButtonExample();
        frame.setVisible(true);


    }
}
