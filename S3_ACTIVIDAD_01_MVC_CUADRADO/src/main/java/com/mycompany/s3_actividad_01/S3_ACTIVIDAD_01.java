
package com.mycompany.s3_actividad_01;

import Controlador.CuadradoControlador;
import Modelo.Cuadrado;
import Vista.CuadradoVista;

public class S3_ACTIVIDAD_01 {

    public static void main(String[] args) {
        Cuadrado modelo = new Cuadrado();
        CuadradoVista vista = new CuadradoVista();
        CuadradoControlador controlador = new CuadradoControlador(modelo, vista);
    }
}
