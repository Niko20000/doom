public class Enciclopedia extends Libros {
    private int volumen;

    public Enciclopedia(String nombreLibro, Double fechaDeCreacion, String autor, int volumen) {
        super(nombreLibro, fechaDeCreacion, autor);
        this.volumen = volumen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Enciclopedia: " + NombreLibro + " (" + FechaDeCreacion.intValue() + "), Autor: " + autor + ", Volumen: " + volumen);
    }
}