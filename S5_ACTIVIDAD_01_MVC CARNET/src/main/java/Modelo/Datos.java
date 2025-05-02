
package Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Datos {
    private List<Estudiante> estudiantes;
    private Map<String, List<String>> facultadesCarreras;

    public Datos() {
        estudiantes = new ArrayList<>();
        facultadesCarreras = new HashMap<>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        facultadesCarreras.put("Ingeniería", Arrays.asList("Sistemas y Computación", "Industrial", "Civil", "Arquitectura", "Del Medio Ambiente y Desarrollo"));
        facultadesCarreras.put("Ciencias de la Salud", Arrays.asList("Farmacia y Bioquímica", "Enfermería", "Odontología","Medicina Veterinaria","Nutrición Humana"));
        facultadesCarreras.put("Derecho y Ciencias Políticas", Arrays.asList("Derecho","Educación Inicial","Educación Primaria"));
        facultadesCarreras.put("Ciencias Administrativas y Contables", Arrays.asList("Administración", "Contabilidad y Finanzas", "Administración e Inteligencia de Negocios"));
        facultadesCarreras.put("Medicina", Arrays.asList("Medicina Humana"));
    }

    public List<String> getFacultades() {
        return new ArrayList<>(facultadesCarreras.keySet());
    }

    public List<String> getCarrerasPorFacultad(String facultad) {
        return facultadesCarreras.getOrDefault(facultad, new ArrayList<>());
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Estudiante getUltimoEstudiante() {
        if (estudiantes.isEmpty()) return null;
        return estudiantes.get(estudiantes.size() - 1);
    }
}
