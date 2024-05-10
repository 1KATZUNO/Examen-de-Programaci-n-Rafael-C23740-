package Logica_De_Programación;

import javax.swing.ImageIcon;

/**
 * Principal
 */
public class ImagenLugar {
// objeto imagen para luego pasar a diferentes variables y trabajar con el nopmbre de la imagen y la descripcion de la misma
          private ImageIcon imagen;
   private String nombre;

   private String descripcion;


   public ImagenLugar(ImageIcon imagen, String nombre, String descripcion) {
       this.imagen = imagen;
       this.nombre = nombre;
      
       this.descripcion = descripcion;
   }

   public ImageIcon getImagen() {
       return imagen;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDescripcion() {
       return descripcion;
   }

    }

    
