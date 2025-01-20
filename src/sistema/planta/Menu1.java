/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

import CICLODELAGUA.Agua1;
import CICLODELAGUA.Coleccion;
import CICLODELAGUA.InporAgua;
import CICLODELAGUA.Precipitacion;
import CICLODELAGUA.RAICES;
import CICLODELAGUA.ciclo;
import CICLODELAGUA.ciclo4;
import CICLODELAGUA.condensacion;
import CICLODELAGUA.evaporacion;
import CLIMA.Antartico;
import CLIMA.Continental;
import CLIMA.Desertico;
import CLIMA.Mediterraneo;
import CLIMA.Templado;
import CLIMA.Tropical;
import CLIMA.subTropical;
import JARDIN.Adaptacion1;
import JARDIN.IntroPreparacion;
import JARDIN.Mantenimiento1;
import JARDIN.PreparacionS1;
import JARDIN.TiposSuelos1;
import JARDIN.introDiseño;
import OPERACIONES.Operaciones;
import Plantas.Margaritas1;
import TiposDeRiesgos.Climas;
import TiposDeRiesgos.Lluvias;
import TiposDeRiesgos.Plagas;
import TiposDeRiesgos.RiesgosComunes;
import TiposDeRiesgos.TiposDeTierra;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author pc
 */
public class Menu1 extends javax.swing.JFrame {
 
