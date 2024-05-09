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
    private List<Imagen> imagenes;
    private int currentImageIndex;

    public Fauna() {
        imagenes = new ArrayList<>();
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/armadillo.jpg"), "Nombre 1", "Estado 1", "Descripción 1"));
        imagenes.add(new Imagen(new ImageIcon("chanchodemonte(peligro).jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("danta.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("guacamayoverde(peligro).jpg.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("Jaguar_(Panthera_onca_palustris)_female_Piquiri_River_2.JPG"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("manatí(peligro).jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("monocapuccino.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("monocongo(peligro).jpg.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("ocelote(peligro).jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("osoperezoso.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("pizote.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("ranaroja.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("TortugaGolfina(peligro).jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("tortugaverde.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("venado.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
     
        imagenes.add(new Imagen(new ImageIcon("imagen16.jpg"), "Nombre 16", "Estado 16", "Descripción 16"));

        // Carga las imágenes en la lista de objetos Imagen
        for (Imagen imagen : imagenes) {
            imagen.getImagen().getImage().flush();
        }
    }

    public void siguienteImagen() {
        currentImageIndex++;
        if (currentImageIndex >= imagenes.size()) {
            currentImageIndex = 0;
        }
    }

    public void anteriorImagen() {
        currentImageIndex--;
        if (currentImageIndex < 0) {
            currentImageIndex = imagenes.size() - 1;
        }
    }

    public ImageIcon getImagen() {
        return imagenes.get(currentImageIndex).getImagen();
    }

    public String getNombre() {
        return imagenes.get(currentImageIndex).getNombre();
    }

    public String getEstado() {
        return imagenes.get(currentImageIndex).getEstado();
    }

    public String getDescripcion() {
        return imagenes.get(currentImageIndex).getDescripcion();
    }
}