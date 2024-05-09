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
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/armadillo.jpg"), "Nombre: Armadillo", "Estado: Sin peligro de extincion", "Descripción: El armadillo es un mamífero de aspecto único cubierto por una armadura de placas óseas. \nSe encuentra principalmente en América Central y del Sur, y es conocido por su capacidad de enrollarse\n en una bola para protegerse de los depredadores."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/chanchodemonte(peligro).jpg"), "Nombre: Chancho de Monte", "Estado: Peligro de Extinción", "Descripción: El chancho de monte, también conocido como pecarí de labios blancos, es un mamífero perteneciente a la familia \nde los pecaríes, nativo de América Central y del Sur. Se caracteriza por su pelaje oscuro y cerdas blancas en los labios. \nVive en grupos sociales y se alimenta principalmente de frutas, semillas, insectos y pequeños vertebrados."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/danta.jpg"), "Nombre: Danta", "Estado: Sin peligro de extincion", "Descripción: El danta es un mamífero grande y robusto, con una larga trompa y grandes orejas. \nVive en bosques y selvas, y se alimenta de hojas, brotes, frutas y ramas."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/guacamayoverde(peligro).jpg"), "Nombre: Guacamaya Verde", "Estado: Peligro de Extinción", "Descripción: La guacamaya verde es un ave grande y colorida, con plumas verdes y rojas. \nVive en bosques y selvas, y se alimenta de frutas, semillas y nueces."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/iguana.jpg"), "Nombre: Iguana", "Estado: Sin peligro de extincion", "Descripción: La iguana es un reptil grande y robusto, con escamas verdes y una cresta dorsal. \nVive en bosques y selvas, y se alimenta de hojas, flores y frutas."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/Jaguar_(Panthera_onca_palustris)_female_Piquiri_River_2.JPG"), "Nombre: Jaguar", "Estado: Peligro de Extinción", "Descripción: El jaguar es un felino grande y poderoso, con un pelaje amarillento y manchas negras. \nVive en bosques y selvas, y se alimenta de animales grandes y pequeños."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/manatí(peligro).jpg"), "Nombre: Manatí", "Estado: Peligro de Extinción", "Descripción: El manatí es un mamífero acuático grande y robusto, con una piel gris y una cola en forma de remo. \nVive en ríos y lagos, y se alimenta de plantas acuáticas."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/monocongo(peligro).jpg"), "Nombre: Mono Congo", "Estado: Peligro de Extinción", "Descripción: El mono congo es un primate grande y robusto, con un pelaje negro y una cara blanca. \nVive en bosques y selvas, y se alimenta de frutas, semillas y hojas."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/ocelote(peligro).jpg"), "Nombre: Ocelote", "Estado: Peligro de Extinción", "Descripción: El ocelote es un felino pequeñoyesbelto, con un pelaje amarillento y manchas negras. \nVive en bosques y selvas, y se alimenta de aves, reptiles y pequeños mamíferos."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/osoperezoso.jpg"), "Nombre: Oso Perezoso", "Estado: Sin peligro de extincion", "Descripción: El oso perezoso es un mamífero grande y lento, con un pelaje gris y una cola corta. \nVive en bosques y selvas, y se alimenta principalmente de hojas, pero también come frutas, semillas e insectos."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/pizote.jpg"), "Nombre: Pizote", "Estado: Sin peligro de extincion", "Descripción: El pizote es un mamífero pequeño y ágil,  con un pelaje marrón y una cola larga. \nVive en bosques y selvas, y se alimenta de frutas, semillas e insectos."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/ranaroja.jpg"), "Nombre: Rana Roja", "Estado: Sin peligro de extincion", "Descripción: La rana roja es un anfibio pequeño y colorido, con un cuerpo rojo y una piel suave. \nVive en bosques y selvas, y se alimenta de insectos y otros invertebrados."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/TortugaGolfina(peligro).jpg"), "Nombre: Tortuga Golfina", "Estado: Peligro de Extinción", "Descripción: La tortuga golfina es una tortuga marina grande y robusta, con un caparazón gris y una piel blanca. \nVive en océanos y playas, y se alimenta de algas y pequeños animales."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/tortugaverde.jpg"), "Nombre: Tortuga Verde", "Estado: Sin peligro de extincion", "Descripción: La tortuga verde es una tortuga marina grande y robusta, con un caparazón verde y una piel blanca. \nVive en océanos y playas, y se alimenta de algas y pequeños animales."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/tucan.jpg"), "Nombre: Tucán Pico Iris", "Estado: Sin peligro de extincion", "Descripción: El tucán pico iris es una ave grande y colorida, con un pico largo y curvo. \nVive en bosques y selvas, y se alimenta de frutas, semillas y pequeños animales."));
        imagenes.add(new Imagen(new ImageIcon("Fotos/fotos_animales/venado.jpg"), "Nombre: Venado", "Estado: Sin peligro de extincion", "Descripción: El venado es un mamífero grande y robusto, con un pelaje marrón y cuernos largos. \nVive en bosques y selvas, y se alimenta de hojas, brotes y frutas."));
       

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