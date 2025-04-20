
package Clases;

public class Circulo {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }  
    
    public float hallarArea(){
        float area;
        area = (float)((Math.PI)*(Math.pow(radio, 2)));
        return area;
    }
    
    public float mostrarArea(){
        return hallarArea();
    }
}
