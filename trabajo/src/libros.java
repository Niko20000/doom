class libros {
protected String NombreLibro;
protected Double FechaDeCreacion;
protected String autor;

public libros (String NombreLibro,Double FechaDeCreacion,String autor  ){
this.NombreLibro = NombreLibro;
this.FechaDeCreacion = FechaDeCreacion;
this.autor = autor;


}

  public void mostrarinformacion() {
        System.out.println("Nombre del libro: " + NombreLibro);
        System.out.println("Fecha de creación: " + FechaDeCreacion);
        System.out.println("Autor: " + autor);

}
}