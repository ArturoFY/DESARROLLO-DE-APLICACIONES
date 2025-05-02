
package Vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaAdmin extends javax.swing.JFrame {
    VentanaCuadrado ventCua = new VentanaCuadrado();
    VentanaTriangulo ventTria = new VentanaTriangulo();
    VentanaCirculo ventCir = new VentanaCirculo();
    VentanaRectangulo ventRect = new VentanaRectangulo();

    public VentanaAdmin() {
        initComponents();
        setTitle("Panel de ADMIN");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.panelFiguras.setBackground(Color.WHITE);

        
        ventCua.setBounds(150,10,360,200);
        ventCua.setVisible(false);
        this.add(ventCua);
        
        ventTria.setBounds(150,10,360,200);
        ventTria.setVisible(false);
        this.add(ventTria);
        
        ventCir.setBounds(150,10,360,200);
        ventCir.setVisible(false);
        this.add(ventCir);
        
        ventRect.setBounds(150,10,360,200);
        ventRect.setVisible(false);
        this.add(ventRect);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFiguras = new javax.swing.JPanel();
        btnCuadrado = new javax.swing.JButton();
        btnRectangulo = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCuadrado.setBackground(new java.awt.Color(51, 51, 255));
        btnCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        btnCuadrado.setText("Cuadrado");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnRectangulo.setBackground(new java.awt.Color(51, 51, 255));
        btnRectangulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRectangulo.setForeground(new java.awt.Color(255, 255, 255));
        btnRectangulo.setText("Rectangulo");
        btnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloActionPerformed(evt);
            }
        });

        btnCirculo.setBackground(new java.awt.Color(51, 51, 255));
        btnCirculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCirculo.setForeground(new java.awt.Color(255, 255, 255));
        btnCirculo.setText("Circulo");
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnTriangulo.setBackground(new java.awt.Color(51, 51, 255));
        btnTriangulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTriangulo.setForeground(new java.awt.Color(255, 255, 255));
        btnTriangulo.setText("Triangulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFigurasLayout = new javax.swing.GroupLayout(panelFiguras);
        panelFiguras.setLayout(panelFigurasLayout);
        panelFigurasLayout.setHorizontalGroup(
            panelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFigurasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCirculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCuadrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRectangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFigurasLayout.setVerticalGroup(
            panelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFigurasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCirculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        // TODO add your handling code here:
        setSize(550, 250);
        ventRect.setVisible(false);
        ventCir.setVisible(false);
        ventTria.setVisible(false);
        ventCua.setVisible(true);
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void btnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloActionPerformed
        // TODO add your handling code here:
        setSize(550, 250);
        ventTria.setVisible(false);
        ventCua.setVisible(false);
        ventCir.setVisible(false);
        ventRect.setVisible(true);
    }//GEN-LAST:event_btnRectanguloActionPerformed

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        // TODO add your handling code here:
        setSize(550, 250);
        ventRect.setVisible(false);
        ventTria.setVisible(false);
        ventCua.setVisible(false);
        ventCir.setVisible(true);
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        // TODO add your handling code here:
        setSize(550, 250);
        ventRect.setVisible(false);
        ventCir.setVisible(false);
        ventCua.setVisible(false);
        ventTria.setVisible(true);
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showOptionDialog(this, "Estas seguro de Salir..?", "Area Cuadrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si Salgo","No Salgo"}, "No salgo");
        if(r == 0){
            dispose();
            new CPrincipal().setVisible(true);            
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JPanel panelFiguras;
    // End of variables declaration//GEN-END:variables
}
