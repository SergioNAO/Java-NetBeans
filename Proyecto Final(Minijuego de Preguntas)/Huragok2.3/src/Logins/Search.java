/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;


import static Logins.PreguntasRandom.flujo;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author liond
 */
public class Search extends javax.swing.JDialog  {
File archivo;


    private static final long serialVersionUID = 1L;
    String p;
    Question recibe;
    PreguntasRandom e;
    public Search(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        BTNModificar.setVisible(true);
        SpinnerNumberModel s = new SpinnerNumberModel();
        s.setMaximum(49);
        s.setMinimum(0);
        s.setStepSize(1);
       // ESPI.setModel(s);
        
        e= new PreguntasRandom();
        recibe= new Question();
         ImageIcon imagen= new ImageIcon("src/imagesp/hr.jpg");
         Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(ETIFondo.getWidth(),ETIFondo.getHeight(),Image.SCALE_DEFAULT));
         ETIFondo.setIcon(icono);
        this.repaint();
    
    }
    
   public Search() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        txtPregunta1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        txtRes1 = new javax.swing.JTextField();
        txtRes2 = new javax.swing.JTextField();
        txtRes3 = new javax.swing.JTextField();
        btnMo = new javax.swing.JButton();
        jRes = new javax.swing.JTextField();
        jNum = new javax.swing.JTextField();
        BTNModificar = new javax.swing.JButton();
        txtTema = new javax.swing.JTextField();
        TXTSubTema = new javax.swing.JTextField();
        ETIFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");
        getContentPane().setLayout(null);

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("<--  Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(700, 40, 110, 30);

        txtPregunta1.setBackground(new java.awt.Color(204, 204, 204));
        txtPregunta1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPregunta1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregunta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        txtPregunta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPregunta1MouseClicked(evt);
            }
        });
        txtPregunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta1ActionPerformed(evt);
            }
        });
        txtPregunta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPregunta1KeyPressed(evt);
            }
        });
        getContentPane().add(txtPregunta1);
        txtPregunta1.setBounds(210, 190, 330, 70);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICACION DE PREGUNTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 10, 300, 80);

        txtUnidad.setBackground(new java.awt.Color(204, 204, 204));
        txtUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        txtUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtUnidad);
        txtUnidad.setBounds(30, 110, 260, 60);

        txtRes1.setBackground(new java.awt.Color(204, 204, 204));
        txtRes1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        txtRes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRes1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtRes1);
        txtRes1.setBounds(30, 280, 330, 70);

        txtRes2.setBackground(new java.awt.Color(204, 204, 204));
        txtRes2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        getContentPane().add(txtRes2);
        txtRes2.setBounds(400, 280, 330, 70);

        txtRes3.setBackground(new java.awt.Color(204, 204, 204));
        txtRes3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        txtRes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRes3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtRes3);
        txtRes3.setBounds(190, 380, 330, 70);

        btnMo.setBackground(new java.awt.Color(0, 153, 0));
        btnMo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnMo.setForeground(new java.awt.Color(255, 255, 255));
        btnMo.setText("Agregar");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMo);
        btnMo.setBounds(690, 490, 140, 30);

        jRes.setBackground(new java.awt.Color(204, 204, 204));
        jRes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        jRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResActionPerformed(evt);
            }
        });
        getContentPane().add(jRes);
        jRes.setBounds(190, 480, 330, 70);

        jNum.setBackground(new java.awt.Color(204, 204, 204));
        jNum.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jNum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        getContentPane().add(jNum);
        jNum.setBounds(70, 190, 90, 70);

        BTNModificar.setBackground(new java.awt.Color(0, 153, 0));
        BTNModificar.setForeground(new java.awt.Color(255, 255, 255));
        BTNModificar.setText("Modificar Preguntas");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNModificar);
        BTNModificar.setBounds(690, 440, 140, 30);

        txtTema.setBackground(new java.awt.Color(204, 204, 204));
        txtTema.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        getContentPane().add(txtTema);
        txtTema.setBounds(320, 110, 280, 70);

        TXTSubTema.setBorder(javax.swing.BorderFactory.createTitledBorder("Subtema"));
        TXTSubTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTSubTemaActionPerformed(evt);
            }
        });
        getContentPane().add(TXTSubTema);
        TXTSubTema.setBounds(560, 190, 260, 70);
        getContentPane().add(ETIFondo);
        ETIFondo.setBounds(0, 0, 880, 560);

        setBounds(0, 0, 889, 599);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login prin;
        prin=new Login();
        this.dispose();
        prin.setVisible(true);
          prin.setLocationRelativeTo(null) ;

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta1ActionPerformed
      
    }//GEN-LAST:event_txtPregunta1ActionPerformed

    private void txtPregunta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPregunta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta1MouseClicked

    private void txtPregunta1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregunta1KeyPressed
        
    }//GEN-LAST:event_txtPregunta1KeyPressed

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
            String T,S,N,U,P,R1,R2,R3,R;
     T=txtTema.getText().trim();   
     S=TXTSubTema.getText().trim();
     N=jNum.getText().trim();
     U=txtUnidad.getText().trim();
     P=txtPregunta1.getText().trim(); 
     R1=txtRes1.getText().trim();
     R2=txtRes2.getText().trim();
     R3=txtRes3.getText().trim();
     R=jRes.getText().trim();
        try {
            PreguntasRandom.crearFilePreguntas( new File("preguntas.dat") );
            PreguntasRandom.añadirPregunta( new Preguntas(U,T,S,N,P,R1,R2,R3,R) );
            PreguntasRandom.mostrar();
            PreguntasRandom.cerrar();
            JOptionPane.showMessageDialog(this, "El registro se realizó correctamente.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la escritura de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnMoActionPerformed

    private void txtRes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRes1ActionPerformed

    private void txtRes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRes3ActionPerformed

    private void jResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jResActionPerformed

    private void txtUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
    try {  
         String T,S,N,U,P,R1,R2,R3,R;
         T=txtTema.getText().trim();
         S=TXTSubTema.getText().trim();
     N=jNum.getText().trim();
     U=txtUnidad.getText().trim();
     P=txtPregunta1.getText().trim(); 
     R1=txtRes1.getText().trim();
     R2=txtRes2.getText().trim();
     R3=txtRes3.getText().trim();
     R=jRes.getText().trim();
        PreguntasRandom.crearFilePreguntas( new File("preguntas.dat") );
        flujo.seek(0*PreguntasRandom.tamañoRegistro);
        flujo.writeUTF(T);
        flujo.writeUTF(S);
        flujo.writeUTF(U);
        flujo.writeUTF(N);
        flujo.writeUTF(P);
        flujo.writeUTF(R1);
        flujo.writeUTF(R2);
        flujo.writeUTF(R3);
        flujo.writeUTF(R);
                PreguntasRandom.cerrar();
    } catch (IOException ex) {
        Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.out.println("hecho");
        
       
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void TXTSubTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTSubTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTSubTemaActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {  public void run() {
                Search dialog = new Search(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNModificar;
    private javax.swing.JLabel ETIFondo;
    private javax.swing.JTextField TXTSubTema;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jNum;
    private javax.swing.JTextField jRes;
    private javax.swing.JTextField txtPregunta1;
    private javax.swing.JTextField txtRes1;
    private javax.swing.JTextField txtRes2;
    private javax.swing.JTextField txtRes3;
    private javax.swing.JTextField txtTema;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
