
package Controlador;

import Modelo.Datos;
import Vista.VistaFormulario;
import Modelo.Estudiante;
import Vista.VistaCarnet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorCarnet {
    
    private VistaFormulario vista;
    private VistaCarnet vistaCarnet;
    private Datos modelo;
    private DefaultTableModel modeloTabla;


    public ControladorCarnet(VistaFormulario vista, VistaCarnet vistaCarnet, Datos modelo) {
        this.vista = vista;
        this.vistaCarnet = vistaCarnet;
        this.modelo = modelo;

        modeloTabla = new DefaultTableModel(new Object[]{"Nombres", "Apellidos", "Facultad", "Carrera", "Código", "DNI"}, 0);
        vista.tablaEstudiantes.setModel(modeloTabla);
        
        vista.btnRegistrar.addActionListener(e -> registrarEstudiante());
        
        vista.btnGenerar.addActionListener(e -> generarCarnet());
        
        cargarFacultades();
        
        vista.cbFacultad.addActionListener(e -> actualizarCarreras());
    }
    
    private void registrarEstudiante() {
        // Validación: campos vacíos
        if (
            vista.txtNombres.getText().trim().isEmpty() ||
            vista.txtApellidos.getText().trim().isEmpty() ||
            vista.txtCodigo.getText().trim().isEmpty() ||
            vista.txtDni.getText().trim().isEmpty()
        ) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos antes de registrar.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Datos
        String nombres = vista.txtNombres.getText().trim();
        String apellidos = vista.txtApellidos.getText().trim();
        String facultad = vista.cbFacultad.getSelectedItem().toString();
        String carrera = vista.cbCarrera.getSelectedItem().toString();
        String codigo = vista.txtCodigo.getText().trim();
        String dni = vista.txtDni.getText().trim();

        // Validación: DNI o código duplicado
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String codExistente = modeloTabla.getValueAt(i, 4).toString();
            String dniExistente = modeloTabla.getValueAt(i, 5).toString();
            if (codigo.equals(codExistente)) {
                JOptionPane.showMessageDialog(null, "Ya existe un estudiante con ese código.", "Duplicado", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (dni.equals(dniExistente)) {
                JOptionPane.showMessageDialog(null, "Ya existe un estudiante con ese DNI.", "Duplicado", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Agregar a tabla
        modeloTabla.addRow(new Object[]{nombres, apellidos, facultad, carrera, codigo, dni});

        // Limpiar campos
        vista.txtNombres.setText("");
        vista.txtApellidos.setText("");
        vista.txtCodigo.setText("");
        vista.txtDni.setText("");
        vista.cbFacultad.setSelectedIndex(0);
        vista.cbCarrera.setSelectedIndex(0);

        JOptionPane.showMessageDialog(null, "Estudiante registrado correctamente.");
    }
    
    private void generarCarnet() {
        int fila = vista.tablaEstudiantes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estudiante para generar su carnet.", "Sin selección", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener datos del estudiante seleccionado
        String nombres = modeloTabla.getValueAt(fila, 0).toString();
        String apellidos = modeloTabla.getValueAt(fila, 1).toString();
        String facultad = modeloTabla.getValueAt(fila, 2).toString();
        String carrera = modeloTabla.getValueAt(fila, 3).toString();
        String codigo = modeloTabla.getValueAt(fila, 4).toString();
        String dni = modeloTabla.getValueAt(fila, 5).toString();

        // Crear texto del carnet
        String carnetTexto = "\tCARNET UNIVERSITARIO\n\n" +
                             "Nombres: \n\t" + nombres + "\n" +
                             "Apellidos: \n\t" + apellidos + "\n" +
                             "Facultad: \n\t" + facultad + "\n" +
                             "Carrera: \n\t" + carrera + "\n" +
                             "Código: \n\t" + codigo + "\n" +
                             "DNI: \n\t" + dni;

        // Crear y mostrar la ventana VistaCarnet
        VistaCarnet ventanaCarnet = new VistaCarnet(); // Es un JFrame Form
        ventanaCarnet.txtResultado.setText(carnetTexto);
        ventanaCarnet.setLocationRelativeTo(null); // Centrar la ventana
        ventanaCarnet.setVisible(true);
    }
    
    private void cargarFacultades() {
        for (String fac : modelo.getFacultades()) {
            vista.cbFacultad.addItem(fac);
        }
        actualizarCarreras();
    }

    private void actualizarCarreras() {
        String fac = (String) vista.cbFacultad.getSelectedItem();
        vista.cbCarrera.removeAllItems();
        for (String car : modelo.getCarrerasPorFacultad(fac)) {
            vista.cbCarrera.addItem(car);
        }
    }    
}
