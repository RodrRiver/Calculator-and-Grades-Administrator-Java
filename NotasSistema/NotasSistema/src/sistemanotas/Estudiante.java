package sistemanotas;
import java.util.*;

public class Estudiante {

    public String nombre;
    public double guia;
    public double parcial;
    public double promedio;

    public Estudiante(String nombre, double guia, double parcial) {
        this.nombre = nombre;
        this.guia = guia;
        this.parcial = parcial;
        this.promedio = Math.round((guia * 0.4 + parcial * 0.6) * 10.0) / 10.0;
    }
}