    public Menu1() {
        initComponents(); 
        this.setTitle("Menu principal");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENGRANDES/logo del software.png")));
        this.setLocationRelativeTo(null);
        
      
        //this.setResizable(false);
        
    }
   
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Bienvenida = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        Riesgos = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea27 = new javax.swing.JTextArea();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextArea29 = new javax.swing.JTextArea();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextArea30 = new javax.swing.JTextArea();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextArea32 = new javax.swing.JTextArea();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        Lluviaslbl = new javax.swing.JLabel();
        Tierralbl = new javax.swing.JLabel();
        Climaslbl = new javax.swing.JLabel();
        Plagaslbl = new javax.swing.JLabel();
        comuneslbl = new javax.swing.JLabel();
        Clima = new javax.swing.JPanel();
        SubTropical = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        antartico = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        continental = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        tropical = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        mediterraneo = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        Desertico = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        Templado = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        Plantas = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Int_Plantas = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        Margaritas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Amapolas_Rosas = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextArea31 = new javax.swing.JTextArea();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextArea33 = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextArea34 = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextArea35 = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Ixoras = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextArea40 = new javax.swing.JTextArea();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextArea41 = new javax.swing.JTextArea();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextArea42 = new javax.swing.JTextArea();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextArea43 = new javax.swing.JTextArea();
        Rosas_Desierto = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextArea36 = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea37 = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextArea38 = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea39 = new javax.swing.JTextArea();
        jLabel81 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        Tulipanes = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTextArea44 = new javax.swing.JTextArea();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextArea45 = new javax.swing.JTextArea();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextArea46 = new javax.swing.JTextArea();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextArea47 = new javax.swing.JTextArea();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        Bugambilia = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextArea48 = new javax.swing.JTextArea();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextArea49 = new javax.swing.JTextArea();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTextArea50 = new javax.swing.JTextArea();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextArea51 = new javax.swing.JTextArea();
        Azalea = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTextArea52 = new javax.swing.JTextArea();
        jScrollPane54 = new javax.swing.JScrollPane();
        jTextArea53 = new javax.swing.JTextArea();
        jScrollPane55 = new javax.swing.JScrollPane();
        jTextArea54 = new javax.swing.JTextArea();
        jScrollPane56 = new javax.swing.JScrollPane();
        jTextArea55 = new javax.swing.JTextArea();
        Genciana = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane57 = new javax.swing.JScrollPane();
        jTextArea56 = new javax.swing.JTextArea();
        jScrollPane58 = new javax.swing.JScrollPane();
        jTextArea57 = new javax.swing.JTextArea();
        jScrollPane59 = new javax.swing.JScrollPane();
        jTextArea58 = new javax.swing.JTextArea();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jScrollPane60 = new javax.swing.JScrollPane();
        jTextArea59 = new javax.swing.JTextArea();
        Primula = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jScrollPane61 = new javax.swing.JScrollPane();
        jTextArea60 = new javax.swing.JTextArea();
        jScrollPane62 = new javax.swing.JScrollPane();
        jTextArea61 = new javax.swing.JTextArea();
        jLabel104 = new javax.swing.JLabel();
        jScrollPane63 = new javax.swing.JScrollPane();
        jTextArea62 = new javax.swing.JTextArea();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane64 = new javax.swing.JScrollPane();
        jTextArea63 = new javax.swing.JTextArea();
        Hortensia = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane65 = new javax.swing.JScrollPane();
        jTextArea64 = new javax.swing.JTextArea();
        jScrollPane66 = new javax.swing.JScrollPane();
        jTextArea65 = new javax.swing.JTextArea();
        jLabel107 = new javax.swing.JLabel();
        jScrollPane67 = new javax.swing.JScrollPane();
        jTextArea66 = new javax.swing.JTextArea();
        jLabel108 = new javax.swing.JLabel();
        jScrollPane68 = new javax.swing.JScrollPane();
        jTextArea67 = new javax.swing.JTextArea();
        Begonia = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane69 = new javax.swing.JScrollPane();
        jTextArea68 = new javax.swing.JTextArea();
        jScrollPane70 = new javax.swing.JScrollPane();
        jTextArea69 = new javax.swing.JTextArea();
        jLabel110 = new javax.swing.JLabel();
        jScrollPane71 = new javax.swing.JScrollPane();
        jTextArea70 = new javax.swing.JTextArea();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane72 = new javax.swing.JScrollPane();
        jTextArea71 = new javax.swing.JTextArea();
        Narciso = new javax.swing.JPanel();
        Brezo = new javax.swing.JPanel();
        Gardenia = new javax.swing.JPanel();
        Helecho = new javax.swing.JPanel();
        Diente_Leon = new javax.swing.JPanel();
        Fresa = new javax.swing.JPanel();
        Rododendro = new javax.swing.JPanel();
        Llanten = new javax.swing.JPanel();
        Achicoria = new javax.swing.JPanel();
        Quenopodio = new javax.swing.JPanel();
        Boca_De_dragon = new javax.swing.JPanel();
        Caléndula = new javax.swing.JPanel();
        Mastuerzo_marino = new javax.swing.JPanel();
        Tagetes = new javax.swing.JPanel();
        Árbol_del_amor = new javax.swing.JPanel();
        Jardin = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        adaptacion = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        introDiseños = new javax.swing.JButton();
        Tsuelos = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        CicloDeAgua1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz");
        setBackground(new java.awt.Color(0, 153, 102));
        setName("MenuPrincipal"); // NOI18N
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 0));
        jTabbedPane1.setForeground(new java.awt.Color(51, 255, 0));
        jTabbedPane1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1049, 903));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1064, 900));

        Bienvenida.setBackground(new java.awt.Color(0, 153, 153));
        Bienvenida.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        Bienvenida.setForeground(new java.awt.Color(0, 51, 0));
        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida.setPreferredSize(new java.awt.Dimension(1064, 870));
        Bienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane23.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));

        jTextArea22.setEditable(false);
        jTextArea22.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 23)); // NOI18N
        jTextArea22.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea22.setTabSize(0);
        jTextArea22.setText(" Es un honor recibirte en este fascinante mundo de la jardinería escolar y el cuidado \n de nuestras plantas. Exploraremos juntos la diversidad de las plantas y su adapta\n ción a diferentes tierras y climas, lo que te permitirá comprender mejor su cuidado \n y mantenimiento. Este es un lugar para experimentar, aprender y compartir tu pasi-\n ón por la naturaleza.");
        jTextArea22.setWrapStyleWord(true);
        jTextArea22.setBorder(null);
        jScrollPane23.setViewportView(jTextArea22);

        Bienvenida.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 150));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/pngwing.com (6).png"))); // NOI18N
        Bienvenida.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, 610));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/plantas.png"))); // NOI18N
        Bienvenida.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        jScrollPane24.setBorder(null);

        jTextArea23.setEditable(false);
        jTextArea23.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextArea23.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea23.setTabSize(0);
        jTextArea23.setText(" Aprenderás a identificar los riesgos que pueden afectar \n a tus plantas y cómo prevenirlos, asegurando un entor-\n no saludable para que florezcan.");
        jTextArea23.setWrapStyleWord(true);
        jTextArea23.setBorder(null);
        jScrollPane24.setViewportView(jTextArea23);

        Bienvenida.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 570, 80));

        jLabel51.setBackground(new java.awt.Color(255, 204, 204));
        jLabel51.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 0));
        jLabel51.setText("Hola! Bienvenidos a nuestro espacio educativo.");
        Bienvenida.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, -1, -1));

        jLabel52.setBackground(new java.awt.Color(255, 204, 204));
        jLabel52.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 0));
        jLabel52.setText("Aqui aprenderas sobre:");
        Bienvenida.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel53.setBackground(new java.awt.Color(255, 204, 204));
        jLabel53.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 0));
        jLabel53.setText("1*");
        Bienvenida.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jScrollPane25.setBorder(null);

        jTextArea24.setEditable(false);
        jTextArea24.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextArea24.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea24.setTabSize(0);
        jTextArea24.setText(" Abordaremos temas como la selección de plantas, \n el uso sostenible de recursos, la planificación del \n espacio y las tendencias actuales en jardinería.");
        jTextArea24.setWrapStyleWord(true);
        jTextArea24.setBorder(null);
        jScrollPane25.setViewportView(jTextArea24);

        Bienvenida.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 510, 70));

        jLabel54.setBackground(new java.awt.Color(255, 204, 204));
        jLabel54.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 0));
        jLabel54.setText("2*");
        Bienvenida.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel55.setBackground(new java.awt.Color(255, 204, 204));
        jLabel55.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 0));
        jLabel55.setText("3*");
        Bienvenida.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        jScrollPane26.setBorder(null);

        jTextArea25.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextArea25.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea25.setTabSize(0);
        jTextArea25.setText(" Los secretos del ciclo del agua y cómo este elemento vital \n influye en el crecimiento y bienestar de las plantas. ");
        jTextArea25.setWrapStyleWord(true);
        jTextArea25.setBorder(null);
        jScrollPane26.setViewportView(jTextArea25);

        Bienvenida.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 590, 60));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/ciclo del agua.png"))); // NOI18N
        Bienvenida.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 160, 90));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/riesgos.png"))); // NOI18N
        Bienvenida.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 160, 140));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/jardin.png"))); // NOI18N
        Bienvenida.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        jButton9.setBackground(new java.awt.Color(0, 204, 204));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/maceta.png"))); // NOI18N
        jButton9.setText("Volver al menu principal.");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Bienvenida.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 360, 50));

        jTabbedPane1.addTab("Bienvenida ", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Bienvenida); // NOI18N

        Riesgos.setBackground(new java.awt.Color(255, 204, 0));
        Riesgos.setPreferredSize(new java.awt.Dimension(1064, 870));

        jScrollPane7.setBorder(null);

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea6.setLineWrap(true);
        jTextArea6.setTabSize(0);
        jTextArea6.setText("Las plantas, aunque vitales para el equilibrio ecológico y la salud de\nlos ecosistemas, enfrentan una serie de riesgos tanto naturales \ncomo inducidos por el hombre. Estos riesgos pueden comprometer \nsu crecimiento, desarrollo y longevidad. Los factores climáticos, \ncomo lluvias excesivas o sequías, así como las condiciones del suelo,\nla presencia de plagas, y hasta la exposición a contaminantes, son \ndeterminantes que pueden afectar su salud. Conocer estos riesgos\nes esencial para entender cómo proteger y cuidar las plantas de \nmanera adecuada. Por ejemplo, las lluvias intensas pueden provocar \nencharcamientos que asfixian las raíces, mientras que la falta de \nagua puede causar marchitez y deshidratación. El tipo de suelo \ntambién juega un papel crucial: un suelo compactado puede impedir \nel desarrollo radicular mientras que uno con alta salinidad puede ser \ntóxico. Los insectos, como pulgones o orugas, y los hongos, pueden \ncausar enfermedades que debilitan las plantas. La protección de las \nplantas implica una comprensión profunda de estos riesgos para im\nplementar medidas preventivas que aseguren su bienestar y promu\nevan un crecimiento saludable.");
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setBorder(null);
        jScrollPane7.setViewportView(jTextArea6);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/Cuidado de plantas2.png"))); // NOI18N
        jLabel29.setText("jLabel29");

        jScrollPane22.setBorder(null);

        jTextArea21.setEditable(false);
        jTextArea21.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea21.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jTextArea21.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea21.setLineWrap(true);
        jTextArea21.setTabSize(0);
        jTextArea21.setText("TIPOS DE RIESGOS\n");
        jTextArea21.setWrapStyleWord(true);
        jTextArea21.setBorder(null);
        jScrollPane22.setViewportView(jTextArea21);

        jScrollPane27.setBorder(null);

        jTextArea26.setEditable(false);
        jTextArea26.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea26.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jTextArea26.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea26.setTabSize(0);
        jTextArea26.setText("RIESGOS");
        jTextArea26.setWrapStyleWord(true);
        jTextArea26.setBorder(null);
        jScrollPane27.setViewportView(jTextArea26);

        jScrollPane28.setBorder(null);

        jTextArea27.setEditable(false);
        jTextArea27.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea27.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea27.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea27.setTabSize(0);
        jTextArea27.setText("Plagas");
        jTextArea27.setWrapStyleWord(true);
        jTextArea27.setBorder(null);
        jScrollPane28.setViewportView(jTextArea27);

        jScrollPane29.setBorder(null);

        jTextArea28.setEditable(false);
        jTextArea28.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea28.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea28.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea28.setTabSize(0);
        jTextArea28.setText("Lluvias");
        jTextArea28.setWrapStyleWord(true);
        jTextArea28.setBorder(null);
        jScrollPane29.setViewportView(jTextArea28);

        jScrollPane30.setBorder(null);

        jTextArea29.setEditable(false);
        jTextArea29.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea29.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea29.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea29.setTabSize(0);
        jTextArea29.setText("Climas");
        jTextArea29.setWrapStyleWord(true);
        jTextArea29.setBorder(null);
        jScrollPane30.setViewportView(jTextArea29);

        jScrollPane31.setBorder(null);

        jTextArea30.setEditable(false);
        jTextArea30.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea30.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea30.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea30.setLineWrap(true);
        jTextArea30.setTabSize(0);
        jTextArea30.setText("Riesgos comunes");
        jTextArea30.setWrapStyleWord(true);
        jTextArea30.setBorder(null);
        jScrollPane31.setViewportView(jTextArea30);

        jScrollPane33.setBorder(null);

        jTextArea32.setEditable(false);
        jTextArea32.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea32.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea32.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea32.setLineWrap(true);
        jTextArea32.setTabSize(0);
        jTextArea32.setText("Tipos de tierra");
        jTextArea32.setWrapStyleWord(true);
        jTextArea32.setBorder(null);
        jScrollPane33.setViewportView(jTextArea32);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/photosynthesis.png"))); // NOI18N
        jLabel84.setText("jLabel84");

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/garden.png"))); // NOI18N
        jLabel85.setText("jLabel84");

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/planting.png"))); // NOI18N
        jLabel86.setText("jLabel84");

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/save-nature.png"))); // NOI18N
        jLabel87.setText("jLabel84");

        Lluviaslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTiposDeRiesgos/Lluviasova.png"))); // NOI18N
        Lluviaslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LluviaslblMouseClicked(evt);
            }
        });

        Tierralbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTiposDeRiesgos/tipo de tierraova.png"))); // NOI18N
        Tierralbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TierralblMouseClicked(evt);
            }
        });

        Climaslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTiposDeRiesgos/climasova_1.png"))); // NOI18N
        Climaslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClimaslblMouseClicked(evt);
            }
        });

        Plagaslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTiposDeRiesgos/bichosova.png"))); // NOI18N
        Plagaslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlagaslblMouseClicked(evt);
            }
        });

        comuneslbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTiposDeRiesgos/riesgos comunesova.png"))); // NOI18N
        comuneslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comuneslblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RiesgosLayout = new javax.swing.GroupLayout(Riesgos);
        Riesgos.setLayout(RiesgosLayout);
        RiesgosLayout.setHorizontalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RiesgosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(RiesgosLayout.createSequentialGroup()
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RiesgosLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RiesgosLayout.createSequentialGroup()
                                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lluviaslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tierralbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RiesgosLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                        .addComponent(Climaslbl)
                                        .addGap(22, 22, 22))
                                    .addComponent(Plagaslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comuneslbl)
                                    .addGroup(RiesgosLayout.createSequentialGroup()
                                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(RiesgosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        RiesgosLayout.setVerticalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RiesgosLayout.createSequentialGroup()
                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RiesgosLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34)))
                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RiesgosLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jLabel86)))
                    .addGroup(RiesgosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RiesgosLayout.createSequentialGroup()
                                .addComponent(Climaslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                .addComponent(Lluviaslbl)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tierralbl, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(Plagaslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comuneslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Riesgos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/parasito.png")), Riesgos); // NOI18N

        Clima.setBackground(new java.awt.Color(255, 204, 204));
        Clima.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 80, 5, new java.awt.Color(0, 0, 0)));
        Clima.setPreferredSize(new java.awt.Dimension(1064, 870));
        Clima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTropical.setBackground(new java.awt.Color(255, 204, 204));
        SubTropical.setOpaque(false);
        SubTropical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubTropicalMouseClicked(evt);
            }
        });

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/reproduce-el-video.png"))); // NOI18N

        javax.swing.GroupLayout SubTropicalLayout = new javax.swing.GroupLayout(SubTropical);
        SubTropical.setLayout(SubTropicalLayout);
        SubTropicalLayout.setHorizontalGroup(
            SubTropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubTropicalLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addGap(64, 64, 64))
        );
        SubTropicalLayout.setVerticalGroup(
            SubTropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubTropicalLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel79)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        Clima.add(SubTropical, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 220, 220));

        antartico.setBackground(new java.awt.Color(255, 204, 204));
        antartico.setOpaque(false);
        antartico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antarticoMouseClicked(evt);
            }
        });

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/reproduce-el-video.png"))); // NOI18N

        javax.swing.GroupLayout antarticoLayout = new javax.swing.GroupLayout(antartico);
        antartico.setLayout(antarticoLayout);
        antarticoLayout.setHorizontalGroup(
            antarticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(antarticoLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel69)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        antarticoLayout.setVerticalGroup(
            antarticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(antarticoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel69)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        Clima.add(antartico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 490, 230));

        continental.setBackground(new java.awt.Color(255, 204, 204));
        continental.setName("continental"); // NOI18N
        continental.setOpaque(false);
        continental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continentalMouseClicked(evt);
            }
        });

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/reproduce-el-video.png"))); // NOI18N

        javax.swing.GroupLayout continentalLayout = new javax.swing.GroupLayout(continental);
        continental.setLayout(continentalLayout);
        continentalLayout.setHorizontalGroup(
            continentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continentalLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel80)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        continentalLayout.setVerticalGroup(
            continentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continentalLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel80)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        Clima.add(continental, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 260, 300));
        continental.getAccessibleContext().setAccessibleName("continental");

        tropical.setBackground(new java.awt.Color(255, 204, 204));
        tropical.setOpaque(false);
        tropical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tropicalMouseClicked(evt);
            }
        });
        tropical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tropicalKeyPressed(evt);
            }
        });

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/sol.png"))); // NOI18N

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/reproduce-el-video.png"))); // NOI18N

        javax.swing.GroupLayout tropicalLayout = new javax.swing.GroupLayout(tropical);
        tropical.setLayout(tropicalLayout);
        tropicalLayout.setHorizontalGroup(
            tropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tropicalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addContainerGap())
            .addGroup(tropicalLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel75)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        tropicalLayout.setVerticalGroup(
            tropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tropicalLayout.createSequentialGroup()
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel75)
                .addGap(109, 109, 109))
        );

        Clima.add(tropical, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 380, 390));

        mediterraneo.setBackground(new java.awt.Color(255, 204, 204));
        mediterraneo.setOpaque(false);
        mediterraneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediterraneoMouseClicked(evt);
            }
        });

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/reproduce-el-video.png"))); // NOI18N

        javax.swing.GroupLayout mediterraneoLayout = new javax.swing.GroupLayout(mediterraneo);
        mediterraneo.setLayout(mediterraneoLayout);
        mediterraneoLayout.setHorizontalGroup(
            mediterraneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediterraneoLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel76)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        mediterraneoLayout.setVerticalGroup(
            mediterraneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mediterraneoLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel76)
                .addGap(66, 66, 66))
        );

        Clima.add(mediterraneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 350, 210));

        Desertico.setBackground(new java.awt.Color(255, 204, 204));
        Desertico.setOpaque(false);
        Desertico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeserticoMouseClicked(evt);
            }
        });

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/reproduce-el-video.png"))); // NOI18N

        javax.swing.GroupLayout DeserticoLayout = new javax.swing.GroupLayout(Desertico);
        Desertico.setLayout(DeserticoLayout);
        DeserticoLayout.setHorizontalGroup(
            DeserticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeserticoLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel78)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        DeserticoLayout.setVerticalGroup(
            DeserticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeserticoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel78)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        Clima.add(Desertico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 330));

        Templado.setBackground(new java.awt.Color(255, 204, 204));
        Templado.setOpaque(false);
        Templado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TempladoMouseClicked(evt);
            }
        });

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/reproduce-el-video.png"))); // NOI18N

        javax.swing.GroupLayout TempladoLayout = new javax.swing.GroupLayout(Templado);
        Templado.setLayout(TempladoLayout);
        TempladoLayout.setHorizontalGroup(
            TempladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TempladoLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel77)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        TempladoLayout.setVerticalGroup(
            TempladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TempladoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel77)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        Clima.add(Templado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 350, 180));

        jLabel13.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 204, 255));
        jLabel13.setText("Antartico");
        Clima.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

        jLabel16.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 0));
        jLabel16.setText("Continental");
        Clima.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        jLabel17.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        jLabel17.setText("Tropical");
        Clima.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        jLabel19.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Desertico");
        Clima.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel20.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 0));
        jLabel20.setText("Mediterraneo");
        Clima.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel21.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 153));
        jLabel21.setText("Sub Tropical");
        Clima.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 610, -1, -1));

        jLabel36.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 153, 255));
        jLabel36.setText("Templado");
        Clima.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/Brown Autumn Photo Collage2.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        Clima.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1120, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/calido.png"))); // NOI18N
        Clima.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/clima.png"))); // NOI18N
        Clima.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, -1, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/clima (1).png"))); // NOI18N
        Clima.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 670, -1, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/vista-desde-la-montana.png"))); // NOI18N
        Clima.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, -1, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/fuertes-nevadas.png"))); // NOI18N
        Clima.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, -1, -1));

        jTabbedPane1.addTab("Clima", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/el-planeta-tierra.png")), Clima); // NOI18N

        Plantas.setBackground(new java.awt.Color(0, 51, 0));
        Plantas.setPreferredSize(new java.awt.Dimension(1064, 870));
        Plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.setName(""); // NOI18N

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/intPlant.png"))); // NOI18N
        jLabel49.setText("jLabel49");

        javax.swing.GroupLayout Int_PlantasLayout = new javax.swing.GroupLayout(Int_Plantas);
        Int_Plantas.setLayout(Int_PlantasLayout);
        Int_PlantasLayout.setHorizontalGroup(
            Int_PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Int_PlantasLayout.setVerticalGroup(
            Int_PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int_PlantasLayout.createSequentialGroup()
                .addComponent(jLabel49)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Plantas", Int_Plantas);

        Margaritas.setBackground(new java.awt.Color(255, 255, 153));

        jScrollPane4.setBorder(null);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea3.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(0, 204, 51));
        jTextArea3.setTabSize(0);
        jTextArea3.setText("MARGARITAS");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jScrollPane4.setViewportView(jTextArea3);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/daisy_1280.Png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel10.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane6.setBorder(null);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(0, 204, 51));
        jTextArea5.setLineWrap(true);
        jTextArea5.setTabSize(0);
        jTextArea5.setText("En cuanto a sus beneficios, las margaritas\npueden ser utilizadas en infusiones que \nayudan con problemas digestivos y actúan\ncomo antiinflamatorios naturales. A nivel\nde suelo, estas plantas no son particu-\nlarmente exigentes y pueden adaptarse\na una variedad de condiciones, siendo\nsu principal requerimiento un suelo bien\ndrenado y rico en nutrientes. Pueden \ncrecer tanto en macetas como directa-\nmente en la tierra, loque las  convierte \nen una opción versátil para jardines \nrecicladoso comunitarios.\n\nEn cuanto a sus necesidades específicas de \ncuidado,las margaritas prosperan en zonas \ncon abundante luz solar, aunque también \ntoleran la sombra parcial. El riego debe ser \nmoderado, evitando tanto el encharcamien-\nto como la sequedad extrema del suelo. \nAunque no tienen requisitos estrictos de hu-\nmedad, es fundamental regarlas de manera \nregular, sin llegar a excesos que puedan \nprovocar pudrición en las raíces. Prefieren \nsuelos ricos en nitrógeno, y es importante \nque los fertilizantes se utilicen de forma \ncontrolada, ya que en grandes cantidades \npueden dañar la planta. ");
        jTextArea5.setToolTipText("");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        jScrollPane6.setViewportView(jTextArea5);

        jScrollPane8.setBorder(null);

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea7.setForeground(new java.awt.Color(0, 204, 51));
        jTextArea7.setLineWrap(true);
        jTextArea7.setTabSize(0);
        jTextArea7.setText("Las margaritas son plantas sumamente\napreciadas por su sencillez y belleza \nnatural.Son conocidas por sus flores \nblancas con centros amarillos vibrantes,\nque simbolizanpureza e inocencia. \nEstas flores pueden crecer en diversas \ncondiciones climáticas, haciéndolas \npopulares en muchos tipos de jardines.");
        jTextArea7.setToolTipText("");
        jTextArea7.setWrapStyleWord(true);
        jTextArea7.setBorder(null);
        jScrollPane8.setViewportView(jTextArea7);

        jScrollPane9.setBorder(null);

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(0, 204, 51));
        jTextArea8.setLineWrap(true);
        jTextArea8.setTabSize(0);
        jTextArea8.setText("En cuanto al pH del suelo, las margaritas toleran\nun amplio rango que va desde4.5 hasta 7.5, lo \nque les permite adaptarse a diferentes tipos de \nterrenos. Sin embargo, no soportan suelos con \nalta salinidad, lo cual es crucial evitar si se desea\nque la planta florezca de manera óptima.\n\nEn resumen, las margaritas son plantas resisten-\ntes, fáciles de cuidar y beneficiosas tanto para \nlas personas como para los ecosistemas. Son una \nopción ideal para jardines escolares o proyectos \ncomunitarios por su capacidad para crecer en \ncondiciones variadas, su contribución a la biodi-\nversidad y su facilidad de propagación. Con \ncuidados básicos, estas flores brindarán belleza\ny vida a cualquier entorno donde sean plantadas.\n");
        jTextArea8.setToolTipText("");
        jTextArea8.setWrapStyleWord(true);
        jTextArea8.setBorder(null);
        jScrollPane9.setViewportView(jTextArea8);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Margaritaschi.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flowers-8047833.Png"))); // NOI18N
        jLabel24.setText("jLabel24");

        javax.swing.GroupLayout MargaritasLayout = new javax.swing.GroupLayout(Margaritas);
        Margaritas.setLayout(MargaritasLayout);
        MargaritasLayout.setHorizontalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MargaritasLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        MargaritasLayout.setVerticalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Margaritas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/Margaritas.png")), Margaritas); // NOI18N

        Amapolas_Rosas.setBackground(new java.awt.Color(255, 153, 153));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Amarosa.png"))); // NOI18N
        jLabel25.setText("jLabel10");
        jLabel25.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel25.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane32.setBorder(null);

        jTextArea31.setEditable(false);
        jTextArea31.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea31.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea31.setForeground(new java.awt.Color(255, 0, 204));
        jTextArea31.setTabSize(0);
        jTextArea31.setText("AMAPOLA ROSA");
        jTextArea31.setWrapStyleWord(true);
        jTextArea31.setBorder(null);
        jScrollPane32.setViewportView(jTextArea31);

        jScrollPane34.setBorder(null);

        jTextArea33.setEditable(false);
        jTextArea33.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea33.setForeground(new java.awt.Color(255, 0, 204));
        jTextArea33.setLineWrap(true);
        jTextArea33.setTabSize(0);
        jTextArea33.setText("Las amapolas rosas son plantas ornamentales\ncon flores grandes y llamativas en tonos rosa-\ndos, populares tanto por su belleza como por \nlos beneficios que aportan a los jardines y a la \necología local. Estas flores no presentan reque-\nrimientos estrictos en cuanto a contenido mine-\nral en el suelo, lo cual las convierte en una \nopción adaptable para jardines con distintos ti-\npos de terrenos, siempre que cuenten con \nbuena fertilidad");
        jTextArea33.setToolTipText("");
        jTextArea33.setWrapStyleWord(true);
        jTextArea33.setBorder(null);
        jScrollPane34.setViewportView(jTextArea33);

        jScrollPane35.setBorder(null);

        jTextArea34.setEditable(false);
        jTextArea34.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea34.setForeground(new java.awt.Color(255, 0, 204));
        jTextArea34.setLineWrap(true);
        jTextArea34.setTabSize(0);
        jTextArea34.setText("Son plantas versátiles, prefieren un pH\n de 6.0 a 6.8, ligeramente ácido a neu-\ntro, lo que optimiza la absorción de nu-\ntrientes clave como el fósforo y el po-\ntasio para un desarrollo saludable.\n\nLas amapolas rosas toleran bien diver-\nsas condiciones de humedad en el su-\nelo, sin requisitos estrictos, pero se \nbenefician particularmente de un suelo\ncon buen drenaje. Un suelo bien drena-\ndo previene el riesgo de encharca-\nmientos, que podrían afectar a sus \nraíces sensibles y provocar problemas \nde hongos. En cuanto a la salinidad, son \nplantas sensibles que no soportan altos \nniveles de sal en el suelo, por lo que de-\nben evitarse zonas cercanas a aguas \nsalinas o suelos salinizados. Prefieren \nuna tierra de jardín común y de textura \nligera que les permita establecerse sin \ndificultad.\n");
        jTextArea34.setToolTipText("");
        jTextArea34.setWrapStyleWord(true);
        jTextArea34.setBorder(null);
        jScrollPane35.setViewportView(jTextArea34);

        jScrollPane36.setBorder(null);

        jTextArea35.setEditable(false);
        jTextArea35.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea35.setForeground(new java.awt.Color(255, 0, 204));
        jTextArea35.setLineWrap(true);
        jTextArea35.setTabSize(0);
        jTextArea35.setText("El cultivo de las amapolas rosas ofrece \nbeneficios para el ecosistema del jardín,\nya que atraen polinizadores como abe-\njas y mariposas, apoyando la biodiversi-\ndad local. Además de embellecer el pai-\nsaje, estas plantas ayudan a mejorar la \nsalud general del suelo y el ambiente, \nincrementando la presencia de poliniza-\ndores que, a su vez, benefician otras \nplantas en el jardín. Las amapolas tam-\nbién son valoradas por su resistencia \nmoderada, y aunque florecen mejor en \nclimas templados, son capaces de ada-\nptarse a condiciones más cálidas si se \nles proporciona algo de sombra y riego \nadecuado en temporadas secas.");
        jTextArea35.setToolTipText("");
        jTextArea35.setWrapStyleWord(true);
        jTextArea35.setBorder(null);
        jScrollPane36.setViewportView(jTextArea35);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Rositas.png"))); // NOI18N
        jLabel50.setText("jLabel24");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Rosasaba.png"))); // NOI18N
        jLabel58.setText("jLabel6");

        javax.swing.GroupLayout Amapolas_RosasLayout = new javax.swing.GroupLayout(Amapolas_Rosas);
        Amapolas_Rosas.setLayout(Amapolas_RosasLayout);
        Amapolas_RosasLayout.setHorizontalGroup(
            Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                        .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Amapolas_RosasLayout.setVerticalGroup(
            Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                        .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Amapolas_RosasLayout.createSequentialGroup()
                                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane34))))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Amapolas Rosas", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/Amapola.rosa.png")), Amapolas_Rosas); // NOI18N

        Ixoras.setBackground(new java.awt.Color(153, 255, 204));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Ixo_1.png"))); // NOI18N
        jLabel82.setText("jLabel81");

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Ixor1.png"))); // NOI18N
        jLabel90.setText("jLabel6");

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/proixo2.png"))); // NOI18N
        jLabel89.setText("jLabel24");

        jScrollPane41.setBorder(null);

        jTextArea40.setEditable(false);
        jTextArea40.setBackground(new java.awt.Color(153, 255, 204));
        jTextArea40.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea40.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea40.setTabSize(0);
        jTextArea40.setText("IXORAS");
        jTextArea40.setWrapStyleWord(true);
        jTextArea40.setBorder(null);
        jScrollPane41.setViewportView(jTextArea40);

        jScrollPane42.setBorder(null);

        jTextArea41.setEditable(false);
        jTextArea41.setBackground(new java.awt.Color(153, 255, 204));
        jTextArea41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea41.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea41.setLineWrap(true);
        jTextArea41.setTabSize(0);
        jTextArea41.setText("Las ixoras son plantas tropicales muy valoradas\npor sus flores agrupadas en racimos brillantes \nde colores vivos, que incluyen tonos de rojo, ro-\nsa,naranja y amarillo. Estas plantas destacan por \nsu adaptabilidad en jardines y paisajes decora-\ntivos, además de su resistencia en climas cálidos.");
        jTextArea41.setToolTipText("");
        jTextArea41.setWrapStyleWord(true);
        jTextArea41.setBorder(null);
        jScrollPane42.setViewportView(jTextArea41);

        jScrollPane43.setBorder(null);

        jTextArea42.setEditable(false);
        jTextArea42.setBackground(new java.awt.Color(153, 255, 204));
        jTextArea42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea42.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea42.setLineWrap(true);
        jTextArea42.setTabSize(0);
        jTextArea42.setText("Las ixoras no tienen requisitos estrictos en \ncuanto al contenido mineral del suelo, por \nlo que pueden crecer bien en terrenos que \ncuenten con nutrientes básicos, sin necesi-\ndad de suelos enriquecidos específica-\nmente. Sin embargo, prefieren un nivel de \npH ligeramente ácido, alrededor de 5, lo \ncual facilita una óptima absorción de los \nnutrientes disponibles en el suelo, en esp-\necial el hierro, para mantener el follaje \nverde y saludable.\n\nEn cuanto a la humedad del suelo, no ne-\ncesitan condiciones específicas, aunque \nprosperan mejor en suelos que retengan \nsuficiente humedad sin llegar a encharcarse");
        jTextArea42.setToolTipText("");
        jTextArea42.setWrapStyleWord(true);
        jTextArea42.setBorder(null);
        jScrollPane43.setViewportView(jTextArea42);

        jScrollPane44.setBorder(null);

        jTextArea43.setEditable(false);
        jTextArea43.setBackground(new java.awt.Color(153, 255, 204));
        jTextArea43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea43.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea43.setLineWrap(true);
        jTextArea43.setTabSize(0);
        jTextArea43.setText("Esto las convierte en una buena opción \npara jardines de bajo mantenimiento, \nsiempre que se les dé un riego adecu-\nado, especialmente en temporadas \nsecas. Las ixoras no toleran la salini-\ndad en el suelo, por lo que deben evi-\ntarse los suelos con altos niveles de \nsal para no comprometer su crecimi-\nento y desarrollo. La tierra de jardín \ncomún, de textura media y con buen \ndrenaje, es ideal para su cultivo, permi-\ntiendo que sus raíces se establezcan \nsin dificultades y reduciendo el riesgo \nde enfermedades.\n\nAdemás de su valor ornamental, las \nixoras aportan beneficios al ecosistema \ndel jardín al atraer polinizadores como \nmariposas y abejas, contribuyendo a un \nentorno más biodiverso.");
        jTextArea43.setToolTipText("");
        jTextArea43.setWrapStyleWord(true);
        jTextArea43.setBorder(null);
        jScrollPane44.setViewportView(jTextArea43);

        javax.swing.GroupLayout IxorasLayout = new javax.swing.GroupLayout(Ixoras);
        Ixoras.setLayout(IxorasLayout);
        IxorasLayout.setHorizontalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addGroup(IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IxorasLayout.createSequentialGroup()
                        .addGroup(IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IxorasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IxorasLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IxorasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IxorasLayout.setVerticalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addGroup(IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IxorasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addGroup(IxorasLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IxorasLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IxorasLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel90))))
                    .addGroup(IxorasLayout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ixoras", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/ixora.png")), Ixoras); // NOI18N

        Rosas_Desierto.setBackground(new java.awt.Color(244, 231, 197));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Rosa del desierto.png"))); // NOI18N
        jLabel61.setText("jLabel10");
        jLabel61.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel61.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane37.setBorder(null);

        jTextArea36.setEditable(false);
        jTextArea36.setBackground(new java.awt.Color(244, 231, 197));
        jTextArea36.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea36.setForeground(new java.awt.Color(92, 64, 51));
        jTextArea36.setTabSize(0);
        jTextArea36.setText("ROSA DEL DESIERTO");
        jTextArea36.setWrapStyleWord(true);
        jTextArea36.setBorder(null);
        jScrollPane37.setViewportView(jTextArea36);

        jScrollPane38.setBorder(null);

        jTextArea37.setEditable(false);
        jTextArea37.setBackground(new java.awt.Color(244, 231, 197));
        jTextArea37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea37.setForeground(new java.awt.Color(92, 64, 51));
        jTextArea37.setLineWrap(true);
        jTextArea37.setTabSize(0);
        jTextArea37.setText("La Rosa del Desierto es una planta suculenta\nde aspecto exótico, popular por sus llamati-\nvas flores y su adaptación a climas áridos. \nNo requiere de un contenido mineral especí-\nfico, lo cual la hace muy versátil en diferentes \ntipos de sustratos siempre que ofrezcan bu-\nenos niveles de drenaje.");
        jTextArea37.setToolTipText("");
        jTextArea37.setWrapStyleWord(true);
        jTextArea37.setBorder(null);
        jScrollPane38.setViewportView(jTextArea37);

        jScrollPane39.setBorder(null);

        jTextArea38.setEditable(false);
        jTextArea38.setBackground(new java.awt.Color(244, 231, 197));
        jTextArea38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea38.setForeground(new java.awt.Color(92, 64, 51));
        jTextArea38.setLineWrap(true);
        jTextArea38.setTabSize(0);
        jTextArea38.setText("Su pH ideal es de alrededor de 6.0, lo que asegura \nla absorción de nutrientes sin sobrecargar la \nplanta, promoviendo un crecimiento saludable de \nsus raíces y tallos. Para la humedad, la rosa del \ndesierto es una planta de bajos requerimientos, \nadaptada a ambientes secos y que no necesita \nniveles constantes de agua en el suelo; por lo \ntanto, es fundamental evitar el riego excesivo, ya \nque esto puede afectar su salud debido a su sen-\nsibilidad a los encharcamientos.\n\nRespecto a la salinidad, esta planta no la soporta,\npor lo que su cultivo en suelos salinos puede \nafectar su desarrollo y provocar estrés en sus te-\njidos. El tipo de tierra ideal para la rosa del desi-\nerto es un sustrato ligero y de excelente drenaje,\ncomo una mezcla de arena gruesa y perlita, que \npermite que el agua circule con rapidez y evite el \nestancamiento. Esta combinación de sustrato \ntambién facilita el paso de oxígeno a las raíces, \nayudando a prevenir enfermedades fúngicas.");
        jTextArea38.setToolTipText("");
        jTextArea38.setWrapStyleWord(true);
        jTextArea38.setBorder(null);
        jScrollPane39.setViewportView(jTextArea38);

        jScrollPane40.setBorder(null);

        jTextArea39.setEditable(false);
        jTextArea39.setBackground(new java.awt.Color(244, 231, 197));
        jTextArea39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea39.setForeground(new java.awt.Color(92, 64, 51));
        jTextArea39.setLineWrap(true);
        jTextArea39.setTabSize(0);
        jTextArea39.setText("Además de su atractivo visual, la rosa del desierto\nes una planta de bajo mantenimiento y gran du-\nrabilidad, lo que la hace perfecta para jardines \ndecorativos en regiones cálidas o para interiores \nluminosos. Como una suculenta, almacena agua \nen sus tallos y raíces, lo que le permite sobrevivir \nbien en condiciones de sequía. En el jardín, esta\nplanta aporta un toque único con su apariencia es \ncultural y sus flores de colores vivos, mientras que\nsu bajo requerimiento de riego contribuye a la \nconservación de agua. Con un cuidado básico y \nun sustrato adecuado, la rosa del desierto puede \nflorecer de manera espectacular y convertirse en \nel centro de atención en cualquier jardín o espacio\ninterior.");
        jTextArea39.setToolTipText("");
        jTextArea39.setWrapStyleWord(true);
        jTextArea39.setBorder(null);
        jScrollPane40.setViewportView(jTextArea39);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/r1.png"))); // NOI18N
        jLabel81.setText("jLabel6");

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/r2.png"))); // NOI18N
        jLabel88.setText("jLabel24");

        javax.swing.GroupLayout Rosas_DesiertoLayout = new javax.swing.GroupLayout(Rosas_Desierto);
        Rosas_Desierto.setLayout(Rosas_DesiertoLayout);
        Rosas_DesiertoLayout.setHorizontalGroup(
            Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                .addGroup(Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Rosas_DesiertoLayout.setVerticalGroup(
            Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Rosas_DesiertoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Rosas_DesiertoLayout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Rosas_DesiertoLayout.createSequentialGroup()
                        .addGroup(Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88))
                        .addGap(18, 18, 18)
                        .addGroup(Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Rosas Del Desierto", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/rosa.png")), Rosas_Desierto); // NOI18N

        Tulipanes.setBackground(new java.awt.Color(230, 230, 250));
        Tulipanes.setForeground(new java.awt.Color(204, 0, 51));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/tulip.png"))); // NOI18N
        jLabel91.setText("jLabel10");
        jLabel91.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel91.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane45.setBorder(null);

        jTextArea44.setEditable(false);
        jTextArea44.setBackground(new java.awt.Color(230, 230, 250));
        jTextArea44.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea44.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea44.setTabSize(0);
        jTextArea44.setText("TULIPANES");
        jTextArea44.setWrapStyleWord(true);
        jTextArea44.setBorder(null);
        jScrollPane45.setViewportView(jTextArea44);

        jScrollPane46.setBorder(null);

        jTextArea45.setEditable(false);
        jTextArea45.setBackground(new java.awt.Color(230, 230, 250));
        jTextArea45.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea45.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea45.setLineWrap(true);
        jTextArea45.setTabSize(0);
        jTextArea45.setText("Los tulipanes son flores icónicas, conocidas \npor su elegancia y por ser un símbolo de la \nprimavera. Originarias de Asia Central, estas \nplantas bulbosas se han cultivado durante \nsiglos, especialmente en regiones de climas \ntemplados. Su capacidad para adaptarse a \ndiferentes ambientes y su amplia variedad de \ncolores y formas las convierten en una opción \npopular para jardines y espacios decorativos.");
        jTextArea45.setToolTipText("");
        jTextArea45.setWrapStyleWord(true);
        jTextArea45.setBorder(null);
        jScrollPane46.setViewportView(jTextArea45);

        jScrollPane47.setBorder(null);

        jTextArea46.setEditable(false);
        jTextArea46.setBackground(new java.awt.Color(230, 230, 250));
        jTextArea46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea46.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea46.setLineWrap(true);
        jTextArea46.setTabSize(0);
        jTextArea46.setText("El suelo es un aspecto clave para los tulipanes.\nPrefieren un terreno rico en materia orgánica, \ncomo compost, y mezclado con arena para \ngarantizar un drenaje adecuado. El nivel de pH \nideal oscila entre 6.0 y 7.0, lo que asegura un \nambiente ligeramente ácido a neutro para el \ncrecimiento de las raíces. Aunque estas plantas \nno tienen requisitos estrictos en cuanto a mine-\nrales, es importante evitar terrenos salinos, ya \nque los tulipanes no toleran la salinidad. La hu-\nmedad del suelo también debe manejarse \ncuidadosamente: debe estar moderadamente \nhúmedo pero sin llegar a encharcarse, ya que \nel exceso de agua puede provocar pudrición en \nlos bulbos, afectando su salud y desarrollo.\n\nPara plantarlos, selecciona un lugar que reciba \nabundante luz solar, ya que esto favorece una \nfloración más brillante y prolongada. ");
        jTextArea46.setToolTipText("");
        jTextArea46.setWrapStyleWord(true);
        jTextArea46.setBorder(null);
        jScrollPane47.setViewportView(jTextArea46);

        jScrollPane48.setBorder(null);

        jTextArea47.setEditable(false);
        jTextArea47.setBackground(new java.awt.Color(230, 230, 250));
        jTextArea47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea47.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea47.setLineWrap(true);
        jTextArea47.setTabSize(0);
        jTextArea47.setText("Antes de plantar los bulbos, trabaja bien \nla tierra incorporando compost para \nmejorar su fertilidad. Coloca los bulbos \na una profundidad de aproximadamente \ntres veces su tamaño, con la punta hacia \narriba, y asegúrate de espaciar cada bulbo \npara que las plantas tengan espacio su-\nficiente para crecer. Durante su crecimi-\nento, riégalos de forma moderada y pro-\ntege las plantas de plagas comunes \ncomo los pulgones, que pueden afectar \ntanto las hojas como las flores.");
        jTextArea47.setToolTipText("");
        jTextArea47.setWrapStyleWord(true);
        jTextArea47.setBorder(null);
        jScrollPane48.setViewportView(jTextArea47);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Tuli2.png"))); // NOI18N
        jLabel92.setText("jLabel6");

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/tuli1.png"))); // NOI18N

        javax.swing.GroupLayout TulipanesLayout = new javax.swing.GroupLayout(Tulipanes);
        Tulipanes.setLayout(TulipanesLayout);
        TulipanesLayout.setHorizontalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TulipanesLayout.createSequentialGroup()
                .addGroup(TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TulipanesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(TulipanesLayout.createSequentialGroup()
                        .addGroup(TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TulipanesLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TulipanesLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGroup(TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        TulipanesLayout.setVerticalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TulipanesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TulipanesLayout.createSequentialGroup()
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TulipanesLayout.createSequentialGroup()
                        .addGroup(TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TulipanesLayout.createSequentialGroup()
                                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane48, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                            .addGroup(TulipanesLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel93)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tulipanes", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/tulipanes.png")), Tulipanes); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 102, 178));
        jPanel1.setForeground(new java.awt.Color(255, 102, 178));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Bugpri.png"))); // NOI18N
        jLabel94.setText("jLabel10");
        jLabel94.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel94.setPreferredSize(new java.awt.Dimension(350, 380));

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/bug2.png"))); // NOI18N

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Bug3.png"))); // NOI18N
        jLabel96.setText("jLabel6");

        jScrollPane49.setBorder(null);

        jTextArea48.setEditable(false);
        jTextArea48.setBackground(new java.awt.Color(255, 102, 178));
        jTextArea48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea48.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea48.setLineWrap(true);
        jTextArea48.setTabSize(0);
        jTextArea48.setText("En cuanto a minerales, la bugambilia no tiene \nrequisitos estrictos, pero responde bien a su-\nelos moderadamente fértiles. Añadir compost \no abono orgánico ayudará a mejorar el con-\ntenido de nutrientes y promover un crecimi-\nento saludable. El rango de pH ideal para la \nbugambilia es de 5.5 a 6.5, ligeramente ácido.\nEs crucial mantener este equilibrio, ya que ni-\nveles de pH fuera de este rango pueden li-\nmitar la absorción de nutrientes esenciales. \nEl uso de suelos arenosos o francoarenosos \ncon buen drenaje es ideal, ya que evita el en-\ncharcamiento que puede perjudicar las raíces.\n\nEn términos de humedad del suelo, la bugam-\nbilia no es exigente, pero prefiere suelos que \npuedan retener algo de agua sin volverse pe-\nsados o compactos.");
        jTextArea48.setToolTipText("");
        jTextArea48.setWrapStyleWord(true);
        jTextArea48.setBorder(null);
        jScrollPane49.setViewportView(jTextArea48);

        jScrollPane50.setBorder(null);

        jTextArea49.setEditable(false);
        jTextArea49.setBackground(new java.awt.Color(255, 102, 178));
        jTextArea49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea49.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea49.setLineWrap(true);
        jTextArea49.setTabSize(0);
        jTextArea49.setText("Un riego moderado, asegurándose de que la\ncapa superficial del suelo se seque ligera-\nmente entre riegos, es la clave para evitar \nproblemas como la pudrición radicular. Dado \nque la planta no tolera la salinidad, es esen-\ncial evitar agua de riego o fertilizantes con \naltos niveles de sales.\n\nLa bugambilia prospera mejor en suelos bien \naireados y ricos en materia orgánica, donde \nsus raíces pueden extenderse fácilmente. \nIncorporar arena o materia orgánica en el su-\nelo es una práctica útil para asegurar el dre\nnaje y mantener las raíces saludables, maxi-\nmizando su resistencia y floración.");
        jTextArea49.setToolTipText("");
        jTextArea49.setWrapStyleWord(true);
        jTextArea49.setBorder(null);
        jScrollPane50.setViewportView(jTextArea49);

        jScrollPane51.setBorder(null);

        jTextArea50.setEditable(false);
        jTextArea50.setBackground(new java.awt.Color(255, 102, 178));
        jTextArea50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea50.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea50.setLineWrap(true);
        jTextArea50.setTabSize(0);
        jTextArea50.setText("La bugambilia, con sus llamativos colores y\ncapacidad para adaptarse a diversas con-\ndiciones climáticas, es una planta orna-\nmental ideal para embellecer jardines y \nespacios exteriores. Su cultivo es sencillo \nsi se respetan sus necesidades básicas, \nlo que la convierte en una opción favorita \npara jardines en regiones cálidas y soleadas.");
        jTextArea50.setToolTipText("");
        jTextArea50.setWrapStyleWord(true);
        jTextArea50.setBorder(null);
        jScrollPane51.setViewportView(jTextArea50);

        jScrollPane52.setBorder(null);

        jTextArea51.setEditable(false);
        jTextArea51.setBackground(new java.awt.Color(255, 102, 178));
        jTextArea51.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea51.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea51.setTabSize(0);
        jTextArea51.setText("BUGAMBILIA");
        jTextArea51.setWrapStyleWord(true);
        jTextArea51.setBorder(null);
        jScrollPane52.setViewportView(jTextArea51);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel96)
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel95)))))
                .addGap(77, 152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BugambiliaLayout = new javax.swing.GroupLayout(Bugambilia);
        Bugambilia.setLayout(BugambiliaLayout);
        BugambiliaLayout.setHorizontalGroup(
            BugambiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BugambiliaLayout.setVerticalGroup(
            BugambiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BugambiliaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bugambilia", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/bugambilia.png")), Bugambilia); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 192, 203));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Azales.png"))); // NOI18N
        jLabel97.setText("jLabel10");
        jLabel97.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel97.setPreferredSize(new java.awt.Dimension(350, 380));

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Aza2.png"))); // NOI18N

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/aza3.png"))); // NOI18N
        jLabel99.setText("jLabel6");

        jScrollPane53.setBorder(null);

        jTextArea52.setEditable(false);
        jTextArea52.setBackground(new java.awt.Color(255, 192, 203));
        jTextArea52.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea52.setForeground(new java.awt.Color(46, 139, 87));
        jTextArea52.setTabSize(0);
        jTextArea52.setText("AZALEAS");
        jTextArea52.setWrapStyleWord(true);
        jTextArea52.setBorder(null);
        jScrollPane53.setViewportView(jTextArea52);

        jScrollPane54.setBorder(null);

        jTextArea53.setEditable(false);
        jTextArea53.setBackground(new java.awt.Color(255, 192, 203));
        jTextArea53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea53.setForeground(new java.awt.Color(46, 139, 87));
        jTextArea53.setLineWrap(true);
        jTextArea53.setTabSize(0);
        jTextArea53.setText("Las azaleas son arbustos ornamentales \nmuy valorados por su belleza y su capa-\ncidad para llenar jardines con vibrantes \ncolores. Estas plantas son conocidas \npor sus flores delicadas y su naturaleza \nadaptable, lo que las hace ideales tanto \npara jardineros principiantes como ex-\nperimentados.");
        jTextArea53.setToolTipText("");
        jTextArea53.setWrapStyleWord(true);
        jTextArea53.setBorder(null);
        jScrollPane54.setViewportView(jTextArea53);

        jScrollPane55.setBorder(null);

        jTextArea54.setEditable(false);
        jTextArea54.setBackground(new java.awt.Color(255, 192, 203));
        jTextArea54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea54.setForeground(new java.awt.Color(46, 139, 87));
        jTextArea54.setLineWrap(true);
        jTextArea54.setTabSize(0);
        jTextArea54.setText("En cuanto al riego, necesitan un suelo cons-\ntantemente húmedo, pero bien drenado, \npara evitar problemas como la pudrición de \nraíces. Regarlas de manera uniforme, espe-\ncialmente durante la temporada de floración, \nasegurará un crecimiento vigoroso.\n\nSu mantenimiento incluye la poda ligera \ndespués de la floración para estimular nu-\nevos brotes y mantener una forma compacta. \nAdemás, aplicar fertilizante específico para \nplantas acidófilas durante la primavera ayu-\ndará a proporcionarles los nutrientes nece-\nsarios para una floración abundante.");
        jTextArea54.setToolTipText("");
        jTextArea54.setWrapStyleWord(true);
        jTextArea54.setBorder(null);
        jScrollPane55.setViewportView(jTextArea54);

        jScrollPane56.setBorder(null);

        jTextArea55.setEditable(false);
        jTextArea55.setBackground(new java.awt.Color(255, 192, 203));
        jTextArea55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea55.setForeground(new java.awt.Color(46, 139, 87));
        jTextArea55.setLineWrap(true);
        jTextArea55.setTabSize(0);
        jTextArea55.setText("Para cultivarlas con éxito, es fundamental propor-\ncionarles un suelo ácido, con un pH que oscile \nentre 4.5 y 6.0, ya que las azaleas prosperan en \nsuelos ligeramente ácidos. Este entorno favorece \nla absorción de nutrientes esenciales y asegura \nsu desarrollo saludable. El tipo de tierra más \nadecuado incluye mezclas ricas en materia orgá-\nnica, como turba, corteza de pino o tierra de jardín \ncon compost. Estas condiciones recrean su há-\nbitat natural, que generalmente se encuentra en \nbosques húmedos y sombreados.\n\nLas azaleas requieren un equilibrio entre sol y \nsombra para florecer en su máximo esplendor. \nLo ideal es colocarlas en un lugar donde reciban \nluz solar filtrada o sombra parcial, evitando la ex-\nposición directa al sol durante las horas más \nintensas del día.");
        jTextArea55.setToolTipText("");
        jTextArea55.setWrapStyleWord(true);
        jTextArea55.setBorder(null);
        jScrollPane56.setViewportView(jTextArea55);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane55)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane56)
                            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel98))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AzaleaLayout = new javax.swing.GroupLayout(Azalea);
        Azalea.setLayout(AzaleaLayout);
        AzaleaLayout.setHorizontalGroup(
            AzaleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AzaleaLayout.setVerticalGroup(
            AzaleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Azalea", Azalea);

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Gen.png"))); // NOI18N
        jLabel100.setText("jLabel10");
        jLabel100.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel100.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane57.setBorder(null);

        jTextArea56.setEditable(false);
        jTextArea56.setBackground(new java.awt.Color(173, 216, 230));
        jTextArea56.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea56.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea56.setTabSize(0);
        jTextArea56.setText("GENCIANAS");
        jTextArea56.setWrapStyleWord(true);
        jTextArea56.setBorder(null);
        jScrollPane57.setViewportView(jTextArea56);

        jScrollPane58.setBorder(null);

        jTextArea57.setEditable(false);
        jTextArea57.setBackground(new java.awt.Color(173, 216, 230));
        jTextArea57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea57.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea57.setLineWrap(true);
        jTextArea57.setTabSize(0);
        jTextArea57.setText("Las gencianas son plantas herbáceas pere-\nnnes muy apreciadas por sus flores de co-\nlores vivos, que van desde el azul profundo \nhasta el violeta, pasando por tonos blancos \ny amarillos en algunas variedades. Estas \nplantas son originarias de regiones monta-\nñosas y de climas frescos, lo que las hace \nideales para suelos bien drenados y ligera-\nmente ácidos.");
        jTextArea57.setToolTipText("");
        jTextArea57.setWrapStyleWord(true);
        jTextArea57.setBorder(null);
        jScrollPane58.setViewportView(jTextArea57);

        jScrollPane59.setBorder(null);

        jTextArea58.setEditable(false);
        jTextArea58.setBackground(new java.awt.Color(173, 216, 230));
        jTextArea58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea58.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea58.setLineWrap(true);
        jTextArea58.setTabSize(0);
        jTextArea58.setText("En términos de exposición, prefieren lugares con\n luz solar indirecta o semisombra, especialmente \nen regiones donde el sol es muy intenso.\n\nEn cuanto a cuidados generales, estas plantas \nnecesitan protección contra vientos fuertes y tem-\nperaturas extremas. Durante los meses más fríos, \nun acolchado de hojas secas puede ayudar a \nmantener la temperatura del suelo estable. Ade-\nmás, es importante evitar zonas con alta salinidad, \nya que las gencianas no la toleran bien. \nSu mantenimiento es sencillo, lo que las convierte\nen una excelente opción para jardines escolares, \ndonde pueden ser utilizadas para enseñar a los \nniños sobre la biodiversidad y el cuidado ambiental.");
        jTextArea58.setToolTipText("");
        jTextArea58.setWrapStyleWord(true);
        jTextArea58.setBorder(null);
        jScrollPane59.setViewportView(jTextArea58);

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/gen2.png"))); // NOI18N

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/gen3.png"))); // NOI18N
        jLabel102.setText("jLabel6");

        jScrollPane60.setBorder(null);

        jTextArea59.setEditable(false);
        jTextArea59.setBackground(new java.awt.Color(173, 216, 230));
        jTextArea59.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea59.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea59.setLineWrap(true);
        jTextArea59.setTabSize(0);
        jTextArea59.setText("Para preparar el suelo adecuado para las gen-\ncianas, se recomienda mezclar tierra para jar-\ndín con arena gruesa y un poco de turba o \ncompost. Esto asegura un drenaje eficiente \nmientras proporciona los nutrientes necesarios \npara su desarrollo. Su rango óptimo de pH está \nentre 5.5 y 6.5, condiciones que favorecen el \ncrecimiento saludable de sus raíces. Aunque no \nrequieren un contenido específico de minerales, \nagradecen suelos enriquecidos con materia \norgánica.\n\nEl riego debe ser moderado, manteniendo la ti-\nerra húmeda sin llegar a encharcarla. Las gen-\ncianas son sensibles al exceso de agua, ya que \npuede provocar la pudrición de las raíces, uno \nde los principales riesgos para su salud. ");
        jTextArea59.setToolTipText("");
        jTextArea59.setWrapStyleWord(true);
        jTextArea59.setBorder(null);
        jScrollPane60.setViewportView(jTextArea59);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))
                    .addComponent(jScrollPane58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel102)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel101))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GencianaLayout = new javax.swing.GroupLayout(Genciana);
        Genciana.setLayout(GencianaLayout);
        GencianaLayout.setHorizontalGroup(
            GencianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GencianaLayout.setVerticalGroup(
            GencianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Genciana", Genciana);

        jPanel4.setBackground(new java.awt.Color(255, 228, 225));

        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Prim.png"))); // NOI18N
        jLabel103.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel103.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane61.setBorder(null);

        jTextArea60.setEditable(false);
        jTextArea60.setBackground(new java.awt.Color(255, 228, 225));
        jTextArea60.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea60.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea60.setTabSize(0);
        jTextArea60.setText("PRIMULAS");
        jTextArea60.setWrapStyleWord(true);
        jTextArea60.setBorder(null);
        jScrollPane61.setViewportView(jTextArea60);

        jScrollPane62.setBorder(null);

        jTextArea61.setEditable(false);
        jTextArea61.setBackground(new java.awt.Color(255, 228, 225));
        jTextArea61.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea61.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea61.setLineWrap(true);
        jTextArea61.setTabSize(0);
        jTextArea61.setText("Las prímulas son plantas de floración atrac-\ntiva que destacan por sus colores vivos y su \ncapacidad de adaptarse a diferentes ent-\nornos. Son ideales para embellecer jardines \nescolares gracias a su bajo mantenimiento \ny resistencia, además de fomentar la apre-\nciación por la diversidad floral en los niños. \nEstas flores prefieren suelos bien drenados \ny ricos en materia orgánica.");
        jTextArea61.setToolTipText("");
        jTextArea61.setWrapStyleWord(true);
        jTextArea61.setBorder(null);
        jScrollPane62.setViewportView(jTextArea61);

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Prim1.png"))); // NOI18N

        jScrollPane63.setBorder(null);

        jTextArea62.setEditable(false);
        jTextArea62.setBackground(new java.awt.Color(255, 228, 225));
        jTextArea62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea62.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea62.setLineWrap(true);
        jTextArea62.setTabSize(0);
        jTextArea62.setText("Para protegerlas, es importante vigilar posi-\nbles plagas como ácaros o pulgones y ac-\ntuar rápidamente si se detectan, utilizando \nmétodos naturales o productos adecuados.\n\nEn conclusión, las prímulas son una exce-\nlente elección para cualquier jardín escolar, \naportando belleza y enseñando a los niños \nel valor del cuidado y la observación de la \nnaturaleza.");
        jTextArea62.setToolTipText("");
        jTextArea62.setWrapStyleWord(true);
        jTextArea62.setBorder(null);
        jScrollPane63.setViewportView(jTextArea62);

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/prim 2.png"))); // NOI18N

        jScrollPane64.setBorder(null);

        jTextArea63.setEditable(false);
        jTextArea63.setBackground(new java.awt.Color(255, 228, 225));
        jTextArea63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea63.setForeground(new java.awt.Color(75, 0, 130));
        jTextArea63.setLineWrap(true);
        jTextArea63.setTabSize(0);
        jTextArea63.setText("El cultivo de las prímulas requiere una prepa-\nración básica del suelo. Se recomienda mez-\nclar tierra de jardín común con compost para \nenriquecerla, lo que mejorará tanto la reten-\nción de agua como la disponibilidad de nu-\ntrientes. La ubicación también juega un pa-\npel crucial: las prímulas prosperan en áreas \ncon luz indirecta o semisombra, ya que una \nexposición prolongada al sol puede dañar \nsus delicadas hojas.\n\nEl riego debe ser moderado, manteniendo \nel suelo húmedo pero no encharcado. Un \nbuen drenaje es fundamental para evitar \nproblemas de pudrición de raíces. \n\nAdemás, es beneficioso fertilizar las prí\nmulas cada dos semanas durante la tem-\nporada de crecimiento con un fertilizante \nequilibrado, lo que favorecerá una floración \nmás abundante.");
        jTextArea63.setToolTipText("");
        jTextArea63.setWrapStyleWord(true);
        jTextArea63.setBorder(null);
        jScrollPane64.setViewportView(jTextArea63);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PrimulaLayout = new javax.swing.GroupLayout(Primula);
        Primula.setLayout(PrimulaLayout);
        PrimulaLayout.setHorizontalGroup(
            PrimulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PrimulaLayout.setVerticalGroup(
            PrimulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Primula", Primula);

        jPanel5.setBackground(new java.awt.Color(179, 229, 252));

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Hortensias.png"))); // NOI18N
        jLabel106.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel106.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane65.setBorder(null);

        jTextArea64.setEditable(false);
        jTextArea64.setBackground(new java.awt.Color(179, 229, 252));
        jTextArea64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea64.setForeground(new java.awt.Color(55, 71, 79));
        jTextArea64.setLineWrap(true);
        jTextArea64.setTabSize(0);
        jTextArea64.setText("Las hortensias son plantas ornamentales muy \napreciadas por su espectacular floración y la \nvariedad de colores que ofrecen, que van des-\nde el blanco hasta tonos rosados, azules y \npúrpuras. Estas plantas, por su belleza y ta-\nmaño, son ideales para jardines escolares, \ndonde pueden servir como punto focal y ense-\nñar a los niños sobre los cuidados de plantas \nperennes.");
        jTextArea64.setToolTipText("");
        jTextArea64.setWrapStyleWord(true);
        jTextArea64.setBorder(null);
        jScrollPane65.setViewportView(jTextArea64);

        jScrollPane66.setBorder(null);

        jTextArea65.setEditable(false);
        jTextArea65.setBackground(new java.awt.Color(179, 229, 252));
        jTextArea65.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea65.setForeground(new java.awt.Color(55, 71, 79));
        jTextArea65.setTabSize(0);
        jTextArea65.setText("HORTENSIAS");
        jTextArea65.setWrapStyleWord(true);
        jTextArea65.setBorder(null);
        jScrollPane66.setViewportView(jTextArea65);

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/h2.png"))); // NOI18N

        jScrollPane67.setBorder(null);

        jTextArea66.setEditable(false);
        jTextArea66.setBackground(new java.awt.Color(179, 229, 252));
        jTextArea66.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea66.setForeground(new java.awt.Color(55, 71, 79));
        jTextArea66.setLineWrap(true);
        jTextArea66.setTabSize(0);
        jTextArea66.setText("El riego de las hortensias debe ser constante, espe-\ncialmente durante las épocas más calurosas. Se \nrecomienda regarlas de dos a tres veces por sema-\nna manteniendo el suelo húmedo pero evitando el \nencharcamiento. Durante la temporada de creci-\nmiento, un fertilizante equilibrado aplicado cada dos \nsemanas ayudará a mantenerlas saludables y fa-\nvorece una floración exuberante.\n\nEn cuanto al mantenimiento, es importante podar \nlas hortensias regularmente para eliminar flores \nmarchitas y promover un crecimiento vigoroso. \nTambién deben protegerse contra plagas como pul-\ngones o enfermedades como el mildiu, utilizando \nmétodos preventivos naturales o productos específicos.");
        jTextArea66.setToolTipText("");
        jTextArea66.setWrapStyleWord(true);
        jTextArea66.setBorder(null);
        jScrollPane67.setViewportView(jTextArea66);

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/h3.png"))); // NOI18N

        jScrollPane68.setBorder(null);

        jTextArea67.setEditable(false);
        jTextArea67.setBackground(new java.awt.Color(179, 229, 252));
        jTextArea67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea67.setForeground(new java.awt.Color(55, 71, 79));
        jTextArea67.setLineWrap(true);
        jTextArea67.setTabSize(0);
        jTextArea67.setText("Las hortensias prefieren suelos ricos en materia orgánica,\ncon buen drenaje pero que retengan cierta humedad. Una \ncaracterística única de estas plantas es que su coloración \npuede variar según el pH del suelo: un pH ácido (5.5-6.5) \nfavorecerá tonos azules, mientras que un pH más alcalino \nproducirá flores rosadas o púrpuras. Por lo tanto, se pue-\nden realizar experimentos educativos en los jardines es-\ncolares para demostrar cómo los minerales y el pH del \nsuelo afectan la naturaleza.\n\nPara plantar hortensias, es importante elegir un lugar con \nluz indirecta o semisombra, ya que la exposición directa al \nsol durante las horas más intensas puede dañarlas. Se \ndebe cavar un hoyo amplio y profundo, en el que se mezcle \ntierra de jardín con compost o materia orgánica. Después \nde plantar, un buen riego inicial asegurará que la planta se \nadapte al suelo.");
        jTextArea67.setToolTipText("");
        jTextArea67.setWrapStyleWord(true);
        jTextArea67.setBorder(null);
        jScrollPane68.setViewportView(jTextArea67);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel108)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane67)
                .addGap(80, 80, 80))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HortensiaLayout = new javax.swing.GroupLayout(Hortensia);
        Hortensia.setLayout(HortensiaLayout);
        HortensiaLayout.setHorizontalGroup(
            HortensiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HortensiaLayout.setVerticalGroup(
            HortensiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Hortensia", Hortensia);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Begonia.png"))); // NOI18N
        jLabel109.setMinimumSize(new java.awt.Dimension(350, 380));
        jLabel109.setPreferredSize(new java.awt.Dimension(350, 380));

        jScrollPane69.setBorder(null);

        jTextArea68.setEditable(false);
        jTextArea68.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea68.setForeground(new java.awt.Color(0, 204, 255));
        jTextArea68.setLineWrap(true);
        jTextArea68.setTabSize(0);
        jTextArea68.setText("Las begonias son plantas ornamentales muy\n apreciadas por su belleza y versatilidad. Con \nuna amplia gama de colores y formas, tanto \nen sus flores como en su follaje, estas plantas \nse han convertido en un elemento esencial en \nla decoración de interiores y exteriores. Su fa-\ncilidad de cultivo las hace ideales para jardi-\nneros principiantes y experimentados por igual.");
        jTextArea68.setToolTipText("");
        jTextArea68.setWrapStyleWord(true);
        jTextArea68.setBorder(null);
        jScrollPane69.setViewportView(jTextArea68);

        jScrollPane70.setBorder(null);

        jTextArea69.setEditable(false);
        jTextArea69.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea69.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        jTextArea69.setForeground(new java.awt.Color(0, 204, 255));
        jTextArea69.setTabSize(0);
        jTextArea69.setText("BEGONIA");
        jTextArea69.setWrapStyleWord(true);
        jTextArea69.setBorder(null);
        jScrollPane70.setViewportView(jTextArea69);

        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Beg1.png"))); // NOI18N

        jScrollPane71.setBorder(null);

        jTextArea70.setEditable(false);
        jTextArea70.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea70.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea70.setForeground(new java.awt.Color(0, 204, 255));
        jTextArea70.setLineWrap(true);
        jTextArea70.setTabSize(0);
        jTextArea70.setText("Al momento de preparar el suelo para plantar \nbegonias, es fundamental incorporar sufici-\nente materia orgánica para asegurar un \naporte adecuado de nutrientes. Estas plantas \npueden cultivarse tanto en macetas como en \nel suelo, siempre dejando espacio suficiente \nentre ellas para facilitar una buena ventilación. \nDurante su cuidado, el riego debe ser mode-\nrado, asegurando que la capa superior del \nsuelo se seque ligeramente entre cada apli-\ncación de agua para evitar el exceso de hu-\nmedad. Las begonias prefieren ubicaciones \ncon luz indirecta o sombra parcial, ya que la \nexposición directa al sol puede dañar sus hojas. ");
        jTextArea70.setToolTipText("");
        jTextArea70.setWrapStyleWord(true);
        jTextArea70.setBorder(null);
        jScrollPane71.setViewportView(jTextArea70);

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Beg2.png"))); // NOI18N

        jScrollPane72.setBorder(null);

        jTextArea71.setEditable(false);
        jTextArea71.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea71.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea71.setForeground(new java.awt.Color(0, 204, 255));
        jTextArea71.setLineWrap(true);
        jTextArea71.setTabSize(0);
        jTextArea71.setText("Estas plantas no tienen requisitos estrictos en \ncuanto a contenido de minerales, pero pros-\nperan mejor en suelos enriquecidos con ma-\nteria orgánica como compost. En lo que res-\npecta al nivel de pH, prefieren un rango de 6.0\na 7.0, lo que les permite absorber los nutrien-\ntes de manera óptima para mantener su salud \ny belleza. Aunque no necesitan suelos demas-\niado húmedos, es importante garantizar un \nriego adecuado que mantenga la tierra ligera-\nmente húmeda pero bien drenada para evitar \nproblemas de encharcamiento. Los suelos \nideales para las begonias son aquellos ricos \nen materia orgánica y con buen drenaje, como \nlas mezclas que contienen tierra para macetas \ncombinada con arena y compost.");
        jTextArea71.setToolTipText("");
        jTextArea71.setWrapStyleWord(true);
        jTextArea71.setBorder(null);
        jScrollPane72.setViewportView(jTextArea71);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel110)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BegoniaLayout = new javax.swing.GroupLayout(Begonia);
        Begonia.setLayout(BegoniaLayout);
        BegoniaLayout.setHorizontalGroup(
            BegoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BegoniaLayout.setVerticalGroup(
            BegoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BegoniaLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Begonia", Begonia);

        javax.swing.GroupLayout NarcisoLayout = new javax.swing.GroupLayout(Narciso);
        Narciso.setLayout(NarcisoLayout);
        NarcisoLayout.setHorizontalGroup(
            NarcisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        NarcisoLayout.setVerticalGroup(
            NarcisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Narciso", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/narciso.png")), Narciso); // NOI18N

        javax.swing.GroupLayout BrezoLayout = new javax.swing.GroupLayout(Brezo);
        Brezo.setLayout(BrezoLayout);
        BrezoLayout.setHorizontalGroup(
            BrezoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BrezoLayout.setVerticalGroup(
            BrezoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Brezo", Brezo);

        javax.swing.GroupLayout GardeniaLayout = new javax.swing.GroupLayout(Gardenia);
        Gardenia.setLayout(GardeniaLayout);
        GardeniaLayout.setHorizontalGroup(
            GardeniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GardeniaLayout.setVerticalGroup(
            GardeniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Gardenia", Gardenia);

        javax.swing.GroupLayout HelechoLayout = new javax.swing.GroupLayout(Helecho);
        Helecho.setLayout(HelechoLayout);
        HelechoLayout.setHorizontalGroup(
            HelechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HelechoLayout.setVerticalGroup(
            HelechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Helecho", Helecho);

        javax.swing.GroupLayout Diente_LeonLayout = new javax.swing.GroupLayout(Diente_Leon);
        Diente_Leon.setLayout(Diente_LeonLayout);
        Diente_LeonLayout.setHorizontalGroup(
            Diente_LeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Diente_LeonLayout.setVerticalGroup(
            Diente_LeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Diente De León", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/diente leon.png")), Diente_Leon); // NOI18N

        javax.swing.GroupLayout FresaLayout = new javax.swing.GroupLayout(Fresa);
        Fresa.setLayout(FresaLayout);
        FresaLayout.setHorizontalGroup(
            FresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FresaLayout.setVerticalGroup(
            FresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Fresa", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/planta fresa.png")), Fresa); // NOI18N

        javax.swing.GroupLayout RododendroLayout = new javax.swing.GroupLayout(Rododendro);
        Rododendro.setLayout(RododendroLayout);
        RododendroLayout.setHorizontalGroup(
            RododendroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RododendroLayout.setVerticalGroup(
            RododendroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Rododendro", Rododendro);

        javax.swing.GroupLayout LlantenLayout = new javax.swing.GroupLayout(Llanten);
        Llanten.setLayout(LlantenLayout);
        LlantenLayout.setHorizontalGroup(
            LlantenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LlantenLayout.setVerticalGroup(
            LlantenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Llantén", Llanten);

        javax.swing.GroupLayout AchicoriaLayout = new javax.swing.GroupLayout(Achicoria);
        Achicoria.setLayout(AchicoriaLayout);
        AchicoriaLayout.setHorizontalGroup(
            AchicoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AchicoriaLayout.setVerticalGroup(
            AchicoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Achicoria", Achicoria);

        javax.swing.GroupLayout QuenopodioLayout = new javax.swing.GroupLayout(Quenopodio);
        Quenopodio.setLayout(QuenopodioLayout);
        QuenopodioLayout.setHorizontalGroup(
            QuenopodioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        QuenopodioLayout.setVerticalGroup(
            QuenopodioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Quenopodio", Quenopodio);

        javax.swing.GroupLayout Boca_De_dragonLayout = new javax.swing.GroupLayout(Boca_De_dragon);
        Boca_De_dragon.setLayout(Boca_De_dragonLayout);
        Boca_De_dragonLayout.setHorizontalGroup(
            Boca_De_dragonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Boca_De_dragonLayout.setVerticalGroup(
            Boca_De_dragonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Boca de dragón", Boca_De_dragon);

        javax.swing.GroupLayout CaléndulaLayout = new javax.swing.GroupLayout(Caléndula);
        Caléndula.setLayout(CaléndulaLayout);
        CaléndulaLayout.setHorizontalGroup(
            CaléndulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CaléndulaLayout.setVerticalGroup(
            CaléndulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Caléndula", Caléndula);

        javax.swing.GroupLayout Mastuerzo_marinoLayout = new javax.swing.GroupLayout(Mastuerzo_marino);
        Mastuerzo_marino.setLayout(Mastuerzo_marinoLayout);
        Mastuerzo_marinoLayout.setHorizontalGroup(
            Mastuerzo_marinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Mastuerzo_marinoLayout.setVerticalGroup(
            Mastuerzo_marinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Mastuerzo marino", Mastuerzo_marino);

        javax.swing.GroupLayout TagetesLayout = new javax.swing.GroupLayout(Tagetes);
        Tagetes.setLayout(TagetesLayout);
        TagetesLayout.setHorizontalGroup(
            TagetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TagetesLayout.setVerticalGroup(
            TagetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tagetes", Tagetes);

        javax.swing.GroupLayout Árbol_del_amorLayout = new javax.swing.GroupLayout(Árbol_del_amor);
        Árbol_del_amor.setLayout(Árbol_del_amorLayout);
        Árbol_del_amorLayout.setHorizontalGroup(
            Árbol_del_amorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Árbol_del_amorLayout.setVerticalGroup(
            Árbol_del_amorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Árbol del amor", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/arbol amor.png")), Árbol_del_amor); // NOI18N

        Plantas.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 870));

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/planta (3).png")), Plantas); // NOI18N

        Jardin.setBackground(new java.awt.Color(255, 255, 0));
        Jardin.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 50, 5, new java.awt.Color(0, 0, 0)));
        Jardin.setPreferredSize(new java.awt.Dimension(1064, 870));
        Jardin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane10.setBorder(null);

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea9.setTabSize(0);
        jTextArea9.setText("Diseño del Jardin Escolar.");
        jTextArea9.setWrapStyleWord(true);
        jTextArea9.setBorder(null);
        jScrollPane10.setViewportView(jTextArea9);

        Jardin.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 104, -1, -1));

        jLabel26.setBackground(new java.awt.Color(153, 102, 0));
        jLabel26.setFont(new java.awt.Font("Calisto MT", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 102, 0));
        jLabel26.setText("JARDIN DE APRENDIZAJE");
        Jardin.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 0, -1, 84));

        jScrollPane11.setBorder(null);

        jTextArea10.setEditable(false);
        jTextArea10.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea10.setTabSize(0);
        jTextArea10.setText("Un diseño bien pensado puede fomentar\nla curiosidad de los estudiantes, pro...\nmover la sostenibilidad en el ambiente \ny servir como un laboratorio al aire libre \npara la enseñanza sobre las plantas.");
        jTextArea10.setWrapStyleWord(true);
        jTextArea10.setBorder(null);
        jScrollPane11.setViewportView(jTextArea10);

        Jardin.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 142, 294, -1));

        jScrollPane12.setBorder(null);

        jTextArea11.setEditable(false);
        jTextArea11.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea11.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jTextArea11.setTabSize(0);
        jTextArea11.setText("Preparacion y construccion.");
        jTextArea11.setWrapStyleWord(true);
        jTextArea11.setBorder(null);
        jScrollPane12.setViewportView(jTextArea11);

        Jardin.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jScrollPane13.setBorder(null);

        jTextArea12.setEditable(false);
        jTextArea12.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea12.setTabSize(0);
        jTextArea12.setText("Preparacion de la tierra.");
        jTextArea12.setWrapStyleWord(true);
        jTextArea12.setBorder(null);
        jScrollPane13.setViewportView(jTextArea12);

        Jardin.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        jScrollPane14.setBorder(null);

        jTextArea13.setEditable(false);
        jTextArea13.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jTextArea13.setTabSize(0);
        jTextArea13.setText("Adaptacion del terreno escolar.");
        jTextArea13.setWrapStyleWord(true);
        jTextArea13.setBorder(null);
        jScrollPane14.setViewportView(jTextArea13);

        Jardin.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, -1, -1));

        jScrollPane15.setBorder(null);

        jTextArea14.setEditable(false);
        jTextArea14.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea14.setTabSize(0);
        jTextArea14.setText("Tipos de Suelos.");
        jTextArea14.setWrapStyleWord(true);
        jTextArea14.setBorder(null);
        jScrollPane15.setViewportView(jTextArea14);

        Jardin.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 104, -1, -1));

        jScrollPane16.setBorder(null);

        jTextArea15.setEditable(false);
        jTextArea15.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea15.setTabSize(0);
        jTextArea15.setText("Mantenimiento.");
        jTextArea15.setWrapStyleWord(true);
        jTextArea15.setBorder(null);
        jScrollPane16.setViewportView(jTextArea15);

        Jardin.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin.png"))); // NOI18N
        Jardin.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/beneficios.png"))); // NOI18N
        Jardin.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin3_1.png"))); // NOI18N
        Jardin.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/tierra-arcillosa-seca-y-compactada..png"))); // NOI18N
        Jardin.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/buenas-practicas-agricolas-tipos-suelo.png"))); // NOI18N
        Jardin.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, -1, -1));

        jScrollPane17.setBorder(null);

        jTextArea16.setEditable(false);
        jTextArea16.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea16.setTabSize(0);
        jTextArea16.setText("Esto incluye tareas regulares como el \nriego, la poda, el control de plagas y la \nrotación de cultivos, así como actividades \neducativas que involucren a los estudiantes \nen el cuidado continuo del espacio.\n");
        jTextArea16.setWrapStyleWord(true);
        jTextArea16.setBorder(null);
        jScrollPane17.setViewportView(jTextArea16);

        Jardin.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, -1, -1));

        jScrollPane18.setBorder(null);

        jTextArea17.setEditable(false);
        jTextArea17.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea17.setTabSize(0);
        jTextArea17.setText("La preparación y construcción del jardín \ncomienza con la selección del sitio ade\ncuado, la evaluación del tipo de suelo y \nla determinación de las plantas más \nadecuadas para el clima local.\n");
        jTextArea17.setWrapStyleWord(true);
        jTextArea17.setBorder(null);
        jScrollPane18.setViewportView(jTextArea17);

        Jardin.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jScrollPane19.setBorder(null);

        jTextArea18.setEditable(false);
        jTextArea18.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea18.setTabSize(0);
        jTextArea18.setText("El suelo es un recurso vital que sus\ntenta la vida en nuestro planeta, actu\nando como un medio para el creci-\nmiento de las plantas y un hábitat \npara una variedad de organismos. \n");
        jTextArea18.setWrapStyleWord(true);
        jTextArea18.setBorder(null);
        jScrollPane19.setViewportView(jTextArea18);

        Jardin.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 142, -1, -1));

        jScrollPane20.setBorder(null);

        jTextArea19.setEditable(false);
        jTextArea19.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea19.setTabSize(0);
        jTextArea19.setText("Para la tierra, su preparacion brinda \ncaracterísticas únicas, influyen en su \ncapacidad para retener agua, nutrientes \ny su idoneidad para diferentes cultivos.\n");
        jTextArea19.setWrapStyleWord(true);
        jTextArea19.setBorder(null);
        jScrollPane20.setViewportView(jTextArea19);

        Jardin.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        adaptacion.setBackground(new java.awt.Color(255, 102, 0));
        adaptacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        adaptacion.setText(" Contenido.");
        adaptacion.setBorder(null);
        adaptacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptacionActionPerformed(evt);
            }
        });
        Jardin.add(adaptacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 700, 110, -1));

        jScrollPane21.setBorder(null);

        jTextArea20.setEditable(false);
        jTextArea20.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea20.setTabSize(0);
        jTextArea20.setText("Transformamos el entorno escolar en \nun espacio educativo y ecológico. para \nmaximizar el uso de cada tipo de suelo \nes esencial para la agricultura sostenible \ny la conservación del medio ambiente.\n");
        jTextArea20.setWrapStyleWord(true);
        jTextArea20.setBorder(null);
        jScrollPane21.setViewportView(jTextArea20);

        Jardin.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 330, 140));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton1.setText(" Contenido.");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Jardin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 730, 110, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton2.setText(" Contenido.");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Jardin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, -1));

        introDiseños.setBackground(new java.awt.Color(255, 102, 0));
        introDiseños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        introDiseños.setText(" Contenido.");
        introDiseños.setBorder(null);
        introDiseños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introDiseñosActionPerformed(evt);
            }
        });
        Jardin.add(introDiseños, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, -1));

        Tsuelos.setBackground(new java.awt.Color(255, 102, 0));
        Tsuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        Tsuelos.setText(" Contenido.");
        Tsuelos.setBorder(null);
        Tsuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsuelosActionPerformed(evt);
            }
        });
        Jardin.add(Tsuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 110, -1));

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton6.setText("Contenido.");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Jardin.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 110, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/regando-plantas (1).png"))); // NOI18N
        Jardin.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 6, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flores.png"))); // NOI18N
        Jardin.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/cactus.png"))); // NOI18N
        Jardin.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/lapices-de-color.png"))); // NOI18N
        Jardin.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/impresion-de-mano.png"))); // NOI18N
        Jardin.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/informe-de-crecimiento.png"))); // NOI18N
        Jardin.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/jardin-de-infancia.png"))); // NOI18N
        Jardin.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin2_1.png"))); // NOI18N
        Jardin.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/siembra.png"))); // NOI18N
        Jardin.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 720, -1, -1));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/impresion-de-la-mano.png"))); // NOI18N
        Jardin.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 690, -1, -1));

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

        CicloDeAgua1.setBackground(new java.awt.Color(0, 51, 153));
        CicloDeAgua1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 153, 255)));
        CicloDeAgua1.setForeground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CicloDeAgua1.setPreferredSize(new java.awt.Dimension(1064, 870));
        CicloDeAgua1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin2.png"))); // NOI18N
        CicloDeAgua1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/32.png"))); // NOI18N
        CicloDeAgua1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/ciclo1.5.png"))); // NOI18N
        CicloDeAgua1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, -1, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ObOhgosRIJnnCAeHU_twkrWC9uCJRpoI5QYeKZF9GJk.png"))); // NOI18N
        CicloDeAgua1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ahorrar-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas (1).png"))); // NOI18N
        CicloDeAgua1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin3.png"))); // NOI18N
        CicloDeAgua1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 255, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton3.setText("Contenido.");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        CicloDeAgua1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, 50));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/ciclo1.4.png"))); // NOI18N
        CicloDeAgua1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, -1, 140));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/gota-de-agua1.1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 60, -1));

        jScrollPane5.setBorder(null);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea4.setTabSize(0);
        jTextArea4.setText("El ciclo del agua es un hermoso recordatorio de la interconexión \ny la renovación constante en la naturaleza. Desde la evaporación, \ndonde el agua asciende en forma de vapor, nos enseña sobre la \ntransformación y la capacidad de liberarnos de lo que ya no nece\nsitamos. La condensación, al formar nubes, simboliza la unión y \nla colaboración; cada gota se suma a un todo mayor.\n\nCuando el agua precipita en forma de lluvia, nos recuerda que a \nveces es necesario soltar para nutrir y dar vida a nuestro entorno. \nEste proceso alimenta ríos, lagos y océanos, revitalizando la tierra \ny sosteniendo la vida. ");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jScrollPane5.setViewportView(jTextArea4);

        CicloDeAgua1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, 260));

        jScrollPane3.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea2.setTabSize(0);
        jTextArea2.setText("¿Alguna vez te has preguntado de dónde viene el agua que\nbebemos, la que riega las plantas o la que forma los ríos,\nlagunas, pozos y cauces?\n\nEl agua, como fuente de vida, nos enseña la importancia de \nla conexión y la fluidez. Su capacidad para adaptarse a dife\nrentes formas y entornos nos recuerda que, al igual que ella, \ndebemos ser flexibles y resilientes ante los cambios. El agua \ntambién simboliza la vitalidad y la renovación; nos invita a valo\nrar cada gota y a ser conscientes de su papel esencial en nues\ntro bienestar y en el equilibrio del planeta. Aprendamos de su \ntransparencia y pureza, promoviendo la honestidad y la claridad \nen nuestras relaciones. Al cuidar el agua, cuidamos de nosotros \nmismos y del futuro, creando un mundo más sostenible y bello. ");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        CicloDeAgua1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 460, 300));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flores.png"))); // NOI18N
        CicloDeAgua1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/dia-mundial-del-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flor.png"))); // NOI18N
        CicloDeAgua1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/enfriar.png"))); // NOI18N
        CicloDeAgua1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, -1, 60));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/gato.png"))); // NOI18N
        CicloDeAgua1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 0));
        jLabel8.setText("El Ciclo del Agua.");
        CicloDeAgua1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 0));
        jLabel9.setText("El Agua.");
        CicloDeAgua1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 255, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton8.setText("Contenido.");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        CicloDeAgua1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, 50));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/81qaU6Yza-L._UC256,256_CACC,256,256_.png"))); // NOI18N
        CicloDeAgua1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, 140));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/ciclo1.1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 670, -1, 140));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/ciclo1.3.png"))); // NOI18N
        CicloDeAgua1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, -1, 140));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/ciclo1.2.png"))); // NOI18N
        CicloDeAgua1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, 140));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas.png"))); // NOI18N
        CicloDeAgua1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 60, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/agua (2).png"))); // NOI18N
        CicloDeAgua1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 750, 70, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/agua (1).png"))); // NOI18N
        CicloDeAgua1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 750, 60, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/agua1.1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 740, 60, -1));

        jTabbedPane1.addTab("Ciclo del agua", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/filtro-de-agua.png")), CicloDeAgua1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Jardin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    
    
    private void DeserticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeserticoMouseClicked
         try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Desertico acceso = new Desertico();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_DeserticoMouseClicked

    private void SubTropicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTropicalMouseClicked
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            subTropical acceso = new subTropical();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_SubTropicalMouseClicked

    private void tropicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tropicalMouseClicked
        
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Tropical acceso = new Tropical();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_tropicalMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void TempladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TempladoMouseClicked
        
         try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Templado acceso = new Templado();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_TempladoMouseClicked

    private void tropicalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tropicalKeyPressed
        
    }//GEN-LAST:event_tropicalKeyPressed

    private void mediterraneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediterraneoMouseClicked
        
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Mediterraneo acceso = new Mediterraneo();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_mediterraneoMouseClicked

    private void continentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continentalMouseClicked
        
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Continental acceso = new Continental();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_continentalMouseClicked

    private void antarticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antarticoMouseClicked
        
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Antartico acceso = new Antartico();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_antarticoMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

      try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Agua1 acceso = new Agua1();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }

     
    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            ciclo acceso = new ciclo();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_salir.wav");
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
            
        }
        
        Principal acceso = new Principal();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void introDiseñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introDiseñosActionPerformed
        
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            introDiseño acceso = new introDiseño();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        
       
    }//GEN-LAST:event_introDiseñosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            IntroPreparacion acceso = new IntroPreparacion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Mantenimiento1 acceso = new Mantenimiento1();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TsuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsuelosActionPerformed
       try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            TiposSuelos1 acceso = new TiposSuelos1();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_TsuelosActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            PreparacionS1 acceso = new  PreparacionS1();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
       
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void adaptacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptacionActionPerformed
         try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_play.wav");
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
            
            Adaptacion1 acceso = new  Adaptacion1();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_adaptacionActionPerformed

    private void LluviaslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LluviaslblMouseClicked

    Lluvias acceso = new Lluvias();
    acceso.setVisible(true);
    acceso.setLocationRelativeTo(null); 
            
    }//GEN-LAST:event_LluviaslblMouseClicked

    private void ClimaslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClimaslblMouseClicked
        Climas acceso = new Climas();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_ClimaslblMouseClicked

    private void TierralblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TierralblMouseClicked
        TiposDeTierra acceso = new TiposDeTierra();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_TierralblMouseClicked

    private void PlagaslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlagaslblMouseClicked
        Plagas acceso = new Plagas();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_PlagaslblMouseClicked

    private void comuneslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comuneslblMouseClicked
        RiesgosComunes acceso = new RiesgosComunes();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_comuneslblMouseClicked

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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Achicoria;
    private javax.swing.JPanel Amapolas_Rosas;
    private javax.swing.JPanel Azalea;
    private javax.swing.JPanel Begonia;
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JPanel Boca_De_dragon;
    private javax.swing.JPanel Brezo;
    private javax.swing.JPanel Bugambilia;
    private javax.swing.JPanel Caléndula;
    private javax.swing.JPanel CicloDeAgua1;
    private javax.swing.JPanel Clima;
    private javax.swing.JLabel Climaslbl;
    private javax.swing.JPanel Desertico;
    private javax.swing.JPanel Diente_Leon;
    private javax.swing.JPanel Fresa;
    private javax.swing.JPanel Gardenia;
    private javax.swing.JPanel Genciana;
    private javax.swing.JPanel Helecho;
    private javax.swing.JPanel Hortensia;
    private javax.swing.JPanel Int_Plantas;
    private javax.swing.JPanel Ixoras;
    private javax.swing.JPanel Jardin;
    private javax.swing.JPanel Llanten;
    private javax.swing.JLabel Lluviaslbl;
    private javax.swing.JPanel Margaritas;
    private javax.swing.JPanel Mastuerzo_marino;
    private javax.swing.JPanel Narciso;
    private javax.swing.JLabel Plagaslbl;
    private javax.swing.JPanel Plantas;
    private javax.swing.JPanel Primula;
    private javax.swing.JPanel Quenopodio;
    private javax.swing.JPanel Riesgos;
    private javax.swing.JPanel Rododendro;
    private javax.swing.JPanel Rosas_Desierto;
    private javax.swing.JPanel SubTropical;
    private javax.swing.JPanel Tagetes;
    private javax.swing.JPanel Templado;
    private javax.swing.JLabel Tierralbl;
    private javax.swing.JButton Tsuelos;
    private javax.swing.JPanel Tulipanes;
    private javax.swing.JButton adaptacion;
    private javax.swing.JPanel antartico;
    private javax.swing.JLabel comuneslbl;
    private javax.swing.JPanel continental;
    private javax.swing.JButton introDiseños;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea28;
    private javax.swing.JTextArea jTextArea29;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea30;
    private javax.swing.JTextArea jTextArea31;
    private javax.swing.JTextArea jTextArea32;
    private javax.swing.JTextArea jTextArea33;
    private javax.swing.JTextArea jTextArea34;
    private javax.swing.JTextArea jTextArea35;
    private javax.swing.JTextArea jTextArea36;
    private javax.swing.JTextArea jTextArea37;
    private javax.swing.JTextArea jTextArea38;
    private javax.swing.JTextArea jTextArea39;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea40;
    private javax.swing.JTextArea jTextArea41;
    private javax.swing.JTextArea jTextArea42;
    private javax.swing.JTextArea jTextArea43;
    private javax.swing.JTextArea jTextArea44;
    private javax.swing.JTextArea jTextArea45;
    private javax.swing.JTextArea jTextArea46;
    private javax.swing.JTextArea jTextArea47;
    private javax.swing.JTextArea jTextArea48;
    private javax.swing.JTextArea jTextArea49;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea50;
    private javax.swing.JTextArea jTextArea51;
    private javax.swing.JTextArea jTextArea52;
    private javax.swing.JTextArea jTextArea53;
    private javax.swing.JTextArea jTextArea54;
    private javax.swing.JTextArea jTextArea55;
    private javax.swing.JTextArea jTextArea56;
    private javax.swing.JTextArea jTextArea57;
    private javax.swing.JTextArea jTextArea58;
    private javax.swing.JTextArea jTextArea59;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea60;
    private javax.swing.JTextArea jTextArea61;
    private javax.swing.JTextArea jTextArea62;
    private javax.swing.JTextArea jTextArea63;
    private javax.swing.JTextArea jTextArea64;
    private javax.swing.JTextArea jTextArea65;
    private javax.swing.JTextArea jTextArea66;
    private javax.swing.JTextArea jTextArea67;
    private javax.swing.JTextArea jTextArea68;
    private javax.swing.JTextArea jTextArea69;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea70;
    private javax.swing.JTextArea jTextArea71;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JPanel mediterraneo;
    private javax.swing.JPanel tropical;
    private javax.swing.JPanel Árbol_del_amor;
    // End of variables declaration//GEN-END:variables
}
