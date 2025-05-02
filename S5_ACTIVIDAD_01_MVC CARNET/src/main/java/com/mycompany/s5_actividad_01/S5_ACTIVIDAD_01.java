
package com.mycompany.s5_actividad_01;

import Controlador.ControladorCarnet;
import Modelo.Datos;
import Vista.VistaCarnet;
import Vista.VistaFormulario;

public class S5_ACTIVIDAD_01 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Datos modelo = new Datos();
            VistaFormulario vista = new VistaFormulario();
            VistaCarnet vistaCarnet = new VistaCarnet();
            new ControladorCarnet(vista, vistaCarnet, modelo);
            vista.setVisible(true);
        });
    }
}
