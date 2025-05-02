
package Controlador;
import Modelo.Cuadrado;
import Vista.CuadradoVista;

public class CuadradoControlador {
    private Cuadrado modelo;
    private CuadradoVista vista;

    public CuadradoControlador(Cuadrado modelo, CuadradoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }
    
    public void setLado(double lado){
        modelo.setLado(lado);
        actualizarVista();
    }
    
    public void actualizarVista(){
        vista.mostrarResultados(modelo.getArea(), modelo.getPerimetro());
    }
    
}
