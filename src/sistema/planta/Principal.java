/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

import OPERACIONES.Operaciones;
import java.awt.Toolkit;

/**
 *
 * @author pc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENGRANDES/logo del software.png")));
          this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Educacion = new javax.swing.JButton();
        Operaciones = new javax.swing.JButton();
        info = new javax.swing.JButton();
        Desarrolladores = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));
        jPanel2.setForeground(new java.awt.Color(102, 51, 0));

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Software GardenGrow Learning");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        Educacion.setForeground(new java.awt.Color(153, 51, 0));
        Educacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/icons8-casa-con-jardín-48.png"))); // NOI18N
        Educacion.setToolTipText("Educacion.");
        Educacion.setBorder(null);
        Educacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducacionActionPerformed(evt);
            }
        });

        Operaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/icons8-pila-de-compost-48.png"))); // NOI18N
        Operaciones.setToolTipText("Operaciones.");
        Operaciones.setBorder(null);
        Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionesActionPerformed(evt);
            }
        });

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/icons8-parque-con-farola-48.png"))); // NOI18N
        info.setToolTipText("Sobre el sistema.");
        info.setBorder(null);

        Desarrolladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/icons8-farmer-hombre-48.png"))); // NOI18N
        Desarrolladores.setToolTipText("Desarrolladores.");
        Desarrolladores.setBorder(null);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/icons8-ir-48.png"))); // NOI18N
        Salir.setToolTipText("Salir.");
        Salir.setBorder(null);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Operaciones, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Desarrolladores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Educacion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(Educacion)
                .addGap(37, 37, 37)
                .addComponent(Operaciones)
                .addGap(40, 40, 40)
                .addComponent(info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Desarrolladores)
                .addGap(35, 35, 35)
                .addComponent(Salir)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void EducacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducacionActionPerformed
        
            Menu1 acceso = new Menu1();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
            this.setVisible(false);
    }//GEN-LAST:event_EducacionActionPerformed

    private void OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionesActionPerformed
       Operaciones acceso = new Operaciones();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
            this.setVisible(false);
    }//GEN-LAST:event_OperacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desarrolladores;
    private javax.swing.JButton Educacion;
    private javax.swing.JButton Operaciones;
    private javax.swing.JButton Salir;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
