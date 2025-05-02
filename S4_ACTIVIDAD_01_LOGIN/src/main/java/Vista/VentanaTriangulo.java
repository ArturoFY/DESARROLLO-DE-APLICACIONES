
package Vista;
import Clases.Triangulo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class VentanaTriangulo extends javax.swing.JPanel {
    Triangulo tria = new Triangulo();

    public VentanaTriangulo() {
        initComponents();
        formulario();
    }
    
    private void formulario(){
        this.panelIngreso.setBackground(Color.WHITE);
        this.panelOperaciones.setBackground(Color.WHITE);
        this.panelResultado.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        panelOperaciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelResultado = new javax.swing.JPanel();
        lblArea = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        panelIngreso.setAlignmentX(0.0F);
        panelIngreso.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Ingrese Base:");

        txtBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseActionPerformed(evt);
            }
        });
        txtBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBaseKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBaseKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Ingrese Altura:");

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlturaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Operaciones");

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
                        .addGap(15, 15, 15)
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

        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblArea.setForeground(new java.awt.Color(51, 51, 255));
        lblArea.setText("Área:");

        txtResultado.setEditable(false);

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelOperaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseActionPerformed
        // TODO add your handling code here:
        this.btnCalcular.doClick();
        this.txtBase.setText("");
        this.txtBase.requestFocus();
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtBaseActionPerformed

    private void txtBaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBaseKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_txtBaseKeyPressed

    private void txtBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBaseKeyTyped
        // TODO add your handling code here:
        this.btnCalcular.setEnabled(true);
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtBaseKeyTyped

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
        this.btnCalcular.doClick();
        this.txtAltura.setText("");
        this.txtAltura.requestFocus();
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void txtAlturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_txtAlturaKeyPressed

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
        // TODO add your handling code here:
        this.btnCalcular.setEnabled(true);
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtAlturaKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        float base,altura;
        if(txtBase.getText().isEmpty() || txtAltura.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un Valor");
        }else{
            base = Float.parseFloat(txtBase.getText().trim());
            altura = Float.parseFloat(txtAltura.getText().trim());
            tria.setBase(base);
            tria.setAltura(altura);
            tria.hallarArea();
            this.txtResultado.setText(String.valueOf(tria.mostrarArea()));
            this.panelResultado.setVisible(true);
            this.btnNuevo.setEnabled(true);
            this.panelResultado.setBackground(new Color(255,255,255));
        }
        this.txtBase.requestFocus();
        this.btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.txtBase.setText("");
        this.txtAltura.setText("");
        this.txtResultado.setText("");
        this.panelResultado.setVisible(false);
        this.txtBase.requestFocus();
        this.btnNuevo.setEnabled(false);
        this.btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showOptionDialog(this, "Estas seguro de Salir..?", "Area Cuadrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si Salgo","No Salgo"}, "No salgo");
        if(r == 0){
            System.exit(0);
        }
        this.txtBase.requestFocus();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblArea;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
