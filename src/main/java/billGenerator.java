import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

import java.io.*;

public class billGenerator {
    


    
    // Formato de la matriz para las faturas : Pelicula, Tipo de funcion (2D o 3D), Horario, Sala, Clasificacion, Sillas
    
    //Matriz de prueba
    String[] matrizDemoInvoice = {"Jumanji", "2D", "9pm a 11pm", "2", "+12", "A12, A13"};
    //Ruta de destino del pdf
    public static final String DEST = "/home/verzach3/hello.pdf";

    //Funcion principal para general la factura
    public static void generateBill() throws IOException {
 
        PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
        Document document = new Document(pdf);
        document.setTextAlignment(TextAlignment.CENTER);
        document.setFontSize(40);
        String line = "Hello! Welcome to iTextPdf \n como seria mi pana fresco ";
        document.add(new Paragraph(line));

        document.close();

        //Mensaje de confirmacion del pdf
        System.out.println("Factura creada correctamente");
    }
}