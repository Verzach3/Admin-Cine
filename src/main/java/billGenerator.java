import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.tagging.IStructureNode;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

import java.io.*;

public class billGenerator {
    // Formato de la matriz para las faturas : Pelicula, Tipo de funcion (2D o 3D),
    // Horario, Sala, Clasificacion, Sillas

    // Ruta de destino del pdf
    public static final String DEST = "/home/verzach3/hello.pdf";

    // Funcion principal para general la factura
    public static void generateBill(String Pelicula, String Tipo, String Horario, String Sala, String Clasificacion,
            String Sillas) throws IOException {

        PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
        Document document = new Document(pdf);
        document.setTextAlignment(TextAlignment.CENTER);
        document.setFontSize(60);
        String tittle = "Cinema Films \n \n";
        document.add(new Paragraph(tittle));
        document.setFontSize(40);
        document.setTextAlignment(TextAlignment.JUSTIFIED);
        String line = "Tiquete de entrada \n\n";
        document.add(new Paragraph(line));
        String detalles = "Pelicula: "+ Pelicula+ "\nTipo: " + Tipo+"\nHorario: " + Horario+ "\nSala: "+Sala+ "\nClasificacion "+ Clasificacion+"\nSillas: "+Sillas;
        document.add(new Paragraph(detalles));


        document.close();

        // Mensaje de confirmacion del pdf
        System.out.println("Factura creada correctamente");
    }

    public static void generateDemoBill() {
        // Matriz de prueba
        String[] matrizDemoInvoice = { "Jumanji", "2D", "9pm a 11pm", "2", "+12", "A12, A13"};

        try {
            generateBill(matrizDemoInvoice[0], matrizDemoInvoice[1], matrizDemoInvoice[2], matrizDemoInvoice[3],matrizDemoInvoice[4], matrizDemoInvoice[5]);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }

}