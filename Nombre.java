public class Nombre extends libros {
    private String libreria;

    public Nombre(String nombreLibro, Double fechaDeCreacion, String autor, String libreria) {
        super(nombreLibro, fechaDeCreacion, autor); 
        this.libreria = libreria;
    }
    @Override
 public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Nombre de la librería: " + libreria);
        System.out.println("Fecha de creación: " + FechaDeCreacion);
        System.out.println("Autor: " + autor);
    }

    public void mostrarNombreLibro() {
        System.out.println(" Nombre del libro: " + NombreLibro);
    }
}