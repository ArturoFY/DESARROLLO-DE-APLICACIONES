
package Clases;

public class Triangulo {
    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float hallarArea(){
        float area;
        area = (float)(base * altura)/2;
        return area;
    }
    
    public float mostrarArea(){
        return hallarArea();
    }
}
