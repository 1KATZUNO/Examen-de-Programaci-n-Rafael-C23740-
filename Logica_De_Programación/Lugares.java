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
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/Barbilla.jpg"), "Nombre: Parque Nacional Barbilla", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Barbilla es un parque nacional ubicado en la provincia de Limón, Costa Rica. \nEs un lugar ideal para la observación de aves y la práctica de actividades al aire libre."));
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/BarraHonda.jpg"), "Nombre: Parque Nacional Barra Honda", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Barra Honda es un parque nacional ubicado en la provincia de Guanacaste, Costa Rica. \nEs un lugar ideal para la práctica de actividades de aventura y la observación de la naturaleza."));
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/BraulioCarrillo.jpg"), "Nombre: Parque Nacional Braulio Carrillo", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Braulio Carrillo es un parque nacional ubicado en la provincia de Heredia, Costa Rica. \nEs un lugar ideal para la observación de la naturaleza y la práctica de actividades al aire libre."));
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/IslaSanLucas.jpg"), "Nombre: Parque Nacional Isla San Lucas", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Isla San Lucas es un parque nacional ubicado en la provincia de Puntarenas, Costa Rica. \nEs un lugar ideal para la observación de la naturaleza y la práctica de actividades de aventura."));
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/ManuelAntonio.jpg"), "Nombre: Parque Nacional Manuel Antonio", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Manuel Antonio es un parque nacional ubicado en la provincia de Puntarenas, Costa Rica. \nEs un lugar ideal para la observación de la naturaleza y la práctica de actividades de aventura."));
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/MarinoLasBaulas.jpg"), "Nombre: Parque Nacional Marino las Baulas", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Marino las Baulas es un parque nacional ubicado en la provincia de Guanacaste, Costa Rica. \nEs un lugar ideal para la observación de la naturaleza y la protección de las tortugas marinas."));
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/RincónDeLaVieja.jpg"), "Nombre: Parque Nacional Rincón de la Vieja", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Rincón de la Vieja es un parque nacional ubicado en la provincia de Guanacaste, Costa Rica. \nEs un lugar ideal para la observación de la naturaleza y la práctica de actividades de aventura."));
        imagenes.add(new Imagen(new ImageIcon("Fotos2/fotos_lugares/VolcánIrazu.jpg"), "Nombre: Parque Nacional Volcán Irazú", "Estado: Sin peligro de extincion", "Descripción: El Parque Nacional Volcán Irazú es un parque nacional ubicado en la provincia de Cartago, Costa Rica. \nEs un lugar ideal para la observación de la naturaleza y la práctica de actividades al aire libre."));

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
