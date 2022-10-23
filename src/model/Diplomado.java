package model;

import java.util.ArrayList;
import java.util.Comparator;

public class Diplomado {

    private String nombre;

    private Integer cupo;
    private ArrayList<Estudiante> listaEstudiante;

    public Diplomado() {
        this.listaEstudiante = new ArrayList<>();
    }


    public Diplomado(String nombre, Integer cupo) {
        this.listaEstudiante = new ArrayList<>();
        this.nombre = nombre;
        this.cupo = cupo;
    }

    /**
     * metodo que permite registrar un estudiante en el diplomado, si el cupo lo permite, dado su nombre, numero de identificacion y genero
     *
     */
    public void registrarEstudiante(String nombre, String identificacion, Genero genero) {
        if (this.listaEstudiante.size() < this.cupo) {
            Estudiante estudiante = new Estudiante(nombre, identificacion, genero);
            this.listaEstudiante.add(estudiante);
        }
    }

    /**
     * metodo que permite ordenar la lista de estudiantes por genero
     */

    public void ordenarPorGenero() {
        this.listaEstudiante.sort(Comparator.comparing(Estudiante::getGenero));
    }

    /**
     * metodo que permite ordenar la lista de estudiantes por nombre
     */

    public void ordenarPorNombre() {
        this.listaEstudiante.sort(Comparator.comparing(Estudiante::getNombre));
    }

    /**
     * metodo que permite ordenar la lista de estudiantes por identificacion
     */

    public void ordenarPorIdentificacion() {
        this.listaEstudiante.sort(Comparator.comparing(Estudiante::getIdentificacion));
    }

    /**
     * metodo que permite filtrar la lista de estudiantes por genero, dado un genero
     * @param genero
     */

    public void filtrarPorGenero(Genero genero) {
        this.listaEstudiante.stream().filter(estudiante -> estudiante.getGenero().equals(genero)).forEach(System.out::println);
    }

    /**
     * metodo que permite buscar un estudiante por su identificacion, dado un numero de identificacion
     */

    public void buscarPorIdentificacion(String identificacion) {
        this.listaEstudiante.stream().filter(estudiante -> estudiante.getIdentificacion().equals(identificacion)).forEach(System.out::println);
    }
}
