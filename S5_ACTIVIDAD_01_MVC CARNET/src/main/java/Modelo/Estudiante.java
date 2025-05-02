
package Modelo;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private String facultad;
    private String carrera;
    private String codigo;
    private String dni;

    public Estudiante(String nombres, String apellidos, String facultad, String carrera, String codigo, String dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.facultad = facultad;
        this.carrera = carrera;
        this.codigo = codigo;
        this.dni = dni;
    }

    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getFacultad() { return facultad; }
    public String getCarrera() { return carrera; }
    public String getCodigo() { return codigo; }
    public String getDni() { return dni; }
}
