// Clase principal
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Creamos un objeto de la clase libros
        libros libro1 = new libros("Cien años de soledad", 1967.0, "Gabriel García Márquez");
        libro1.mostrarInformacion();
    }
}

// Interfaz que define un comportamiento común
interface InformacionLibro {
    void mostrarInformacion(); // Método abstracto
}

// Clase libros que implementa la interfaz
class libros implements InformacionLibro {
    protected String NombreLibro;
    protected Double FechaDeCreacion;
    protected String autor;

    public libros(String NombreLibro, Double FechaDeCreacion, String autor) {
        this.NombreLibro = NombreLibro;
        this.FechaDeCreacion = FechaDeCreacion;
        this.autor = autor;
    }

    // Implementación del método de la interfaz
    public void mostrarInformacion() {
        System.out.println("Título: " + NombreLibro);
        System.out.println("Fecha de creación: " + FechaDeCreacion);
        System.out.println("Autor: " + autor);
    }
}