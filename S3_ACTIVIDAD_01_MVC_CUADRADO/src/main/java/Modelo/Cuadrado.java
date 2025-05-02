
package Modelo;

public class Cuadrado {
    
    private double lado;
    private double area;
    private double perimetro;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double area, double perimetro) {
        this.lado = lado;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    public double calcularArea(){
        this.area = lado*lado;
        return area;
    }
    public double calcularPerimetro(){
        this.perimetro = lado * 4;
        return perimetro;
    }   
    

    
}
