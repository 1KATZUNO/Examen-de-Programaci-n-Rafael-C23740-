package Logica_De_Programación;

public class Tipo_Fauna {
    private int imageNumber;

    public Tipo_Fauna() {
        imageNumber = 0;
    }

    public void addImage() {
        imageNumber++;
    }

    public int getImageNumber() {
        return imageNumber;
    }
}