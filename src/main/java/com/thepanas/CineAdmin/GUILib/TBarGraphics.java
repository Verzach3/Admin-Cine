package com.thepanas.CineAdmin.GUILib;
//------------------->Importations
import javax.swing.*;
import java.awt.*;
/*
TBarGraphics ---------------> V1
 */

//---------------->TBarGraphics
@SuppressWarnings("serial")
public class TBarGraphics extends JPanel {
    private final double[] values;

    private final String title;

    public TBarGraphics(double[] v, String t) {

        values = v;
        title = t;
    }

    //-------------------->PaintComponent
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (values == null || values.length == 0)
            return;
        double minValue = 0;
        double maxValue = 0;
        for (double value : values) {
            if (minValue > value)
                minValue = value;
            if (maxValue < value)
                maxValue = value;
        }

        //-------------------->Dimensiones
        Dimension d = getSize();
        int clientWidth = d.width;
        int clientHeight = d.height;
        int barWidth = clientWidth / values.length;

        //---------------->Cambio de Fuente
        Font titleFont = new Font("Arial", Font.BOLD, 20);
        FontMetrics titleFontMetrics = g.getFontMetrics(titleFont);
        Font labelFont = new Font("Arial", Font.PLAIN, 10);
        FontMetrics labelFontMetrics = g.getFontMetrics(labelFont);

        //----------------->Titulo
        int titleWidth = titleFontMetrics.stringWidth(title);
        int y = titleFontMetrics.getAscent();
        int x = (clientWidth - titleWidth) / 2;
        g.setFont(titleFont);
        g.drawString(title, x, y);
        int top = titleFontMetrics.getHeight();
        int bottom = labelFontMetrics.getHeight();
        if (maxValue == minValue)
            return;
        double scale = (clientHeight - top - bottom) / (maxValue - minValue);
        y = clientHeight - labelFontMetrics.getDescent();
        g.setFont(labelFont);
        int contador = 0; //---------------------------------->Contador definido
        //-------------------->Bucle
        for (int i = 0; i < values.length; i++) {
            int valueX = i * barWidth + 1;
            int valueY = top;
            int height = (int) (values[i] * scale);
            if (values[i] >= 0)
                valueY += (int) ((maxValue - values[i]) * scale);
            else {
                valueY += (int) (maxValue * scale);
                height = -height;
            }
    //-------------------------------------------------->
    //------------------------------------------------->
            g.setColor(Color.BLUE);//--------------------------->Color de las barras (Grafica)
            g.fillRect(valueX, valueY, barWidth - 2, height);//------------------------>Barras
            g.setColor(Color.BLACK);//--------------------------->Color del contorno y letras de dato
            g.drawRect(valueX, valueY, barWidth - 2, height);
            int labelWidth = labelFontMetrics.stringWidth("Datos: "+i); //--------------->Datos muestra los datos ++
            x = i * barWidth + (barWidth - labelWidth) / 2;
            contador++;//----------------------------->Contador de datos
            g.drawString("Datos: "+contador, x, y);//-------------------------------->Datos Ubicacion

            g.drawString("Valor: "+values[i],valueX,valueY);//--------------->Muestra los valores asignados

            //------------------------->Personalizar Barras Color*


        }
    }
}