/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaBotones;

import java.awt.Color;

/**
 *
 * @author sergio
 */
public class Colores extends javax.swing.JFrame {

    
    public Colores() {
        initComponents();
        Grupo1.add(RBrojo);
        Grupo1.add(RBazul);
        Grupo1.add(RBamarillo);
        Grupo1.add(RBverde);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RBrojo = new javax.swing.JRadioButton();
        RBamarillo = new javax.swing.JRadioButton();
        RBverde = new javax.swing.JRadioButton();
        RBazul = new javax.swing.JRadioButton();
        Barra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RBrojo.setText("Rojo");
        RBrojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBrojoActionPerformed(evt);
            }
        });

        RBamarillo.setText("Amarillo");
        RBamarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBamarilloActionPerformed(evt);
            }
        });

        RBverde.setText("Verde");
        RBverde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBverdeActionPerformed(evt);
            }
        });

        RBazul.setText("Azul");
        RBazul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBazulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RBamarillo)
                    .addComponent(RBazul, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBverde, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBrojo, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(RBrojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBamarillo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBverde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBazul)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Barra)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraActionPerformed
        
    }//GEN-LAST:event_BarraActionPerformed

    private void RBrojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBrojoActionPerformed
        // TODO add your handling code here:
        Barra.setBackground(Color.red);
    }//GEN-LAST:event_RBrojoActionPerformed

    private void RBamarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBamarilloActionPerformed
        // TODO add your handling code here:
        Barra.setBackground(Color.yellow);
    }//GEN-LAST:event_RBamarilloActionPerformed

    private void RBverdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBverdeActionPerformed
        // TODO add your handling code here:
        Barra.setBackground(Color.green);
    }//GEN-LAST:event_RBverdeActionPerformed

    private void RBazulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBazulActionPerformed
        // TODO add your handling code here:
        Barra.setBackground(Color.blue);
    }//GEN-LAST:event_RBazulActionPerformed

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
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Barra;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JRadioButton RBamarillo;
    private javax.swing.JRadioButton RBazul;
    private javax.swing.JRadioButton RBrojo;
    private javax.swing.JRadioButton RBverde;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
