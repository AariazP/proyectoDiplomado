package model;

public class Estudiante {

    private String nombre;
    private String identificacion;
    private Genero genero;

    public Estudiante(String nombre, String identificacion, Genero genero) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", genero=" + genero +
                '}';
    }
}
