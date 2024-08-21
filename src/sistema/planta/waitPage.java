/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer; 
import java.io.IOException; 
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


/**
 *
 * @author USUARIO.LABORATORIO
 */
public class waitPage extends javax.swing.JFrame {

    /**
     * Creates new form waitPage
     */
    public waitPage() {
        initComponents();
        iconImage();
        
        System.out.println("bbsote");
     
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENGRANDES/logo del software.png")));
        
        this.setLocationRelativeTo(null);
        
        Connection cn;
        Statement st;
        
        //musica
       AudioPlayer();
        ////////////////////////////// HASTA AQUI TERMINA LA MUSICA
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(waitPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/plantas","root", "");
            Statement stmt = cn.createStatement();
            //stmt.executeUpdate("INSERT INTO usuarios VALUES('001','Cesar','Perez','22545875','casa los mangos','cesar24@gmail.com', '+58414754485','profeCesar','profe1234') ");
        } catch (SQLException ex) {
            Logger.getLogger(waitPage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos");
            OpenXAMPP();
        }
            System.out.println("conectado");
        
    }

    private void AudioPlayer() {
        // Inicializa JavaFX (solo si es necesario)
        new JFXPanel();

        try {
            // Ruta al archivo de audio
            File audioFile = new File("magicINTRO.mp3");
            if (!audioFile.exists()) {
                throw new IllegalArgumentException("El archivo de audio no existe: " + audioFile.getAbsolutePath());
            }

            // Crea el objeto Media y MediaPlayer
            String audioPath = audioFile.toURI().toString();
            MediaPlayer mediaPlayer = new MediaPlayer(new Media(audioPath));

            // Reproduce el audio
            mediaPlayer.play();

            // Espera a que el audio termine de reproducirse
            // (opcional, solo si quieres que el programa espere hasta que termine la reproducción)
            mediaPlayer.setOnEndOfMedia(() -> System.out.println("Reproducción finalizada"));
            mediaPlayer.play();
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al reproducir el audio: " + e.getMessage());
        }
        
//To change body of generated methods, choose Tools | Templates.
    }
    
    public void iconImage() {
        ImageIcon icono = new ImageIcon("src/Imagenes/img/eagle.jpg");
        this.setIconImage(icono.getImage());
    }

    private void OpenXAMPP() {
     
        try {
        // Ruta al ejecutable de XAMPP
        String xamppPath = "C:\\xampp\\xampp-control.exe";
       

        // Ejecuta el comando para abrir XAMPP
        Runtime.getRuntime().exec(xamppPath);
        System.out.println("XAMPP iniciado correctamente");

        
    } catch (IOException e) {
        e.printStackTrace();
    }
       
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/Software GardenGrow Learning.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(waitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               waitPage waitPage = new waitPage();
                waitPage.setVisible(true);
                int delay = (7000);
                Timer timer = new Timer(delay, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        waitPage.dispose();// Cerrar el JFrame actual 
                
                    // Abrir otro JFrame
                new Menu1().setVisible(true);
            }
        });
            // Iniciar el temporizador
                timer.setRepeats(false); // Para que se ejecute solo una vez
                timer.start();    
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
