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
        bt_op_ventana = new javax.swing.JButton();
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
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        butt_AmapolasRosas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        butt_Ixora = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        butt_Tulipanes = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        butt_rosaDelDesierto = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
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
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 0));
        jTabbedPane1.setForeground(new java.awt.Color(51, 255, 0));
        jTabbedPane1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1049, 903));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1064, 800));

        Bienvenida.setBackground(new java.awt.Color(0, 51, 0));
        Bienvenida.setForeground(new java.awt.Color(0, 51, 0));
        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida.setPreferredSize(new java.awt.Dimension(1064, 800));

        bt_op_ventana.setBackground(new java.awt.Color(102, 51, 0));
        bt_op_ventana.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        bt_op_ventana.setForeground(new java.awt.Color(153, 255, 153));
        bt_op_ventana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/evolucion.png"))); // NOI18N
        bt_op_ventana.setText("Realizar operacion.");
        bt_op_ventana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_op_ventanaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BienvenidaLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(bt_op_ventana)
                .addGap(712, 712, 712))
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BienvenidaLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(bt_op_ventana)
                .addContainerGap(588, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bienvenida ", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Bienvenida); // NOI18N

        Riesgos.setBackground(new java.awt.Color(0, 51, 0));
        Riesgos.setPreferredSize(new java.awt.Dimension(1064, 800));

        javax.swing.GroupLayout RiesgosLayout = new javax.swing.GroupLayout(Riesgos);
        Riesgos.setLayout(RiesgosLayout);
        RiesgosLayout.setHorizontalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1047, Short.MAX_VALUE)
        );
        RiesgosLayout.setVerticalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riesgos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/parasito.png")), Riesgos); // NOI18N

        CicloDeAgua1.setBackground(new java.awt.Color(0, 51, 153));
        CicloDeAgua1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        CicloDeAgua1.setForeground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CicloDeAgua1.setPreferredSize(new java.awt.Dimension(1064, 800));
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
        Clima.setPreferredSize(new java.awt.Dimension(1064, 800));
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
        Plantas.setPreferredSize(new java.awt.Dimension(1064, 800));
        Plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Margaritas.setBackground(new java.awt.Color(0, 204, 102));

        jScrollPane4.setBorder(null);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
        jTextArea5.setText("Las margaritas son una planta resistente y adaptable que puede \nencontrarse en muchos jardines y paisajes. A nivel ornamental, \nestas flores perennes son valoradas por su apariencia clásica: \npétalos blancos que rodean un centro amarillo brillante. \nSe adaptan bien a diferentes tipos de climas y pueden crecer \ntanto en sol pleno como en sombra parcial, lo que las convierte \nen una opción versátil para cubrir grandes áreas de jardín o \ncrear bordes naturales en paisajes. Además, su capacidad para \nflorecer durante varias estaciones del año las hace un componente\nclave en jardines que buscan tener color constante.\n\nMás allá de su valor estético, las margaritas tienen un historial en \nmedicina tradicional. Se han utilizado en infusiones para tratar \ndolencias menores como resfriados, problemas digestivos y para \naliviar dolores leves. También se han aplicado tópicamente en \nforma de cataplasmas para tratar heridas, quemaduras menores \ny picaduras de insectos debido a sus propiedades anti-inflamatorias\ny calmantes.");
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
        jTextArea7.setText("Contenido en Minerales:\n- Sin requisitos estrictos.\nNivel de pH:\n-  4.5 – 7.5\nHumedad del suelo:\n-  Sin requisitos estrictos.\nSalinidad:\n-  No soportada\nTipo de tierra: \n- Rico en Nitrógeno \nbajos en fertilizantes");
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
        jTextArea8.setText("Desde un punto de vista ecológico, las margaritas juegan un papel importante en el equilibrio del suelo y el ecosistema del jardín. Al ser una planta que cubre bien el suelo, son útiles para evitar la erosión del suelo y controlar el crecimiento de malezas no deseadas. \nAdemás, atraen polinizadores como abejas y mariposas, lo que contribuye a la biodiversidad y mejora la polinización de otras plantas cercanas. \nSu habilidad para crecer en suelos pobres o ligeramente compactados también las convierte en una opción excelente para terrenos difíciles, mejorando la estructura del suelo al permitir una mayor infiltración de agua.");
        jTextArea8.setToolTipText("");
        jTextArea8.setWrapStyleWord(true);
        jTextArea8.setBorder(null);
        jScrollPane9.setViewportView(jTextArea8);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel6.setText("jLabel1");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel23.setText("jLabel1");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel24.setText("jLabel1");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel25.setText("jLabel1");

        javax.swing.GroupLayout MargaritasLayout = new javax.swing.GroupLayout(Margaritas);
        Margaritas.setLayout(MargaritasLayout);
        MargaritasLayout.setHorizontalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MargaritasLayout.createSequentialGroup()
                    .addGap(332, 332, 332)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(581, Short.MAX_VALUE)))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MargaritasLayout.createSequentialGroup()
                    .addGap(415, 415, 415)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(498, Short.MAX_VALUE)))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                    .addContainerGap(890, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );
        MargaritasLayout.setVerticalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                    .addContainerGap(391, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(182, 182, 182)))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                    .addContainerGap(545, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MargaritasLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(552, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Margaritas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/Margaritas.png")), Margaritas); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        butt_AmapolasRosas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Amapolas rosas.png"))); // NOI18N
        butt_AmapolasRosas.setText("jButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(butt_AmapolasRosas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(813, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(butt_AmapolasRosas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        butt_Ixora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/planta_ixora.jpg"))); // NOI18N
        butt_Ixora.setText("jButton1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(butt_Ixora, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(815, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(butt_Ixora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 0, 51));
        jPanel4.setForeground(new java.awt.Color(204, 0, 51));

        butt_Tulipanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Tulipanes.jpg"))); // NOI18N
        butt_Tulipanes.setText("jButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(butt_Tulipanes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(818, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(butt_Tulipanes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(487, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab4", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 153, 255));

        butt_rosaDelDesierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flor-rosa-desierto.png"))); // NOI18N
        butt_rosaDelDesierto.setText("jButton1");
        butt_rosaDelDesierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_rosaDelDesiertoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(butt_rosaDelDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(821, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(butt_rosaDelDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab5", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab6", jPanel6);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab7", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab8", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab9", jPanel10);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab10", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab11", jPanel12);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab12", jPanel13);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab13", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab14", jPanel1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab15", jPanel14);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab16", jPanel15);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab17", jPanel16);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab18", jPanel17);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab19", jPanel18);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab20", jPanel19);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab21", jPanel20);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab22", jPanel21);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab23", jPanel22);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab24", jPanel23);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab25", jPanel24);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab26", jPanel25);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab27", jPanel26);

        Plantas.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 740));

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/planta (3).png")), Plantas); // NOI18N

        Jardin.setBackground(new java.awt.Color(255, 255, 0));
        Jardin.setPreferredSize(new java.awt.Dimension(1064, 800));

        jScrollPane10.setBorder(null);

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea9.setForeground(new java.awt.Color(0, 0, 0));
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
        jTextArea10.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea10.setTabSize(0);
        jTextArea10.setText("Un diseño bien pensado puede fomentar\nla curiosidad de los estudiantes, pro...\nmover la sostenibilidad en el ambiente \ny servir como un laboratorio al aire libre \npara la enseñanza sobre las plantas.");
        jTextArea10.setWrapStyleWord(true);
        jTextArea10.setBorder(null);
        jScrollPane11.setViewportView(jTextArea10);

        jScrollPane12.setBorder(null);

        jTextArea11.setEditable(false);
        jTextArea11.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea11.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jTextArea11.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea11.setTabSize(0);
        jTextArea11.setText("Preparacion y construccion.");
        jTextArea11.setWrapStyleWord(true);
        jTextArea11.setBorder(null);
        jScrollPane12.setViewportView(jTextArea11);

        jScrollPane13.setBorder(null);

        jTextArea12.setEditable(false);
        jTextArea12.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea12.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea12.setTabSize(0);
        jTextArea12.setText("Beneficios.");
        jTextArea12.setWrapStyleWord(true);
        jTextArea12.setBorder(null);
        jScrollPane13.setViewportView(jTextArea12);

        jScrollPane14.setBorder(null);

        jTextArea13.setEditable(false);
        jTextArea13.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jTextArea13.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea13.setTabSize(0);
        jTextArea13.setText("Adaptacion del terreno.");
        jTextArea13.setWrapStyleWord(true);
        jTextArea13.setBorder(null);
        jScrollPane14.setViewportView(jTextArea13);

        jScrollPane15.setBorder(null);

        jTextArea14.setEditable(false);
        jTextArea14.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea14.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea14.setTabSize(0);
        jTextArea14.setText("Tipos de Suelos.");
        jTextArea14.setWrapStyleWord(true);
        jTextArea14.setBorder(null);
        jScrollPane15.setViewportView(jTextArea14);

        jScrollPane16.setBorder(null);

        jTextArea15.setEditable(false);
        jTextArea15.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea15.setForeground(new java.awt.Color(0, 0, 0));
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
        jTextArea16.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea16.setTabSize(0);
        jTextArea16.setText("Esto incluye tareas regulares como el \nriego, la poda, el control de plagas y la \nrotación de cultivos, así como actividades \neducativas que involucren a los estudiantes \nen el cuidado continuo del espacio.\n");
        jTextArea16.setWrapStyleWord(true);
        jTextArea16.setBorder(null);
        jScrollPane17.setViewportView(jTextArea16);

        jScrollPane18.setBorder(null);

        jTextArea17.setEditable(false);
        jTextArea17.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea17.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea17.setTabSize(0);
        jTextArea17.setText("La preparación y construcción del jardín \ncomienza con la selección del sitio ade\ncuado, la evaluación del tipo de suelo y \nla determinación de las plantas más \nadecuadas para el clima local.\n");
        jTextArea17.setWrapStyleWord(true);
        jTextArea17.setBorder(null);
        jScrollPane18.setViewportView(jTextArea17);

        jScrollPane19.setBorder(null);

        jTextArea18.setEditable(false);
        jTextArea18.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea18.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea18.setTabSize(0);
        jTextArea18.setText("El suelo es un recurso vital que sus\ntenta la vida en nuestro planeta, actu\nando como un medio para el creci-\nmiento de las plantas y un hábitat \npara una variedad de organismos. \n");
        jTextArea18.setWrapStyleWord(true);
        jTextArea18.setBorder(null);
        jScrollPane19.setViewportView(jTextArea18);

        jScrollPane20.setBorder(null);

        jTextArea19.setEditable(false);
        jTextArea19.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea19.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea19.setTabSize(0);
        jTextArea19.setText("Cada uno con características únicas,  \ninfluyen en su capacidad para retener \nagua, nutrientes y su idoneidad para \ndiferentes cultivos.\n");
        jTextArea19.setWrapStyleWord(true);
        jTextArea19.setBorder(null);
        jScrollPane20.setViewportView(jTextArea19);

        jScrollPane21.setBorder(null);

        jTextArea20.setEditable(false);
        jTextArea20.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea20.setForeground(new java.awt.Color(0, 0, 0));
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
                        .addGap(0, 68, Short.MAX_VALUE))))
            .addGroup(JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JardinLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel43)
                    .addContainerGap(656, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void bt_op_ventanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_op_ventanaMouseClicked

        Operaciones btop = new Operaciones();
        btop.setVisible(true);
    }//GEN-LAST:event_bt_op_ventanaMouseClicked

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
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JPanel CicloDeAgua1;
    private javax.swing.JPanel Clima;
    private javax.swing.JPanel Desertico;
    private javax.swing.JPanel Jardin;
    private javax.swing.JPanel Margaritas;
    private javax.swing.JTabbedPane MenuCiclo;
    private javax.swing.JPanel Plantas;
    private javax.swing.JPanel ProcesoPrincipal;
    private javax.swing.JPanel Riesgos;
    private javax.swing.JPanel SubTropical;
    private javax.swing.JPanel Templado;
    private javax.swing.JPanel antartico;
    private javax.swing.JButton bt_op_ventana;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
    // End of variables declaration//GEN-END:variables
}
