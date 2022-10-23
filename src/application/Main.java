package application;

import model.Diplomado;
import model.Genero;

public class Main {
    public static void main(String[] args) {

        Diplomado diplomado = new Diplomado("Diplomado en Java", 10);
        diplomado.registrarEstudiante("Juan", "123456789", Genero.MASCULINO);
        diplomado.registrarEstudiante("Maria", "987654321", Genero.FEMENINO);
        diplomado.registrarEstudiante("Pedro", "123456789", Genero.MASCULINO);
        diplomado.registrarEstudiante("Luisa", "987654321", Genero.FEMENINO);
        diplomado.registrarEstudiante("Carlos", "123456789", Genero.MASCULINO);
        diplomado.registrarEstudiante("Ana", "987654321", Genero.FEMENINO);

        diplomado.filtrarPorGenero(Genero.FEMENINO);
        diplomado.buscarPorIdentificacion("987654321");

    }


}