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
import CLIMA.Desertico;
import CLIMA.Templado;
import CLIMA.Tropical;
import CLIMA.subTropical;
import OPERACIONES.Operaciones;
import Plantas.Margaritas1;
import java.awt.Color;
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
        jPanel7 = new javax.swing.JPanel();
        Jardin = new javax.swing.JPanel();
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
        butt_Margarita = new javax.swing.JButton();
        butt_Ixora = new javax.swing.JButton();
        butt_rosaDelDesierto = new javax.swing.JButton();
        butt_Tulipanes = new javax.swing.JButton();
        butt_AmapolasRosas = new javax.swing.JButton();

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
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(bt_op_ventana)
                .addGap(712, 712, 712))
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BienvenidaLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(bt_op_ventana)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bienvenida", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Bienvenida); // NOI18N

        Riesgos.setBackground(new java.awt.Color(0, 51, 0));
        Riesgos.setPreferredSize(new java.awt.Dimension(1064, 800));

        javax.swing.GroupLayout RiesgosLayout = new javax.swing.GroupLayout(Riesgos);
        Riesgos.setLayout(RiesgosLayout);
        RiesgosLayout.setHorizontalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        RiesgosLayout.setVerticalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riesgos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/parasito.png")), Riesgos); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 51, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(1064, 800));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Recomendaciones", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/brote.png")), jPanel7); // NOI18N

        Jardin.setBackground(new java.awt.Color(0, 51, 0));
        Jardin.setPreferredSize(new java.awt.Dimension(1064, 800));

        javax.swing.GroupLayout JardinLayout = new javax.swing.GroupLayout(Jardin);
        Jardin.setLayout(JardinLayout);
        JardinLayout.setHorizontalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        JardinLayout.setVerticalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

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

        butt_Margarita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Margaritas.jpg"))); // NOI18N
        butt_Margarita.setText("jButton_Margarita ");
        butt_Margarita.setMaximumSize(new java.awt.Dimension(240, 200));
        butt_Margarita.setMinimumSize(new java.awt.Dimension(240, 200));
        butt_Margarita.setPreferredSize(new java.awt.Dimension(240, 200));
        butt_Margarita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_MargaritaActionPerformed(evt);
            }
        });
        Plantas.add(butt_Margarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 200));
        butt_Margarita.getAccessibleContext().setAccessibleName("jbutt_Margarita");

        butt_Ixora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/planta_ixora.jpg"))); // NOI18N
        butt_Ixora.setText("jButton1");
        Plantas.add(butt_Ixora, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 220, 200));

        butt_rosaDelDesierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flor-rosa-desierto.png"))); // NOI18N
        butt_rosaDelDesierto.setText("jButton1");
        butt_rosaDelDesierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_rosaDelDesiertoActionPerformed(evt);
            }
        });
        Plantas.add(butt_rosaDelDesierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 220, 200));

        butt_Tulipanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Tulipanes.jpg"))); // NOI18N
        butt_Tulipanes.setText("jButton1");
        Plantas.add(butt_Tulipanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 220, 200));

        butt_AmapolasRosas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Amapolas rosas.png"))); // NOI18N
        butt_AmapolasRosas.setText("jButton1");
        Plantas.add(butt_AmapolasRosas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 200));

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/hoja.png")), Plantas); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void butt_MargaritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_MargaritaActionPerformed
       Margaritas1 newframe = new Margaritas1();
       
       newframe.setVisible(true); 
       
       
    }//GEN-LAST:event_butt_MargaritaActionPerformed

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
    private javax.swing.JButton butt_Margarita;
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
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JPanel mediterraneo;
    private javax.swing.JButton precipitacion;
    private javax.swing.JPanel tropical;
    // End of variables declaration//GEN-END:variables
}
