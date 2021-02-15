import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

import java.io.*;

public class billGenerator {
    // Formato de la matriz para las faturas : Pelicula, Tipo de funcion (2D o 3D),
    // Horario, Sala, Clasificacion, Sillas

    // Ruta de destino del pdf
    public static final String DEST = "/home/verzach3/hello.pdf";
    static String path = System.getProperty("user.dir");

    // Funcion principal para general la factura
    public static void saveBill(String Pelicula, String Tipo, String Horario, String Sala, String Clasificacion,
            String Sillas, String Filename) throws IOException {

        PdfDocument pdf = new PdfDocument(new PdfWriter(path + "/"+Filename+".pdf"));
        Document document = new Document(pdf);

        // Titulo
        // Se centra el titulo
        document.setTextAlignment(TextAlignment.CENTER);
        // Tamaño de letra del titulo
        document.setFontSize(60);
        // Strings del titulo
        String tittle = "Cinema Films \n \n";
        // Se añade el titulo al documento
        document.add(new Paragraph(tittle));
        // Tiquete
        // Se coloca el tamaño de la fuente
        document.setFontSize(40);
        // Se coloca la alineacion del texto
        document.setTextAlignment(TextAlignment.JUSTIFIED);
        // String
        String line = "Tiquete de entrada \n\n";
        // Se añade al documento
        document.add(new Paragraph(line));
        // Cuerpo de la factura
        String detalles = "Pelicula: " + Pelicula + "\nTipo: " + Tipo + "\nHorario: " + Horario + "\nSala: " + Sala
                + "\nClasificacion " + Clasificacion + "\nSillas: " + Sillas;
        // Se añade el cuerpo de la factura al documento
        document.add(new Paragraph(detalles));
        // Se cierra el documento (ya no se pueden hacer mas cambios si se cierra)
        document.close();

        // Imprime el directorio donde se encuentra la clase
        System.out.println("Working Directory = " + path);
        // Mensaje de confirmacion del pdf
        System.out.println("Factura creada correctamente");
    }

    public static void generateBill(String Pelicula, String Tipo, String Horario, String Sala, String Clasificacion,String Sillas, String Filename) {
        try {
            saveBill(Pelicula, Tipo, Horario, Sala, Clasificacion, Sillas, Filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar la factura");
        }


    }

    //Genera una factura demo
    public static void generateDemoBill() {
        // Matriz de prueba
        String[] matrizDemoInvoice = { "Jumanji", "2D", "9pm a 11pm", "2", "+12", "A12, A13"};

        
        try {
            saveBill(matrizDemoInvoice[0], matrizDemoInvoice[1], matrizDemoInvoice[2], matrizDemoInvoice[3],matrizDemoInvoice[4], matrizDemoInvoice[5], "DemoBill");
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }

}