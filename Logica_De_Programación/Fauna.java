// Paquete Logica_De_Programación
package Logica_De_Programación;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fauna {
    private List<ImageIcon> imagenes;
    private int indiceImagen;

    public Fauna() {
        imagenes = new ArrayList<>();
        indiceImagen = 0;
    }

    public void cargarImagenes(String ruta) {
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();

        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().endsWith(".jpg")) {
                try {
                    BufferedImage imagenOriginal = ImageIO.read(archivo);
                    int ancho = 500;
                    int alto = 500;
                    BufferedImage imagenEscalada = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
                    Graphics2D g = imagenEscalada.createGraphics();
                    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g.drawImage(imagenOriginal, 0, 0, ancho, alto, null);
                    g.dispose();
                    imagenes.add(new ImageIcon(imagenEscalada));
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error loading image: " + archivo.getName(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void siguienteImagen() {
        indiceImagen++;
        if (indiceImagen >= imagenes.size()) {
            indiceImagen = 0;
        }
    }

    public void anteriorImagen() {
        indiceImagen--;
        if (indiceImagen < 0) {
            indiceImagen = imagenes.size() - 1;
        }
    }

    public ImageIcon getImagen() {
        return imagenes.get(indiceImagen);
    }
}