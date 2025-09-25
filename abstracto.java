public abstract class Libros {
    protected String nombreLibro;
    protected Double fechaDeCreacion;
    protected String autor;

    public Libros(String nombreLibro, Double fechaDeCreacion, String autor) {
        this.nombreLibro = nombreLibro;
        this.fechaDeCreacion = fechaDeCreacion;
        this.autor = autor;
    }

    // Método abstracto (debe ser implementado por subclases)
    public abstract void mostrarInformacion();

    // Método concreto (opcional)
    public void saludar() {
        System.out.println("Este es un libro del sistema bibliotecario.");
    }
}
