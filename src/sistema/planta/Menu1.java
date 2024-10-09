/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

import CICLODELAGUA.Coleccion;
import CICLODELAGUA.InporAgua;
import CICLODELAGUA.Precipitacion;
import CICLODELAGUA.RAICES;
import CICLODELAGUA.condensacion;
import CICLODELAGUA.evaporacion;
import CLIMA.Antartico;
import CLIMA.Continental;
import CLIMA.Desertico;
import CLIMA.Mediterraneo;
import CLIMA.Templado;
import CLIMA.Tropical;
import CLIMA.subTropical;
import OPERACIONES.Operaciones;
import Plantas.Margaritas1;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
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
        Riesgos = new javax.swing.JPanel();
        CicloDeAgua1 = new javax.swing.JPanel();
        MenuCiclo = new javax.swing.JTabbedPane();
        consejos1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        consejos = new javax.swing.JPanel();
        condensacion1 = new javax.swing.JButton();
        condensacion2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ProcesoPrincipal = new javax.swing.JPanel();
        coleccion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        condensacion = new javax.swing.JButton();
        evaporacion = new javax.swing.JButton();
        precipitacion = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Clima = new javax.swing.JPanel();
        SubTropical = new javax.swing.JPanel();
        antartico = new javax.swing.JPanel();
        continental = new javax.swing.JPanel();
        tropical = new javax.swing.JPanel();
        mediterraneo = new javax.swing.JPanel();
        Desertico = new javax.swing.JPanel();
        Templado = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Amapolas_Rosas = new javax.swing.JPanel();
        butt_AmapolasRosas = new javax.swing.JButton();
        Ixoras = new javax.swing.JPanel();
        butt_Ixora = new javax.swing.JButton();
        Tulipanes = new javax.swing.JPanel();
        butt_Tulipanes = new javax.swing.JButton();
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
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz");
        setBackground(new java.awt.Color(0, 153, 102));
        setName("MenuPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1071, 830));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 0));
        jTabbedPane1.setForeground(new java.awt.Color(51, 255, 0));
        jTabbedPane1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1049, 903));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1064, 830));

        Bienvenida.setBackground(new java.awt.Color(0, 51, 0));
        Bienvenida.setForeground(new java.awt.Color(0, 51, 0));
        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida.setPreferredSize(new java.awt.Dimension(1064, 830));

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bienvenida ", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Bienvenida); // NOI18N

        Riesgos.setBackground(new java.awt.Color(0, 51, 0));
        Riesgos.setPreferredSize(new java.awt.Dimension(1064, 830));

        javax.swing.GroupLayout RiesgosLayout = new javax.swing.GroupLayout(Riesgos);
        Riesgos.setLayout(RiesgosLayout);
        RiesgosLayout.setHorizontalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        RiesgosLayout.setVerticalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riesgos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/parasito.png")), Riesgos); // NOI18N

        CicloDeAgua1.setBackground(new java.awt.Color(0, 51, 153));
        CicloDeAgua1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        CicloDeAgua1.setForeground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CicloDeAgua1.setPreferredSize(new java.awt.Dimension(1064, 830));
        CicloDeAgua1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuCiclo.setBackground(new java.awt.Color(204, 255, 204));
        MenuCiclo.setForeground(new java.awt.Color(0, 51, 102));
        MenuCiclo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MenuCiclo.setPreferredSize(new java.awt.Dimension(541, 604));

        consejos1.setBackground(new java.awt.Color(0, 51, 153));
        consejos1.setPreferredSize(new java.awt.Dimension(533, 604));
        consejos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/enfriar.png"))); // NOI18N
        consejos1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/enfriar.png"))); // NOI18N
        consejos1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/gato.png"))); // NOI18N
        consejos1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas.png"))); // NOI18N
        consejos1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 60, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flor.png"))); // NOI18N
        consejos1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ES Water_ A Resource for Everyone by Slidesgo2.jpg"))); // NOI18N
        jLabel33.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 255, 255)));
        jLabel33.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel33.setPreferredSize(new java.awt.Dimension(533, 604));
        consejos1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 520));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/dia-mundial-del-agua.png"))); // NOI18N
        consejos1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        MenuCiclo.addTab("Agua", new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/h2o_3357227.png")), consejos1); // NOI18N

        consejos.setBackground(new java.awt.Color(0, 51, 153));
        consejos.setPreferredSize(new java.awt.Dimension(533, 604));
        consejos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        condensacion1.setBackground(new java.awt.Color(153, 102, 0));
        condensacion1.setForeground(new java.awt.Color(0, 0, 204));
        condensacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/arbolRaices.png"))); // NOI18N
        condensacion1.setActionCommand("¿Que es la evaporacion?");
        condensacion1.setIconTextGap(1);
        condensacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condensacion1ActionPerformed(evt);
            }
        });
        consejos.add(condensacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 80));

        condensacion2.setBackground(new java.awt.Color(0, 204, 204));
        condensacion2.setForeground(new java.awt.Color(0, 0, 204));
        condensacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water-tap_5824199.png"))); // NOI18N
        condensacion2.setActionCommand("¿Que es la evaporacion?");
        condensacion2.setIconTextGap(1);
        condensacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condensacion2ActionPerformed(evt);
            }
        });
        consejos.add(condensacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 80));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/importancia-de-la-calidad-del-agua-para-riego-el-elemento-clave-para-el-exito-en-la-agricultura.jpg"))); // NOI18N
        jLabel35.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel35.setPreferredSize(new java.awt.Dimension(533, 604));
        consejos.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 530));

        jLabel8.setFont(new java.awt.Font("Goudy Old Style", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 0));
        jLabel8.setText("El agua es fuente de vida para ellas.");
        consejos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        MenuCiclo.addTab("Importancia", new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/tap_964403.png")), consejos); // NOI18N

        ProcesoPrincipal.setBackground(new java.awt.Color(0, 51, 153));
        ProcesoPrincipal.setName("Principal"); // NOI18N
        ProcesoPrincipal.setPreferredSize(new java.awt.Dimension(533, 604));
        ProcesoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coleccion.setBackground(new java.awt.Color(255, 153, 0));
        coleccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        coleccion.setForeground(new java.awt.Color(153, 153, 0));
        coleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/save-water_7296364.png"))); // NOI18N
        coleccion.setActionCommand("¿Que es la evaporacion?");
        coleccion.setIconTextGap(1);
        coleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coleccionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(coleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 70, 60));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/save-water_7296364.png"))); // NOI18N
        jButton3.setText("Coleccion.");
        jButton3.setActionCommand("¿Que es la evaporacion?");
        jButton3.setIconTextGap(1);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 730, -1, -1));

        condensacion.setBackground(new java.awt.Color(0, 204, 204));
        condensacion.setForeground(new java.awt.Color(0, 0, 204));
        condensacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water-purification_13505860.png"))); // NOI18N
        condensacion.setActionCommand("¿Que es la evaporacion?");
        condensacion.setIconTextGap(1);
        condensacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condensacionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(condensacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        evaporacion.setBackground(new java.awt.Color(0, 0, 153));
        evaporacion.setForeground(new java.awt.Color(0, 255, 255));
        evaporacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water-cycle_525893.png"))); // NOI18N
        evaporacion.setActionCommand("¿Que es la evaporacion?");
        evaporacion.setIconTextGap(1);
        evaporacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaporacionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(evaporacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        precipitacion.setBackground(new java.awt.Color(0, 255, 153));
        precipitacion.setForeground(new java.awt.Color(0, 204, 153));
        precipitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water_5625899.png"))); // NOI18N
        precipitacion.setActionCommand("¿Que es la evaporacion?");
        precipitacion.setIconTextGap(1);
        precipitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precipitacionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(precipitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/Captura.JPG"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 255, 255)));
        jLabel9.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel9.setPreferredSize(new java.awt.Dimension(533, 604));
        ProcesoPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 450, 510));

        MenuCiclo.addTab("Ciclos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/planta (6).png")), ProcesoPrincipal); // NOI18N

        CicloDeAgua1.add(MenuCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 490, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin2.png"))); // NOI18N
        CicloDeAgua1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/32.png"))); // NOI18N
        CicloDeAgua1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/81qaU6Yza-L._UC256,256_CACC,256,256_.png"))); // NOI18N
        CicloDeAgua1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ObOhgosRIJnnCAeHU_twkrWC9uCJRpoI5QYeKZF9GJk.png"))); // NOI18N
        CicloDeAgua1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ahorrar-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas (1).png"))); // NOI18N
        CicloDeAgua1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin3.png"))); // NOI18N
        CicloDeAgua1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jScrollPane5.setBorder(null);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea4.setTabSize(0);
        jTextArea4.setText("Imagina que la naturaleza es como \nun gran juego de agua. En este juego, \nel agua se mueve de un lugar a otro \ny cambia de forma. A veces está \nlíquida, como cuando bebes agua, y \notras veces se convierte en vapor, \ncomo cuando ves humo o el vapor \nde una olla caliente. \n¡Esto se llama el ciclo del agua!\n\nEste ciclo del agua es super \nimportante para que todas las plantas\n y animales vivan felices en la Tierra.");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jScrollPane5.setViewportView(jTextArea4);

        CicloDeAgua1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 260));

        jScrollPane3.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea2.setTabSize(0);
        jTextArea2.setText("¿Alguna vez te has preguntado de dónde \nviene el agua que bebemos, la que riega \nlas plantas o la que forma los ríos, \nlagunas, pozos y cauces? \n\n¡Pues se trata de un recurso renovable \nque da vida y del cual es un viaje increíble \nque no para nunca! ");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        CicloDeAgua1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 230));

        jScrollPane7.setBorder(null);

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea6.setTabSize(0);
        jTextArea6.setText("¿Estás preparado para embarcarte \nen esta emocionante aventura?\n\nA tu derecha, encontrarás material \nelaborado que ofrece buena \ninformación sobre el ciclo del agua \ndonde veras cómo este proceso no \nsolo beneficia a las plantas, sino \ntambién cómo influye en el conjunto\nde los ecosistemas.");
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setAutoscrolls(false);
        jTextArea6.setBorder(null);
        jScrollPane7.setViewportView(jTextArea6);

        CicloDeAgua1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 260, 240));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flores.png"))); // NOI18N
        CicloDeAgua1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/dia-mundial-del-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jTabbedPane1.addTab("Ciclo del agua", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/filtro-de-agua.png")), CicloDeAgua1); // NOI18N

        Clima.setBackground(new java.awt.Color(255, 204, 204));
        Clima.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 0, 5, new java.awt.Color(0, 0, 0)));
        Clima.setPreferredSize(new java.awt.Dimension(1064, 830));
        Clima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTropical.setBackground(new java.awt.Color(255, 204, 204));
        SubTropical.setOpaque(false);
        SubTropical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubTropicalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SubTropicalLayout = new javax.swing.GroupLayout(SubTropical);
        SubTropical.setLayout(SubTropicalLayout);
        SubTropicalLayout.setHorizontalGroup(
            SubTropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        SubTropicalLayout.setVerticalGroup(
            SubTropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        Clima.add(SubTropical, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 220, 220));

        antartico.setBackground(new java.awt.Color(255, 204, 204));
        antartico.setOpaque(false);
        antartico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antarticoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout antarticoLayout = new javax.swing.GroupLayout(antartico);
        antartico.setLayout(antarticoLayout);
        antarticoLayout.setHorizontalGroup(
            antarticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        antarticoLayout.setVerticalGroup(
            antarticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
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

        javax.swing.GroupLayout continentalLayout = new javax.swing.GroupLayout(continental);
        continental.setLayout(continentalLayout);
        continentalLayout.setHorizontalGroup(
            continentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        continentalLayout.setVerticalGroup(
            continentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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

        javax.swing.GroupLayout tropicalLayout = new javax.swing.GroupLayout(tropical);
        tropical.setLayout(tropicalLayout);
        tropicalLayout.setHorizontalGroup(
            tropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        tropicalLayout.setVerticalGroup(
            tropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Clima.add(tropical, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 380, 390));

        mediterraneo.setBackground(new java.awt.Color(255, 204, 204));
        mediterraneo.setOpaque(false);
        mediterraneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediterraneoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mediterraneoLayout = new javax.swing.GroupLayout(mediterraneo);
        mediterraneo.setLayout(mediterraneoLayout);
        mediterraneoLayout.setHorizontalGroup(
            mediterraneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        mediterraneoLayout.setVerticalGroup(
            mediterraneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        Clima.add(mediterraneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 350, 210));

        Desertico.setBackground(new java.awt.Color(255, 204, 204));
        Desertico.setOpaque(false);
        Desertico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeserticoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DeserticoLayout = new javax.swing.GroupLayout(Desertico);
        Desertico.setLayout(DeserticoLayout);
        DeserticoLayout.setHorizontalGroup(
            DeserticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        DeserticoLayout.setVerticalGroup(
            DeserticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        Clima.add(Desertico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 330));

        Templado.setBackground(new java.awt.Color(255, 204, 204));
        Templado.setOpaque(false);
        Templado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TempladoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TempladoLayout = new javax.swing.GroupLayout(Templado);
        Templado.setLayout(TempladoLayout);
        TempladoLayout.setHorizontalGroup(
            TempladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        TempladoLayout.setVerticalGroup(
            TempladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
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

        jTabbedPane1.addTab("Clima", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/el-planeta-tierra.png")), Clima); // NOI18N

        Plantas.setBackground(new java.awt.Color(0, 51, 0));
        Plantas.setPreferredSize(new java.awt.Dimension(1064, 830));
        Plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/intPlant.png"))); // NOI18N
        jLabel49.setText("jLabel49");

        javax.swing.GroupLayout Int_PlantasLayout = new javax.swing.GroupLayout(Int_Plantas);
        Int_Plantas.setLayout(Int_PlantasLayout);
        Int_PlantasLayout.setHorizontalGroup(
            Int_PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int_PlantasLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Int_PlantasLayout.setVerticalGroup(
            Int_PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int_PlantasLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Plantas", Int_Plantas);

        Margaritas.setBackground(new java.awt.Color(0, 204, 102));

        jScrollPane4.setBorder(null);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setTabSize(0);
        jTextArea3.setText("MARGARITAS");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jScrollPane4.setViewportView(jTextArea3);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/margaritovalada.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jScrollPane6.setBorder(null);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea5.setLineWrap(true);
        jTextArea5.setTabSize(0);
        jTextArea5.setText("En cuanto a sus beneficios, las margaritas pueden ser utilizadas \nen infusiones que ayudan con problemas digestivos y actúan \ncomo antiinflamatorios naturales. A nivel de suelo, estas plantas\nno son particularmente exigentes y pueden adaptarse a una va-\nriedad de condiciones, siendo su principal requerimiento un \nsuelo bien drenado y rico en nutrientes. Pueden crecer tanto en \nmacetas como directamente en la tierra, lo que las convierte en \nuna opción versátil para jardines reciclados o comunitarios.\n\nEn cuanto a sus necesidades específicas de cuidado, las marga-\nritas prosperan en zonas con abundante luz solar, aunque tam-\nbiéntoleran la sombra parcial. El riego debe ser moderado, evit-\nando tanto el encharcamiento como la sequedad extrema del \nsuelo. Aunque no tienen requisitos estrictos de humedad, es \nfundamental regarlas de manera regular, sin llegar a excesos \nque puedan provocar pudrición en las raíces. Prefieren suelos \nricos en nitrógeno, y es importante que los fertilizantes se utilic-\nen de forma cont-rolada, ya que en grandes cantidades pueden \ndañar la planta. ");
        jTextArea5.setToolTipText("");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        jScrollPane6.setViewportView(jTextArea5);

        jScrollPane8.setBorder(null);

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea7.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea7.setLineWrap(true);
        jTextArea7.setTabSize(0);
        jTextArea7.setText("Las margaritas son plantas sumamente\napreciadas por su sencillez y belleza \nnatural.Son conocidas por sus flores \nblancas con centros amarillos vibrantes,\nque simbolizanpureza e inocencia. \nEstas flores pueden crecer en diversas \ncondiciones climáticas, haciéndolas \npopulares en muchos tipos de jardines.");
        jTextArea7.setToolTipText("");
        jTextArea7.setWrapStyleWord(true);
        jTextArea7.setBorder(null);
        jScrollPane8.setViewportView(jTextArea7);

        jScrollPane9.setBorder(null);

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea8.setLineWrap(true);
        jTextArea8.setTabSize(0);
        jTextArea8.setText("En cuanto al pH del suelo, las margaritas toleran un amplio rango que va desde\n4.5 hasta 7.5, lo que les permite adaptarse a diferentes tipos de terrenos. Sin\nembargo, no soportan suelos con alta salinidad, lo cual es crucial evitar si se \ndesea que la planta florezca de manera óptima.\n\nEn resumen, las margaritas son plantas resistentes, fáciles de cuidar y benefi-\nciosas tanto para las personas como para los ecosistemas. Son una opción \nideal para jardines escolares o proyectos comunitarios por su capacidad para \ncrecer en condiciones variadas, su contribución a la biodiversidad y su facilida-\nd de propagación. Con cuidados básicos, estas flores brindarán belleza y vida\na cualquier entorno donde sean plantadas.\n");
        jTextArea8.setToolTipText("");
        jTextArea8.setWrapStyleWord(true);
        jTextArea8.setBorder(null);
        jScrollPane9.setViewportView(jTextArea8);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel24.setText("jLabel1");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel25.setText("jLabel1");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel50.setText("jLabel1");

        javax.swing.GroupLayout MargaritasLayout = new javax.swing.GroupLayout(Margaritas);
        Margaritas.setLayout(MargaritasLayout);
        MargaritasLayout.setHorizontalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jScrollPane9))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MargaritasLayout.createSequentialGroup()
                    .addGap(349, 349, 349)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(564, Short.MAX_VALUE)))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                    .addContainerGap(903, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        MargaritasLayout.setVerticalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                    .addContainerGap(429, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(143, 143, 143)))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MargaritasLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(562, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Margaritas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/Margaritas.png")), Margaritas); // NOI18N

        Amapolas_Rosas.setBackground(new java.awt.Color(51, 0, 51));

        butt_AmapolasRosas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Amapolas rosas.png"))); // NOI18N
        butt_AmapolasRosas.setText("jButton1");

        javax.swing.GroupLayout Amapolas_RosasLayout = new javax.swing.GroupLayout(Amapolas_Rosas);
        Amapolas_Rosas.setLayout(Amapolas_RosasLayout);
        Amapolas_RosasLayout.setHorizontalGroup(
            Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(butt_AmapolasRosas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Amapolas_RosasLayout.setVerticalGroup(
            Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(butt_AmapolasRosas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Amapolas Rosas", Amapolas_Rosas);

        Ixoras.setBackground(new java.awt.Color(153, 0, 0));

        butt_Ixora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/planta_ixora.jpg"))); // NOI18N
        butt_Ixora.setText("jButton1");

        javax.swing.GroupLayout IxorasLayout = new javax.swing.GroupLayout(Ixoras);
        Ixoras.setLayout(IxorasLayout);
        IxorasLayout.setHorizontalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(butt_Ixora, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IxorasLayout.setVerticalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(butt_Ixora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ixoras", Ixoras);

        Tulipanes.setBackground(new java.awt.Color(204, 0, 51));
        Tulipanes.setForeground(new java.awt.Color(204, 0, 51));

        butt_Tulipanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Tulipanes.jpg"))); // NOI18N
        butt_Tulipanes.setText("jButton1");

        javax.swing.GroupLayout TulipanesLayout = new javax.swing.GroupLayout(Tulipanes);
        Tulipanes.setLayout(TulipanesLayout);
        TulipanesLayout.setHorizontalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TulipanesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(butt_Tulipanes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TulipanesLayout.setVerticalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TulipanesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(butt_Tulipanes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tulipanes", Tulipanes);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Rosas_DesiertoLayout.setVerticalGroup(
            Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(butt_rosaDelDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rosas Del Desierto", Rosas_Desierto);

        javax.swing.GroupLayout MagnolioLayout = new javax.swing.GroupLayout(Magnolio);
        Magnolio.setLayout(MagnolioLayout);
        MagnolioLayout.setHorizontalGroup(
            MagnolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Árbol_del_amorLayout.setVerticalGroup(
            Árbol_del_amorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Árbol del amor", Árbol_del_amor);

        Plantas.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 740));

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/planta (3).png")), Plantas); // NOI18N

        Jardin.setBackground(new java.awt.Color(255, 255, 0));
        Jardin.setPreferredSize(new java.awt.Dimension(1064, 830));

        jScrollPane10.setBorder(null);

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea9.setTabSize(0);
        jTextArea9.setText("Diseño del Jardin Escolar.");
        jTextArea9.setWrapStyleWord(true);
        jTextArea9.setBorder(null);
        jScrollPane10.setViewportView(jTextArea9);

        jLabel26.setBackground(new java.awt.Color(153, 102, 0));
        jLabel26.setFont(new java.awt.Font("Calisto MT", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 102, 0));
        jLabel26.setText("JARDIN DE APRENDIZAJE");

        jScrollPane11.setBorder(null);

        jTextArea10.setEditable(false);
        jTextArea10.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea10.setTabSize(0);
        jTextArea10.setText("Un diseño bien pensado puede fomentar\nla curiosidad de los estudiantes, pro...\nmover la sostenibilidad en el ambiente \ny servir como un laboratorio al aire libre \npara la enseñanza sobre las plantas.");
        jTextArea10.setWrapStyleWord(true);
        jTextArea10.setBorder(null);
        jScrollPane11.setViewportView(jTextArea10);

        jScrollPane12.setBorder(null);

        jTextArea11.setEditable(false);
        jTextArea11.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea11.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jTextArea11.setTabSize(0);
        jTextArea11.setText("Preparacion y construccion.");
        jTextArea11.setWrapStyleWord(true);
        jTextArea11.setBorder(null);
        jScrollPane12.setViewportView(jTextArea11);

        jScrollPane13.setBorder(null);

        jTextArea12.setEditable(false);
        jTextArea12.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea12.setTabSize(0);
        jTextArea12.setText("Beneficios.");
        jTextArea12.setWrapStyleWord(true);
        jTextArea12.setBorder(null);
        jScrollPane13.setViewportView(jTextArea12);

        jScrollPane14.setBorder(null);

        jTextArea13.setEditable(false);
        jTextArea13.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jTextArea13.setTabSize(0);
        jTextArea13.setText("Adaptacion del terreno.");
        jTextArea13.setWrapStyleWord(true);
        jTextArea13.setBorder(null);
        jScrollPane14.setViewportView(jTextArea13);

        jScrollPane15.setBorder(null);

        jTextArea14.setEditable(false);
        jTextArea14.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea14.setTabSize(0);
        jTextArea14.setText("Tipos de Suelos.");
        jTextArea14.setWrapStyleWord(true);
        jTextArea14.setBorder(null);
        jScrollPane15.setViewportView(jTextArea14);

        jScrollPane16.setBorder(null);

        jTextArea15.setEditable(false);
        jTextArea15.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea15.setTabSize(0);
        jTextArea15.setText("Mantenimiento.");
        jTextArea15.setWrapStyleWord(true);
        jTextArea15.setBorder(null);
        jScrollPane16.setViewportView(jTextArea15);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin.png"))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/beneficios.png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin3_1.png"))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/tierra-arcillosa-seca-y-compactada..png"))); // NOI18N

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/buenas-practicas-agricolas-tipos-suelo.png"))); // NOI18N

        jScrollPane17.setBorder(null);

        jTextArea16.setEditable(false);
        jTextArea16.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea16.setTabSize(0);
        jTextArea16.setText("Esto incluye tareas regulares como el \nriego, la poda, el control de plagas y la \nrotación de cultivos, así como actividades \neducativas que involucren a los estudiantes \nen el cuidado continuo del espacio.\n");
        jTextArea16.setWrapStyleWord(true);
        jTextArea16.setBorder(null);
        jScrollPane17.setViewportView(jTextArea16);

        jScrollPane18.setBorder(null);

        jTextArea17.setEditable(false);
        jTextArea17.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea17.setTabSize(0);
        jTextArea17.setText("La preparación y construcción del jardín \ncomienza con la selección del sitio ade\ncuado, la evaluación del tipo de suelo y \nla determinación de las plantas más \nadecuadas para el clima local.\n");
        jTextArea17.setWrapStyleWord(true);
        jTextArea17.setBorder(null);
        jScrollPane18.setViewportView(jTextArea17);

        jScrollPane19.setBorder(null);

        jTextArea18.setEditable(false);
        jTextArea18.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea18.setTabSize(0);
        jTextArea18.setText("El suelo es un recurso vital que sus\ntenta la vida en nuestro planeta, actu\nando como un medio para el creci-\nmiento de las plantas y un hábitat \npara una variedad de organismos. \n");
        jTextArea18.setWrapStyleWord(true);
        jTextArea18.setBorder(null);
        jScrollPane19.setViewportView(jTextArea18);

        jScrollPane20.setBorder(null);

        jTextArea19.setEditable(false);
        jTextArea19.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea19.setTabSize(0);
        jTextArea19.setText("Cada uno con características únicas,  \ninfluyen en su capacidad para retener \nagua, nutrientes y su idoneidad para \ndiferentes cultivos.\n");
        jTextArea19.setWrapStyleWord(true);
        jTextArea19.setBorder(null);
        jScrollPane20.setViewportView(jTextArea19);

        jScrollPane21.setBorder(null);

        jTextArea20.setEditable(false);
        jTextArea20.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea20.setTabSize(0);
        jTextArea20.setText("La adaptación del terreno para maximizar \nel uso de cada tipo de suelo es esencial \npara la agricultura sostenible y la conser\nvación del medio ambiente. \n");
        jTextArea20.setWrapStyleWord(true);
        jTextArea20.setBorder(null);
        jScrollPane21.setViewportView(jTextArea20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton1.setBorder(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton2.setBorder(null);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton4.setBorder(null);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton5.setBorder(null);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton6.setBorder(null);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton7.setBorder(null);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/regando-plantas (1).png"))); // NOI18N

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flores.png"))); // NOI18N

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/cactus.png"))); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/impresion-de-la-mano.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/impresion-de-mano.png"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/informe-de-crecimiento.png"))); // NOI18N

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/jardin-de-infancia.png"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin2_1.png"))); // NOI18N

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/siembra.png"))); // NOI18N

        javax.swing.GroupLayout JardinLayout = new javax.swing.GroupLayout(Jardin);
        Jardin.setLayout(JardinLayout);
        JardinLayout.setHorizontalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JardinLayout.createSequentialGroup()
                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JardinLayout.createSequentialGroup()
                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel28)))
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel27))
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel47)))
                        .addGap(18, 18, 18)
                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JardinLayout.createSequentialGroup()
                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addGap(56, 56, 56))
                                    .addGroup(JardinLayout.createSequentialGroup()
                                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(JardinLayout.createSequentialGroup()
                                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(JardinLayout.createSequentialGroup()
                                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton1)))
                                                .addGap(36, 36, 36))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JardinLayout.createSequentialGroup()
                                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addComponent(jLabel44)
                                        .addGap(18, 18, 18)))
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JardinLayout.createSequentialGroup()
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6))
                                    .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(JardinLayout.createSequentialGroup()
                                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7))
                                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JardinLayout.createSequentialGroup()
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addGap(36, 36, 36))
                                    .addGroup(JardinLayout.createSequentialGroup()
                                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel45))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel42)))
                                .addGap(22, 22, 22)
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JardinLayout.createSequentialGroup()
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5))
                                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JardinLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addGap(18, 18, 18))))
                    .addGroup(JardinLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JardinLayout.createSequentialGroup()
                    .addContainerGap(984, Short.MAX_VALUE)
                    .addComponent(jLabel43)
                    .addGap(15, 15, 15)))
        );
        JardinLayout.setVerticalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JardinLayout.createSequentialGroup()
                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addGroup(JardinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41)))
                .addGap(20, 20, 20)
                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JardinLayout.createSequentialGroup()
                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42))
                                .addGap(63, 63, 63)
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JardinLayout.createSequentialGroup()
                                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2)))
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel44)
                                    .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JardinLayout.createSequentialGroup()
                        .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(JardinLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel48))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JardinLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel28)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47)))
                        .addGap(0, 98, Short.MAX_VALUE))))
            .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JardinLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel43)
                    .addContainerGap(686, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Jardin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void condensacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condensacionActionPerformed
        condensacion acceso = new condensacion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_condensacionActionPerformed

    private void evaporacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaporacionActionPerformed
        evaporacion acceso = new evaporacion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_evaporacionActionPerformed

    private void precipitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precipitacionActionPerformed
        Precipitacion acceso = new Precipitacion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_precipitacionActionPerformed

    private void coleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coleccionActionPerformed
        Coleccion acceso = new Coleccion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_coleccionActionPerformed

    private void condensacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condensacion1ActionPerformed
        InporAgua acceso = new InporAgua();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_condensacion1ActionPerformed

    private void condensacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condensacion2ActionPerformed
       RAICES acceso = new RAICES();
        acceso.setVisible(true); 
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_condensacion2ActionPerformed

    private void DeserticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeserticoMouseClicked
        
        Desertico acceso = new Desertico();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_DeserticoMouseClicked

    private void SubTropicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTropicalMouseClicked
        subTropical acceso = new subTropical();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_SubTropicalMouseClicked

    private void butt_rosaDelDesiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_rosaDelDesiertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butt_rosaDelDesiertoActionPerformed

    private void tropicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tropicalMouseClicked
        Tropical acceso = new Tropical();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_tropicalMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void TempladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TempladoMouseClicked
        Templado acceso = new Templado();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_TempladoMouseClicked

    private void tropicalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tropicalKeyPressed
        Tropical acceso = new Tropical();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_tropicalKeyPressed

    private void mediterraneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediterraneoMouseClicked
        Mediterraneo acceso = new Mediterraneo();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_mediterraneoMouseClicked

    private void continentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continentalMouseClicked
        Continental acceso = new Continental();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_continentalMouseClicked

    private void antarticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antarticoMouseClicked
        Antartico acceso = new Antartico();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_antarticoMouseClicked

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
    private javax.swing.JTabbedPane MenuCiclo;
    private javax.swing.JPanel Narciso;
    private javax.swing.JPanel Plantas;
    private javax.swing.JPanel Primula;
    private javax.swing.JPanel ProcesoPrincipal;
    private javax.swing.JPanel Quenopodio;
    private javax.swing.JPanel Riesgos;
    private javax.swing.JPanel Rododendro;
    private javax.swing.JPanel Rosas_Desierto;
    private javax.swing.JPanel SubTropical;
    private javax.swing.JPanel Tagetes;
    private javax.swing.JPanel Templado;
    private javax.swing.JPanel Tulipanes;
    private javax.swing.JPanel antartico;
    private javax.swing.JButton butt_AmapolasRosas;
    private javax.swing.JButton butt_Ixora;
    private javax.swing.JButton butt_Tulipanes;
    private javax.swing.JButton butt_rosaDelDesierto;
    private javax.swing.JButton coleccion;
    private javax.swing.JButton condensacion;
    private javax.swing.JButton condensacion1;
    private javax.swing.JButton condensacion2;
    private javax.swing.JPanel consejos;
    private javax.swing.JPanel consejos1;
    private javax.swing.JPanel continental;
    private javax.swing.JButton evaporacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JPanel mediterraneo;
    private javax.swing.JButton precipitacion;
    private javax.swing.JPanel tropical;
    private javax.swing.JPanel Árbol_del_amor;
    // End of variables declaration//GEN-END:variables
}
