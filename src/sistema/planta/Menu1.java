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
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
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
        Tulipanes = new javax.swing.JPanel();
        Rosas_Desierto = new javax.swing.JPanel();
        butt_rosaDelDesierto = new javax.swing.JButton();
        Magnolio = new javax.swing.JPanel();
        Azalea = new javax.swing.JPanel();
        Genciana = new javax.swing.JPanel();
        Primula = new javax.swing.JPanel();
        Hortensia = new javax.swing.JPanel();
        Begonia = new javax.swing.JPanel();
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
        jTextArea26.setTabSize(0);
        jTextArea26.setText("RIESGOS");
        jTextArea26.setWrapStyleWord(true);
        jTextArea26.setBorder(null);
        jScrollPane27.setViewportView(jTextArea26);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/tipo de tierrachiquita.png"))); // NOI18N
        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/Lluviaschiquita.png"))); // NOI18N
        jButton11.setText("jButton10");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/bichoschiquita.png"))); // NOI18N
        jButton12.setText("jButton10");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/riesgos comuneschiquitas.png"))); // NOI18N
        jButton14.setText("jButton10");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Riesgos/climaschiquita.png"))); // NOI18N
        jButton15.setText("jButton10");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jScrollPane28.setBorder(null);

        jTextArea27.setEditable(false);
        jTextArea27.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea27.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea27.setTabSize(0);
        jTextArea27.setText("Plagas");
        jTextArea27.setWrapStyleWord(true);
        jTextArea27.setBorder(null);
        jScrollPane28.setViewportView(jTextArea27);

        jScrollPane29.setBorder(null);

        jTextArea28.setEditable(false);
        jTextArea28.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea28.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea28.setTabSize(0);
        jTextArea28.setText("Lluvias");
        jTextArea28.setWrapStyleWord(true);
        jTextArea28.setBorder(null);
        jScrollPane29.setViewportView(jTextArea28);

        jScrollPane30.setBorder(null);

        jTextArea29.setEditable(false);
        jTextArea29.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea29.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
        jTextArea29.setTabSize(0);
        jTextArea29.setText("Climas");
        jTextArea29.setWrapStyleWord(true);
        jTextArea29.setBorder(null);
        jScrollPane30.setViewportView(jTextArea29);

        jScrollPane31.setBorder(null);

        jTextArea30.setEditable(false);
        jTextArea30.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea30.setFont(new java.awt.Font("Elephant", 1, 30)); // NOI18N
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
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RiesgosLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(120, 120, 120))
                                    .addGroup(RiesgosLayout.createSequentialGroup()
                                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(RiesgosLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                                .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(RiesgosLayout.createSequentialGroup()
                                                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(5, 5, 5)))
                                                .addGap(22, 22, 22))
                                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(RiesgosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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
                    .addGroup(RiesgosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiesgosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel87)
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
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RiesgosLayout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RiesgosLayout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
        );
        Int_PlantasLayout.setVerticalGroup(
            Int_PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int_PlantasLayout.createSequentialGroup()
                .addComponent(jLabel49)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        Amapolas_RosasLayout.setVerticalGroup(
            Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane34))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Amapolas Rosas", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/Amapola.rosa.png")), Amapolas_Rosas); // NOI18N

        Ixoras.setBackground(new java.awt.Color(153, 0, 0));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/ixo.png"))); // NOI18N
        jLabel82.setText("jLabel81");

        javax.swing.GroupLayout IxorasLayout = new javax.swing.GroupLayout(Ixoras);
        Ixoras.setLayout(IxorasLayout);
        IxorasLayout.setHorizontalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 805, Short.MAX_VALUE))
        );
        IxorasLayout.setVerticalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addComponent(jLabel82)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ixoras", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/ixora.png")), Ixoras); // NOI18N

        Tulipanes.setBackground(new java.awt.Color(204, 0, 51));
        Tulipanes.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout TulipanesLayout = new javax.swing.GroupLayout(Tulipanes);
        Tulipanes.setLayout(TulipanesLayout);
        TulipanesLayout.setHorizontalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        TulipanesLayout.setVerticalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tulipanes", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/tulipanes.png")), Tulipanes); // NOI18N

        Rosas_Desierto.setBackground(new java.awt.Color(255, 153, 255));

        butt_rosaDelDesierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flor-rosa-desierto.png"))); // NOI18N
        butt_rosaDelDesierto.setText("jButton1");
        butt_rosaDelDesierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_rosaDelDesiertoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Rosas_DesiertoLayout = new javax.swing.GroupLayout(Rosas_Desierto);
        Rosas_Desierto.setLayout(Rosas_DesiertoLayout);
        Rosas_DesiertoLayout.setHorizontalGroup(
            Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(butt_rosaDelDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(907, Short.MAX_VALUE))
        );
        Rosas_DesiertoLayout.setVerticalGroup(
            Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(butt_rosaDelDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rosas Del Desierto", new javax.swing.ImageIcon(getClass().getResource("/IconosPlantas/rosa.png")), Rosas_Desierto); // NOI18N

        javax.swing.GroupLayout MagnolioLayout = new javax.swing.GroupLayout(Magnolio);
        Magnolio.setLayout(MagnolioLayout);
        MagnolioLayout.setHorizontalGroup(
            MagnolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        MagnolioLayout.setVerticalGroup(
            MagnolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Magnolio", Magnolio);

        javax.swing.GroupLayout AzaleaLayout = new javax.swing.GroupLayout(Azalea);
        Azalea.setLayout(AzaleaLayout);
        AzaleaLayout.setHorizontalGroup(
            AzaleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        AzaleaLayout.setVerticalGroup(
            AzaleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Azalea", Azalea);

        javax.swing.GroupLayout GencianaLayout = new javax.swing.GroupLayout(Genciana);
        Genciana.setLayout(GencianaLayout);
        GencianaLayout.setHorizontalGroup(
            GencianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        GencianaLayout.setVerticalGroup(
            GencianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Genciana", Genciana);

        javax.swing.GroupLayout PrimulaLayout = new javax.swing.GroupLayout(Primula);
        Primula.setLayout(PrimulaLayout);
        PrimulaLayout.setHorizontalGroup(
            PrimulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        PrimulaLayout.setVerticalGroup(
            PrimulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Primula", Primula);

        javax.swing.GroupLayout HortensiaLayout = new javax.swing.GroupLayout(Hortensia);
        Hortensia.setLayout(HortensiaLayout);
        HortensiaLayout.setHorizontalGroup(
            HortensiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        HortensiaLayout.setVerticalGroup(
            HortensiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Hortensia", Hortensia);

        javax.swing.GroupLayout BegoniaLayout = new javax.swing.GroupLayout(Begonia);
        Begonia.setLayout(BegoniaLayout);
        BegoniaLayout.setHorizontalGroup(
            BegoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        BegoniaLayout.setVerticalGroup(
            BegoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Begonia", Begonia);

        javax.swing.GroupLayout NarcisoLayout = new javax.swing.GroupLayout(Narciso);
        Narciso.setLayout(NarcisoLayout);
        NarcisoLayout.setHorizontalGroup(
            NarcisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        NarcisoLayout.setVerticalGroup(
            NarcisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Narciso", Narciso);

        javax.swing.GroupLayout BrezoLayout = new javax.swing.GroupLayout(Brezo);
        Brezo.setLayout(BrezoLayout);
        BrezoLayout.setHorizontalGroup(
            BrezoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        BrezoLayout.setVerticalGroup(
            BrezoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Brezo", Brezo);

        javax.swing.GroupLayout GardeniaLayout = new javax.swing.GroupLayout(Gardenia);
        Gardenia.setLayout(GardeniaLayout);
        GardeniaLayout.setHorizontalGroup(
            GardeniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        GardeniaLayout.setVerticalGroup(
            GardeniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Gardenia", Gardenia);

        javax.swing.GroupLayout HelechoLayout = new javax.swing.GroupLayout(Helecho);
        Helecho.setLayout(HelechoLayout);
        HelechoLayout.setHorizontalGroup(
            HelechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        HelechoLayout.setVerticalGroup(
            HelechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Helecho", Helecho);

        javax.swing.GroupLayout Diente_LeonLayout = new javax.swing.GroupLayout(Diente_Leon);
        Diente_Leon.setLayout(Diente_LeonLayout);
        Diente_LeonLayout.setHorizontalGroup(
            Diente_LeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        Diente_LeonLayout.setVerticalGroup(
            Diente_LeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Diente De León", Diente_Leon);

        javax.swing.GroupLayout FresaLayout = new javax.swing.GroupLayout(Fresa);
        Fresa.setLayout(FresaLayout);
        FresaLayout.setHorizontalGroup(
            FresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        FresaLayout.setVerticalGroup(
            FresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Fresa", Fresa);

        javax.swing.GroupLayout RododendroLayout = new javax.swing.GroupLayout(Rododendro);
        Rododendro.setLayout(RododendroLayout);
        RododendroLayout.setHorizontalGroup(
            RododendroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        RododendroLayout.setVerticalGroup(
            RododendroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Rododendro", Rododendro);

        javax.swing.GroupLayout LlantenLayout = new javax.swing.GroupLayout(Llanten);
        Llanten.setLayout(LlantenLayout);
        LlantenLayout.setHorizontalGroup(
            LlantenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        LlantenLayout.setVerticalGroup(
            LlantenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Llantén", Llanten);

        javax.swing.GroupLayout AchicoriaLayout = new javax.swing.GroupLayout(Achicoria);
        Achicoria.setLayout(AchicoriaLayout);
        AchicoriaLayout.setHorizontalGroup(
            AchicoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        AchicoriaLayout.setVerticalGroup(
            AchicoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Achicoria", Achicoria);

        javax.swing.GroupLayout QuenopodioLayout = new javax.swing.GroupLayout(Quenopodio);
        Quenopodio.setLayout(QuenopodioLayout);
        QuenopodioLayout.setHorizontalGroup(
            QuenopodioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        QuenopodioLayout.setVerticalGroup(
            QuenopodioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Quenopodio", Quenopodio);

        javax.swing.GroupLayout Boca_De_dragonLayout = new javax.swing.GroupLayout(Boca_De_dragon);
        Boca_De_dragon.setLayout(Boca_De_dragonLayout);
        Boca_De_dragonLayout.setHorizontalGroup(
            Boca_De_dragonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        Boca_De_dragonLayout.setVerticalGroup(
            Boca_De_dragonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Boca de dragón", Boca_De_dragon);

        javax.swing.GroupLayout CaléndulaLayout = new javax.swing.GroupLayout(Caléndula);
        Caléndula.setLayout(CaléndulaLayout);
        CaléndulaLayout.setHorizontalGroup(
            CaléndulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        CaléndulaLayout.setVerticalGroup(
            CaléndulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Caléndula", Caléndula);

        javax.swing.GroupLayout Mastuerzo_marinoLayout = new javax.swing.GroupLayout(Mastuerzo_marino);
        Mastuerzo_marino.setLayout(Mastuerzo_marinoLayout);
        Mastuerzo_marinoLayout.setHorizontalGroup(
            Mastuerzo_marinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        Mastuerzo_marinoLayout.setVerticalGroup(
            Mastuerzo_marinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Mastuerzo marino", Mastuerzo_marino);

        javax.swing.GroupLayout TagetesLayout = new javax.swing.GroupLayout(Tagetes);
        Tagetes.setLayout(TagetesLayout);
        TagetesLayout.setHorizontalGroup(
            TagetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        TagetesLayout.setVerticalGroup(
            TagetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tagetes", Tagetes);

        javax.swing.GroupLayout Árbol_del_amorLayout = new javax.swing.GroupLayout(Árbol_del_amor);
        Árbol_del_amor.setLayout(Árbol_del_amorLayout);
        Árbol_del_amorLayout.setHorizontalGroup(
            Árbol_del_amorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
        );
        Árbol_del_amorLayout.setVerticalGroup(
            Árbol_del_amorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Árbol del amor", Árbol_del_amor);

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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void butt_rosaDelDesiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_rosaDelDesiertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butt_rosaDelDesiertoActionPerformed

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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       Lluvias acceso = new Lluvias();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         Climas acceso = new Climas();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        TiposDeTierra acceso = new TiposDeTierra();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Plagas acceso = new Plagas();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        RiesgosComunes acceso = new RiesgosComunes();
            acceso.setVisible(true);
            acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton14ActionPerformed

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
    private javax.swing.JPanel Caléndula;
    private javax.swing.JPanel CicloDeAgua1;
    private javax.swing.JPanel Clima;
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
    private javax.swing.JPanel Magnolio;
    private javax.swing.JPanel Margaritas;
    private javax.swing.JPanel Mastuerzo_marino;
    private javax.swing.JPanel Narciso;
    private javax.swing.JPanel Plantas;
    private javax.swing.JPanel Primula;
    private javax.swing.JPanel Quenopodio;
    private javax.swing.JPanel Riesgos;
    private javax.swing.JPanel Rododendro;
    private javax.swing.JPanel Rosas_Desierto;
    private javax.swing.JPanel SubTropical;
    private javax.swing.JPanel Tagetes;
    private javax.swing.JPanel Templado;
    private javax.swing.JButton Tsuelos;
    private javax.swing.JPanel Tulipanes;
    private javax.swing.JButton adaptacion;
    private javax.swing.JPanel antartico;
    private javax.swing.JButton butt_rosaDelDesierto;
    private javax.swing.JPanel continental;
    private javax.swing.JButton introDiseños;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
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
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JPanel mediterraneo;
    private javax.swing.JPanel tropical;
    private javax.swing.JPanel Árbol_del_amor;
    // End of variables declaration//GEN-END:variables
}
