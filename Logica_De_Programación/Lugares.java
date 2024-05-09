// Paquete Logica_De_Programación
package Logica_De_Programación;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Lugares {
    private List<Imagen> imagenes;
    private int currentImageIndex;

    public Lugares() {
        imagenes = new ArrayList<>();
    imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/armadillo.jpg"), "Armadillo", "Estado: Sin peligro de extincion", "Descripción: Un animal muy amable"));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/chanchodemonte(peligro).jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/danta.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/guacamayoverde(peligro).jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/Jaguar_(Panthera_onca_palustris)_female_Piquiri_River_2.JPG"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/manatí(peligro).jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/monocapuccino.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/monocongo(peligro).jpg.jpg"), "Nombre 2", "Estado 2", "Descripción 2"));

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
