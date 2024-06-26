package Logica_De_Programación;

import javax.swing.ImageIcon;

// Clase Imagen
public class Imagen {
   private ImageIcon imagen;
   private String nombre;
   private String estado;
   private String descripcion;

// objeto imagen para luego pasar a diferentes variables y trabajar con el nopmbre de la imagen y la descripcion de la misma
   public Imagen(ImageIcon imagen, String nombre, String estado, String descripcion) {
       this.imagen = imagen;
       this.nombre = nombre;
       this.estado = estado;
       this.descripcion = descripcion;
   }

   public ImageIcon getImagen() {
       return imagen;
   }

   public String getNombre() {
       return nombre;
   }

   public String getEstado() {
       return estado;
   }

   public String getDescripcion() {
       return descripcion;
   }
}