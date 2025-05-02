
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InversionFeria extends javax.swing.JFrame {

    public InversionFeria() {
        initComponents();
        formulario();
    }

    private void formulario(){
        this.setTitle("Cálculo de Inversión");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.panelDatos.setBackground(new Color(255,255,255));
        this.panelSalida6.setBackground(new Color(255,255,255));
        this.setSize(new Dimension(450,350));
        this.txtMonto6.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelSalida6 = new javax.swing.JPanel();
        txtMonto6 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtResultado6 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Ingrese Monto:");

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setMnemonic('C');
        btnCalcular.setText("Calcular");
        btnCalcular.setToolTipText("Click para calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(51, 204, 0));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setMnemonic('N');
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Clic para nuevo cálculo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 51));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Clic para salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        txtMonto6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMonto6.setForeground(new java.awt.Color(51, 51, 255));
        txtMonto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonto6ActionPerformed(evt);
            }
        });
        txtMonto6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonto6KeyTyped(evt);
            }
        });

        txtResultado6.setColumns(20);
        txtResultado6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtResultado6.setForeground(new java.awt.Color(51, 51, 255));
        txtResultado6.setRows(5);
        jScrollPane7.setViewportView(txtResultado6);

        javax.swing.GroupLayout panelSalida6Layout = new javax.swing.GroupLayout(panelSalida6);
        panelSalida6.setLayout(panelSalida6Layout);
        panelSalida6Layout.setHorizontalGroup(
            panelSalida6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalida6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSalida6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(txtMonto6))
                .addContainerGap())
        );
        panelSalida6Layout.setVerticalGroup(
            panelSalida6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalida6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtMonto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSalida6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSalida6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

        double monto, alquiler, publicidad, transporte, servicios, deco, gastos, total, resto;

        monto = Double.parseDouble(txtMonto6.getText().trim());

        if(monto>0){
            alquiler = monto * .23;
            publicidad = monto * .07;
            transporte = monto * .26;
            servicios = monto * .12;
            deco = monto * .21;
            gastos = monto * .11;
            total = alquiler+publicidad+transporte+servicios+deco+gastos;
            resto = monto - total;

            this.txtResultado6.setText("\tResultados");
            this.txtResultado6.append("\n\t-------------");
            this.txtResultado6.append("\nImporte de Alquiler: S/. "+String.format("%.2f", alquiler));
            this.txtResultado6.append("\nImporte de Publicidad: S/. "+String.format("%.2f", publicidad));
            this.txtResultado6.append("\nImporte de Transporte: S/. "+String.format("%.2f", transporte));
            this.txtResultado6.append("\nImporte de Servicios Feriales: S/. "+String.format("%.2f", servicios));
            this.txtResultado6.append("\nImporte de Decoración: S/. "+String.format("%.2f", deco));
            this.txtResultado6.append("\nImporte de Gastos Varios: S/. "+String.format("%.2f", gastos));
            this.txtResultado6.append("\n\nImporte Total: S/. "+String.format("%.2f", total));
            this.txtResultado6.append("\nResto: S/. "+String.format("%.2f", resto));
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un valor mayor a cero");
            this.txtMonto6.setText("");
            this.txtMonto6.requestFocus();
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:

        this.txtMonto6.setText("");
        this.txtResultado6.setText("");
        this.txtMonto6.requestFocus();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMonto6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonto6KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        String texto = ((javax.swing.JTextField) evt.getSource()).getText();
        boolean numeros = (key >= 48 && key <= 57);
        boolean punto = (key == 46);

        if (!(numeros || (punto && !texto.isEmpty() && !texto.contains(".")))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMonto6KeyTyped

    private void txtMonto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonto6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonto6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InversionFeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InversionFeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InversionFeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InversionFeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InversionFeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelSalida6;
    private javax.swing.JTextField txtMonto6;
    private javax.swing.JTextArea txtResultado6;
    // End of variables declaration//GEN-END:variables
}
