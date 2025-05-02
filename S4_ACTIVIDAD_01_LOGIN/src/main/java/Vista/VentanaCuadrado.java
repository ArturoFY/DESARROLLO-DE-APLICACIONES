
package Vista;
import Clases.Cuadrado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class VentanaCuadrado extends javax.swing.JPanel {
    
        Cuadrado cua = new Cuadrado();

    public VentanaCuadrado() {
        initComponents();
        formulario();
    }          
    
    private void formulario(){
        this.panelIngreso.setBackground(Color.WHITE);
        this.panelOperaciones.setBackground(Color.WHITE);
        this.panelResultado1.setBackground(Color.WHITE);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        panelOperaciones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelResultado1 = new javax.swing.JPanel();
        lblArea1 = new javax.swing.JLabel();
        txtResultado1 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Ingrese Lado:");

        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });
        txtLado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setMnemonic('C');
        btnCalcular.setText("Calcular");
        btnCalcular.setToolTipText("Calcular el área");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Operaciones");

        btnNuevo.setBackground(new java.awt.Color(51, 153, 0));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setMnemonic('N');
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Nuevo cálculo");
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
        btnSalir.setToolTipText("Salir del sistema");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGap(17, 17, 17))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnNuevo)
                    .addComponent(btnSalir))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lblArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblArea1.setForeground(new java.awt.Color(51, 51, 255));
        lblArea1.setText("Área:");

        txtResultado1.setEditable(false);
        txtResultado1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelResultado1Layout = new javax.swing.GroupLayout(panelResultado1);
        panelResultado1.setLayout(panelResultado1Layout);
        panelResultado1Layout.setHorizontalGroup(
            panelResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultado1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelResultado1Layout.setVerticalGroup(
            panelResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea1)
                    .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        // TODO add your handling code here:
        this.btnCalcular.doClick();
        this.txtLado.setText("");
        this.txtLado.requestFocus();
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtLadoActionPerformed

    private void txtLadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_txtLadoKeyPressed

    private void txtLadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoKeyTyped
        // TODO add your handling code here:
        this.btnCalcular.setEnabled(true);
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtLadoKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        float lado;
        if(txtLado.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un Valor");
        }else{
            lado = Float.parseFloat(txtLado.getText().trim());
            cua.setLado(lado);
            cua.hallarArea();
            this.txtResultado1.setText(String.valueOf(cua.mostrarArea()));
            this.panelResultado1.setVisible(true);
            this.btnNuevo.setEnabled(true);
            this.panelResultado1.setBackground(new Color(255,255,255));
        }
        this.txtLado.requestFocus();
        this.btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.txtLado.setText("");
        this.txtResultado1.setText("");
        this.panelResultado1.setVisible(false);
        this.txtLado.requestFocus();
        this.btnNuevo.setEnabled(false);
        this.btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showOptionDialog(this, "Estas seguro de Salir..?", "Area Cuadrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si Salgo","No Salgo"}, "No salgo");
        if(r == 0){
            System.exit(0);
        }
        this.txtLado.requestFocus();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblArea1;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelResultado1;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtResultado1;
    // End of variables declaration//GEN-END:variables
}
